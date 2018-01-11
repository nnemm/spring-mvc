package com.zz.mycode.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(names="model")
@Controller
public class Notest {
	//controller 像页面传数据的三种方式

	//通过ModelAndMapping
	/*@RequestMapping("/ed")
	public ModelAndView edit(){
		
		User user = new User();
		user.setUsername("小A");
		user.setPassword("123");
		
		
		ModelAndView modelAndView = new ModelAndView();
		//指定要查找的页面
		modelAndView.setViewName("/from");
		modelAndView.addObject("user", user);
		return modelAndView;
	}*/
/*	
	//通过Map
		@RequestMapping("/ed")
		public String retMap(Map<String,Object> map){
			
			map.put("name", "你好");
			
			return "show";
		}*/
	//通过Model
		
		@RequestMapping("/ed")
		public String retModel(Model model){
			model.addAttribute("model", "模型");
			return "show";
			
		}
		//在控制器方法中使用原生API 需要导入jsp jstl servlet 	api
		@RequestMapping("/login")
		public String getSlt(HttpServletRequest req){
			
			System.out.println(req);
			return "show";
		}
}
