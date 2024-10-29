package com.karagyozov.core.services;


import org.springframework.stereotype.Service;

import com.karagyozov.core.repositories.AlbumRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor

@Service
public class AlbumService
{

    private final AlbumRepository albumRepository;

}
