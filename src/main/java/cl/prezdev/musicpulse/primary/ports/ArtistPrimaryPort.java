package cl.prezdev.musicpulse.primary.ports;

import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.dto.response.ArtistResponse;
import cl.prezdev.musicpulse.domain.dto.Pagination;

public interface ArtistPrimaryPort {
    ArtistResponse getArtistBy(long id);

    PageDto<ArtistDto> getAllArtist(Pagination pagination);
}
