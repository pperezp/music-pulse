package cl.prezdev.musicpulse.domain.service;

import cl.prezdev.musicpulse.domain.dto.ArtistLiteDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;

import java.util.List;
import java.util.Optional;

public interface ArtistService {
    Optional<ArtistDto> getArtistBy(long artistId);

    PageDto<ArtistLiteDto> getAllArtist(Pagination pagination);

    List<ArtistLiteDto> search(String q);
}
