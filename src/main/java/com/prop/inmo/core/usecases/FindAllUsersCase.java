package com.prop.inmo.core.usecases;

import com.prop.inmo.core.domain.UserModel;

import java.util.List;

public interface FindAllUsersCase {

    List<UserModel> execute();
}
