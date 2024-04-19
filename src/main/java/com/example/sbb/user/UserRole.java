package com.example.sbb.user;

import lombok.Getter;


@Getter
//열거형 함수
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
