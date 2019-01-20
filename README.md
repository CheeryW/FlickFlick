# FlickFlick
FlickFlick is an app that allows users to browse movies from the [The Movie Database API](http://docs.themoviedb.apiary.io/#).

📝 Part 2 coming soon

## Flix Part 1

### User Stories

#### REQUIRED (10pts)
- [x] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [x] (2pts) Views should be responsive for both landscape/portrait mode.
   - [x] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [x] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.

- [ ] (2pts) Display a nice default [placeholder graphic](https://guides.codepath.com/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
- [ ] (2pts) Improved the user interface by experimenting with styling and coloring.
- [ ] (2pts) For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.

### App Walkthough GIF
<img src="http://g.recordit.co/8kfDizy0js.gif" width=500><br>

### Notes
I got an error that simply gives me error messages such as "couldn't load memtrack" and "getDiskStats failed". I tried to use 
different emulators and wipe previous data from old emulators, but none of those methods worked. After trying for hours, I seeked
help from CodePath staff. Thanks to Caren and Nathan, I discovered that my error is caused by missing the line that sets adapter
for recyclerview and using getString() instead of optString() inside if(jsonObject.optJSONObject("xxx") != null) clause to get 
title, poster image, and movie overview. 

### Open-source libraries used
- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
