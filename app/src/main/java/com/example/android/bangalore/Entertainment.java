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
public class Entertainment extends Fragment {

    private int colorResourceId = R.color.entertainmentColor;

    public Entertainment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> attractions = new ArrayList<>();
        attractions.add(new Place("Innovative Film City", "Bidadi", "₹1250", "080 2209 9999", R.drawable.image_innovative));
        attractions.add(new Place("Snow City", "JC Nagar", "₹1500", "080 2355 0000", R.drawable.image_snow));
        attractions.add(new Place("iAMGAME - PLaY Studio", "Jayanagar", "₹600", "080 4146 4263", R.drawable.image_iamgame));
        attractions.add(new Place("Lazer Castle", "Kasturba Road", "₹600", "098452 07866", R.drawable.image_lazer));
        attractions.add(new Place("Fun World", "JC Road", "₹1000", "088616 55993", R.drawable.image_fun_world));
        attractions.add(new Place("The Escape Hunt", "Indira nagar", "₹350", "098453 33058", R.drawable.image_escape));
        attractions.add(new Place("Smaaash", "Ulsoor", "₹500", "080 2506 6900", R.drawable.image_smash));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), attractions, colorResourceId);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
