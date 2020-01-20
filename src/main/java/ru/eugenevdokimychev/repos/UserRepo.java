package ru.eugenevdokimychev.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eugenevdokimychev.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
