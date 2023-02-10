package cl.prezdev.musicpulse.domain.controller;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.VideoDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.dto.response.ArtistResponse;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.response.ArtistSearchResponse;
import cl.prezdev.musicpulse.domain.exceptions.ArtistNotFoundException;
import cl.prezdev.musicpulse.domain.service.ArtistService;
import cl.prezdev.musicpulse.domain.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class RestArtistController {

    private final ArtistService artistService;
    private final VideoService videoService;

    // curl -v http://localhost:8080/api/v1/artists/1 | python -m json.tool
    @GetMapping("/api/v1/artists/{id}")
    public ResponseEntity<ArtistResponse> getArtistBy(@PathVariable("id") long id) {
        Optional<ArtistDto> optionalArtistDto = artistService.getArtistBy(id);
        if (optionalArtistDto.isEmpty()) {
            throw new ArtistNotFoundException();
        }
        ArtistDto artistDto = optionalArtistDto.get();
        return ResponseEntity.ok(new ArtistResponse(artistDto));
    }

    // curl -v 'http://localhost:8080/api/v1/artists?page=0&size=10&orderBy=name&asc=true' | python -m json.tool
    @GetMapping("/api/v1/artists")
    public ResponseEntity<PageDto<ArtistDto>> getAllArtist(Pagination pagination) {
        return ResponseEntity.ok(artistService.getAllArtist(pagination));
    }

    // curl -v http://localhost:8080/api/v1/artists/search?q=koke
    @GetMapping("/api/v1/artists/search")
    public ResponseEntity<ArtistSearchResponse> search(@RequestParam("q") String q) {
        List<ArtistDto> artists = artistService.search(q);
        return ResponseEntity.ok(new ArtistSearchResponse(artists));
    }

    // curl -v http://localhost:8080/api/v1/artists/1/videos?page=0&size=15
    @GetMapping("/api/v1/artists/{id}/videos")
    public ResponseEntity<PageDto<VideoDto>> getVideos(
            @PathVariable long id,
            Pagination pagination
    ) {
        PageDto<VideoDto> videos = videoService.getVideos(id, pagination);
        return ResponseEntity.ok(videos);
    }
}
