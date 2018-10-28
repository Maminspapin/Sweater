package ru.maminspapin.example.sweater.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maminspapin.example.sweater.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
