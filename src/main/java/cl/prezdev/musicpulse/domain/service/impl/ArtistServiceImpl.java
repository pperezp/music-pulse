package cl.prezdev.musicpulse.domain.service.impl;

import cl.prezdev.musicpulse.domain.dto.ArtistLiteDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.service.ArtistService;
import cl.prezdev.musicpulse.domain.ports.secondary.ArtistPersistencePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
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
    public PageDto<ArtistLiteDto> getAllArtist(Pagination pagination) {
        return artistPersistencePort.getAllArtist(pagination);
    }

    @Override
    public List<ArtistLiteDto> search(String q) {
        return artistPersistencePort.search(q);
    }
}
