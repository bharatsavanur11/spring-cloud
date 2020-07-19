package pg.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("people")
@RequestMapping("people")

@RefreshScope
@EnableCircuitBreaker
public class PGPeopleService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("getHello")
	public String sayHelloPeople() {
		logger.info("Saying hello from People");
		return "Hello from People";
	}

}
