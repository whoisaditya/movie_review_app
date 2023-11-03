package com.movie_review_app.movie_review_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieReviewAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewAppApplication.class, args);
	}
	
	// @GetMapping("/root")
	// public String apiRoot() {
	// 	return "Hello, World!";
	// }
}
