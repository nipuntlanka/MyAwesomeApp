package com.tcs.angularjs.controller;

public class InpurRequest {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "InpurRequest{" +
                "id='" + id + '\'' +
                '}';
    }
}
