package com.karagyozov.core;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.karagyozov.core.testUtils.constants.PhotoConstants;
import com.karagyozov.core.testUtils.factories.PhotoFactory;
import com.karagyozov.domain.models.entities.PhotoEntity;


class PhotoFactoryTest
{

    @Test
    void testCreatePhotoReturnsValidPhotoEntity()
    {
        final PhotoEntity photo = PhotoFactory.createPhoto();

        Assertions.assertNotNull(photo, "PhotoEntity should not be null!");
        Assertions.assertEquals(PhotoConstants.TEST_PHOTO_NAME, photo.getPhotoName(), "Photo name should match!");
        Assertions.assertEquals(PhotoConstants.TEST_PHOTO_FORMAT, photo.getFormat(), "Photo format should match!");
        Assertions.assertEquals(PhotoConstants.TEST_PHOTO_UPLOAD_DATE, photo.getUploadDate(), "Photo upload date should match!");
        Assertions.assertArrayEquals(PhotoConstants.TEST_PHOTO_IMAGE_DATA, photo.getImageData(), "Photo image data should match!");
        Assertions.assertEquals(PhotoConstants.TEST_PHOTO_METADATA, photo.getMetadata(), "Photo metadata should match!");
        Assertions.assertEquals(PhotoConstants.TEST_PHOTO_SIZE_BYTES, photo.getSizeBytes(), "Photo size bytes should match!");
        Assertions.assertEquals(PhotoConstants.TEST_PHOTO_WIDTH, photo.getWidth(), "Photo width should match!");
        Assertions.assertEquals(PhotoConstants.TEST_PHOTO_HEIGHT, photo.getHeight(), "Photo height should match!");
    }
}