package com.example.Bookmyshow.Requests;

import com.example.Bookmyshow.Enums.Genre;
import com.example.Bookmyshow.Enums.Language;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;


@Data
public class AddMovieRequest {
    private String movieName;
    private Genre genre;
    private Language movieLanguage;
    private LocalDate releaseDate;
    private double duration;
    private double rating;
}
