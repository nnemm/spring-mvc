package com.zz.mycode.dao;

import com.zz.mycode.pojo.vo.User;

public interface IUserDao {
	//
	User selectByName(String username);
	//增加一个新用户
	void saveByName(User user);
}
