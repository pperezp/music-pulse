package cl.prezdev.musicpulse.musicpulse.service.impl;

import cl.prezdev.musicpulse.musicpulse.dto.ArtistDto;
import cl.prezdev.musicpulse.musicpulse.model.Artist;
import cl.prezdev.musicpulse.musicpulse.repository.ArtistRepository;
import cl.prezdev.musicpulse.musicpulse.service.ArtistService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ArtistServiceImpl implements ArtistService {

    private final ModelMapper modelMapper;
    private final ArtistRepository artistRepository;

    @Override
    public Optional<ArtistDto> getArtistBy(long artistId) {
        Optional<Artist> optionalArtist = artistRepository.findById(artistId);

        if (optionalArtist.isEmpty()) {
            return Optional.empty();
        }

        Artist artist = optionalArtist.get();

        ArtistDto artistDto = modelMapper.map(artist, ArtistDto.class);

        return Optional.of(artistDto);
    }
}
