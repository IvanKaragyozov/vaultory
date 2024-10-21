package com.karagyozov.domain.models.entities;


import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Photo
{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "photo_id")
    private UUID photoId;

    @Column(name = "photo_name")
    private String photoName;

    @Column(name = "photo_format")
    private String format;

    @Column(name = "photo_upload_date")
    private LocalDateTime uploadDate;

    @Lob
    @Column(name = "photo_image_data")
    private byte[] imageData;

    @Column(columnDefinition = "jsonb", name = "photo_meta_data")
    private String metadata;

    @Column(name = "photo_size_bytes")
    private Long sizeBytes;

    @Column(name = "photo_width")
    private Integer width;

    @Column(name = "photo_height")
    private Integer height;

    @ManyToOne
    @JoinColumn(name = "photo_album_id")
    private Album album;

    @ManyToMany
    @JoinTable(
                    name = "photo_tags",
                    joinColumns = @JoinColumn(name = "photo_id"),
                    inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags;

}