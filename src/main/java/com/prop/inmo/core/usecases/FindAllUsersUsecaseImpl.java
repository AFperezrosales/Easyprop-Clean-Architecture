package com.prop.inmo.core.usecases;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.core.gateway.UserGateway;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FindAllUsersUsecaseImpl implements FindAllUsersUsecase {

    private final UserGateway userGateway;

    @Override
    public List<UserModel> execute() {
        return userGateway.findAllUsers();
    }
}
