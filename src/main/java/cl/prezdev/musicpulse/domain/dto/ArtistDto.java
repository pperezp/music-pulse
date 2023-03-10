package cl.prezdev.musicpulse.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArtistDto {
    private long id;
    private String name;
    private String imageUrl;
    private CountryDto country;
    private List<ArtistContactInfoDto> contactsInfo;
    private List<ArtistSocialMediaDto> socialsMedia;
}
