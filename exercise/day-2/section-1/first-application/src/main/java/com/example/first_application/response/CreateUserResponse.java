package com.example.first_application.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CreateUserResponse {

    @JsonProperty("id")
    private Long id;

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

