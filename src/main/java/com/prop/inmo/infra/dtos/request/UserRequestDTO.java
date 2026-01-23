package com.prop.inmo.infra.dtos.request;

import lombok.Builder;
import lombok.Data;

import java.util.Date;


public record UserRequestDTO(
        String email,
        String password,
        Date birthdate,
        String name,
        String lastName,
        String phoneNumber
) {
}
