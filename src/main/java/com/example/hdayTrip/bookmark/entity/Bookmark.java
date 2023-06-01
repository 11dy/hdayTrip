package com.example.hdayTrip.bookmark.entity;

import com.example.hdayTrip.curation.entity.Curation;
import com.example.hdayTrip.location.entity.Location;
import com.example.hdayTrip.user.entity.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bookmarks")
public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookmarkId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @Column(nullable = false)
    private Date bookmarkedDate;

    @ManyToOne
    @JoinColumn(name = "curation_id")
    private Curation curation;


}
