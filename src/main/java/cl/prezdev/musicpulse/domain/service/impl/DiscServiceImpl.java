package cl.prezdev.musicpulse.domain.service.impl;

import cl.prezdev.musicpulse.domain.dto.DiscDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.ports.secondary.DiscPersistencePort;
import cl.prezdev.musicpulse.domain.service.DiscService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DiscServiceImpl implements DiscService {

    private final DiscPersistencePort discPersistencePort;

    @Override
    public PageDto<DiscDto> getDiscography(long artistId, Pagination pagination) {
        pagination.checkSize();
        return discPersistencePort.getDiscography(artistId, pagination);
    }
}
