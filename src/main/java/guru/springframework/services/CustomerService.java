package guru.springframework.services;

import java.util.List;

import guru.springframework.domain.Customer;
import guru.springframework.domain.PackageType;
import guru.springframework.domain.User;

public interface CustomerService {
	//public User findUserByEmail(String email);
	//public void saveUser(User user);
	
	public Customer findCustomerById(Integer id);
	
	public List<Customer> getAllCustomers();

}
