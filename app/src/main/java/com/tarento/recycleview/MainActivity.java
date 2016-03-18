package com.tarento.recycleview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        mAdapter=new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);

        movie = new Movie("Priya","Mohan","1993");
        movieList.add(movie);


        mAdapter.notifyDataSetChanged();
    }

}
