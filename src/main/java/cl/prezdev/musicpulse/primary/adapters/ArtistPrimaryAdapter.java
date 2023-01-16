package cl.prezdev.musicpulse.primary.adapters;

import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.dto.response.ArtistResponse;
import cl.prezdev.musicpulse.domain.exceptions.ArtistNotFoundException;
import cl.prezdev.musicpulse.domain.service.ArtistService;
import cl.prezdev.musicpulse.primary.ports.ArtistPrimaryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ArtistPrimaryAdapter implements ArtistPrimaryPort {

    private final ArtistService artistService;

    @Override
    public ArtistResponse getArtistBy(long id) {
        Optional<ArtistDto> optionalArtistDto = artistService.getArtistBy(id);

        if (optionalArtistDto.isEmpty()) {
            throw new ArtistNotFoundException();
        }

        ArtistDto artistDto = optionalArtistDto.get();

        return new ArtistResponse(artistDto);
    }

    @Override
    public PageDto<ArtistDto> getAllArtist(Pagination pagination) {
        return artistService.getAllArtist(pagination);
    }
}
