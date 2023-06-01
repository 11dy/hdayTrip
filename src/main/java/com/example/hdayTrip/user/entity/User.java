package com.example.hdayTrip.user.entity;

import com.example.hdayTrip.profile.entity.Profile;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name; // 0525 추가

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Date registrationDate;

    @Column
    private Date lastLoginDate;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Profile profileId;
}
