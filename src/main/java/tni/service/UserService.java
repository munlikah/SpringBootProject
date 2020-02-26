package tni.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tni.entity.User;
import tni.repository.UserRepository;

@Service

public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

}
