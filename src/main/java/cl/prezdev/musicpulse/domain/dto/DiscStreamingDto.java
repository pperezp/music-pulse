package cl.prezdev.musicpulse.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscStreamingDto {
    private int id;
    private String url;
    private SocialMediaDto socialMedia;
}
