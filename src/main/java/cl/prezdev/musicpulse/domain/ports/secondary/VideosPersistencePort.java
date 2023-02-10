package cl.prezdev.musicpulse.domain.ports.secondary;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.VideoDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;

public interface VideosPersistencePort {
    PageDto<VideoDto> getVideos(long artistId, Pagination pagination);
}
