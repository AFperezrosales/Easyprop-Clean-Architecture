package com.prop.inmo.core.domain;

import com.prop.inmo.core.enums.UserRole;

import java.util.Date;
import java.util.List;

public record UserModel(
        String id,
        String email,
        String password,
        Date birthdate,
        //entidad a la que se conecta en este caso seria la propiedad.
        String name,
        String lastName,
        String phoneNumber,
        //entidad direccion enbbebida para poder agrupar esos datos que se van a usar juntos.
        UserRole role,
        List<PropertyModel> properties
) {
}
