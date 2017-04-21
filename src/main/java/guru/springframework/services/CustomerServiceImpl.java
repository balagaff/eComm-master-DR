package guru.springframework.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import guru.springframework.domain.Customer;
import guru.springframework.domain.PackageType;
import guru.springframework.domain.Role;
import guru.springframework.domain.User;
import guru.springframework.repositories.CustomerRepository;
import guru.springframework.repositories.RoleRepository;
import guru.springframework.repositories.UserRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired 
	UserRepository userRepository;
	@Autowired
    RoleRepository roleRepository;
    
    @Autowired
    CustomerRepository customerRepository;
    
    BCryptPasswordEncoder bCryptPasswordEncoder;
	
    @Override
	public Customer findCustomerById(Integer id) {
		return customerRepository.findCustomerById(id);
	}
    
    @Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	/*@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	} */

}
