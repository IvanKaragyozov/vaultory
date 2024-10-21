package com.karagyozov.domain.models.entities;


import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tags")
public class Tag
{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID tagId;

    @Column(name = "tag_name")
    private String tagName;

    @ManyToMany(mappedBy = "tags")
    private Set<Photo> photos;

}