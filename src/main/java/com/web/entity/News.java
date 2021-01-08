package com.web.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "news")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "title")
    String title;

    @Column(name = "less_description")
    @Lob
    String lessDescription;

    @Column(name = "description")
    @Lob
    String description;

    @OneToOne(cascade = CascadeType.ALL)
    Image image;

    @Column(name = "url_youtube_video")
    String urlYouTubeVideo;

    @OneToOne(cascade = CascadeType.ALL)
    Game game;
}
