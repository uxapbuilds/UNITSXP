package com.uxap.unitsxp.model;

import com.uxap.unitsxp.fragment.UnitConversionFragment;
import com.uxap.unitsxp.unitdata.AreaData;
import com.uxap.unitsxp.unitdata.CurrencyAPI;
import com.uxap.unitsxp.unitdata.EnergyData;
import com.uxap.unitsxp.unitdata.LengthData;
import com.uxap.unitsxp.constants.ConversionTypes;
import com.uxap.unitsxp.unitdata.TempData;
import com.uxap.unitsxp.unitdata.TimeData;

import java.text.NumberFormat;
import java.util.Locale;

public class ConversionProcessor {

    private UnitConversionFragment ucFrag;

    public ConversionProcessor(UnitConversionFragment activity) {
        this.ucFrag = activity;
    }

    public String setCnvLayout(String conversionType, String fromUnit, String toUnit, String value) {
        String val = value;
        String result = "";

        //minus problem quick fix
        if (value.contains("-") && value.length() == 1) {
            val += "0";
        }

        double valToDouble = Double.parseDouble(val);
        switch (conversionType) {
            case ConversionTypes.LENGTH:
                result = doFormat(new LengthData(fromUnit, toUnit).getConvertedValue(valToDouble));
                break;
            case ConversionTypes.ENERGY:
                result = doFormat(new EnergyData(fromUnit, toUnit).getConvertedValue(valToDouble));
                break;
            case ConversionTypes.TEMPERATURE:
                result = doFormat(new TempData(fromUnit, toUnit).getConvertedValue(valToDouble));
                break;
            case ConversionTypes.AREA:
                result = doFormat(new AreaData(fromUnit, toUnit).getConvertedValue(valToDouble));
                break;
            case ConversionTypes.TIME:
                result = doFormat(new TimeData(fromUnit, toUnit).getConvertedValue(valToDouble));
                break;
            case ConversionTypes.CURRENCY:
                new CurrencyAPI(fromUnit, toUnit, ucFrag).doConversion(valToDouble);
                break;
        }
        return result;
    }

    public String doFormat(String value) {
        NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
        if (!value.equalsIgnoreCase("") || value != null) { //didn't work check it
            String[] splitVal = value.split(" ");
            return format.format(Double.parseDouble(splitVal[0])) + " " + splitVal[1];
        }
        return "";
    }

}
