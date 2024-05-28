package org.example.tuan_4.Repositories;

import org.example.tuan_4.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByIsDeletedFalse();
}
