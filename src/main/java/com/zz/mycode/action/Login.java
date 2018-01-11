package com.zz.mycode.action;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zz.mycode.pojo.vo.User;

@Controller
public class Login {
	
	
/*	@RequestMapping("/hi")
	public String hello(){
		return "hi";
	}
	*/
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String hello(){

		return "login";
	}
	
	@RequestMapping(value="/login" ,method=RequestMethod.POST)
	public String login(User user){
		System.out.println(user.getUsername()+"++++"+user.getPassword());
		return "success";
	}
	
	/*@RequestMapping(value="/login",method=RequestMethod.POST )
	public String login( String username , String password){
		System.out.println(username+"+++++++++"+password);
		return "success";
	}
	*/
	
}
