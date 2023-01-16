package cl.prezdev.musicpulse.secondary.ports;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ArtistPersistencePort {
    Optional<ArtistDto> getArtistBy(long artistId);

    Page<ArtistDto> getAllArtist(Pagination pagination);
}
