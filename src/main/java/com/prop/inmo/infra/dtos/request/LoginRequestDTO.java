package com.prop.inmo.infra.dtos.request;

public record LoginRequestDTO(
        String email,
        String password
) {
}
