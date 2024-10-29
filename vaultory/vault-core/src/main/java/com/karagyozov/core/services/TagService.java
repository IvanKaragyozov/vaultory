package com.karagyozov.core.services;


import org.springframework.stereotype.Service;

import com.karagyozov.core.repositories.TagRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor

@Service
public class TagService
{

    private final TagRepository tagRepository;

}
