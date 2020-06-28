package dev.mks.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    MovieRecyclerAdapter movieRecyclerAdapter;

    List<MovieListModel> movieListModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        prepareMovieData();
        movieRecyclerAdapter = new MovieRecyclerAdapter(movieListModels,this);
        recyclerView.setAdapter(movieRecyclerAdapter);

    }
    private void prepareMovieData() {
        MovieListModel movie = new MovieListModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieListModels.add(movie);

        movie = new MovieListModel("Inside Out", "Animation, Kids & Family", "2015");
        movieListModels.add(movie);

        movie = new MovieListModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieListModels.add(movie);

        movie = new MovieListModel("Shaun the Sheep", "Animation", "2015");
        movieListModels.add(movie);

        movie = new MovieListModel("The Martian", "Science Fiction & Fantasy", "2015");
        movieListModels.add(movie);

        movie = new MovieListModel("Mission: Impossible Rogue Nation", "Action", "2015");
        movieListModels.add(movie);

        movie = new MovieListModel("Up", "Animation", "2009");
        movieListModels.add(movie);

        movie = new MovieListModel("Star Trek", "Science Fiction", "2009");
        movieListModels.add(movie);

        movie = new MovieListModel("The LEGO Movie", "Animation", "2014");
        movieListModels.add(movie);

        movie = new MovieListModel("Iron Man", "Action & Adventure", "2008");
        movieListModels.add(movie);

        movie = new MovieListModel("Aliens", "Science Fiction", "1986");
        movieListModels.add(movie);

        movie = new MovieListModel("Chicken Run", "Animation", "2000");
        movieListModels.add(movie);

        movie = new MovieListModel("Back to the Future", "Science Fiction", "1985");
        movieListModels.add(movie);

        movie = new MovieListModel("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieListModels.add(movie);

        movie = new MovieListModel("Goldfinger", "Action & Adventure", "1965");
        movieListModels.add(movie);

        movie = new MovieListModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieListModels.add(movie);

    }
}