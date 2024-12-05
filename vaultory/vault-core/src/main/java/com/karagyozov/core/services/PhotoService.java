package com.karagyozov.core.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.karagyozov.core.repositories.PhotoRepository;
import com.karagyozov.domain.models.entities.PhotoEntity;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor

@Service
public class PhotoService
{

    private static final Logger LOGGER = LoggerFactory.getLogger(PhotoService.class);


    @Value("file.photo.source")
    private String photosSource;

    private final PhotoRepository photoRepository;


    public void loadPhotosFromDirectory(final Path directoryPath)
    {
        if (Files.exists(directoryPath) && Files.isDirectory(directoryPath))
        {
            try (final Stream<Path> files = Files.walk(directoryPath))
            {
                files.filter(Files::isRegularFile)
                     .filter(this::isSupportedFormat)
                     .forEach(this::processPhotoFile);
            }
            catch (final IOException e)
            {
                throw new RuntimeException("Error scanning directory: " + directoryPath, e);
            }
        }
        else
        {
            throw new IllegalArgumentException("Invalid directory: " + directoryPath);
        }
    }

    public void loadPhotosFromDirectory()
    {
        final Path directoryPath = Paths.get(photosSource);
        loadPhotosFromDirectory(directoryPath);
    }


    boolean isSupportedFormat(final Path filePath)
    {
        final String fileName = filePath.getFileName().toString().toLowerCase();
        // TODO: Implement a better solution for extracting file extensions
        return fileName.endsWith(".jpg") || fileName.endsWith(".png");
    }


    private void processPhotoFile(final Path photoPath)
    {
        try
        {
            final byte[] imageData = Files.readAllBytes(photoPath);
            final String fileName = photoPath.getFileName().toString();

            final PhotoEntity photo = PhotoEntity.builder()
                                                 .setPhotoName(fileName)
                                                 .setImageData(imageData)
                                                 .build();

            photoRepository.save(photo);
        }
        catch (final IOException e)
        {
            throw new RuntimeException("Error processing file: " + photoPath, e);
        }
    }

}
