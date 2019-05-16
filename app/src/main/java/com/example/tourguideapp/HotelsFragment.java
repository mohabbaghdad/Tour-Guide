package com.example.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.world, container, false);

        final ArrayList<customArrayList> placeInfo = new ArrayList<customArrayList>();
        placeInfo.add(new customArrayList(R.string.Hilton_name, R.string.Grand_plaza_Address, R.drawable.grand_plaza, R.string.phoneNumber1));
        placeInfo.add(new customArrayList(R.string.Royal_Crown_name, R.string.Royal_Crown, R.drawable.royal_crown, R.string.phoneNumber2));
        placeInfo.add(new customArrayList(R.string.Hilton_name, R.string.Hilton, R.drawable.hilton, R.string.phoneNumber1));
        placeInfo.add(new customArrayList(R.string.Tolip_name, R.string.Tolip, R.drawable.tolip, R.string.phoneNumber2));
        WorldAdapter adapter = new WorldAdapter(getActivity(), placeInfo, R.color.category_hotels);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
