package com.newsswipe.simonini.newsswipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create an ArrayList of fake news objects
        ArrayList<News> news = new ArrayList<News>();
        news.add(new News("45 pandas s'échappent d'un zoo", "14 décembre 2016"));
        news.add(new News("La folie des meme sur internet", "14 décembre 2016"));
        news.add(new News("Sauron: les citoyens n'ont pas compris mon projet politique", "14 décembre 2016"));

        // Create an {@link NewsAdapter}, whose data source is a list of
        // {@link News}s. The adapter knows how to create list item views for each item
        // in the list.
        NewsAdapter newsAdapter = new NewsAdapter(this, news);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView newsListView = (ListView) findViewById(R.id.list);
        newsListView.setAdapter(newsAdapter);
    }
}

