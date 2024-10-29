package com.karagyozov.core.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karagyozov.domain.models.entities.TagEntity;


@Repository
public interface TagRepository extends JpaRepository<TagEntity, String>
{

}
