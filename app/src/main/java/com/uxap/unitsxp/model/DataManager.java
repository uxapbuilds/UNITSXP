package com.uxap.unitsxp.model;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import com.uxap.unitsxp.R;
import com.uxap.unitsxp.constants.ConversionTypes;

import java.util.ArrayList;
import java.util.Map;

public class DataManager {
    SharedPreferences sharedPreferences;
    private final static int EMPTY = 0;
    private Context context;

    public DataManager(Context context) {
        this.context = context;
        setInitialConversionTypeInfoData();
    }

    public void saveConversionTypeInfo(int unitImage, String unitName) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (!sharedPreferences.contains(unitName)) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt(unitName, unitImage);
            editor.apply();
        }
    }

    public ArrayList<ConversionTypeInfoModel> retrieveConversionTypeInfo() {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Map<String, ?> retrievedMapData = sharedPreferences.getAll();
        ArrayList<ConversionTypeInfoModel> conversionTypeInfoModelArrayList = new ArrayList<>();
        for (Map.Entry<String, ?> entry : retrievedMapData.entrySet()) {
            ConversionTypeInfoModel conversionTypeInfoModel = new ConversionTypeInfoModel((Integer) entry.getValue(), entry.getKey());
            conversionTypeInfoModelArrayList.add(conversionTypeInfoModel);
        }
        return conversionTypeInfoModelArrayList;
    }

    public void setInitialConversionTypeInfoData() {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        new Thread(new Runnable() {
            @Override
            public void run() {
                saveConversionTypeInfo(R.drawable.length, ConversionTypes.LENGTH);
                saveConversionTypeInfo(R.drawable.clock, ConversionTypes.TIME);
                saveConversionTypeInfo(R.drawable.exchange, ConversionTypes.CURRENCY);
//                    saveConversionTypeInfo(R.drawable.torque, ConversionTypes.TORQUE);
//                    saveConversionTypeInfo(R.drawable.timezone, ConversionTypes.TIME_ZONE);
//                    saveConversionTypeInfo(R.drawable.power, ConversionTypes.POWER);
//                    saveConversionTypeInfo(R.drawable.ic_baseline_rotate_left_24, ConversionTypes.COOKING);
                saveConversionTypeInfo(R.drawable.plug, ConversionTypes.ENERGY);
//                    saveConversionTypeInfo(R.drawable.fuel, ConversionTypes.FUEL_CONSUMPTION);
                saveConversionTypeInfo(R.drawable.temp, ConversionTypes.TEMPERATURE);
                saveConversionTypeInfo(R.drawable.area, ConversionTypes.AREA);
            }
        }).start();
    }
}

