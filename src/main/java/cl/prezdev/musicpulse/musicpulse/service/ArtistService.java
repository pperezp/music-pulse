package cl.prezdev.musicpulse.musicpulse.service;

import cl.prezdev.musicpulse.musicpulse.dto.ArtistDto;
import cl.prezdev.musicpulse.musicpulse.dto.SocialMediaDto;
import cl.prezdev.musicpulse.musicpulse.model.Artist;

import java.util.List;
import java.util.Optional;

public interface ArtistService {
    Optional<ArtistDto> getArtistBy(long artistId);

    List<String> getEmails(Artist artist);

    List<SocialMediaDto> getSocialMedia(Artist artist);
}
