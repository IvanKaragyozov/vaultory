package com.karagyozov.core.services;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor

@Service
public class PhotoService
{

    @Value("file.photo.source")
    private String photosSource;

    private final PhotoService photoService;



}
