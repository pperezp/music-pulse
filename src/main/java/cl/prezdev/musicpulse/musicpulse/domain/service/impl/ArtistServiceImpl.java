package cl.prezdev.musicpulse.musicpulse.domain.service.impl;

import cl.prezdev.musicpulse.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.musicpulse.domain.service.ArtistService;
import cl.prezdev.musicpulse.musicpulse.ports.secondary.database.ArtistPort;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ArtistServiceImpl implements ArtistService {

    private final ArtistPort artistPort;

    @Override
    public Optional<ArtistDto> getArtistBy(long artistId) {
        return artistPort.getArtistBy(artistId);
    }

    @Override
    public Page<ArtistDto> getAllArtist(Pagination pagination) {
        return artistPort.getAllArtist(pagination);
    }
}
