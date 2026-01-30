package com.prop.inmo.infra.controller;


import com.prop.inmo.core.usecases.LoginUsecase;
import com.prop.inmo.infra.dtos.request.LoginRequestDTO;
import com.prop.inmo.infra.dtos.response.JwtResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final LoginUsecase loginUsecase;

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody LoginRequestDTO loginRequestDTO){
        String token = loginUsecase.execute(loginRequestDTO.email(), loginRequestDTO.password());
        return ResponseEntity.ok(new JwtResponse(token));

    }
}

