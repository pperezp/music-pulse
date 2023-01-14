package cl.prezdev.musicpulse.musicpulse.service;

import cl.prezdev.musicpulse.musicpulse.controller.request.Pagination;
import cl.prezdev.musicpulse.musicpulse.dto.ArtistDto;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ArtistService {
    Optional<ArtistDto> getArtistBy(long artistId);

    Page<ArtistDto> getAllArtist(Pagination pagination);
}
