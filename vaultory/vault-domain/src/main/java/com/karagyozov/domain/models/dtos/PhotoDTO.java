package com.karagyozov.domain.models.dtos;


import java.time.LocalDateTime;


public class PhotoDTO
{

    private String photoName;

    private String format;

    private LocalDateTime uploadDate;

    private byte[] imageData;

    private String metadata;

    private Long sizeBytes;

    private Integer width;

    private Integer height;
}
