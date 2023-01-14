package cl.prezdev.musicpulse.musicpulse.domain.dto.response;

import cl.prezdev.musicpulse.musicpulse.domain.dto.ArtistDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArtistResponse {
    private ArtistDto artist;
}
