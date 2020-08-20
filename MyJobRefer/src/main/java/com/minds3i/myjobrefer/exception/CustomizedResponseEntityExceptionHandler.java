package com.minds3i.myjobrefer.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handlingUserNotFoundException(UserNotFoundException unf,
			WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), unf.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PasswordNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handlingPasswordNotFoundException(PasswordNotFoundException unf,
			WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), unf.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserDetailsNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handlingUserDetailsNotFoundException(UserDetailsNotFoundException unf,
			WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), unf.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
}
