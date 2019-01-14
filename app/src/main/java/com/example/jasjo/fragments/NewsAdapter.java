package com.example.jasjo.fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News>{

    Context context;
    int resource;
    Mylistener mylistener;
    ArrayList<News> objects;

    public NewsAdapter(Context context, int resource, ArrayList<News> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    // getView method will be executed n number of times from 0 to n-1
    // n is size of objects
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        // view is pointing to list item
        View view = inflater.inflate(resource, parent, false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "you selected", Toast.LENGTH_LONG).show();

            }
        });
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView txtTitle = view.findViewById(R.id.textViewNewsTitle);
        TextView txtURL = view.findViewById(R.id.textViewURL);

        News news = objects.get(position);
        imageView.setBackgroundResource(news.image);
        txtTitle.setText(news.title);
        txtURL.setText(news.url);


        return view;
    }


}