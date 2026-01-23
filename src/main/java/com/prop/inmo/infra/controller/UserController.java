package com.prop.inmo.infra.controller;

import com.prop.inmo.infra.dtos.request.UserRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody UserRequestDTO userRequestDTO){
        return "USERCREADO";
    }

}
