package cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.repository;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.model.DiscStreaming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvdRepository extends JpaRepository<DiscStreaming, Long> {

}
