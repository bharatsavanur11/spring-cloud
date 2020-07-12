package pg.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
//Followed the below steps for git initialization.
// Not we need to add and commit if we are going to 
//https://howtodoinjava.com/spring-cloud/spring-cloud-config-server-git/
public class PGCloudConfig {
	
	public static void main(String[] args) {
		SpringApplication.run(PGCloudConfig.class, args);
	}

}
