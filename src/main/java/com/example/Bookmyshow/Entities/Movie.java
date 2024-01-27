package com.example.Bookmyshow.Entities;


import com.example.Bookmyshow.Enums.Genre;
import com.example.Bookmyshow.Enums.Language;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="movie_info")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer movieId;
    @Column(unique=true,nullable = false)
    private String movieName;
    @Enumerated(value=EnumType.STRING)
    private Genre genre;
    private double rating;
    @Enumerated(value=EnumType.STRING)
    private Language movieLanguage;
    private LocalDate releaseDate;
     private double duration;
     @OneToMany(mappedBy = "movie",cascade=CascadeType.ALL)
     private List<Show> showList= new ArrayList<>();



}
