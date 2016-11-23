package com.example.android.bangalore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Restaurants extends Fragment {

    private int colorResourceId = R.color.restaurantsColor;

    public Restaurants() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place("Ebony Restaurant", "MG Road", "₹3000", "080 4178 3344"));
        restaurants.add(new Place("The Tao Terraces", "Halasuru", "₹3500", "080 6001 5001"));
        restaurants.add(new Place("Samarkand", "Infantry Road", "₹5000", "080 4111 3366"));
        restaurants.add(new Place("Shiro", "Jayanagar", "₹5000", "090660 25211"));
        restaurants.add(new Place("Barbeque Nation", "Kasturba Road", "₹1000", "80 2286 6200"));
        restaurants.add(new Place("High Ultra Lounge", "Malleshwaram", "₹8000", "072599 51076"));
        restaurants.add(new Place("The Oberoi", "Sivanchetti Gardens", "₹3500", "080 2558 5858"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), restaurants, colorResourceId);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
