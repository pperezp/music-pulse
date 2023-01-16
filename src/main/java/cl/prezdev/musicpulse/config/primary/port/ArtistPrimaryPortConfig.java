package cl.prezdev.musicpulse.config.primary.port;

import cl.prezdev.musicpulse.primary.ports.ArtistPrimaryPort;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@AllArgsConstructor
public class ArtistPrimaryPortConfig {

    private final ArtistPrimaryPort artistPrimaryAdapter;

    @Primary @Bean
    public ArtistPrimaryPort getArtistPrimaryPort() {
        return artistPrimaryAdapter;
    }
}
