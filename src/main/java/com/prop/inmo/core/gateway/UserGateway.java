package com.prop.inmo.core.gateway;

import com.prop.inmo.core.domain.UserModel;

public interface UserGateway {

    UserModel createUser(UserModel userModel);
}
