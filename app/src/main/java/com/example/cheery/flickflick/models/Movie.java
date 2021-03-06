package com.example.cheery.flickflick.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Movie {

    double voteAverage;
    String posterPath;
    String title;
    String overview;
    String backdropPath;
    int movieId;

    public Movie() { } // empty constructor needed by Parceler library

    public Movie(JSONObject jsonObject) throws JSONException {
            posterPath = jsonObject.optString("poster_path");
            title = jsonObject.optString("title");
            overview = jsonObject.optString("overview");
            backdropPath = jsonObject.optString("backdrop_path");
            voteAverage = jsonObject.optDouble("vote_average");
            movieId = jsonObject.optInt("id");
    }

    public static List<Movie> fromJsonArray(JSONArray movieJsonArray) throws JSONException {
        List<Movie> movies = new ArrayList<Movie>();
        for (int i = 0; i < movieJsonArray.length(); i++) {
            movies.add(new Movie(movieJsonArray.getJSONObject(i)));
        }
        return movies;
    }

    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", posterPath);
    }

    public String getBackdropPath() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", backdropPath);
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public double getVoteAverage() { return voteAverage; }

    public int getMovieId() { return movieId; }
}
