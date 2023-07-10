package com.study.security_lim.domain.User;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
	public int save(User user) throws Exception;
	public User findUserByUsername(String username) throws Exception;
	
	public User findOAuth2UserByUsername(String oauth2_id) throws Exception;
}
