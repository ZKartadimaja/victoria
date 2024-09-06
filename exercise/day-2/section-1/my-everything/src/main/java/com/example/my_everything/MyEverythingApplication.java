package com.example.my_everything;

import com.example.my_everything.request.CreateUserRequest;
import com.example.my_everything.request.UpdateUserRequest;
import com.example.my_everything.response.CreateUserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@SpringBootApplication
public class MyEverythingApplication {
	private ArrayList<CreateUserResponse> users = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}


	// Menambahkan Data User
	@PostMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> createUser(
			@RequestBody CreateUserRequest request) {
		users.add(
				CreateUserResponse.builder().id((long) users.size()+1).name(request.getName()).status(request.getStatus()).description(request.getDescription()).build()
		);

		// return response
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	// Update
	@PatchMapping("/users/{id}")
	public ResponseEntity<List<CreateUserResponse>> updateUser(
			@RequestBody UpdateUserRequest request,
			@PathVariable("id") Long id){

		// Check
		for (CreateUserResponse user : users) {
			if (Objects.equals(user.getId(), id)) {
				user.setName(request.getName());
			}
		}

		// return response
		return new ResponseEntity<>(users, HttpStatus.OK);
	}



}
