package com.example.Bookmyshow.CustomExceptions;

public class InvalidMovieException extends Exception{
    public InvalidMovieException(String message) {
        super(message);
    }
}
