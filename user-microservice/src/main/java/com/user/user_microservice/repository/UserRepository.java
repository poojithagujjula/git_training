package com.user.user_microservice.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.user.user_microservice.models.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
 
}