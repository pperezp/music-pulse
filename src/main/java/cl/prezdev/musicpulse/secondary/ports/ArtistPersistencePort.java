package cl.prezdev.musicpulse.secondary.ports;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;

import java.util.Optional;

public interface ArtistPersistencePort {
    Optional<ArtistDto> getArtistBy(long artistId);

    PageDto<ArtistDto> getAllArtist(Pagination pagination);
}
