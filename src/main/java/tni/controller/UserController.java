package tni.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tni.entity.User;
import tni.service.UserService;

@Controller

public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/user-list", method = RequestMethod.GET)
	public String userList(Model model) {
		List<User> userList = userService.findAllUsers();
		model.addAttribute("userList", userList);
		return "pages/userList";
	}
	
}
