package com.poscodx.emaillist.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ResponseBody
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handlerException(Exception e) {
		// 0. 로깅(Logging)
		StringWriter errors = new StringWriter();
		e.printStackTrace(new PrintWriter(errors));
		log.error(errors.toString());
		
		// 응답
		return ResponseEntity.status(HttpStatus.OK).body(Map.of("error", errors.toString()));	
	}
}
