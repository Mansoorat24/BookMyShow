package com.example.Bookmyshow.Repository;

import com.example.Bookmyshow.Entities.Movie;
import com.example.Bookmyshow.Enums.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {


    Movie findMovieByMovieNameAndAndMovieLanguage(String movieName, Language language);


    Movie findMovieByMovieName(String movieName);

    List<Movie> findAllByDurationGreaterThanEqual(double duration);
}
