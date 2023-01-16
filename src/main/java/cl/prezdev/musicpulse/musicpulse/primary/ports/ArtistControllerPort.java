package cl.prezdev.musicpulse.musicpulse.primary.ports;

import cl.prezdev.musicpulse.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.musicpulse.domain.dto.response.ArtistResponse;
import cl.prezdev.musicpulse.musicpulse.domain.dto.Pagination;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ArtistControllerPort {
    @GetMapping("/api/v1/artists/{id}")
    ResponseEntity<ArtistResponse> getArtistBy(@PathVariable("id") long id);

    @GetMapping("/api/v1/artists")
    ResponseEntity<Page<ArtistDto>> getAllArtist(Pagination pagination);
}
