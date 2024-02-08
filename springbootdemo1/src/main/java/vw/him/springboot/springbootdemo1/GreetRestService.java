package vw.him.springboot.springbootdemo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestService {

	@GetMapping("hello")
	public String sayHello() {
		return "Hello Everyone";
	}
}
