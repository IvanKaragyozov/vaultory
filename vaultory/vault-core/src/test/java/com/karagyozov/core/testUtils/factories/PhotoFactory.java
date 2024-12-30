package com.karagyozov.core.testUtils.factories;


import com.karagyozov.core.testUtils.constants.PhotoConstants;
import com.karagyozov.domain.models.entities.PhotoEntity;


public class PhotoFactory
{

    public static PhotoEntity createPhoto() {
        return PhotoEntity.builder()
                          .setPhotoName(PhotoConstants.TEST_PHOTO_NAME)
                          .setFormat(PhotoConstants.TEST_PHOTO_FORMAT)
                          .setUploadDate(PhotoConstants.TEST_PHOTO_UPLOAD_DATE)
                          .setImageData(PhotoConstants.TEST_PHOTO_IMAGE_DATA)
                          .setMetadata(PhotoConstants.TEST_PHOTO_METADATA)
                          .setSizeBytes(PhotoConstants.TEST_PHOTO_SIZE_BYTES)
                          .setWidth(PhotoConstants.TEST_PHOTO_WIDTH)
                          .setHeight(PhotoConstants.TEST_PHOTO_HEIGHT)
                          .build();
    }


    private PhotoFactory() {}
}
