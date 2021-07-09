package com.uxap.unitsxp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.uxap.unitsxp.fragment.TZConversionFragment;
import com.uxap.unitsxp.fragment.UnitConversionFragment;

public class ConversionActivity extends AppCompatActivity {
    private TextView txtConversionTypeName;
    private ImageView imgConversionTypeImage;
    private String conversionTypeName;
    private UnitConversionFragment unitConversionFragment;
    private TZConversionFragment tzConversionFragment;
    private int conversionTypeImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        conversionTypeName = getIntent().getStringExtra(HomeActivity.KEY_UNIT_TYPE_NAME);
        conversionTypeImage = getIntent().getIntExtra(HomeActivity.KEY_UNIT_TYPE_IMAGE, 0);

        txtConversionTypeName = findViewById(R.id.txtConvUnitName);
        imgConversionTypeImage = findViewById(R.id.imgConvUnitImage);

        txtConversionTypeName.setText(conversionTypeName);
        imgConversionTypeImage.setImageResource(conversionTypeImage);

//        if(conversionTypeName.equalsIgnoreCase(ConversionTypes.TIME_ZONE)){
//            tzConversionFragment = TZConversionFragment.newInstance(conversionTypeName);
//            getSupportFragmentManager().beginTransaction().replace(R.id.homeFragmentLayoutContainer, tzConversionFragment).commit();
//        }else {
            unitConversionFragment = UnitConversionFragment.newInstance(conversionTypeName);
            getSupportFragmentManager().beginTransaction().replace(R.id.homeFragmentLayoutContainer, unitConversionFragment).commit();
//        }
    }

    public void goBack(View v){
        if(v.getId() == R.id.ibGoBack){
            finish();
        }
    }
}