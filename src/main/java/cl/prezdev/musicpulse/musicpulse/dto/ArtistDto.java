package cl.prezdev.musicpulse.musicpulse.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArtistDto {
    private Long id;
    private String name;
    private List<String> emails;
    private String image;
    private List<SocialMediaDto> socialMedia;
}
