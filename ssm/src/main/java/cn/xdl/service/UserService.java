package cn.xdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.User;
import cn.xdl.mapper.UserDAO;
@Service("userService")
public class UserService {
	@Autowired
	private UserDAO userDao;
	
	public User find(String username,String password) {
		return userDao.find(username, password);
	}
}
