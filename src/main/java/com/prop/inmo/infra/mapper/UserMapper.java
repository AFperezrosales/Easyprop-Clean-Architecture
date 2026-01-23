package com.prop.inmo.infra.mapper;

import com.prop.inmo.infra.dtos.request.UserRequestDTO;
import com.prop.inmo.infra.dtos.response.UserResponseDTO;
import com.prop.inmo.infra.persistence.UserEntity;

public class UserMapper {

    public static UserEntity dtoToUserEntity(UserRequestDTO dto){

        return UserEntity.builder()
                .email(dto.email())
                .password(dto.password())
                .birthdate(dto.birthdate())
                .name(dto.name())
                .lastName(dto.lastName())
                .phoneNumber(dto.phoneNumber())
                .build();
    }

    public static UserResponseDTO userToUserResponseDTO(UserEntity userEntity){

        return new UserResponseDTO(userEntity.getEmail(),
                                   userEntity.getBirthdate(),
                                   userEntity.getName(),
                                   userEntity.getLastName(),
                                   userEntity.getPhoneNumber());

    }

}
