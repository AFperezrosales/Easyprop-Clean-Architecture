package com.prop.inmo.infra.dtos.response;

import java.util.Date;

public record UserResponseDTO(
        String id,
        String email,
        Date birthdate,
        String name,
        String lastName,
        String phoneNumber
) {
}
