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
public class TabFragment3 extends Fragment {


    private RecyclerView fRecyclerView;
    private ArrayList<Fun> fFoodsList;
    private SportListAdapter fListAdapter;

    public TabFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tab_fragment3, container, false);

        fFoodsList = new ArrayList<>();

        // Get reference to the recycler view
        fRecyclerView = rootView.findViewById(R.id.recycler_view);

        // get our adapter also
        fListAdapter = new SportListAdapter(getContext(), fFoodsList);

        // set adapter
        fRecyclerView.setAdapter(fListAdapter);

        // set our LayoutManager
        fRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        initializeData();

        return rootView;
    }

    private void initializeData() {

        // Get food list from the XMl
        String[] foodList = getResources().getStringArray(R.array.food_name);

        //Use typed array to get the drawable resources

        TypedArray getImageResources = getResources().obtainTypedArray(R.array.food_images);

        fFoodsList.clear();

        // Load the data into the ArrayList

        for(int i=0; i< foodList.length; i++){
            fFoodsList.add(new Fun(foodList[i], getImageResources.getResourceId(i, 0)));
        }

        // Clean up the TypedArray

        getImageResources.recycle();

        // Update the list

        fListAdapter.notifyDataSetChanged();

    }

}
