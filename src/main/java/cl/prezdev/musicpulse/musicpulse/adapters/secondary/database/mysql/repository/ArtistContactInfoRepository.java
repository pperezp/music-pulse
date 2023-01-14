package cl.prezdev.musicpulse.musicpulse.adapters.secondary.database.mysql.repository;

import cl.prezdev.musicpulse.musicpulse.adapters.secondary.database.mysql.model.Artist;
import cl.prezdev.musicpulse.musicpulse.adapters.secondary.database.mysql.model.ArtistContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistContactInfoRepository extends JpaRepository<ArtistContactInfo, Long> {
    List<ArtistContactInfo> findAllByArtist(Artist artist);
}
