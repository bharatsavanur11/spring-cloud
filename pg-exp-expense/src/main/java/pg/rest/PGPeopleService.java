package pg.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@EnableCircuitBreaker
@RestController("expense")
@RequestMapping("/expense")
@RefreshScope
public class PGPeopleService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RestTemplate peopleServiceTemplate;

	
	@Value("${user.role}")
	private String role;

	@GetMapping("getHello")
	public String sayHelloPeople() {
		logger.info("Logging to Say Hello");
		return "Hello from Expense for =>" + role;
	}
	

	
	@GetMapping("getHelloFromPeople")
	public String getHelloFromPeople() {
		logger.info("Logging to Say getHelloFromPeople");
		//String baseUrl = "http://localhost:8081/people/getHello";
		String baseUrl = "http://pg-expense-people/people/getHello";
		String response = (String) peopleServiceTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();
		logger.info("The response received by method2 is " + response);
		return response;
	}

	@HystrixCommand(fallbackMethod = "reliable")
	@GetMapping("testHysterix")
	public String readingList() {
		logger.info("Logging to testHysterix");
		throw new RuntimeException();
	}
	
	public String reliable() {
		return "Cloud Native Java (O'Reilly)";
	}
}
