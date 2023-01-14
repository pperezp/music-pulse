package cl.prezdev.musicpulse.musicpulse.adapters.secondary.database.mysql.repository;

import cl.prezdev.musicpulse.musicpulse.adapters.secondary.database.mysql.model.DiscStreaming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvdRepository extends JpaRepository<DiscStreaming, Long> {

}
