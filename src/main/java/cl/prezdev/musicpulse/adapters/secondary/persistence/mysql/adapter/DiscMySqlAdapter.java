package cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.adapter;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.model.Disc;
import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.repository.DiscRepository;
import cl.prezdev.musicpulse.domain.dto.DiscDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.ports.secondary.DiscPersistencePort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DiscMySqlAdapter implements DiscPersistencePort {

    private final DiscRepository discRepository;
    private final ModelMapper modelMapper;

    @Override
    public PageDto<DiscDto> getDiscography(long artistId, Pagination pagination) {
        Pageable pageable = pagination.toPageable();

        Page<Disc> discPage = discRepository.findByArtistId(artistId, pageable);
        Page<DiscDto> page = discPage.map(video -> modelMapper.map(video, DiscDto.class));

        PageDto<DiscDto> pageDto = new PageDto<>();
        modelMapper.map(page, pageDto);

        return pageDto;
    }
}
