package com.karagyozov.domain.models.entities;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Album
{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "album_id")
    private UUID albumId;

    @Column(name = "album_name")
    private String albumName;

    @Column(name = "album_description")
    private String description;

    @Column(name = "album_created_at")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "album")
    private List<Photo> photos;

}