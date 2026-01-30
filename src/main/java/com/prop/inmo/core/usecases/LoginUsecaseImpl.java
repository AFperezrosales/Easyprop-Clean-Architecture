package com.prop.inmo.core.usecases;

import com.prop.inmo.core.gateway.AuthGateway;
import com.prop.inmo.core.gateway.UserGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginUsecaseImpl implements LoginUsecase {

    private final AuthGateway authGateway;


    @Override
    public String execute(String email, String password) {

       return authGateway.login(email, password);
    }
}
