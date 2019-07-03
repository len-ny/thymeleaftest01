package prj2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "prj1"} )
public class App2 {
	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}
}
