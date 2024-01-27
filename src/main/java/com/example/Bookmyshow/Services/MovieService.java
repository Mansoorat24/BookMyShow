package com.example.Bookmyshow.Services;

import com.example.Bookmyshow.Entities.Movie;
import com.example.Bookmyshow.Repository.MovieRepository;
import com.example.Bookmyshow.Requests.AddMovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.Bookmyshow.Entities.Movie.*;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public String addMovie(AddMovieRequest movieRequest){


        //new Method : create Object using the Builder annotation:
        Movie movie = Movie.builder()
                .movieLanguage(movieRequest.getMovieLanguage())
                .movieName(movieRequest.getMovieName())
                .duration(movieRequest.getDuration())
                .genre(movieRequest.getGenre())
                .releaseDate(movieRequest.getReleaseDate())
                .build();

       movie=movieRepository.save(movie);
        return "The movie has been saved with the movieId" +movie.getMovieId();
    }
}
