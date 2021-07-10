package com.uxap.unitsxp.unitdata;

import com.uxap.unitsxp.constants.Units;

public class AreaData {
    private String fromUnit;
    private String toUnit;

    public AreaData(String fromUnit, String toUnit) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public String getConvertedValue(double val) {
        String result = "0 ?";

        if (fromUnit.equals(toUnit)) {
            return val + " -";
        }

        switch (fromUnit) {
            case Units.AREA_ACRE:
                switch (toUnit) {
                    case Units.AREA_ARE:
                        result = val * 40.468564224 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 4.0468564224E+31 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 0.4046856422 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 40468564.224 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 40.468564224 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 43559.825760174 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 0.0040468564 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 0.4046856422 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 6272640 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 4046.8564224 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 0.0015625 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 4046856422.4 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 4.0468564224E+21 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 4840 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 4.0468564224E+15 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_ARE:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 0.0247105381 + " ac";
                        break;
                    case Units.AREA_BARN:
                        result = val * 1.0E+30 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 0.01 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 1000000 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 1 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 1076.391041671 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 0.0001 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 0.01 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 155000.31000062 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 100 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.86102E-5 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 100000000 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1.0E+20 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 119.5990046301 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 1.0E+14 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_BARN:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 2.4710538146717E-32 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 1.0E-30 + " a";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 1.0E-32 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 1.0E-24 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 1.0E-30 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 1.076391041671E-27 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 1.0E-34 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 1.0E-32 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 1.5500031000062E-25 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 1.0E-28 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.8610215854245E-35 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 1.0E-22 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1.0E-10 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 1.1959900463011E-28 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 1.0E-16 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_HECTARE:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 2.4710439305 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 100 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 1.0E+32 + " b";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 100000000 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 100 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 107639.1041671 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 0.01 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 1 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 15500031.000062 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 10000 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 0.0038610216 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 10000000000D + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1.0E+22 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 11959.900463011 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 1.0E+16 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_CM:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 2.4710538146716E-8 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 1.0E-6 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 1.0E+24 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 1.0E-8 + " ha";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 1.0E-6 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 0.001076391 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 1.0E-10 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 1.0E-8 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 0.15500031 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 0.0001 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.8610215854245E-11 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 100 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1.0E+14 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 0.000119599 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 100000000 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_DEKA_METER:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 0.0247105381 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 1 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 1.0E+30 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 0.01 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 1000000 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 1076.391041671 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 0.0001 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 0.01 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 155000.31000062 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 100 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.86102E-5 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 100000000 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1.0E+20 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 119.5990046301 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 1.0E+14 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_FOOT:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 2.29568E-5 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 0.0009290304 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 9.290304E+26 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 9.290304E-6 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 929.0304 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 0.0009290304 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 9.290304E-8 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 9.290304E-6 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 144 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 0.09290304 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.5870064279155E-8 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 92903.04 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 9.290304E+16 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 0.1111111111 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 92903040000D + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_KM:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 247.1053814672 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 10000 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 1.0E+34 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 100 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 10000000000D + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 10000 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 10763910.41671 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 100 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 1550003100.0062 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 1000000 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 0.3861021585 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 1000000000000D + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1.0E+24 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 1195990.0463011 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 1.0E+18 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_HECTO_METER:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 2.4710538147 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 100 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 1.0E+32 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 1 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 100000000 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 100 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 107639.1041671 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 0.01 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 15500031.000062 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 10000 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 0.0038610216 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 10000000000D + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1.0E+22 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 11959.900463011 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 1.0E+16 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_INCH:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 1.5942250790736E-7 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 6.4516E-6 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 6.4516E+24 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 6.4516E-8 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 6.4516 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 6.4516E-6 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 0.0069444444 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 6.4516E-10 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 6.4516E-8 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 0.00064516 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 2.4909766860524E-10 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 645.16 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 6.4516E+14 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 0.0007716049 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 645160000 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_M: //doubt
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 0.0002471054 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 0.01 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 1.0E+28 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 0.0001 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 10000 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 0.01 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 10.7639104167 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 1.0E-6 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 0.0001 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 1550.0031000062 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.8610215854245E-7 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 1000000 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1.0E+18 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 1.1959900463 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 1000000000000D + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_MILE:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 640 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 25899.88110336 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 2.589988110336E+34 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 258.9988110336 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 25899881103.36 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 25899.88110336 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 27878400 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 2.5899881103 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 258.9988110336 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 4014489600D + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 2589988.110336 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 2589988110336D + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 2.589988110336E+24 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 3097600 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 2.589988110336E+18 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_MM:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 2.4710538146717E-10 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 1.0E-8 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 1.0E+22 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 1.0E-10 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 0.01 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 1.0E-8 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 1.07639E-5 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 1.0E-12 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 1.0E-10 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 0.0015500031 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 1.0E-6 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.8610215854245E-13 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1000000000000D + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 1.1959900463011E-6 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 1000000 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_NANO_METER:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 2.4710538146717E-22 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 1.0E-20 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 10000000000D + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 1.0E-22 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 1.0E-14 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 1.0E-20 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 1.076391041671E-17 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 1.0E-24 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 1.0E-22 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 1.5500031000062E-15 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 1.0E-18 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.8610215854245E-25 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 1.0E-12 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 1.1959900463011E-18 + " yd\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 1.0E-6 + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_YARD:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 0.0002066116 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 0.0083612736 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 8.3612736E+27 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 8.36127E-5 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 8361.2736 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 0.0083612736 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 9 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 8.3612736E-7 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 8.36127E-5 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 1296 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 0.83612736 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.228305785124E-7 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 836127.36 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 8.3612736E+17 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_µM:
                        result = val * 836127360000D + " µm\u00B2";
                        break;
                }
                break;
            case Units.AREA_SQ_µM:
                switch (toUnit) {
                    case Units.AREA_ACRE:
                        result = val * 2.4710538146717E-16 + " ac";
                        break;
                    case Units.AREA_ARE:
                        result = val * 1.0E-14 + " a";
                        break;
                    case Units.AREA_BARN:
                        result = val * 1.0E+16 + " b";
                        break;
                    case Units.AREA_HECTARE:
                        result = val * 1.0E-16 + " ha";
                        break;
                    case Units.AREA_SQ_CM:
                        result = val * 1.0E-8 + " cm\u00B2";
                        break;
                    case Units.AREA_SQ_DEKA_METER:
                        result = val * 1.0E-14 + " dam\u00B2";
                        break;
                    case Units.AREA_SQ_FOOT:
                        result = val * 1.076391041671E-11 + " ft\u00B2";
                        break;
                    case Units.AREA_SQ_KM:
                        result = val * 1.0E-18 + " km\u00B2";
                        break;
                    case Units.AREA_SQ_HECTO_METER:
                        result = val * 1.0E-16 + " hm\u00B2";
                        break;
                    case Units.AREA_SQ_INCH:
                        result = val * 1.5500031000062E-9 + " in\u00B2";
                        break;
                    case Units.AREA_SQ_M:
                        result = val * 1.0E-12 + " m\u00B2";
                        break;
                    case Units.AREA_SQ_MILE:
                        result = val * 3.8610215854245E-19 + " mi\u00B2";
                        break;
                    case Units.AREA_SQ_MM:
                        result = val * 1.0E-6 + " mm\u00B2";
                        break;
                    case Units.AREA_SQ_NANO_METER:
                        result = val * 1000000 + " nm\u00B2";
                        break;
                    case Units.AREA_SQ_YARD:
                        result = val * 1.1959900463011E-12 + " yd\u00B2";
                        break;
                }
                break;

        }
        return result;
    }
}
