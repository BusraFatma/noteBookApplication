package com.notebookApp.dtos.requests;

import lombok.Data;

@Data
public class UserRequest {
    private String userId;
    private String userName;
    private String password;
    private String email;

}
