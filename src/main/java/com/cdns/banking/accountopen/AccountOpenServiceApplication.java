package com.cdns.banking.accountopen;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * AccountOpenServiceApplication
 * 
 * @version 1.0
 */
@SpringBootApplication
@EnableSwagger2
public class AccountOpenServiceApplication {

	/**
	 * main
	 * 
	 * @param args String[]
	 */
	public static void main(String[] args) {
		SpringApplication.run(AccountOpenServiceApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.cdns.banking.accountopen")).build()
				.apiInfo(getAPIInfo());
	}

	private ApiInfo getAPIInfo() {
		return new ApiInfo("CDNS Banking Account Open Service APIs",
				"Documentation of APIs provided by the microservice account-open-service", "1.0", "Free to use", null,
				"API License", null, Collections.emptyList());
	}

}
