package cl.prezdev.musicpulse.secondary.ports.database;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ArtistPort {
    Optional<ArtistDto> getArtistBy(long artistId);

    Page<ArtistDto> getAllArtist(Pagination pagination);
}