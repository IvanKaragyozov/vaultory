package com.karagyozov.core.testUtils.factories;


import com.karagyozov.core.testUtils.constants.PhotoConstants;
import com.karagyozov.domain.models.entities.PhotoEntity;


public class PhotoFactory
{

    public static PhotoEntity createPhoto() {
        return PhotoEntity.builder()
                          .setPhotoName(PhotoConstants.PHOTO_NAME)
                          .setFormat(PhotoConstants.PHOTO_FORMAT)
                          .setUploadDate(PhotoConstants.PHOTO_UPLOAD_DATE)
                          .setImageData(PhotoConstants.PHOTO_IMAGE_DATA)
                          .setMetadata(PhotoConstants.PHOTO_METADATA)
                          .setSizeBytes(PhotoConstants.PHOTO_SIZE_BYTES)
                          .setWidth(PhotoConstants.PHOTO_WIDTH)
                          .setHeight(PhotoConstants.PHOTO_HEIGHT)
                          .build();
    }


    private PhotoFactory() {}
}
