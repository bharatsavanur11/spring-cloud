package pg.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("pg.*")
public class PGExpenseApplication {
    public static void main(String[] args) {
        SpringApplication.run(PGExpenseApplication.class, args);
    }
}
