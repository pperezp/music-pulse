package cl.prezdev.musicpulse.musicpulse.repository;

import cl.prezdev.musicpulse.musicpulse.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

}
