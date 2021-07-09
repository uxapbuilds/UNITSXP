package com.uxap.unitsxp.controller;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uxap.unitsxp.ConversionActivity;
import com.uxap.unitsxp.R;
import com.uxap.unitsxp.model.ConversionTypeInfoModel;
import com.uxap.unitsxp.view.UnitTypesRecyclerViewHolder;

import java.util.ArrayList;

public class UnitTypesRecyclerAdapter extends RecyclerView.Adapter<UnitTypesRecyclerViewHolder> {
    ArrayList<ConversionTypeInfoModel> conversionTypeInfoModelArrayList;
    Activity activity;
    public UnitTypesRecyclerAdapter(ArrayList<ConversionTypeInfoModel> conversionTypeInfoModelArrayList, Activity activity) {
        this.conversionTypeInfoModelArrayList = conversionTypeInfoModelArrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public UnitTypesRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.conversion_type_recycler_layout, parent, false);
        return new UnitTypesRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UnitTypesRecyclerViewHolder holder, int position) {
        ConversionTypeInfoModel conversionTypeInfoModel = conversionTypeInfoModelArrayList.get(position);
        Log.i("HOME_RES_DATA", conversionTypeInfoModel.getConversionTypeName()+"/"+conversionTypeInfoModel.getImgDrawableId());
        holder.getIvUnitLogo().setImageResource(conversionTypeInfoModel.getImgDrawableId());
        holder.getTxtUnitType().setText(conversionTypeInfoModel.getConversionTypeName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toConversionActivity = new Intent(activity, ConversionActivity.class);
                toConversionActivity.putExtra("unitVal", conversionTypeInfoModel.getConversionTypeName());
                toConversionActivity.putExtra("unitImage", conversionTypeInfoModel.getImgDrawableId());
                activity.startActivity(toConversionActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return conversionTypeInfoModelArrayList.size();
    }
}
