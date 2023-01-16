package cl.prezdev.musicpulse.secondary.adapters.database.mysql.repository;

import cl.prezdev.musicpulse.secondary.adapters.database.mysql.model.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedia, Long> {

}
