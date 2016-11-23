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
public class TopAttractions extends Fragment {

    private int colorResourceId = R.color.topAttractionsColor;

    public TopAttractions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> attractions = new ArrayList<>();
        attractions.add(new Place("Wonderla", "Mysore Road", "₹1250", "80 2201 0333", R.drawable.image_wonderla));
        attractions.add(new Place("Iskcon Temple", "Hare Krishna Hill", "₹500", "80 2347 1956", R.drawable.image_iskcon));
        attractions.add(new Place("UB City", "Vittal Mallya Road", "₹500", "97316 00994", R.drawable.image_ub_city));
        attractions.add(new Place("Ragigudda Anjaneya Temple", "Jayanagar", "₹0", "80 2658 0500", R.drawable.image_ragigudda));
        attractions.add(new Place("Visvesvaraya Museum", "Kasturba Road", "₹500", "80 2286 6200", R.drawable.image_visverwaraya_museum));
        attractions.add(new Place("Art of Living Center", "Kanakapura Road", "₹800", "80672 62626", R.drawable.image_art_of_living));
        attractions.add(new Place("Lalbagh Garden", "Lalbagh", "₹350", "80 2657 8184", R.drawable.image_lalbagh));
        attractions.add(new Place("Cubbon Park", "MG Road", "₹200", "80561 24234", R.drawable.image_cubbon_park));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), attractions, colorResourceId);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
