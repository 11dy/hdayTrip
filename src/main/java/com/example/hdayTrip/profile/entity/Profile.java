package com.example.hdayTrip.profile.entity;

import com.example.hdayTrip.user.entity.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column
    private String profilePicture;

//    @Column(columnDefinition = "TEXT")
//    private String comment;

    @Column(nullable = false)
    private Date createdDate;

    @Column
    private Date lastUpdatedDate;

}

