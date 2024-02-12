package vw.him.web.MVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/webcntrl")
@Controller 
//with response body anno it will return as it is in response body it will not try resolve it as view

	//@restcontroller=@controller+@responsebody
public class GreetController {

	@GetMapping("/greet")
	public String greetAll() {
		return "greetall";
	}
  //@restcontroller=@controller+@responsebody
	
	@ResponseBody
	@GetMapping("/greet1")
	public String greetAll1() {
		return "greetall1";
	}
	@GetMapping("/greet/{msg}")
	public String greetAllString(@PathVariable String msg,ModelMap map) {
		map.addAttribute("greetmsg", msg);
		return "greet";
	}
}