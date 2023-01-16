package cl.prezdev.musicpulse.musicpulse.config.ports.secondary;

import cl.prezdev.musicpulse.musicpulse.secondary.ports.database.ArtistPort;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@AllArgsConstructor
public class ArtistPortConfig {

    private final ArtistPort artistPortMySqlAdapter;

    @Primary @Bean
    public ArtistPort getArtistPort() {
        return artistPortMySqlAdapter;
    }
}
