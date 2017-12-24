package com.example.android.jeddahapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.jeddah_list, container,false);


        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.arab),R.drawable.arabd,getString(R.string.arabL)));
        locations.add(new Location(getString(R.string.aziz), R.drawable.azizd, getString(R.string.azizL)));
        locations.add(new Location(getString(R.string.redSea), R.drawable.redsead,getString(R.string.redSeaL)));

        JeddahAdapter adapter=new JeddahAdapter(getActivity(),locations,R.color.category_mall);

        ListView listView=rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

      return rootView;
    }
}
