package cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.repository;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.model.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedia, Long> {

}
