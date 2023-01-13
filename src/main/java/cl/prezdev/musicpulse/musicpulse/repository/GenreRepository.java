package cl.prezdev.musicpulse.musicpulse.repository;

import cl.prezdev.musicpulse.musicpulse.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
