package com.mycompany.databaseservice.repository;

import com.mycompany.common.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by antongusev on 14.11.16.
 */
@RepositoryRestResource(path = "/user")
public interface UserRepository extends JpaRepository<User, Long> {

    User getByUsername(@Param("username") String username);

    User getByEmail(@Param("email") String email);

}
