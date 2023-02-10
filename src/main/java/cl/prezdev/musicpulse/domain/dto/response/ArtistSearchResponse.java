package cl.prezdev.musicpulse.domain.dto.response;

import cl.prezdev.musicpulse.domain.dto.ArtistLiteDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ArtistSearchResponse {
    private List<ArtistLiteDto> artists;
}
