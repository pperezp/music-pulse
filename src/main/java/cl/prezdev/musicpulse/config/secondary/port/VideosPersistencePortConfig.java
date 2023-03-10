package cl.prezdev.musicpulse.config.secondary.port;

import cl.prezdev.musicpulse.domain.ports.secondary.VideoPersistencePort;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@AllArgsConstructor
public class VideosPersistencePortConfig {

    private final VideoPersistencePort videosMySqlAdapter;

    @Primary @Bean
    public VideoPersistencePort getVideosPersistencePort() {
        return videosMySqlAdapter;
    }
}
