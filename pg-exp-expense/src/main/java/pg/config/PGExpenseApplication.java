package pg.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;


@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@ComponentScan("pg.*")
// spring profiles development need to be passed as  a jvm argument 
// as the config server is looked first  and then remaining spring configurations
// are loaded.
public class PGExpenseApplication {
    public static void main(String[] args) {
        SpringApplication.run(PGExpenseApplication.class, args);
    }
    
    @Autowired
    public void setEnv(Environment e)
    {
        System.out.println(e.getProperty("user.role"));
    }
}
