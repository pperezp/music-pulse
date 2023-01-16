package cl.prezdev.musicpulse.domain.service.impl;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.service.ArtistService;
import cl.prezdev.musicpulse.secondary.ports.ArtistPersistencePort;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ArtistServiceImpl implements ArtistService {

    private final ArtistPersistencePort artistPersistencePort;

    @Override
    public Optional<ArtistDto> getArtistBy(long artistId) {
        return artistPersistencePort.getArtistBy(artistId);
    }

    @Override
    public Page<ArtistDto> getAllArtist(Pagination pagination) {
        return artistPersistencePort.getAllArtist(pagination);
    }
}
