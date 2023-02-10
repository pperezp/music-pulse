package cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.adapter;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.model.Artist;
import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.repository.ArtistRepository;
import cl.prezdev.musicpulse.domain.dto.ArtistLiteDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.ports.secondary.ArtistPersistencePort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ArtistMySqlAdapter implements ArtistPersistencePort {

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

    @Override
    public PageDto<ArtistLiteDto> getAllArtist(Pagination pagination) {
        Pageable pageable = pagination.toPageable();

        Page<Artist> artistPages = artistRepository.findAll(pageable);
        Page<ArtistLiteDto> page = artistPages.map(artist -> modelMapper.map(artist, ArtistLiteDto.class));

        PageDto<ArtistLiteDto> pageDto = new PageDto<>();
        modelMapper.map(page, pageDto);

        return pageDto;
    }

    @Override
    public List<ArtistLiteDto> search(String q) {
        List<ArtistLiteDto> artistDtoList = new ArrayList<>();
        List<Artist> artists = artistRepository.findAllByNameContains(q);

        for (Artist artist : artists) {
            ArtistLiteDto artistDto = modelMapper.map(artist, ArtistLiteDto.class);
            artistDtoList.add(artistDto);
        }

        return artistDtoList;
    }
}
