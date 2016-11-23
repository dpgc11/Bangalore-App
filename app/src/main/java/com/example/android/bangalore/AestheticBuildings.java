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
public class AestheticBuildings extends Fragment {

    private int color = R.color.aestheticColor;

    public AestheticBuildings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> buildings = new ArrayList<>();
        buildings.add(new Place("Vidhana Soudha", "MG Road", R.drawable.image_vidhan_saudha));
        buildings.add(new Place("Attara Kacheri", "MG Road", R.drawable.image_attara_kacheri));
        buildings.add(new Place("UB City", "Vittal Mallya Road", R.drawable.image_ub_city));
        buildings.add(new Place("Bangalore Palace", "Palace Road", R.drawable.image_bangalore_palace));
        buildings.add(new Place("Sheshadri Iyer Memorial Hall", "Yelahanka", R.drawable.image_sheshadri));
        buildings.add(new Place("Bagmane Tech park", "Whitefield", R.drawable.image_bagmane));
        buildings.add(new Place("Lalbagh Garden", "Lalbagh", R.drawable.image_lalbagh));
        buildings.add(new Place("Tipu Sultan’s Summer Palace", "Palace Road", R.drawable.image_tipu));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), buildings, color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
