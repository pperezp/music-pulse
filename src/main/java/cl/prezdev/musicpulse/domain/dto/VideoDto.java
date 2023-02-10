package cl.prezdev.musicpulse.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VideoDto {
    private Long id;
    private String url;
    private List<TagDto> tags;
}
