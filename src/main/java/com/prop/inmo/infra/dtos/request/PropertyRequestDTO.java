package com.prop.inmo.infra.dtos.request;

public record PropertyRequestDTO(
        String description,
        Boolean yard,
        Integer bedRoomCount,
        String userid
) {
}
