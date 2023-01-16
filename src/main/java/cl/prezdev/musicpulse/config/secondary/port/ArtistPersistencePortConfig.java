package cl.prezdev.musicpulse.config.secondary.port;

import cl.prezdev.musicpulse.secondary.ports.ArtistPersistencePort;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@AllArgsConstructor
public class ArtistPersistencePortConfig {

    private final ArtistPersistencePort artistMySqlAdapter;

    @Primary @Bean
    public ArtistPersistencePort getArtistPersistencePort() {
        return artistMySqlAdapter;
    }
}
