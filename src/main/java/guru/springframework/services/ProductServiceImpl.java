package guru.springframework.services;

import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

//import com.example.model.User;
//import com.example.service.Role;


@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
   

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    /*@Override
    public Product saveProduct() {
    	Product product=new Product();
    	/*User user=new User();		
    	user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
        return productRepository.save(product);
    }*/

    @Override
    public void deleteProduct(Integer id) {
        productRepository.delete(id);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
    //@Autowired(required=true)
    //private IDropdownRepository repository;
    //public List<DropdownOption> getOptions(String entityName, String nameProp,
    //String valueProp, String filter) {
    //return repository.getOptions(entityName, nameProp, valueProp, filter);
    //}
    /*@Autowired
	//private UserRepository userRepository;
	//@Autowired
   // private RoleRepository roleRepository;
    //@Autowired
    @Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	/*@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}*/
    
}
