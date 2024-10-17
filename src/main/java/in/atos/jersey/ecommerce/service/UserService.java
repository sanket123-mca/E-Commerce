package in.atos.jersey.ecommerce.service;

import org.springframework.stereotype.Service;

import in.atos.jersey.ecommerce.model.User;
import java.util.List;

@Service
public interface UserService {

    	public User loginUser(String username, String password);
    	
	    public User saveUser(User user);

	    public List<User> getAllUser();

	    public List<User> getListByCity(String city);

	    public User getUserByUserName(String username);

}
