package pg.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("expense")
@RequestMapping("/expense")
@RefreshScope
public class PGPeopleService {
	
	@Value("${user.role}")
	private String role;
	
	@GetMapping("getHello")
	public String sayHelloPeople() {
		return "Hello from Expense for =>" + role;
	}

}
