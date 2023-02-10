package cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.adapter;

import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.model.Video;
import cl.prezdev.musicpulse.adapters.secondary.persistence.mysql.repository.VideoRepository;
import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.dto.VideoDto;
import cl.prezdev.musicpulse.domain.dto.pages.PageDto;
import cl.prezdev.musicpulse.domain.ports.secondary.VideoPersistencePort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class VideoMySqlAdapter implements VideoPersistencePort {

    private final VideoRepository videoRepository;
    private final ModelMapper modelMapper;

    @Override
    public PageDto<VideoDto> getVideos(long artistId, Pagination pagination) {
        Pageable pageable = pagination.toPageable();

        Page<Video> videosPages = videoRepository.findByArtistId(artistId, pageable);
        Page<VideoDto> page = videosPages.map(video -> modelMapper.map(video, VideoDto.class));

        PageDto<VideoDto> pageDto = new PageDto<>();
        modelMapper.map(page, pageDto);

        return pageDto;
    }
}
