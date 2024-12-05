package com.karagyozov.domain.models.entities;


import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "set")

@Table(name = "photos")
@Entity
public class PhotoEntity
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

    @Column(columnDefinition = "jsonb", name = "photo_metadata")
    private String metadata;

    @Column(name = "photo_size_bytes")
    private Long sizeBytes;

    @Column(name = "photo_width")
    private Integer width;

    @Column(name = "photo_height")
    private Integer height;

}