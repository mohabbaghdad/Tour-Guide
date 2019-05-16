package com.example.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WorldAdapter extends ArrayAdapter<customArrayList> {
    private int mColorResourceId;

    public WorldAdapter(Context context, ArrayList<customArrayList> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        customArrayList currentWord = getItem(position);

        TextView tourGuideTextView = (TextView) listItemView.findViewById(R.id.title_TextView);
        tourGuideTextView.setText(currentWord.getmPlaceName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);

        addressTextView.setText(currentWord.getmAddress());

        TextView phone_numberTextView = (TextView) listItemView.findViewById(R.id.phone_number_text_view);

        phone_numberTextView.setText(currentWord.getmPhoneNumber());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.listItemImage);
        imageView.setImageResource(currentWord.getImageId());

        View textContainer = listItemView.findViewById(R.id.container_text);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}