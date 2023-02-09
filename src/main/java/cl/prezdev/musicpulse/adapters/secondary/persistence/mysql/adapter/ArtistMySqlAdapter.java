package cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.adapter;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.model.Artist;
import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.repository.ArtistRepository;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.ports.secondary.ArtistPersistencePort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public PageDto<ArtistDto> getAllArtist(Pagination pagination) {
        Sort sort = getSort(pagination);
        Pageable pageable = PageRequest.of(pagination.getPage(), pagination.getSize(), sort);

        Page<Artist> artistPages = artistRepository.findAll(pageable);
        Page<ArtistDto> page = artistPages.map(artist -> modelMapper.map(artist, ArtistDto.class));

        PageDto<ArtistDto> pageDto = new PageDto<>();
        modelMapper.map(page, pageDto);
        return pageDto;
    }

    @Override
    public List<ArtistDto> search(String q) {
        List<ArtistDto> artistDtoList = new ArrayList<>();
        List<Artist> artists = artistRepository.findAllByNameContains(q);

        for (Artist artist : artists) {
            ArtistDto artistDto = modelMapper.map(artist, ArtistDto.class);

            artistDto.setCountry(null);
            artistDto.setSocialsMedia(null);
            artistDto.setContactsInfo(null);

            artistDtoList.add(artistDto);
        }

        return artistDtoList;
    }

    private Sort getSort(Pagination pagination) {
        String orderBy = pagination.getOrderBy();

        if (pagination.isAsc()) {
            return Sort.by(orderBy).ascending();
        }

        return Sort.by(orderBy).descending();
    }
}
