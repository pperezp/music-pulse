package cl.prezdev.musicpulse.config.secondary.port;

import cl.prezdev.musicpulse.domain.ports.secondary.VideosPersistencePort;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@AllArgsConstructor
public class VideosPersistencePortConfig {

    private final VideosPersistencePort videosMySqlAdapter;

    @Primary @Bean
    public VideosPersistencePort getVideosPersistencePort() {
        return videosMySqlAdapter;
    }
}
