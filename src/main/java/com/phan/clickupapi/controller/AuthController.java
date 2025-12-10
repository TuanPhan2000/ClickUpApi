package com.phan.clickupapi.controller;

import com.phan.clickupapi.command.CommandFactory;
import com.phan.clickupapi.command.auth.LoginCommand;
import com.phan.clickupapi.model.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private CommandFactory commandFactory;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO data) throws Exception {
        return ResponseEntity.ok(
                commandFactory.execute(LoginCommand.class, data)
        );
    }

}
