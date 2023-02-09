package cl.prezdev.musicpulse.domain.dto.response;

import cl.prezdev.musicpulse.domain.dto.ArtistDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ArtistSearchResponse {
    private List<ArtistDto> artists;
}
