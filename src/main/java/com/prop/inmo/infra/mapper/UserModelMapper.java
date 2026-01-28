package com.prop.inmo.infra.mapper;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.infra.dtos.request.UserRequestDTO;
import com.prop.inmo.infra.dtos.response.UserResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class UserModelMapper {

    public UserModel dtoToUserModel(UserRequestDTO dto){

        return new  UserModel(
                null,
                dto.email(),
                dto.password(),
                dto.birthdate(),
                dto.name(),
                dto.lastName(),
                dto.phoneNumber(),
                null


        );
    }

    public UserResponseDTO userToUserResponseDTO(UserModel userModel){

        return new UserResponseDTO(userModel.id(),
                                   userModel.email(),
                                   userModel.birthdate(),
                                   userModel.name(),
                                   userModel.lastName(),
                                   userModel.phoneNumber());

    }

}
