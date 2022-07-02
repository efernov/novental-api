package novodental.novodental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;




@SpringBootApplication
@Import({ConfiguracionPorJava.class})
@ImportResource({ "classpath:config/jpa-config.xml" })
public class NovodentalApplication {
	
	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(NovodentalApplication.class, args);
	
	}
}
