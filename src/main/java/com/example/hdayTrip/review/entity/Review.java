package com.example.hdayTrip.review.entity;

import com.example.hdayTrip.location.entity.Location;
import com.example.hdayTrip.user.entity.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location locationId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String reviewComment;

    @Column(nullable = false)
    private Date createdDate;


}

