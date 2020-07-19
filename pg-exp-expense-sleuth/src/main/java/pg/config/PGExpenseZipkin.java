package pg.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import zipkin.server.EnableZipkinServer;


@SpringBootApplication
@ComponentScan("pg.*")
@EnableZipkinServer
// spring profiles development need to be passed as  a jvm argument 
// as the config server is looked first  and then remaining spring configurations
// are loaded.
public class PGExpenseZipkin {
    public static void main(String[] args) {
        SpringApplication.run(PGExpenseZipkin.class, args);
    }
    

}
