package com.karagyozov.core.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karagyozov.domain.models.entities.PhotoEntity;


@Repository
public interface PhotoRepository extends JpaRepository<PhotoEntity, String>
{



}
