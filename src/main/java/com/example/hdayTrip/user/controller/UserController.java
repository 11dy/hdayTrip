package com.example.hdayTrip.user.controller;

import com.example.hdayTrip.user.dto.UserDto;
import com.example.hdayTrip.user.dto.UserPatchDto;
import com.example.hdayTrip.user.entity.User;
import com.example.hdayTrip.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/users")
@Validated
@Slf4j
public class UserController {
    private final UserService userService;

    public UserController(){
        this.userService = new UserService();
    }

    //post 회원 정보 등록
    @PostMapping
    public ResponseEntity postUser(@Valid @RequestBody UserDto userDto){
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());

        User response = userService.createUser(user);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

    //patch 회원 정보 수정
    @PatchMapping("/{user-id}")
    public ResponseEntity patchUser(@PathVariable("user-id") long userId,
                                    @RequestBody UserPatchDto userPatchDto) {
        userPatchDto.setUserId(userId);
        userPatchDto.setName("이동열");

        // No need Business logic

        return new ResponseEntity<>(userPatchDto, HttpStatus.OK);
    }

    // 한명의 회원 정보 조회
    @GetMapping("/{user-id}")
    public ResponseEntity getUser(@PathVariable("user-id") long userId) {
        System.out.println("# userId: " + userId);

        // not implementation
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 모든 회원 정보 조회
    @GetMapping
    public ResponseEntity getUsers() {
        System.out.println("# get users");

        // not implementation

        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 회원 정보 삭제
    @DeleteMapping("/{user-id}")
    public ResponseEntity deleteUser(@PathVariable("user-id") long userId) {
        // No need business logic

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
// 지도 서비스를 이용하기 위해 RestTemplate를 사용 - rest client 수업자료에 포함됨