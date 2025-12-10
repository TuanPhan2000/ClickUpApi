package com.phan.clickupapi.command.auth;

import com.phan.clickupapi.command.Command;
import com.phan.clickupapi.enums.ResponseStatus;
import com.phan.clickupapi.model.dto.LoginDTO;
import com.phan.clickupapi.model.dto.UserDTO;
import com.phan.clickupapi.model.response.ApiResponse;
import org.springframework.stereotype.Component;

@Component
public class LoginCommand implements Command<ApiResponse<UserDTO>, LoginDTO> {
    @Override
    public ApiResponse<UserDTO> execute(LoginDTO  data) throws Exception {
        return ApiResponse.create(null, ResponseStatus.SUCCESS);
    }
}
