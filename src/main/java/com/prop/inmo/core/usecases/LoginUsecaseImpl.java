package com.prop.inmo.core.usecases;

import com.prop.inmo.core.gateway.UserGateway;
import com.prop.inmo.infra.exceptions.UserAlreadyExistException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginUsecaseImpl implements LoginUsercase{

    private final UserGateway userGateway;

    @Override
    public String execute(String email, String password) {
        if (!userGateway.emailAlreadyExist(email)) {
            throw new RuntimeException("Email not registred");
        }
       return userGateway.login(email, password);
    }
}
