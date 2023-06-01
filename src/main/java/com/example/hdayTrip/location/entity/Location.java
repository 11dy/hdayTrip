package com.example.hdayTrip.location.entity;

import com.example.hdayTrip.curation.entity.Curation;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    @OneToOne(mappedBy = "location", cascade = CascadeType.ALL)
    private Curation curation;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

//    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
//    private List<Photo> photos;

    @Column
    private String contact;

    @Column
    private String operatingHours;


}