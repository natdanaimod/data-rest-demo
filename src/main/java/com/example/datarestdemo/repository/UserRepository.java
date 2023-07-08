package com.example.datarestdemo.repository;

import com.example.datarestdemo.entity.User;
import com.example.datarestdemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource( path = "users", excerptProjection = User.class)
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByName(@Param("name") String name);
}