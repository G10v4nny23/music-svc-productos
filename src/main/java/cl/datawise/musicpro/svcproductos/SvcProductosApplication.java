package cl.datawise.musicpro.svcproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class SvcProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcProductosApplication.class, args);
	}

}
