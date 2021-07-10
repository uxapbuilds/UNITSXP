package com.uxap.unitsxp.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uxap.unitsxp.R;
import com.uxap.unitsxp.controller.UnitTypesRecyclerAdapter;
import com.uxap.unitsxp.model.DataManager;
import com.uxap.unitsxp.model.ConversionTypeInfoModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView rvConversionTypes;
    private DataManager dataManager;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dataManager = new DataManager(getContext());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        new Thread(new Runnable() {
            @Override
            public void run() {
                rvConversionTypes = view.findViewById(R.id.rvUnits);
                rvConversionTypes.setLayoutManager(new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL));
                rvConversionTypes.setAdapter(new UnitTypesRecyclerAdapter(retrievedData(), getActivity()));
            }
        }).start();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public ArrayList<ConversionTypeInfoModel> retrievedData() {
        return dataManager.retrieveConversionTypeInfo();
    }
}