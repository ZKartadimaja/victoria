package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
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

	@GetMapping
	public String sayHello(){
		return "Hello World";
	}

	@GetMapping("/assets/listAssets")
	public ArrayList<GetAssetResponse> getAsset(){
		ArrayList<GetAssetResponse> list = new ArrayList<>();
		GetAssetResponse response = GetAssetResponse.builder().id(1L).fullname("James Bond").type("House").amount(700000000).build();
		GetAssetResponse response1 = GetAssetResponse.builder().id(2L).fullname("Taufik Adi").type("Motorcycle").amount(25000000).build();
		list.add(response);
		list.add(response1);
		return list;
	}

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

	@GetMapping("/assets/{id}")
	public ArrayList<GetAssetResponse> getAssetById(
			@PathVariable Long id
	){
		ArrayList<GetAssetResponse> list = new ArrayList<>();
		ArrayList<GetAssetResponse> asset;
        asset = new ArrayList<>();
        asset.add(GetAssetResponse.builder().id(1L).fullname("James Bond").type("House").amount(700000000).build());
		asset.add(GetAssetResponse.builder().id(2L).fullname("Taufik Adi").type("Motorcycle").amount(25000000).build());
		asset.add(GetAssetResponse.builder().id(3L).fullname("Kevin").type("Apartment").amount(250000000).build());
		asset.add(GetAssetResponse.builder().id(4L).fullname("Joko").type("Car").amount(300000000).build());
		asset.add(GetAssetResponse.builder().id(5L).fullname("Dodo").type("House").amount(700000000).build());
        for (GetAssetResponse getAssetResponse : asset) {
            if (getAssetResponse.getId() >= id) {
                list.add(getAssetResponse);
            }
        }
		return list;
	}

	}

//	@GetMapping("/assets/{id}")
//	public ResponseEntity<Long> getUserById(Long id){
//		return new ResponseEntity<>(id, HttpStatus.OK);
//	}