package com.example.CaseSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@SpringBootApplication
public class CaseSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseSearchApplication.class, args);
	}

}
