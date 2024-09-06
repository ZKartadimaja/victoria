package com.example.first_application.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter

public class GetAssetResponse {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("full_name")
    private String fullname;

    @JsonProperty("type")
    private String type;

    @JsonProperty("amount")
    private int amount;

}
