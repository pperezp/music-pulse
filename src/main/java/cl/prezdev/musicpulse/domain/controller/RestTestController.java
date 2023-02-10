package cl.prezdev.musicpulse.domain.controller;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.service.DiscService;
import cl.prezdev.musicpulse.domain.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RestTestController {

    private final VideoService videoService;
    private final DiscService discService;
    // curl -v http://localhost:8080/test
    @GetMapping("/test")

    public Object test() {
        Pagination pagination = new Pagination();

        pagination.setPage(0);
        pagination.setSize(10);

        return discService.getDiscography(1L, pagination);
    }
}
