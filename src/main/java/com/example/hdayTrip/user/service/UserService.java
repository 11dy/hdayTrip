package com.example.hdayTrip.user.service;

import com.example.hdayTrip.user.entity.User;

import java.util.List;

public class UserService {
    public User createUser(User user){
        // 비즈니스 로직

        User createUser = user;
        return createUser;
    }
    public User updateUser(User user){
        // business

        User updateUser = user; //
        return updateUser;
    }
    public User findUser(long userId){
        // business

        User user =
                new User(userId, "hgd@gmail.com", "홍길동", "asdf1234");
        return user;
    }
    public List<User> findUsers(){

        List<User> users = List.of(
                new User(1,"hgd@gmail.com", "홍길동", "asdf1234"),
                new User(2, "lml@gmail.com", "이몽룡", "a123")
        );
        return null;
    }
    public void deleteUser(long userId){
        // business
    }
}

// 1. post, patch의 경우 DB에 저장 후 되돌려 받는 변수를 선언한다.
// 2. find 같은 경우 나중에 db에서 조회하는 객체를 선언한다. > 추후에 변경 필요