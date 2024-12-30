package com.karagyozov.core.testUtils.constants;


import java.time.LocalDateTime;


public final class PhotoConstants
{

    public static final String TEST_PHOTO_NAME = "dummy photo name";
    public static final String TEST_PHOTO_FORMAT = ".jpg";
    public static final LocalDateTime TEST_PHOTO_UPLOAD_DATE = LocalDateTime.of(2025, 1, 1, 12, 0, 0);
    public static final byte[] TEST_PHOTO_IMAGE_DATA = new byte[]{1, 2, 3};
    public static final String TEST_PHOTO_METADATA = "{\"camera\": \"Canon\", \"location\": \"Paris\"}";
    public static final Long TEST_PHOTO_SIZE_BYTES = 204800L;
    public static final Integer TEST_PHOTO_WIDTH = 1920;
    public static final Integer TEST_PHOTO_HEIGHT = 1080;


    private PhotoConstants() {}
}
