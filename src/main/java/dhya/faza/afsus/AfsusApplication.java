package dhya.faza.afsus;

import dhya.faza.afsus.configuration.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AfsusApplication {
	@Autowired
	private GlobalProperties globalProperties;

	
	public static void main(String[] args) {
		SpringApplication.run(AfsusApplication.class, args);
	}

}
