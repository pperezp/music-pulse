package cl.prezdev.musicpulse.secondary.adapters.database.mysql.repository;

import cl.prezdev.musicpulse.secondary.adapters.database.mysql.model.ArtistContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistContactInfoRepository extends JpaRepository<ArtistContactInfo, Long> {

}
