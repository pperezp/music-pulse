package cl.prezdev.musicpulse.domain.ports.secondary;

import cl.prezdev.musicpulse.domain.dto.DiscDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;

public interface DiscPersistencePort {
    PageDto<DiscDto> getDiscography(long artistId, Pagination pagination);
}
