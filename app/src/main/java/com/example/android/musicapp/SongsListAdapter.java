package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsListAdapter extends ArrayAdapter<Songs> {

    private Context mContext;
    private int mResource;

    /**
     * Default constructor for the PersonListAdapter
     * @param context
     * @param resource
     * @param objects
     */
    public SongsListAdapter(Context context, int resource, ArrayList<Songs> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the songs information
        String name = getItem(position).getName();
        String singer = getItem(position).getSinger();
        String time = getItem(position).getTime();

        //Create the song object with the information
        Songs song = new Songs(name,singer,time);

            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);

           TextView sname = (TextView) convertView.findViewById(R.id.textView1);
           TextView ssinger = (TextView) convertView.findViewById(R.id.textView2);
           TextView stime = (TextView) convertView.findViewById(R.id.textView3);

           sname.setText(name);
           ssinger.setText(singer);
           stime.setText(time);

        return convertView;
    }
}