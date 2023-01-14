package cl.prezdev.musicpulse.musicpulse.ports.secondary.database;

import cl.prezdev.musicpulse.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.musicpulse.domain.dto.ArtistDto;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ArtistPort {
    Optional<ArtistDto> getArtistBy(long artistId);

    Page<ArtistDto> getAllArtist(Pagination pagination);
}
