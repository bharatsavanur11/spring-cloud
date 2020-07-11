package pg.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("expense")
@RequestMapping("/expense")
public class PGPeopleService {
	
	@GetMapping("getHello")
	public String sayHelloPeople() {
		return "Hello from Expense";
	}

}
