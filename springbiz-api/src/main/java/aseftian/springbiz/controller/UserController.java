package aseftian.springbiz.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api")
public class UserController {

	@RequestMapping(value="hello/{user}", method=RequestMethod.GET)
	public String sayHello(@PathVariable("user") String user) {
		return "Hello " + user;
	}

}
