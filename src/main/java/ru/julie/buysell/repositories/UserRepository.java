package ru.julie.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julie.buysell.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
