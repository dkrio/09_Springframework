package com.jsw.springsecurity.command.controller;


import com.jsw.springsecurity.command.dto.request.UserCreateRequest;
import com.jsw.springsecurity.command.service.UserCommandService;
import com.jsw.springsecurity.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserCommandController {

    private final UserCommandService userCommandService;

    @PostMapping("/users")
    public ResponseEntity<ApiResponse<Void>> register(@RequestBody UserCreateRequest request){
        userCommandService.registUser(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success(null));
    }
}
