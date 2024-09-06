package com.example.first_application;

import com.example.first_application.request.CreateUserRequest;
import com.example.first_application.request.UpdateUserRequest;
import com.example.first_application.response.CreateUserResponse;
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
public class FirstApplication {
	private final List<CreateUserResponse> users = new ArrayList<>();

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
//
//	@GetMapping
//	public String sayHello(){
//		return "Hello World";
//	}
//
//	@GetMapping("/assets/listAssets")
//	public ArrayList<GetAssetResponse> getAsset(){
//		ArrayList<GetAssetResponse> list = new ArrayList<>();
//		GetAssetResponse response = GetAssetResponse.builder().id(1L).fullname("James Bond").type("House").amount(700000000).build();
//		GetAssetResponse response1 = GetAssetResponse.builder().id(2L).fullname("Taufik Adi").type("Motorcycle").amount(25000000).build();
//		list.add(response);
//		list.add(response1);
//		return list;
//	}

//	@GetMapping("/assets/{id}")
//	public GetAssetResponse getAssetById(
//			@PathVariable Long id
//	){
//		List<GetAssetResponse> asset = new ArrayList<>();
//		asset.add(GetAssetResponse.builder().id(1L).fullname("James Bond").type("House").amount(700000000).build());
//		asset.add(GetAssetResponse.builder().id(2L).fullname("Taufik Adi").type("Motorcycle").amount(25000000).build());
//		asset.add(GetAssetResponse.builder().id(3L).fullname("Kevin").type("Apartment").amount(250000000).build());
//		asset.add(GetAssetResponse.builder().id(4L).fullname("Joko").type("Car").amount(300000000).build());
//		asset.add(GetAssetResponse.builder().id(5L).fullname("Dodo").type("House").amount(700000000).build());
//		for (int i = 0; i < asset.size(); i++) {
//			if (asset.get(i).getId().equals(id)) {
//				return asset.get(i);
//            }
//		}
//		return null;
//		}
//
//	@GetMapping("/assets/{id}")
//	public ArrayList<GetAssetResponse> getAssetById(
//			@PathVariable Long id
//	){
//		ArrayList<GetAssetResponse> list = new ArrayList<>();
//		ArrayList<GetAssetResponse> asset;
//        asset = new ArrayList<>();
//        asset.add(GetAssetResponse.builder().id(1L).fullname("James Bond").type("House").amount(700000000).build());
//		asset.add(GetAssetResponse.builder().id(2L).fullname("Taufik Adi").type("Motorcycle").amount(25000000).build());
//		asset.add(GetAssetResponse.builder().id(3L).fullname("Kevin").type("Apartment").amount(250000000).build());
//		asset.add(GetAssetResponse.builder().id(4L).fullname("Joko").type("Car").amount(300000000).build());
//		asset.add(GetAssetResponse.builder().id(5L).fullname("Dodo").type("House").amount(700000000).build());
//        for (GetAssetResponse getAssetResponse : asset) {
//            if (getAssetResponse.getId() >= id) {
//                list.add(getAssetResponse);
//            }
//        }
//		return list;
//	}
//
//	@GetMapping("/calculator/add")
//	public String getAdd(
//			@RequestParam(name = "panjang") int panjang,
//			@RequestParam(name = "lebar", required = false, defaultValue = "0") int lebar
//	){
//		return String.valueOf(panjang+lebar);
//	}
//	}

//	@GetMapping("/assets")
//	public ArrayList<GetAssetResponse> getAssetByPageSize(
//			@RequestParam (name = "page", defaultValue = "1") int page,
//			@RequestParam (name = "size", defaultValue = "1") int size
////			@PathVariable Long id
//	) {
//		ArrayList<GetAssetResponse> list = new ArrayList<>();
//		ArrayList<GetAssetResponse> asset;
//		asset = new ArrayList<>();
//		asset.add(GetAssetResponse.builder().id(1L).fullname("James Bond").type("House").amount(700000000).build());
//		asset.add(GetAssetResponse.builder().id(2L).fullname("Taufik Adi").type("Motorcycle").amount(25000000).build());
//		asset.add(GetAssetResponse.builder().id(3L).fullname("Kevin").type("Apartment").amount(250000000).build());
//		asset.add(GetAssetResponse.builder().id(4L).fullname("Joko").type("Car").amount(300000000).build());
//		asset.add(GetAssetResponse.builder().id(5L).fullname("Dodo").type("House").amount(700000000).build());
//		asset.add(GetAssetResponse.builder().id(6L).fullname("James Bond").type("House").amount(700000000).build());
//		asset.add(GetAssetResponse.builder().id(7L).fullname("Taufik Adi").type("Motorcycle").amount(25000000).build());
//		asset.add(GetAssetResponse.builder().id(8L).fullname("Kevin").type("Apartment").amount(250000000).build());
//		asset.add(GetAssetResponse.builder().id(9L).fullname("Joko").type("Car").amount(300000000).build());
//		asset.add(GetAssetResponse.builder().id(10L).fullname("Dodo").type("House").amount(700000000).build());
//
//        ArrayList<GetAssetResponse> tampung = new ArrayList<>();
//        int start = (size * page - size);
//        int j = start;
//		while (j < start + size && j < asset.size()){
//			tampung.add(asset.get(j));
//			j++;
//		}
//		return tampung;
//	}
//	@PostMapping("/users")
//	public ResponseEntity<List<CreateUserRequest>> createUser(
//		@RequestBody CreateUserRequest request) {
//		List<CreateUserRequest> createUserRequestList = new ArrayList<>();
//
//		createUserRequestList.add(CreateUserRequest.builder().id(1L).fullname("James Bond").type("House").amount(700000000).build());
//		createUserRequestList.add(CreateUserRequest.builder().id(2L).fullname("Jane Doe").type("Car").amount(250000000).build());
//
//		createUserRequestList.add(
//				CreateUserRequest.builder().id(request.getId()).fullname(request.getFullname()).type(request.getType()).amount(request.getAmount()).build()
//		);
//		// return Response
//		return new ResponseEntity<>(createUserRequestList, HttpStatus.OK);
//		}

//	@PostMapping("/employee")
//	public ResponseEntity<List<CreateUserResponse>> createEmployee(
//		@RequestBody CreateUserRequest request_e) {
//		List<CreateUserResponse> createEmployeeResponseList = new ArrayList<>();
//
//		createEmployeeResponseList.add(CreateUserResponse.builder().id(1L).fullname("James").age(24).address("Tangerang Selatan").phone("088123123122").build());
//		createEmployeeResponseList.add(CreateUserResponse.builder().id(2L).fullname("Bond").age(26).address("Lebak Bulus").phone("088123123122").build());
//		if (request_e.getFullname() != null && request_e.getAge() != null && request_e.getPhone() != null){
//			createEmployeeResponseList.add(
//					CreateUserResponse.builder().id((long)createEmployeeResponseList.size()+1).fullname(request_e.getFullname()).age(request_e.getAge()).address(request_e.getAddress()).phone(request_e.getPhone()).build()
//			);
//		}
//		else {
//			System.out.println("Input tidak lengkap");
//		}
//		// return Response
//		return new ResponseEntity<>(createEmployeeResponseList, HttpStatus.OK);
//	}

	//Input
	@PostMapping("/users")
	public ResponseEntity<List<CreateUserResponse>> createUser(
			@RequestBody CreateUserRequest request) {
		users.add(
				CreateUserResponse.builder().id((long) users.size()+1).fullname(request.getFullname()).build()
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
				user.setFullname(request.getFullname());
			}
		}

		// return response
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	}

