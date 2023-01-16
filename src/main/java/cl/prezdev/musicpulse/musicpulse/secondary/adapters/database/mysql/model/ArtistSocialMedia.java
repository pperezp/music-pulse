package cl.prezdev.musicpulse.musicpulse.secondary.adapters.database.mysql.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "artist_social_media")
public class ArtistSocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_id")
    private String nameId;

    @ManyToOne
    @JoinColumn(name = "artist_id", referencedColumnName = "id")
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "social_media_id", referencedColumnName = "id")
    private SocialMedia socialMedia;

    @Column(name = "url")
    private String url;
}
