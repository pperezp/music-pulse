package cl.prezdev.musicpulse.musicpulse.repository;

import cl.prezdev.musicpulse.musicpulse.model.ArtistGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistGenreRepository extends JpaRepository<ArtistGenre, Long> {

}
