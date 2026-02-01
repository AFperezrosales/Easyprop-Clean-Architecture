package com.prop.inmo.infra.controller;

import com.prop.inmo.infra.dtos.request.PropertyRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/property")
public class PropertyController {


    @PostMapping()
    public ResponseEntity<Map<String,Object>> createProperty(@RequestBody PropertyRequestDTO propertyRequestDTO){


    }
}
