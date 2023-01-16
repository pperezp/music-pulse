package cl.prezdev.musicpulse.secondary.adapters.persistence.mysql.adapter;

import cl.prezdev.musicpulse.secondary.adapters.persistence.mysql.model.Artist;
import cl.prezdev.musicpulse.secondary.adapters.persistence.mysql.repository.ArtistRepository;
import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.secondary.ports.ArtistPersistencePort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

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
    public Page<ArtistDto> getAllArtist(Pagination pagination) {
        Sort sort = getSort(pagination);
        Pageable pageable = PageRequest.of(pagination.getPage(), pagination.getSize(), sort);

        Page<Artist> artistPages = artistRepository.findAll(pageable);

        return artistPages.map(artist -> modelMapper.map(artist, ArtistDto.class));
    }

    private Sort getSort(Pagination pagination) {
        String orderBy = pagination.getOrderBy();

        if (pagination.isAsc()) {
            return Sort.by(orderBy).ascending();
        }

        return Sort.by(orderBy).descending();
    }
}
