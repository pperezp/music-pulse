package cl.prezdev.musicpulse.domain.service.impl;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.VideoDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.ports.secondary.VideosPersistencePort;
import cl.prezdev.musicpulse.domain.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class VideoServiceImpl implements VideoService {

    private final VideosPersistencePort videosPersistencePort;

    @Override
    public PageDto<VideoDto> getVideos(Long artistId, Pagination pagination) {
        pagination.checkSize();
        return videosPersistencePort.getVideos(artistId, pagination);
    }
}
