package com.example.android.bangalore;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yogesh on 23-11-2016.
 */

public class PlaceAdapter extends ArrayAdapter {

    private int colorResourceId;

    PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        this.colorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace = (Place) getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name_textview);
        name.setText(currentPlace.getName());

        TextView location = (TextView) listItemView.findViewById(R.id.location_tetview);
        location.setText(currentPlace.getLocation());

        TextView cost = (TextView) listItemView.findViewById(R.id.cost_textview);
        TextView phone = (TextView) listItemView.findViewById(R.id.phone_textview);
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        if (currentPlace.hasCost()) {
            cost.setText(currentPlace.getCost());
            cost.setVisibility(View.VISIBLE);

        } else {
            cost.setVisibility(View.INVISIBLE);
        }
        if (currentPlace.hasPhone()) {
            phone.setText(currentPlace.getPhone());
            phone.setVisibility(View.VISIBLE);
        } else {
            phone.setVisibility(View.INVISIBLE);
        }
        if (currentPlace.hasImage()) {
            image.setImageResource(currentPlace.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        listItemView.setBackgroundColor(colorResourceId);


        return listItemView;
    }
}
