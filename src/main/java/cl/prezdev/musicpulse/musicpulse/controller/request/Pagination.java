package cl.prezdev.musicpulse.musicpulse.controller.request;

import lombok.Getter;
import lombok.Setter;

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
        orderBy = "name";
        asc = true;
    }
}
