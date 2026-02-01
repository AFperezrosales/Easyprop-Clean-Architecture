package com.prop.inmo.core.domain;

public record PropertyModel(
        String id,
        String description,
        Boolean yard,
        Integer bedroomCount,
        String userId
) {
}
