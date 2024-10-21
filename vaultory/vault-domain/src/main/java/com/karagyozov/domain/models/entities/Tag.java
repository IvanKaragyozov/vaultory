package com.karagyozov.domain.models.entities;


import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Tag
{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID tagId;

    private String tagName;

    @ManyToMany(mappedBy = "tags")
    private Set<Photo> photos;

}