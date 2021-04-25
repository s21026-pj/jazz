package pl.pjatk.alepen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class AlepenApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlepenApplication.class, args);
	}

}
