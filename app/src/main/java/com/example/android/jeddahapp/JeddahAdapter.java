package com.example.android.jeddahapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ebtesam on 12/23/2017 AD.
 */

public class JeddahAdapter extends ArrayAdapter<Location> {

    private int mColorResourceId;

    public JeddahAdapter(@NonNull Context context, ArrayList<Location> location, int colorResourceId) {
        super(context, 0,location);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null){
         listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        Location currentLocation = getItem(position);


        TextView name=listItemView.findViewById(R.id.name);

        name.setText(currentLocation.getName());

        TextView location=listItemView.findViewById(R.id.location);
        location.setText(currentLocation.getLocation());

        ImageView imageView=listItemView.findViewById(R.id.image);
        if(currentLocation.hasImage()){
            imageView.setImageResource(currentLocation.getImage());
            imageView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer=listItemView.findViewById(R.id.text_container);

        int color= ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}
