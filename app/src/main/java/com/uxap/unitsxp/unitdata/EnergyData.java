package com.uxap.unitsxp.unitdata;
import com.uxap.unitsxp.constants.Units;
public class EnergyData {
    private String fromUnit;
    private String toUnit;

    public EnergyData(String fromUnit, String toUnit) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public String getConvertedValue(double val) {
        String result = "0 ?";

        if(fromUnit.equals(toUnit)){
            return val+" -";
        }

        //double check eV

        switch(fromUnit) {
            case Units.ENERGY_JOULE:
                switch (toUnit) {
                    case Units.ENERGY_KILOCALORIE:
                        result = val / 4184 + " kcal";
                        break;
                    case Units.ENERGY_KILOJOULE:
                        result = val / 1000 + " kJ";
                        break;
                    case Units.ENERGY_GRAM_CALORIE:
                        result = val / 4.184 + " cal";
                        break;
                    case Units.ENERGY_WATT_HOUR:
                        result = val / 3600 + " Wh";
                        break;
                    case Units.ENERGY_KILOWATT_HOUR:
                        result = val / 3.6e+6 + " kWh";
                        break;
                    case Units.ENERGY_ELECTRONVOLT:
                        result = val * 6.2415093433e+18 + " eV";
                        break;
                    case Units.ENERGY_BRITISH_THERMAL_UNIT:
                        result = val / 1055 + " Btu";
                        break;
                    case Units.ENERGY_US_THERM:
                        result = val / 1.055e+8 + " therm[US]";
                        break;
                    case Units.ENERGY_FOOT_POUND:
                        result = val / 1.356 + " ft⋅lb";
                        break;
                }
            case Units.ENERGY_KILOCALORIE:
                switch (toUnit) {
                    case Units.ENERGY_JOULE:
                        result = val * 4184 + " J";
                        break;
                    case Units.ENERGY_KILOJOULE:
                        result = val * 4.184 + " kJ";
                        break;
                    case Units.ENERGY_GRAM_CALORIE:
                        result = val * 1000 + " cal";
                        break;
                    case Units.ENERGY_WATT_HOUR:
                        result = val * 1.162 + " Wh";
                        break;
                    case Units.ENERGY_KILOWATT_HOUR:
                        result = val / 860 + " kWh";
                        break;
                    case Units.ENERGY_ELECTRONVOLT:
                        result = val * 2.6114E+22 + " eV";
                        break;
                    case Units.ENERGY_BRITISH_THERMAL_UNIT:
                        result = val * 3.966 + " Btu";
                        break;
                    case Units.ENERGY_US_THERM:
                        result = val / 25210 + " therm[US]";
                        break;
                    case Units.ENERGY_FOOT_POUND:
                        result = val * 3086 + " ft⋅lb";
                        break;
                }
            case Units.ENERGY_KILOJOULE:
                switch (toUnit) {
                    case Units.ENERGY_JOULE:
                        result = val * 1000 + " J";
                        break;
                    case Units.ENERGY_KILOCALORIE:
                        result = val / 4.184 + " kcal";
                        break;
                    case Units.ENERGY_GRAM_CALORIE:
                        result = val * 239 + " cal";
                        break;
                    case Units.ENERGY_WATT_HOUR:
                        result = val / 3.6 + " Wh";
                        break;
                    case Units.ENERGY_KILOWATT_HOUR:
                        result = val / 3600 + " kWh";
                        break;
                    case Units.ENERGY_ELECTRONVOLT:
                        result = val * 6.2415097e+21 + " eV";
                        break;
                    case Units.ENERGY_BRITISH_THERMAL_UNIT:
                        result = val / 1.055 + " Btu";
                        break;
                    case Units.ENERGY_US_THERM:
                        result = val / 105480 + " therm[US]";
                        break;
                    case Units.ENERGY_FOOT_POUND:
                        result = val * 738 + " ft⋅lb";
                        break;
                }
            case Units.ENERGY_GRAM_CALORIE:
                switch (toUnit) {
                    case Units.ENERGY_JOULE:
                        result = val * 4.184 + " J";
                        break;
                    case Units.ENERGY_KILOCALORIE:
                        result = val / 1000 + " kcal";
                        break;
                    case Units.ENERGY_KILOJOULE:
                        result = val / 239 + " kJ";
                        break;
                    case Units.ENERGY_WATT_HOUR:
                        result = val / 860 + " Wh";
                        break;
                    case Units.ENERGY_KILOWATT_HOUR:
                        result = val / 860421 + " kWh";
                        break;
                    case Units.ENERGY_ELECTRONVOLT:
                        result = val * 2.612569782383E+19 + " eV";
                        break;
                    case Units.ENERGY_BRITISH_THERMAL_UNIT:
                        result = val / 252 + " Btu";
                        break;
                    case Units.ENERGY_US_THERM:
                        result = val / 2.521e+7 + " therm[US]";
                        break;
                    case Units.ENERGY_FOOT_POUND:
                        result = val * 3.086 + " ft⋅lb";
                        break;
                }
            case Units.ENERGY_WATT_HOUR:
                switch (toUnit) {
                    case Units.ENERGY_JOULE:
                        result = val * 3600 + " J";
                        break;
                    case Units.ENERGY_KILOCALORIE:
                        result = val / 1.162 + " kcal";
                        break;
                    case Units.ENERGY_KILOJOULE:
                        result = val *3.6 + " kJ";
                        break;
                    case Units.ENERGY_GRAM_CALORIE:
                        result = val * 860 + " cal";
                        break;
                    case Units.ENERGY_KILOWATT_HOUR:
                        result = val / 1000 + " kWh";
                        break;
                    case Units.ENERGY_ELECTRONVOLT:
                        result = val * 2.2469422907138E+22 + " eV";
                        break;
                    case Units.ENERGY_BRITISH_THERMAL_UNIT:
                        result = val *3.412 + " Btu";
                        break;
                    case Units.ENERGY_US_THERM:
                        result = val / 29300 + " therm[US]";
                        break;
                    case Units.ENERGY_FOOT_POUND:
                        result = val * 2655 + " ft⋅lb";
                        break;
                }
            case Units.ENERGY_KILOWATT_HOUR:
                switch (toUnit) {
                    case Units.ENERGY_JOULE:
                        result = val * 3.6e+6 + " J";
                        break;
                    case Units.ENERGY_KILOCALORIE:
                        result = val * 860 + " kcal";
                        break;
                    case Units.ENERGY_KILOJOULE:
                        result = val * 3600 + " kJ";
                        break;
                    case Units.ENERGY_GRAM_CALORIE:
                        result = val * 860421 + " cal";
                        break;
                    case Units.ENERGY_WATT_HOUR:
                        result = val * 1000 + " Wh";
                        break;
                    case Units.ENERGY_ELECTRONVOLT:
                        result = val * 2.24694229E+25 + " eV";
                        break;
                    case Units.ENERGY_BRITISH_THERMAL_UNIT:
                        result = val * 3412 + " Btu";
                        break;
                    case Units.ENERGY_US_THERM:
                        result = val / 29.3 + " therm[US]";
                        break;
                    case Units.ENERGY_FOOT_POUND:
                        result = val * 2.655e+6 + " ft⋅lb";
                        break;
                }
            case Units.ENERGY_ELECTRONVOLT:
                switch (toUnit) {
                    case Units.ENERGY_JOULE:
                        result = val * 1.60217733E-19 + " J";
                        break;
                    case Units.ENERGY_KILOCALORIE:
                        result = val * 3.8292957217973E-23 + " kcal";
                        break;
                    case Units.ENERGY_KILOJOULE:
                        result = val * 1.60217733E-22 + " kJ";
                        break;
                    case Units.ENERGY_GRAM_CALORIE:
                        result = val * 3.8292957217973E-20 + " cal";
                        break;
                    case Units.ENERGY_WATT_HOUR:
                        result = val * 4.4504925833334E-23 + " Wh";
                        break;
                    case Units.ENERGY_KILOWATT_HOUR:
                        result = val * 4.4504925833334E-26 + " kWh";
                        break;
                    case Units.ENERGY_BRITISH_THERMAL_UNIT:
                        result = val * 1.519587736557E-22 + " Btu";
                        break;
                    case Units.ENERGY_US_THERM:
                        result = val* 1.5189336881544E-27+ " therm[US]";
                        break;
                    case Units.ENERGY_FOOT_POUND:
                        result = val * 1.1817053550745E-19 + " ft⋅lb";
                        break;
                }
            case Units.ENERGY_BRITISH_THERMAL_UNIT:
                switch (toUnit) {
                    case Units.ENERGY_JOULE:
                        result = val * 1054.3499999744 + " J";
                        break;
                    case Units.ENERGY_KILOCALORIE:
                        result = val * 0.2519956979 + " kcal";
                        break;
                    case Units.ENERGY_KILOJOULE:
                        result = val * 1.05435 + " kJ";
                        break;
                    case Units.ENERGY_GRAM_CALORIE:
                        result = val * 251.9956978906 + " cal";
                        break;
                    case Units.ENERGY_WATT_HOUR:
                        result = val * 0.292875 + " Wh";
                        break;
                    case Units.ENERGY_KILOWATT_HOUR:
                        result = val * 0.000292875 + " kWh";
                        break;
                    case Units.ENERGY_ELECTRONVOLT:
                        result = val * 6.5807322337686E+21 + " eV";
                        break;
                    case Units.ENERGY_US_THERM:
                        result = val* 9.9956958825948E-6+ " therm[US]";
                        break;
                    case Units.ENERGY_FOOT_POUND:
                        result = val * 777.6486520956 + " ft⋅lb";
                        break;
                }
            case Units.ENERGY_US_THERM:
                switch (toUnit) {
                    case Units.ENERGY_JOULE:
                        result = val * 105480400 + " J";
                        break;
                    case Units.ENERGY_KILOCALORIE:
                        result = val * 25210.420650095 + " kcal";
                        break;
                    case Units.ENERGY_KILOJOULE:
                        result = val * 105480.4 + " kJ";
                        break;
                    case Units.ENERGY_GRAM_CALORIE:
                        result = val * 25210420.650095 + " cal";
                        break;
                    case Units.ENERGY_WATT_HOUR:
                        result = val * 29300.111111111 + " Wh";
                        break;
                    case Units.ENERGY_KILOWATT_HOUR:
                        result = val * 29.3001111111 + " kWh";
                        break;
                    case Units.ENERGY_ELECTRONVOLT:
                        result = val * 6.5835658778169E+26 + " eV";
                        break;
                    case Units.ENERGY_BRITISH_THERMAL_UNIT:
                        result = val* 100043.05970746 + " Btu";
                        break;
                    case Units.ENERGY_FOOT_POUND:
                        result = val * 77798350.533022 + " ft⋅lb";
                        break;
                }
            case Units.ENERGY_FOOT_POUND:
                switch (toUnit) {
                    case Units.ENERGY_JOULE:
                        result = val * 1.3558179483 + " J";
                        break;
                    case Units.ENERGY_KILOCALORIE:
                        result = val * 0.3240482668 + " kcal";
                        break;
                    case Units.ENERGY_KILOJOULE:
                        result = val * 0.0013558179 + " kJ";
                        break;
                    case Units.ENERGY_GRAM_CALORIE:
                        result = val *  0.3240482668 + " cal";
                        break;
                    case Units.ENERGY_WATT_HOUR:
                        result = val * 0.0003766161  + " Wh";
                        break;
                    case Units.ENERGY_KILOWATT_HOUR:
                        result = val * 3.7661609674711E-7 + " kWh";
                        break;
                    case Units.ENERGY_ELECTRONVOLT:
                        result = val * 8.4623463514466E+18 + " eV";
                        break;
                    case Units.ENERGY_BRITISH_THERMAL_UNIT:
                        result = val* 0.0012859278 + " Btu";
                        break;
                    case Units.ENERGY_US_THERM:
                        result = val * 1.2853742954043E-8 + " therm[US]";
                        break;
                }
        }
        return result;
    }
}
