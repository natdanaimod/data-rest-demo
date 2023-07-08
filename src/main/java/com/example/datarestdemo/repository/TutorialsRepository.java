package com.example.datarestdemo.repository;

import com.example.datarestdemo.entity.Tutorials;
import com.example.datarestdemo.entity.TutorialsEntity;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@RepositoryRestResource( path = "tutorials", excerptProjection = Tutorials.class)
public interface TutorialsRepository extends JpaRepository<TutorialsEntity, Long> {

    List<TutorialsEntity> findByTitle(@Param("title") String title);
}
