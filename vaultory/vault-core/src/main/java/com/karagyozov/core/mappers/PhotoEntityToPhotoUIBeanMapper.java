package com.karagyozov.core.mappers;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.karagyozov.domain.models.entities.PhotoEntity;
import com.karagyozov.domain.models.uibeans.PhotoUIBean;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor

@Component
public class PhotoEntityToPhotoUIBeanMapper
{

    private final ModelMapper modelMapper;


    public PhotoEntity mapPhotoUIBeanToPhotoEntity(final PhotoUIBean photoUIBean)
    {
        return modelMapper.map(photoUIBean, PhotoEntity.class);
    }


    public PhotoUIBean mapPhotoEntityToPhotoUIBean(final PhotoEntity photoEntity)
    {
        return modelMapper.map(photoEntity, PhotoUIBean.class);
    }
}
