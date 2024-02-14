package vw.him.web.MVCdemo.exception;
import java.time.LocalDateTime;
import java.util.*;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice //interceptor
public class ResponseEntityExceptionHandlerAdvice extends ResponseEntityExceptionHandler{

	@ExceptionHandler(EmployeeNotFoundException.class)
	ResponseEntity<Object> handleEmpNotFoundException(EmployeeNotFoundException e){
		
		Map<String,Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", e.getMessage());
		
		return new ResponseEntity<>(body,HttpStatus.NOT_FOUND);
	}
	//jakarta.validation.ConstraintViolationException
		@ExceptionHandler(javax.validation.ConstraintViolationException.class)
		ResponseEntity<Object> handleRuntimeException(javax.validation.ConstraintViolationException e)
		{
			  Map<String, Object> body = new LinkedHashMap<>();
		        body.put("timestamp", LocalDateTime.now());
		        body.put("message","bean validation exception:"+ e.getMessage());
	 
		        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
		}
		
		@Override
		protected ResponseEntity<Object> handleMethodArgumentNotValid(
				MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request)
		{
			Map<String, String> responseMap = new HashMap<>();
			responseMap.put("message", ex.getMessage() + " from rest ");
			return new ResponseEntity<>(responseMap, HttpStatus.NOT_EXTENDED);
		}

	
	
}
