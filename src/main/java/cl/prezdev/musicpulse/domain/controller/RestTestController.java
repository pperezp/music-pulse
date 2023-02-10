package cl.prezdev.musicpulse.domain.controller;

import cl.prezdev.musicpulse.domain.dto.Pagination;
import cl.prezdev.musicpulse.domain.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RestTestController {

    private final VideoService videoService;

    // curl -v http://localhost:8080/test
    @GetMapping("/test")

    public Object test() {
        Pagination pagination = new Pagination();

        pagination.setPage(0);
        pagination.setSize(1);

        return videoService.getVideos(1L, pagination);
    }
}
