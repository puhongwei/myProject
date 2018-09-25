package com.qst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qst.model.User;
import com.qst.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@RequestMapping("/login.do")
	public ModelAndView login(User user) {
		ModelAndView mv = new ModelAndView();
		if (userService.login(user)) {
			// 登录成功
			mv.setViewName("success");
			mv.addObject("user", user);
		} else {
			// 登录失败返回到login.jsp
			mv.setViewName("redirect:/jsp/login.jsp");
		}

		return mv;
	}

	@RequestMapping("/userList.do")
	public ModelAndView userList() {
		ModelAndView mv = new ModelAndView();

		List<User> userList = userService.getUsers();
		mv.addObject("userList", userList);
		mv.setViewName("userList");

		return mv;
	}

	@RequestMapping("/userDel.do")
	public ModelAndView userDel(Integer id) {
		ModelAndView mv = new ModelAndView();

		if(userService.userDel(id)){
			mv.setViewName("redirect:/user/userList.do");
		}

		return mv;

	}
	
	@RequestMapping("/showUser.do")
	public ModelAndView showUser(Integer id){
		ModelAndView mv = new ModelAndView();
		User user = userService.getUserById(id);
		if(user != null){
			mv.addObject("user", user);
			mv.setViewName("userUpdate");
		}
		

		return mv;
		
	}
	
	@RequestMapping("/userUpdate.do")
	public ModelAndView userUpdate(User user){
		
		ModelAndView mv = new ModelAndView();
		
		if(userService.userUpdate(user)){
			mv.setViewName("redirect:/user/userList.do");
		}

		return mv;
	}

}
