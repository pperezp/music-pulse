package cl.prezdev.musicpulse.domain.service;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.VideoDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;

public interface VideoService {
    PageDto<VideoDto> getVideos(Long artistId, Pagination pagination);
}
