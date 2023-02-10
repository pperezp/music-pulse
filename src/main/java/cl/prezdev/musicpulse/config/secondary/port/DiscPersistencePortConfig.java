package cl.prezdev.musicpulse.config.secondary.port;

import cl.prezdev.musicpulse.domain.ports.secondary.DiscPersistencePort;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@AllArgsConstructor
public class DiscPersistencePortConfig {

    private final DiscPersistencePort discMySqlAdapter;

    @Primary @Bean
    public DiscPersistencePort getDiscPersistencePort() {
        return discMySqlAdapter;
    }
}
