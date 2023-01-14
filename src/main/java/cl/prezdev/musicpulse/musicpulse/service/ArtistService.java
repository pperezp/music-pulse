package cl.prezdev.musicpulse.musicpulse.service;

import cl.prezdev.musicpulse.musicpulse.dto.ArtistDto;
import java.util.Optional;

public interface ArtistService {
    Optional<ArtistDto> getArtistBy(long artistId);
}
