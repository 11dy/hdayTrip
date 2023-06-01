package com.example.hdayTrip.curation.entity;

import com.example.hdayTrip.bookmark.entity.Bookmark;
import com.example.hdayTrip.location.entity.Location;
import com.example.hdayTrip.profile.entity.Profile;
import com.example.hdayTrip.user.entity.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "curations")
public class Curation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long curationId;

    @OneToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profileId;

    @OneToMany(mappedBy = "curation", cascade = CascadeType.ALL)
    private List<Bookmark> bookmarkId;

    @OneToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private Date uploadDate;

    @OneToOne(mappedBy = "curation", cascade = CascadeType.ALL)
    private User user;

    @Column(nullable = false)
    private String category;
}