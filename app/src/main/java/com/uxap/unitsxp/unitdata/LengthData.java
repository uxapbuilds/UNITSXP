package com.uxap.unitsxp.unitdata;

import com.uxap.unitsxp.constants.Units;

public class LengthData {

    private String fromUnit;
    private String toUnit;

    public LengthData(String fromUnit, String toUnit) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public String getConvertedValue(double val) {
        String result = "0 ?";

        //IF BOTH UNITS ARE SAME
        if (fromUnit.equals(toUnit)) {
            return val + " -";
        }
        //ELSE
        switch (fromUnit) {
            case Units.LENGTH_KM:
                switch (toUnit) {
                    case Units.LENGTH_M:
                        result = val * 1000 + " m";
                        break;
                    case Units.LENGTH_CM:
                        result = val * 100000 + " cm";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 1000000000 + " μm";
                        break;
                    case Units.LENGTH_MM:
                        result = val * 1000000 + " mm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 1000000000000D + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 1.609 + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val * 1094 + " yards";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val * 3281 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val * 39370 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 1.852 + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val * 4.971 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result = val / (9.46*Math.pow(10, 12))+ " ly";;
//                        break;

                }
                break;

            case Units.LENGTH_M:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val / 1000 + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val * 100 + " cm";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 1000000 + " μm";
                        break;
                    case Units.LENGTH_MM:
                        result = val * 1000 + " mm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 1000000000 + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 1609 + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val * 1.094 + " yards";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val * 3.281 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val * 39.37 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 1852 + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val / 201 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;

            case Units.LENGTH_CM:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val / 100000 + " km";
                        break;
                    case Units.LENGTH_M:
                        result = val / 100 + " m";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 10000 + " μm";
                        break;
                    case Units.LENGTH_MM:
                        result = val * 10 + " mm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 10000000 + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 160934 + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val / 91.44 + " yards";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val / 30.48 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val / 2.54 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 185200 + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val / 20117 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;

            case Units.LENGTH_microM:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val / 1000000000 + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val / 10000 + " cm";
                        break;
                    case Units.LENGTH_M:
                        result = val / 1000000 + " m";
                        break;
                    case Units.LENGTH_MM:
                        result = val / 1000 + " mm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 1000 + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 1609000000 + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val / 914400 + " yards";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val / 304800 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val / 25400 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 1852000000 + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val / 201200000 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;
            case Units.LENGTH_nanoM:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val / 1000000000000D + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val / 10000000 + " cm";
                        break;
                    case Units.LENGTH_M:
                        result = val / 1000000000 + " m";
                        break;
                    case Units.LENGTH_MM:
                        result = val / 1000000 + " mm";
                        break;
                    case Units.LENGTH_microM:
                        result = val / 1000 + " μm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 1609000000000D + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val / 914400000 + " yards";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val / 304800000 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val / 25400000 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 1852000000000D + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val / 201200000000D + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;
            case Units.LENGTH_MILE:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val * 1.609 + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val * 160934 + " cm";
                        break;
                    case Units.LENGTH_M:
                        result = val * 1609 + " m";
                        break;
                    case Units.LENGTH_MM:
                        result = val * 1609000 + " mm";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 1609000000 + " μm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 1609000000000D + " nm";
                        break;
                    case Units.LENGTH_YARD:
                        result = val * 1760 + " yards";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val * 5280 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val * 63360 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 1.151 + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val * 8 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;
            case Units.LENGTH_YARD:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val / 1094 + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val * 91.44 + " cm";
                        break;
                    case Units.LENGTH_M:
                        result = val / 1.094 + " m";
                        break;
                    case Units.LENGTH_MM:
                        result = val * 914 + " mm";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 914400 + " μm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 914400000 + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 1760 + " miles";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val * 3 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val * 36 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 2025 + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val / 220 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;
            case Units.LENGTH_FOOT:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val / 3281 + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val * 30.48 + " cm";
                        break;
                    case Units.LENGTH_M:
                        result = val / 3.281 + " m";
                        break;
                    case Units.LENGTH_MM:
                        result = val * 305 + " mm";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 304800 + " μm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 304800000 + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 5280 + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val / 3 + " yard";
                        break;
                    case Units.LENGTH_INCH:
                        result = val * 12 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 6076 + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val / 660 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;
            case Units.LENGTH_INCH:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val / 39370 + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val * 2.54 + " cm";
                        break;
                    case Units.LENGTH_M:
                        result = val / 39.37 + " m";
                        break;
                    case Units.LENGTH_MM:
                        result = val * 25.4 + " mm";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 25400 + " μm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 25400000 + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 63360 + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val / 36 + " yard";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val / 12 + " foot";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 72913 + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val / 7920 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;

            case Units.LENGTH_NAUTICAL_MILE:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val * 1.852 + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val * 185200 + " cm";
                        break;
                    case Units.LENGTH_M:
                        result = val * 1852 + " m";
                        break;
                    case Units.LENGTH_MM:
                        result = val * 1852000 + " mm";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 1852000000 + " μm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 1852000000000D + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val * 1.151 + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val * 2025 + " yard";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val * 6076 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val * 72913 + " inches";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val * 9.206 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;

            case Units.LENGTH_FURLONG:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val / 4.971 + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val * 20117 + " cm";
                        break;
                    case Units.LENGTH_M:
                        result = val * 201 + " m";
                        break;
                    case Units.LENGTH_MM:
                        result = val * 201168 + " mm";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 201200000 + " μm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 201200000000D + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 8 + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val * 220 + " yard";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val * 660 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val * 7920 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 9.206 + " n miles";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;
            case Units.LENGTH_MM:
                switch (toUnit) {
                    case Units.LENGTH_KM:
                        result = val / 1000000 + " km";
                        break;
                    case Units.LENGTH_CM:
                        result = val / 10 + " cm";
                        break;
                    case Units.LENGTH_M:
                        result = val / 1000 + " m";
                        break;
                    case Units.LENGTH_microM:
                        result = val * 1000 + " mm";
                        break;
                    case Units.LENGTH_nanoM:
                        result = val * 1000000 + " nm";
                        break;
                    case Units.LENGTH_MILE:
                        result = val / 1609000 + " miles";
                        break;
                    case Units.LENGTH_YARD:
                        result = val / 914 + " yards";
                        break;
                    case Units.LENGTH_FOOT:
                        result = val / 305 + " foot";
                        break;
                    case Units.LENGTH_INCH:
                        result = val / 25.4 + " inches";
                        break;
                    case Units.LENGTH_NAUTICAL_MILE:
                        result = val / 1852000 + " n miles";
                        break;
                    case Units.LENGTH_FURLONG:
                        result = val / 201168 + " furlong";
                        break;
//                    case Units.LENGTH_LIGHT_YEAR:
//                        result =new DecimalFormat(".000000000000").format(val / (9.46*Math.pow(10, 15)))+ " ly";;
//                        break;
                }
                break;
        }

        return result;
    }
}
