package cl.prezdev.musicpulse.musicpulse.secondary.adapters.database.mysql.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "video_tag")
public class VideoTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "video_id", referencedColumnName = "id")
    private Video video;

    @ManyToOne
    @JoinColumn(name = "tag_id", referencedColumnName = "id")
    private Tag tag;
}
