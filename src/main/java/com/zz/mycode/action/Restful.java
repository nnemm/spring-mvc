package com.zz.mycode.action;

import org.junit.runners.Parameterized.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class Restful {
	@RequestMapping("/test1")
	public String test1(){
		return "test";
	}
	//GET(获取) POST(创建) PUT(更新) DELETE(删除) 资源
	
	@RequestMapping(value="/show1/{id}" ,method=RequestMethod.DELETE)
	public int remove(@PathVariable("id") String id){
		System.out.println("id=");
		return 1;
	}
	
	@RequestMapping(value="/show1/{id}",method=RequestMethod.PUT)
	public int update(@PathVariable("id") String id){
		System.out.println("+++");
		return 1;
	}
	
}
