package cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.repository;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
