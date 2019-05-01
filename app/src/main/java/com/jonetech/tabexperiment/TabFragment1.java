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
public class TabFragment1 extends Fragment {


    private RecyclerView fRecyclerView;
    private ArrayList<Fun> fSmileys;
    private SportListAdapter fSportListAdapter;

    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tab_fragment1, container, false);

        fSmileys = new ArrayList<>();

        fRecyclerView =  rootView.findViewById(R.id.recycler_view);

        fSportListAdapter = new SportListAdapter(getContext(),fSmileys );

        fRecyclerView.setAdapter(fSportListAdapter);

        fRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        initializeData();

        return rootView;
    }

    private void initializeData() {

        // Get arraylist data from the XML strings file

        String[] smileyList = getResources().getStringArray(R.array.smiley_name);

        // Using TypeArray to get the resources for our images

        TypedArray smileyImages = getResources().obtainTypedArray(R.array.smiley_images);

        // Clear all the data in the arraylist to avoid duplications

        fSmileys.clear();

        // Create the ArrayList of Smileys with Name and images

        for(int i=0; i<smileyList.length; i++){
            fSmileys.add(new Fun(smileyList[i], smileyImages.getResourceId(i, 0)));
        }

        // Clean up the TypedArray
        smileyImages.recycle();

        // Update Adapter
        fSportListAdapter.notifyDataSetChanged();

    }

}
