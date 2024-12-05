package com.karagyozov.core.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.karagyozov.core.repositories.PhotoRepository;
import com.karagyozov.domain.models.entities.PhotoEntity;


@ExtendWith(MockitoExtension.class)
class PhotoServiceTest
{

    @Mock
    private PhotoRepository photoRepository;

    @InjectMocks
    private PhotoService photoService;


    @BeforeEach
    void setUp()
    {
        Mockito.reset(photoRepository);
    }


    @Test
    void testLoadPhotosFromDirectory_Success() throws IOException
    {
        final Path dummyPath = Paths.get("src/test/resources/dummyPhotos");
        final Path photoPath = dummyPath.resolve("album1/photo1.jpg");

        photoService.loadPhotosFromDirectory(dummyPath);

        final ArgumentCaptor<PhotoEntity> captor = ArgumentCaptor.forClass(PhotoEntity.class);
        Mockito.verify(photoRepository, Mockito.times(5))
               .save(captor.capture());

        final List<PhotoEntity> extractedImages = captor.getAllValues();
        Assertions.assertEquals(5, extractedImages.size());
//        Assertions.assertEquals("image1.png", savedPhoto.getPhotoName());
    }


    @Test
    void testLoadPhotosFromDirectory_InvalidDirectory()
    {
        final Path invalidPath = Paths.get("invalidDirectory");

        Assertions.assertThrows(IllegalArgumentException.class, () -> photoService.loadPhotosFromDirectory(invalidPath));
    }


    @Test
    void testIsSupportedFormat()
    {
        final Path validJpgPath = Paths.get("photo.jpg");
        final Path invalidTxtPath = Paths.get("document.txt");

        Assertions.assertTrue(photoService.isSupportedFormat(validJpgPath), "JPG should be supported");
        Assertions.assertFalse(photoService.isSupportedFormat(invalidTxtPath), "TXT should not be supported");
    }
}
