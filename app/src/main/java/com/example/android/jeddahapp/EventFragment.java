package com.example.android.jeddahapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * to handle interaction events.

 * create an instance of this fragment.
 */
public class EventFragment extends Fragment {

    public EventFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.jeddah_list, container,false);

        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location(getString(R.string.BooksReader)));
        locations.add(new Location(getString(R.string.Zeo)));
        locations.add(new Location(getString(R.string.aljenadrial)));

        JeddahAdapter adapter=new JeddahAdapter(getActivity(),locations,R.color.category_event);

        ListView listView=rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;}


}
