package com.example.cheery.flickflick.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String posterPath;
    String title;
    String overview;

    public Movie(JSONObject jsonObject) throws JSONException {
        //if(jsonObject.optJSONObject("poster_path") != null) {
            posterPath = jsonObject.getString("poster_path");
      //  }
//        if(jsonObject.optJSONObject("original_title") != null) {
            title = jsonObject.getString("original_title");
//        }
//        if(jsonObject.optJSONObject("overview") != null) {
            overview = jsonObject.getString("overview");
//        }
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

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }
}
