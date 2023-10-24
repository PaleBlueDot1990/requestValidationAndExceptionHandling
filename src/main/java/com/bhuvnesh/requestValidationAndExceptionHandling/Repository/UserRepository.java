package com.bhuvnesh.requestValidationAndExceptionHandling.Repository;

import com.bhuvnesh.requestValidationAndExceptionHandling.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface UserRepository extends JpaRepository<User, Integer>
{
    User findByUserID(int id);
}
