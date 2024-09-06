package com.example.first_application.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CreateUserRequest {


    @JsonProperty("full_name")
    private String fullname;

    @JsonProperty("age")
    private Integer age;

    @JsonProperty("address")
    private String address;

    @JsonProperty("phone")
    private String phone;

//    @JsonProperty("type")
//    private String type;
//
//    @JsonProperty("amount")
//    private int amount;
}
