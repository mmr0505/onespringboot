package cn.xdl.mapper;


import org.apache.ibatis.annotations.Param;

import cn.xdl.bean.User;

public interface UserDAO {

	
	User find(@Param("username")String username,
				@Param("password")String password);
}

					
			
					