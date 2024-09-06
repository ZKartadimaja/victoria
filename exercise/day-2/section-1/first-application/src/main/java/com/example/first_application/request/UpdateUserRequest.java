package com.example.first_application.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UpdateUserRequest {

    @JsonProperty("full_name")
    private String fullname;

//    @JsonProperty("age")
//    private Integer age;
//
//    @JsonProperty("address")
//    private String address;
//
//    @JsonProperty("phone")
//    private String phone;
}
