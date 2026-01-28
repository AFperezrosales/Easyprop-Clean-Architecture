package com.prop.inmo.infra.controller;

import com.prop.inmo.core.domain.UserModel;
import com.prop.inmo.core.usecases.CreateUserUsecase;
import com.prop.inmo.core.usecases.FindAllUsersUsecase;
import com.prop.inmo.core.usecases.FindUserByIdUsecase;
import com.prop.inmo.infra.dtos.request.UserRequestDTO;
import com.prop.inmo.infra.dtos.response.UserResponseDTO;
import com.prop.inmo.infra.mapper.UserModelMapper;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUsecase createUserUsecase;
    private final UserModelMapper userModelMapper;
    private final FindUserByIdUsecase findUserByIdUsecase;
    private final FindAllUsersUsecase findAllUsersUsecase;

    @PostMapping
    public ResponseEntity<Map<String,Object>> createUser(@RequestBody UserRequestDTO userRequestDTO){
        UserModel newUser = createUserUsecase.execute(userModelMapper.dtoToUserModel(userRequestDTO));
        Map<String,Object> response = new HashMap<>();
        response.put("Message;", "User registered successfully");
        response.put("Data",userModelMapper.userToUserResponseDTO(newUser));
        return ResponseEntity.ok(response);

    }

    @GetMapping
    public List<UserResponseDTO> listUsers(){
        List<UserModel> listUsers =  findAllUsersUsecase.execute();
       return listUsers.stream().map(userModelMapper::userToUserResponseDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String,Object>> findUserById(@PathVariable String id){
        Map<String,Object> response = new HashMap<>();
        UserModel user = findUserByIdUsecase.execute(id);
        response.put("Message: ", "User whith id : " + id);
        response.put("Data", userModelMapper.userToUserResponseDTO(user));
        return ResponseEntity.ok(response);
    }

}
