package com.example.jasjo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements View.OnClickListener{
    ListView listView;
    Mylistener listener;

    //GridView listView;

    //RecyclerView recyclerView;

    ArrayList<News> newsList;
    NewsAdapter adapter;

    public BlankFragment() {
        // Required empty public constructor
    }


    void initViews() {

        //listView = findViewById(R.id.listView);
        //recyclerView = findViewById(R.id.recyclerView);

        newsList = new ArrayList<>();

        News news1 = new News(R.drawable.zee,"Zee News", "http://zeenews.india.com/");
        News news2 = new News(R.drawable.ajjtak, "Aaj Tak", "https://aajtak.intoday.in/");
        News news3 = new News(R.drawable.cnn, "CNN IBN", "https://www.news18.com/");
        News news4 = new News(R.drawable.ndtv, "NDTV", "https://www.ndtv.com/");
        News news5 = new News(R.drawable.indiatoday, "India Today", "https://www.indiatoday.in/\n");
        /*News news6 = new News(R.drawable.category, "Aaj Tak", "http://zeenews.india.com/");
        News news7 = new News(R.drawable.lightbulb, "Aaj Tak", "http://zeenews.india.com/");
*/
        newsList.add(news1); // 0
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news5); // 4
        /*newsList.add(news6);
        newsList.add(news7);*/

        adapter = new NewsAdapter(getActivity(), R.layout.item_list, newsList);
        listView.setAdapter(adapter);


    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_blank, container, false);
        listView = v.findViewById(R.id.listView);
        initViews();


        /*// Inflate the layout for this fragment
        v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            switch(position){
                case 1:
                    // do your work
                    break;
            }
        }
    });
*/
        return v;


    }
       
  /* @Override
  public void onClick(View v) {
        Toast.makeText(getContext(),"You Clicked item ",Toast.LENGTH_LONG).show();
        listener.handler("url");
    }*/
    public void registerMylistener(Mylistener listener){
        this.listener = listener;
    }


    @Override
    public void onClick(View v) {

    }
}
