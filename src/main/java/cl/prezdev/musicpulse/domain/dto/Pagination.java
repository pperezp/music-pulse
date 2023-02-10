package cl.prezdev.musicpulse.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Getter
@Setter
public class Pagination {

    private int page;
    private int size;
    private String orderBy;
    private boolean asc;

    public Pagination() {
        page = 0;
        size = 100;
        orderBy = null;
        asc = true;
    }

    public Pageable toPageable() {
        Sort sort = getSort();

        if (sort == null) {
            return PageRequest.of(page, size);
        }

        return PageRequest.of(page, size, sort);
    }

    public Sort getSort() {
        if (orderBy == null) {
            return null;
        }

        if (asc) {
            return Sort.by(orderBy).ascending();
        }

        return Sort.by(orderBy).descending();
    }

    public void checkSize() {
        if (size == 100) {
            size = 15;
        }
    }
}
