package com.example.my_everything;

import com.example.my_everything.request.CreateTaskRequest;
import com.example.my_everything.request.UpdateTaskRequest;
import com.example.my_everything.response.CreateTaskResponse;
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
	private final ArrayList<CreateTaskResponse> tasks = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}

	// Menambahkan Data User
	@PostMapping("/tasks")
	public ResponseEntity<List<CreateTaskResponse>> createUser(
			@RequestBody CreateTaskRequest request) {
		tasks.add(
				CreateTaskResponse.builder().id((long) tasks.size() == 0 ? 1: tasks.get(tasks.size() - 1).getId() + 1 )
						.name(request.getName())
						.status(request.getStatus())
						.description(request.getDescription())
						.build()
		);

		// return response
		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}

	// Update
	@PatchMapping("/tasks/{id}")
	public ResponseEntity<List<CreateTaskResponse>> updateUser(
			@RequestBody UpdateTaskRequest request,
			@PathVariable("id") Long id) {

		// Check
		for (CreateTaskResponse user : tasks) {
			if (Objects.equals(user.getId(), id)) {
				user.setName(request.getName());
				user.setStatus(request.getStatus());
				user.setDescription(request.getDescription());
			}
		}

		// return response
		return new ResponseEntity<>(tasks, HttpStatus.OK);

	}

	// Pagination
	@GetMapping("/tasks")
	public ArrayList<CreateTaskResponse> getAssetByPageSize(
			@RequestParam(name = "page", required = false, defaultValue = "1") int page,
			@RequestParam(name = "size", required = false, defaultValue = "1") int size
	) {
		ArrayList<CreateTaskResponse> listResponse = new ArrayList<>();
		int start = (size * page - size);
		int j = start;
		while (j < start + size && j < tasks.size()) {
			listResponse.add(tasks.get(j));
			j++;
		}
		return listResponse;
	}

	// Get By ID
	@GetMapping("/tasks/{id}")
	public ResponseEntity<CreateTaskResponse> getTaskById(
			@PathVariable Long id
	) {
		for (CreateTaskResponse getTaskResponse : tasks) {
			if (getTaskResponse.getId().equals(id)) {
				return new ResponseEntity<>(getTaskResponse, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

	// Delete By ID
	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<ArrayList<CreateTaskResponse>> deleteById (
			@PathVariable Long id
	){
		for (CreateTaskResponse deleteTaskResponse : tasks) {
			if (deleteTaskResponse.getId().equals(id)) {
				tasks.remove(deleteTaskResponse);
				return new ResponseEntity<>(tasks, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}

