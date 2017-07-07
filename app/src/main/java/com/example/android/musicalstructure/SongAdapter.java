package com.example.android.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.songTitle);
        titleTextView.setText(currentSong.getTitle());
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.songArtist);
        artistTextView.setText(currentSong.getArtist());
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.songAlbum);
        albumTextView.setText(currentSong.getAlbum());

        return listItemView;
    }

}
