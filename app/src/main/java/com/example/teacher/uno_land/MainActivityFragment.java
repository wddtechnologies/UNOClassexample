package com.example.teacher.uno_land;

/**
 * Created by teacher on 8/10/2016.
 * Louise Rennick instructor example of UNO Card game App
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the list_item_game layout
        View rootView = inflater.inflate(R.layout.list_item_game, container, false);

        return rootView;
    }
}