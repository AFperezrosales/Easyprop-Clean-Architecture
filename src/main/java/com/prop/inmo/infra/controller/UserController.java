package com.prop.inmo.infra.controller;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.core.usecases.CreateUserUsecase;
import com.prop.inmo.infra.dtos.request.UserRequestDTO;
import com.prop.inmo.infra.dtos.response.UserResponseDTO;
import com.prop.inmo.infra.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUsecase createUserUsecase;
    private final UserMapper userMapper;

    @PostMapping
    public UserResponseDTO createUser(@RequestBody UserRequestDTO userRequestDTO){
        UserModel newUser = createUserUsecase.execute(userMapper.dtoToUserModel(userRequestDTO));
        return userMapper.userToUserResponseDTO(newUser);

    }

    @GetMapping
    public String listUsers(){

        return "list users";
    }

}
