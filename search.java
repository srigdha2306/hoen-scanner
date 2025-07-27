package com.hoen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class search {
    @JsonProperty
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
