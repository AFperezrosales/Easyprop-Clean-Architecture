package com.prop.inmo.infra.controller;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.core.usecases.CreateUserUsecase;
import com.prop.inmo.core.usecases.FindAllUsersUsecase;
import com.prop.inmo.infra.dtos.request.UserRequestDTO;
import com.prop.inmo.infra.dtos.response.UserResponseDTO;
import com.prop.inmo.infra.mapper.UserModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUsecase createUserUsecase;
    private final UserModelMapper userModelMapper;

    private final FindAllUsersUsecase findAllUsersUsecase;

    @PostMapping
    public UserResponseDTO createUser(@RequestBody UserRequestDTO userRequestDTO){
        UserModel newUser = createUserUsecase.execute(userModelMapper.dtoToUserModel(userRequestDTO));
        return userModelMapper.userToUserResponseDTO(newUser);

    }

    @GetMapping
    public List<UserResponseDTO> listUsers(){
        List<UserModel> listUsers =  findAllUsersUsecase.execute();
       return listUsers.stream().map(userModelMapper::userToUserResponseDTO).collect(Collectors.toList());
    }

}
