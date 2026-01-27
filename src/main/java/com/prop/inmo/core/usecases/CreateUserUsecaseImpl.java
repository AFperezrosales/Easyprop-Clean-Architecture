package com.prop.inmo.core.usecases;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.core.gateway.UserGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class CreateUserUsecaseImpl implements CreateUserUsecase {

    private final UserGateway userGateway;

    @Override
    public UserModel execute(UserModel userModel) {

        return userGateway.createUser(userModel);
    }
}
