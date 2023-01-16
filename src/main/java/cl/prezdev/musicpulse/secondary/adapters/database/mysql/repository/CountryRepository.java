package cl.prezdev.musicpulse.secondary.adapters.database.mysql.repository;

import cl.prezdev.musicpulse.secondary.adapters.database.mysql.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
