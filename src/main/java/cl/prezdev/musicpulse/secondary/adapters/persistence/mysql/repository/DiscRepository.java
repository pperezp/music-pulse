package cl.prezdev.musicpulse.secondary.adapters.persistence.mysql.repository;

import cl.prezdev.musicpulse.secondary.adapters.persistence.mysql.model.Disc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscRepository extends JpaRepository<Disc, Long> {

}
