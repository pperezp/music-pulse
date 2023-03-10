package cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.repository;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArtistRepository extends PagingAndSortingRepository<Artist, Long> {
    Optional<Artist> findById(Long id);

    Page<Artist> findAll(Pageable pageable);

    List<Artist> findAllByNameContains(String name);
}
