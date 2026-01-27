package com.prop.inmo.core.usecases;

import com.prop.inmo.core.domain.UserModel;

public interface FindUserByIdUsecase {

    UserModel execute(String id);
}
