package com.prop.inmo.core.gateway;

import com.prop.inmo.core.domain.UserModel;

import java.util.List;

public interface UserGateway {

    UserModel createUser(UserModel userModel);

    List<UserModel> findAllUsers();

    boolean emailAlreadyExist(String email);

    UserModel findUserById(String id);


}
