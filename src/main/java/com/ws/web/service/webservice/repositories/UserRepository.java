package com.ws.web.service.webservice.repositories;

import com.ws.web.service.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
