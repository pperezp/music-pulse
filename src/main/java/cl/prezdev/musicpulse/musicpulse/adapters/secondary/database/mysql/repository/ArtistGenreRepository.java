package cl.prezdev.musicpulse.musicpulse.adapters.secondary.database.mysql.repository;

import cl.prezdev.musicpulse.musicpulse.adapters.secondary.database.mysql.model.ArtistGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistGenreRepository extends JpaRepository<ArtistGenre, Long> {

}
