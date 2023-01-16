package cl.prezdev.musicpulse.musicpulse.secondary.adapters.database.mysql.repository;

import cl.prezdev.musicpulse.musicpulse.secondary.adapters.database.mysql.model.VideoTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoTagRepository extends JpaRepository<VideoTag, Long> {

}
