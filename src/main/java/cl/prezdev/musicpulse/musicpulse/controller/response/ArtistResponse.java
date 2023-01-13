package cl.prezdev.musicpulse.musicpulse.controller.response;

import cl.prezdev.musicpulse.musicpulse.dto.ArtistDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArtistResponse {
    private ArtistDto artistDto;
}
