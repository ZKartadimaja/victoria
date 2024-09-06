package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

//	@GetMapping
//	public GetAssetResponse sayHello(){
//		GetAssetResponse response = GetAssetResponse.builder().id(1L).fullname("James Bond").build();
//
//		response.setFullname("Joko Doe");
//
//		response.getFullname();
//
//		return response;
//	}

//	@GetMapping
//	public String sayHello(){
//		return "Hello World";
//	}

	@GetMapping
	public ArrayList<GetAssetResponse> getAssets(){
		ArrayList<GetAssetResponse> list = new ArrayList<>();
		GetAssetResponse response = GetAssetResponse.builder().id(1L).fullname("James Bond").type("House").amount(700000000).build();
		GetAssetResponse response1 = GetAssetResponse.builder().id(2L).fullname("Taufik Adi").type("Motorcycle").amount(25000000).build();
		list.add(response);
		list.add(response1);
		return list;
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<Long> getUserById(Long id){
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

}
