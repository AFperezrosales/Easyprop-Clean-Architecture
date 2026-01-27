package com.prop.inmo.infra.mapper;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.infra.persistence.UserEntity;
import org.springframework.stereotype.Component;


@Component
public class UserEntityMapper {


   public UserEntity modelToUserEntity (UserModel userModel){
        return new UserEntity(
                userModel.id(),
                userModel.email(),
                userModel.password(),
                userModel.birthdate(),
                userModel.name(),
                userModel.lastName(),
                userModel.phoneNumber(),
                userModel.role()
        );
    }

   public UserModel entityToUserModel(UserEntity userEntity){

            return new UserModel(
                    userEntity.getId(),
                    userEntity.getEmail(),
                    userEntity.getPassword(),
                    userEntity.getBirthdate(),
                    userEntity.getName(),
                    userEntity.getLastName(),
                    userEntity.getPhoneNumber(),
                    userEntity.getRole()
            );

    }

}
