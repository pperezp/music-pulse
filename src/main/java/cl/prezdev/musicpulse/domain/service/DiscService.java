package cl.prezdev.musicpulse.domain.service;

import cl.prezdev.musicpulse.domain.dto.DiscDto;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;

public interface DiscService {
    PageDto<DiscDto> getDiscography(long artistId, Pagination pagination);
}
