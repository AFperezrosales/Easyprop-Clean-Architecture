package com.prop.inmo.core.usecases;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.core.gateway.UserGateway;
import com.prop.inmo.infra.exceptions.UserAlreadyExistException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class CreateUserUsecaseImpl implements CreateUserUsecase {

    private final UserGateway userGateway;

    @Override
    public UserModel execute(UserModel userModel) {
        if (userGateway.emailAlreadyExist(userModel.email())){
            throw new UserAlreadyExistException("Email already exist");
        }
        return userGateway.createUser(userModel);
    }
}
