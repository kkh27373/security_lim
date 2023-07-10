package com.study.security_lim.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.study.security_lim.handler.exception.CustomValidationApiException;
import com.study.security_lim.web.dto.CMRespDto;

@RestController
@ControllerAdvice
public class RestControllerExceptionHandler {

	@ExceptionHandler(CustomValidationApiException.class)	//이 클래스 타입이면 밑에서 낚아 챔.
	public ResponseEntity<?> validationApiException(CustomValidationApiException e) {
		return ResponseEntity.badRequest().body(new CMRespDto<>(-1, e.getMessage(), e.getErrorMap()));
	}
}
