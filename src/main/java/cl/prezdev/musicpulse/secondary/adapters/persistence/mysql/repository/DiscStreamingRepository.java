package cl.prezdev.musicpulse.secondary.adapters.persistence.mysql.repository;

import cl.prezdev.musicpulse.secondary.adapters.persistence.mysql.model.DiscStreaming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscStreamingRepository extends JpaRepository<DiscStreaming, Long> {

}
