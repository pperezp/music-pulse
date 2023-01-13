package cl.prezdev.musicpulse.musicpulse.controller;

import cl.prezdev.musicpulse.musicpulse.controller.response.ArtistResponse;
import cl.prezdev.musicpulse.musicpulse.dto.ArtistDto;
import cl.prezdev.musicpulse.musicpulse.exceptions.ArtistNotFoundException;
import cl.prezdev.musicpulse.musicpulse.service.ArtistService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ArtistController {

    private final ArtistService artistService;

    // curl -v http://localhost:8080/api/v1/artists/1 | python -m json.tool
    @GetMapping("/artists/{id}")
    public ResponseEntity<ArtistResponse> getArtistBy(@PathVariable("id") long id) {
        Optional<ArtistDto> optionalArtistDto = artistService.getArtistBy(id);

        if (optionalArtistDto.isEmpty()) {
            throw new ArtistNotFoundException();
        }

        ArtistDto artistDto = optionalArtistDto.get();

        return ResponseEntity.ok(new ArtistResponse(artistDto));
    }
}