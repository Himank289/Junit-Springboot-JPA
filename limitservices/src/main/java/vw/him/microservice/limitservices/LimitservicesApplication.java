package vw.him.microservice.limitservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LimitservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitservicesApplication.class, args);
	}

}
