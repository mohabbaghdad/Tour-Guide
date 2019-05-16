package com.example.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsFragment extends Fragment {
    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.world, container, false);

        final ArrayList<customArrayList> placeInfo = new ArrayList<customArrayList>();
        placeInfo.add(new customArrayList(R.string.east_shopping_mall_name, R.string.east_shopping_mall_address, R.drawable.east_shopping_center, R.string.phoneNumber1));
        placeInfo.add(new customArrayList(R.string.boxpark__shoreditch_name, R.string.boxpark__shoreditch_address, R.drawable.boxpark_shoreditch, R.string.phoneNumber2));
        placeInfo.add(new customArrayList(R.string.one_new_change_mall_name, R.string.one_new_change_mall_address, R.drawable.one_new_change, R.string.phoneNumber1));
        placeInfo.add(new customArrayList(R.string.angel_centeral_mall_name, R.string.angel__centeral_address, R.drawable.angel_mall_center, R.string.phoneNumber2));
        WorldAdapter adapter = new WorldAdapter(getActivity(), placeInfo, R.color.category_malls);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
