package cl.prezdev.musicpulse.musicpulse.secondary.adapters.database.mysql.repository;

import cl.prezdev.musicpulse.musicpulse.secondary.adapters.database.mysql.model.Artist;
import cl.prezdev.musicpulse.musicpulse.secondary.adapters.database.mysql.model.ArtistSocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistSocialMediaRepository extends JpaRepository<ArtistSocialMedia, Long> {
    List<ArtistSocialMedia> findAllByArtist(Artist artist);
}
