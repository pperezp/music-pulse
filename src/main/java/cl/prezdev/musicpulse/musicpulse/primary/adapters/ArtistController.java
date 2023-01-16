package cl.prezdev.musicpulse.musicpulse.primary.adapters;

import cl.prezdev.musicpulse.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.musicpulse.domain.dto.response.ArtistResponse;
import cl.prezdev.musicpulse.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.musicpulse.domain.exceptions.ArtistNotFoundException;
import cl.prezdev.musicpulse.musicpulse.domain.service.ArtistService;
import cl.prezdev.musicpulse.musicpulse.primary.ports.ArtistControllerPort;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class ArtistController implements ArtistControllerPort {

    private final ArtistService artistService;

    // curl -v http://localhost:8080/api/v1/artists/1 | python -m json.tool
    @Override
    public ResponseEntity<ArtistResponse> getArtistBy(@PathVariable("id") long id) {
        Optional<ArtistDto> optionalArtistDto = artistService.getArtistBy(id);

        if (optionalArtistDto.isEmpty()) {
            throw new ArtistNotFoundException();
        }

        ArtistDto artistDto = optionalArtistDto.get();

        return ResponseEntity.ok(new ArtistResponse(artistDto));
    }

    // curl -v 'http://localhost:8080/api/v1/artists?page=0&size=10&orderBy=name&asc=true' | python -m json.tool
    @Override
    public ResponseEntity<Page<ArtistDto>> getAllArtist(Pagination pagination) {
        return ResponseEntity.ok(artistService.getAllArtist(pagination));
    }
}
