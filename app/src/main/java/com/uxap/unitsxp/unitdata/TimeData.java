package com.uxap.unitsxp.unitdata;

import com.uxap.unitsxp.constants.Units;

public class TimeData {
    private String fromUnit;
    private String toUnit;

    public TimeData(String fromUnit, String toUnit) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public String getConvertedValue(double val) {
        String result = "0 ?";

        if (fromUnit.equals(toUnit)) {
            return val + " -";
        }

        switch (fromUnit) {
            case Units.TIME_ATTO_SECOND:
                switch (toUnit) {
                    case Units.TIME_DAY:
                        result = val * 1.1574074074074E-23 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 0.001 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 2.7777777777778E-22 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 1.0E-12 + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 1.0E-15 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 1.6666666666667E-20 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 3.8051750380518E-25 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 1.0E-9 + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 1.0E-6 + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.8550948324478E+25 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 1.0E-18 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 1.6534391534392E-24 + " week";
                        break;
                }
                break;
            case Units.TIME_DAY:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 8.64E+22 + " as";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 8.64E+19 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 24 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 86400000000D + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 86400000 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 1440 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 0.0328767123 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 86400000000000D + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 8.64E+16 + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.6028019352349E+48 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 86400 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 0.1428571429 + " week";
                        break;
                }
                break;
            case Units.TIME_FEMTO_SECOND:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 1000 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 1.1574074074074E-20 + " d";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 2.7777777777778E-19 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 1.0E-9 + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 1.0E-12 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 1.6666666666667E-17 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 3.8051750380518E-22 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 1.0E-6 + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 0.001 + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.8550948324478E+28 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 1.0E-15 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 1.6534391534392E-21 + " week";
                        break;
                }
                break;
            case Units.TIME_HOUR:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 3.6E+21 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 0.0416666667 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 3.6E+18 + " fs";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 3600000000D + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 3600000 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 60 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 0.001369863 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 2.7777777777778E-13 + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 3.6E+15 + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 6.6783413968122E+46 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 3600 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 0.005952381 + " week";
                        break;
                }
                break;
            case Units.TIME_MICRO_SECOND:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 1000000000000D + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 1.1574074074074E-11 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 1000000000 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 2.7777777777778E-10 + " h";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 0.001 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 1.6666666666667E-8 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 3.8051750380518E-13 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 1000 + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 1000000 + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.8550948324478E+37 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 1.0E-6 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 1.6534391534392E-12 + " week";
                        break;
                }
                break;
            case Units.TIME_MILLISECOND:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 1.0E+15 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 1.1574074074074E-8 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 1000000000000D + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 2.7777777777778E-7 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 1000 + " µs";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 1.66667E-5 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 3.8051750380518E-10 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 1000000 + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 1000000000D + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.8550948324478E+40 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 0.001 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 1.6534391534392E-9 + " week";
                        break;
                }
                break;
            case Units.TIME_MINUTE:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 6.0E+19 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 0.0006944444 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 6.0E+16 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 0.0166666667 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 60000000 + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 60000 + " ms";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 2.28311E-5 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 60000000000D + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 60000000000000D + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.1130568994687E+45 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 60 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 9.92063E-5 + " week";
                        break;
                }
                break;
            case Units.TIME_MONTH:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 2.628E+24 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 30.4166666667 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 2.628E+21 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 730 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 2628000000000D + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 2628000000D + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 43800 + " min";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 2.628E+15 + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 2.628E+18 + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 4.8751892196729E+49 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 2628000 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 4.3452380952 + " week";
                        break;
                }
                break;
            case Units.TIME_NANO_SECOND:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 1000000000 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 1.1574074074074E-14 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 1000000 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 2.7777777777778E-13 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 0.001 + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 1.0E-6 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 1.6666666666667E-11 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 3.8051750380518E-16 + " month";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 1000 + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.8550948324478E+34 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 1.0E-9 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 1.6534391534392E-15 + " week";
                        break;
                }
                break;
            case Units.TIME_PICO_SECOND:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 1000000 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 1.1574074074074E-17 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 1000 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 2.7777777777778E-16 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 1.0E-6 + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 1.0E-9 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 1.6666666666667E-14 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 3.8051750380518E-19 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 0.001 + " ns";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.8550948324478E+31 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 1.0E-12 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 1.6534391534392E-18 + " week";
                        break;
                }
                break;
            case Units.TIME_PLANCK_TIME:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 5.39056E-26 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 6.2390740740741E-49 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 5.39056E-29 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 1.4973777777778E-47 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 5.39056E-38 + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 5.39056E-41 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 8.9842666666667E-46 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 2.051202435312E-50 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 5.39056E-35 + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 5.39056E-32 + " ps";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 5.39056E-44 + " s";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 8.9129629629629E-50 + " week";
                        break;
                }
                break;
            case Units.TIME_SECOND:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 1.0E+18 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 1.15741E-5 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 1.0E+15 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 0.0002777778 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 1000000 + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 1000 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 0.0166666667 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 3.8051750380518E-7 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 1000000000 + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 1000000000000D + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.8550948324478E+43 + " planck";
                        break;
                    case Units.TIME_WEEK:
                        result = val * 1.6534391534392E-6 + " week";
                        break;
                }
                break;
            case Units.TIME_WEEK:
                switch (toUnit) {
                    case Units.TIME_ATTO_SECOND:
                        result = val * 6.048E+23 + " as";
                        break;
                    case Units.TIME_DAY:
                        result = val * 7 + " d";
                        break;
                    case Units.TIME_FEMTO_SECOND:
                        result = val * 6.048E+20 + " fs";
                        break;
                    case Units.TIME_HOUR:
                        result = val * 168 + " h";
                        break;
                    case Units.TIME_MICRO_SECOND:
                        result = val * 604800000000D + " µs";
                        break;
                    case Units.TIME_MILLISECOND:
                        result = val * 604800000 + " ms";
                        break;
                    case Units.TIME_MINUTE:
                        result = val * 10080 + " min";
                        break;
                    case Units.TIME_MONTH:
                        result = val * 0.2301369863 + " month";
                        break;
                    case Units.TIME_NANO_SECOND:
                        result = val * 6.048E+14 + " ns";
                        break;
                    case Units.TIME_PICO_SECOND:
                        result = val * 6.048E+17 + " ps";
                        break;
                    case Units.TIME_PLANCK_TIME:
                        result = val * 1.1219613546645E+49 + " planck";
                        break;
                    case Units.TIME_SECOND:
                        result = val * 604800 + " s";
                        break;
                }
                break;
        }

        return result;
    }
}
