package com.example.hdayTrip.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDto {
        private Long id;
        private String email;
        private String name;
        private String password;
        private Date registrationDate;
        private Date lastLoginDate;
//        private ProfileDto profileDto;

}
