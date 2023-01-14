package cl.prezdev.musicpulse.musicpulse.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArtistSocialMediaDto {
    private Long id;
    private String nameId;
    private String url;
    private SocialMediaDto socialMedia;
}
