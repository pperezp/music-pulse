package cl.prezdev.musicpulse.domain.dto.response;

import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArtistResponse {
    private ArtistDto artist;
}
