package cl.prezdev.musicpulse.secondary.adapters.database.mysql.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "disc_streaming")
public class DiscStreaming {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "disc_id", referencedColumnName = "id")
    private Disc disc;

    @ManyToOne
    @JoinColumn(name = "social_media_id", referencedColumnName = "id")
    private SocialMedia socialMedia;

    @Column(name = "url")
    private String url;
}
