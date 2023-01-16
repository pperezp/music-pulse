package cl.prezdev.musicpulse.primary;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.response.ArtistResponse;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.primary.ports.ArtistPrimaryPort;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class RestArtistController {

    private final ArtistPrimaryPort artistPrimaryPort;

    // curl -v http://localhost:8080/api/v1/artists/1 | python -m json.tool
    @GetMapping("/api/v1/artists/{id}")
    public ResponseEntity<ArtistResponse> getArtistBy(@PathVariable("id") long id) {
        return ResponseEntity.ok(artistPrimaryPort.getArtistBy(id));
    }

    // curl -v 'http://localhost:8080/api/v1/artists?page=0&size=10&orderBy=name&asc=true' | python -m json.tool
    @GetMapping("/api/v1/artists")
    public ResponseEntity<Page<ArtistDto>> getAllArtist(Pagination pagination) {
        return ResponseEntity.ok(artistPrimaryPort.getAllArtist(pagination));
    }
}
