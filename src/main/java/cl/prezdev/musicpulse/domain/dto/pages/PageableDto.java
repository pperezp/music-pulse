package cl.prezdev.musicpulse.domain.dto.pages;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageableDto {
    private int offset;
    private int pageNumber;
    private int pageSize;
    private boolean paged;
    private SortDto sort;
}
