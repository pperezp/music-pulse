package cl.prezdev.musicpulse.domain.dto.pages;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SortDto {
    private boolean empty;
    private boolean sorted;
    private boolean unsorted;
}
