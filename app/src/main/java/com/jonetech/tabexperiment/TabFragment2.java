package com.jonetech.tabexperiment;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment2 extends Fragment {

    private RecyclerView fRecyclerView;
    private SportListAdapter fListAdapter;
    private ArrayList<Fun> sportData;


    public TabFragment2() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        sportData = new ArrayList<>();

        View view = inflater.inflate(R.layout.tab_fragment2, container, false);

        // Get reference to the RecyclerView
        fRecyclerView = view.findViewById(R.id.recycler_view);

        // Initialize ListAdapter
        fListAdapter = new SportListAdapter(getContext(), sportData);

        fRecyclerView.setAdapter(fListAdapter);

        fRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        initializeData();

        return view;

    }

    private void initializeData() {

        // Get list of data from the XML arrays
        String[] sportList = getResources().getStringArray(R.array.sport_name);

        // Get the images resources also in a typedArray
        TypedArray getImageResources = getResources().obtainTypedArray(R.array.sport_images);

        // Clear the arraylist to avoid duplications
        sportData.clear();

        // Populate the arraylist with our Data

        for (int i = 0; i < sportList.length; i++) {
            sportData.add(new Fun(sportList[i], getImageResources.getResourceId(i, 0)));
        }

        // Clean up the TypedArray
        getImageResources.recycle();

        // Update the recycle view list
        fListAdapter.notifyDataSetChanged();
    }


}
