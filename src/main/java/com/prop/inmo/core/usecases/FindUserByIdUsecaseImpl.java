package com.prop.inmo.core.usecases;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.core.gateway.UserGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindUserByIdUsecaseImpl implements FindUserByIdUsecase{


    private final UserGateway userGateway;

    @Override
    public UserModel execute(String id) {
        return userGateway.findUserById(id);
    }
}
