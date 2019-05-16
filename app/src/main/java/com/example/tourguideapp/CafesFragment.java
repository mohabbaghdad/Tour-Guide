package com.example.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CafesFragment extends Fragment {
    public CafesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.world, container, false);

        final ArrayList<customArrayList> placeInfo = new ArrayList<customArrayList>();
        placeInfo.add(new customArrayList(R.string.Cafe_Toscana_name, R.string.Cafe_Toscana_address, R.drawable.cafe_toscana, R.string.phoneNumber1));
        placeInfo.add(new customArrayList(R.string.Spirit_name, R.string.Spirit_address, R.drawable.spirit_, R.string.phoneNumber2));
        placeInfo.add(new customArrayList(R.string.Mazzika_name, R.string.Mazzika_address, R.drawable.mazzika, R.string.phoneNumber1));
        placeInfo.add(new customArrayList(R.string.Bullet_name, R.string.Bullet_address, R.drawable.bullet, R.string.phoneNumber2));
        WorldAdapter adapter = new WorldAdapter(getActivity(), placeInfo, R.color.category_cafes);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
