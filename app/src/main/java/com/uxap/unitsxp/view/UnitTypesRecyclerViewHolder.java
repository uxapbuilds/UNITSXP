package com.uxap.unitsxp.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uxap.unitsxp.R;

public class UnitTypesRecyclerViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivUnitLogo;
    private TextView txtUnitType;
    public UnitTypesRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        ivUnitLogo = itemView.findViewById(R.id.ivUnitLogo);
        txtUnitType = itemView.findViewById(R.id.txtUnitType);
    }

    public ImageView getIvUnitLogo() {
        return ivUnitLogo;
    }

    public TextView getTxtUnitType() {
        return txtUnitType;
    }

}
