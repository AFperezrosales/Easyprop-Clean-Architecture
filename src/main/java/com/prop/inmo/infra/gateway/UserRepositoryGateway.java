package com.prop.inmo.infra.gateway;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.core.enums.UserRole;
import com.prop.inmo.core.gateway.UserGateway;
import com.prop.inmo.infra.exceptions.UserAlreadyExistException;
import com.prop.inmo.infra.mapper.UserEntityMapper;
import com.prop.inmo.infra.persistence.UserEntity;
import com.prop.inmo.infra.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    @Override
    public UserModel createUser(UserModel userModel) throws UserAlreadyExistException{
        UserEntity entity = userEntityMapper.modelToUserEntity(userModel);
        entity.setRole(UserRole.USER);
        UserEntity newUser = userRepository.save(entity);
        return userEntityMapper.entityToUserModel(newUser);
    }

    @Override
    public List<UserModel> findAllUsers() {
        return userRepository.findAll().stream().map(userEntityMapper::entityToUserModel).collect(Collectors.toList());
    }

    @Override
    public boolean emailAlreadyExist(String email) {
       return userRepository.findAll().stream()
                .anyMatch(userEntity -> userEntity.getEmail().equals(email));
    }
}
