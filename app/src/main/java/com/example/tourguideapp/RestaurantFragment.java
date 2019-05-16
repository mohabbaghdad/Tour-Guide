package com.example.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.world, container, false);

        final ArrayList<customArrayList> placeInfo = new ArrayList<customArrayList>();
        placeInfo.add(new customArrayList(R.string.Vogue_name, R.string.Vogue_address, R.drawable.vogue, R.string.phoneNumber1));
        placeInfo.add(new customArrayList(R.string.Souvlaki_name, R.string.Souvlaki_address, R.drawable.solvakia, R.string.phoneNumber2));
        placeInfo.add(new customArrayList(R.string.Cook_door_name, R.string.Cook_door_address, R.drawable.cook_door, R.string.phoneNumber1));
        placeInfo.add(new customArrayList(R.string.Holmes_Burgers_name, R.string.Holmes_Burgers_address, R.drawable.holmes, R.string.phoneNumber2));
        WorldAdapter adapter = new WorldAdapter(getActivity(), placeInfo, R.color.category_restaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
