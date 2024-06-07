package ru.julie.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julie.buysell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
