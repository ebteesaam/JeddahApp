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

 * create an instance of this fragment.
 */
public class ResturantFragment extends Fragment {


    public ResturantFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.jeddah_list, container,false);


        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.stak)));
        locations.add(new Location(getString(R.string.Section)));
        locations.add(new Location(getString(R.string.munch)));

        JeddahAdapter adapter=new JeddahAdapter(getActivity(),locations,R.color.category_restaurant);

        ListView listView=rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;}}