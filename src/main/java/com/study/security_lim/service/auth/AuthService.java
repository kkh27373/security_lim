package com.study.security_lim.service.auth;

import com.study.security_lim.web.dto.auth.UsernameCheckReqDto;

public interface AuthService {
	public boolean checkUsername(UsernameCheckReqDto usernameCheckReqDto) throws Exception;
	public boolean signup() throws Exception;
}
