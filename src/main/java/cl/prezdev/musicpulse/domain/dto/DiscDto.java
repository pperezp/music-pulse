package cl.prezdev.musicpulse.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DiscDto {
    private long id;
    private String name;
    private int year;
    private List<DiscStreamingDto> streaming;
}
