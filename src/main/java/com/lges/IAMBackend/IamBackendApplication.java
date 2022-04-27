package com.lges.IAMBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class IamBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(IamBackendApplication.class, args);
	}

}
