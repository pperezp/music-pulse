package cl.prezdev.musicpulse.musicpulse.repository;

import cl.prezdev.musicpulse.musicpulse.model.Artist;
import cl.prezdev.musicpulse.musicpulse.model.ArtistSocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistSocialMediaRepository extends JpaRepository<ArtistSocialMedia, Long> {
    List<ArtistSocialMedia> findAllByArtist(Artist artist);
}
