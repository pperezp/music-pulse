package cl.prezdev.musicpulse.primary.ports;

import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.response.ArtistResponse;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import org.springframework.data.domain.Page;

public interface ArtistPrimaryPort {
    ArtistResponse getArtistBy(long id);

    Page<ArtistDto> getAllArtist(Pagination pagination);
}
