package com.uxap.unitsxp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.uxap.unitsxp.fragment.HomeFragment;
import com.uxap.unitsxp.model.DataManager;
import com.uxap.unitsxp.model.ConversionTypeInfoModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    public static final String KEY_UNIT_TYPE_NAME = "unitVal";
    public static final String KEY_UNIT_TYPE_IMAGE = "unitImage";
    private AutoCompleteTextView actSearchUnit;
    private HomeFragment homeFragment;
    private DataManager dataManager;
    ArrayList<ConversionTypeInfoModel> conversionTypeInfoModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actSearchUnit=findViewById(R.id.actSearchUnits);
        dataManager = new DataManager(this);
        conversionTypeInfoModelArrayList = dataManager.retrieveConversionTypeInfo();

        ArrayAdapter<String> listConversionTypesAdapter = new ArrayAdapter<String>(this, R.layout.act_search_item_layout, actAdapterData());

        actSearchUnit.setThreshold(1);
        actSearchUnit.setAdapter(listConversionTypesAdapter);

        homeFragment = HomeFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.homeFragmentLayoutContainer, homeFragment)
                .commit();

        actSearchUnit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String unitNameSelected = listConversionTypesAdapter.getItem(position);
                for(ConversionTypeInfoModel conversionTypeInfo: conversionTypeInfoModelArrayList){
                    if(conversionTypeInfo.getConversionTypeName().equalsIgnoreCase(unitNameSelected)) {

                        Intent toConversionActivity = new Intent(HomeActivity.this, ConversionActivity.class);
                        toConversionActivity.putExtra(KEY_UNIT_TYPE_NAME, conversionTypeInfo.getConversionTypeName());
                        toConversionActivity.putExtra(KEY_UNIT_TYPE_IMAGE, conversionTypeInfo.getImgDrawableId());
                        startActivity(toConversionActivity);
                        actSearchUnit.setText("");

                    }
                }

            }
        });

    }

    public ArrayList<String> actAdapterData(){
        ArrayList<String> unitNames = new ArrayList<>();
        for (ConversionTypeInfoModel conversionTypeInfoModel:conversionTypeInfoModelArrayList){
            unitNames.add(conversionTypeInfoModel.getConversionTypeName());
        }
        return unitNames;
    }
}