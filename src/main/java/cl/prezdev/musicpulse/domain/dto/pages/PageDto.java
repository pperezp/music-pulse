package cl.prezdev.musicpulse.domain.dto.pages;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageDto<T> {
    private int totalPages;
    private int totalElements;
    private int size;
    private int number;
    private int numberOfElements;
    private boolean last;
    private boolean first;
    private boolean empty;
    private List<T> content;
    private PageableDto pageable;
}
