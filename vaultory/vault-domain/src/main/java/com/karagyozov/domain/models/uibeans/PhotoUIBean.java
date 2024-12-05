package com.karagyozov.domain.models.uibeans;


import java.time.LocalDateTime;
import java.util.Set;

import lombok.Data;


@Data
public class PhotoUIBean
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
