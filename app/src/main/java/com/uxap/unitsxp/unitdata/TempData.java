package com.uxap.unitsxp.unitdata;

import com.uxap.unitsxp.constants.Units;

public class TempData {
    private String fromUnit;
    private String toUnit;

    public TempData(String fromUnit, String toUnit) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public String getConvertedValue(double val) {
        String result = "0 ?";

        if (fromUnit.equals(toUnit)) {
            return val + " -";
        }

        switch (fromUnit) {
            case Units.TEMP_CELSIUS:
                switch (toUnit) {
                    case Units.TEMP_FAHRENHEIT:
                        result = (val * 9 / 5) + 32 + " °F";
                        break;
                    case Units.TEMP_KELVIN:
                        result = val + 273.15 + " K";
                        break;
                    case Units.TEMP_RANKINE:
                        result = val * 9 / 5 + 491.67 + " °R";
                        break;
                    case Units.TEMP_REAUMUR:
                        result = val * 4 / 5 + " °Ré";
                        break;
                    case Units.TEMP_RøMER:
                        result = val * 24 / 40 + 7.5 + " °Rø";
                        break;
                    case Units.TEMP_DELISLE:
                        result = (100 - val) * 3 / 2 + " °De";
                        break;
                    case Units.TEMP_NEWTON:
                        result = val * 33 / 100 + " °Rø";
                        break;
                }
                break;
            case Units.TEMP_FAHRENHEIT:
                switch (toUnit) {
                    case Units.TEMP_CELSIUS:
                        result = (val - 32) * 5 / 9 + " °C";
                        break;
                    case Units.TEMP_KELVIN:
                        result = (val + 459.67) * 5 / 9 + " K";
                        break;
                    case Units.TEMP_RANKINE:
                        result = val + 459.67 + " °R";
                        break;
                    case Units.TEMP_REAUMUR:
                        result = (val - 32) * 4 / 9 + " °Ré";
                        break;
                    case Units.TEMP_RøMER:
                        result = (val - 32) * 7 / 24 + 7.5 + " °Rø";
                        break;
                    case Units.TEMP_DELISLE:
                        result = (212 - val) * 5 / 6 + " °De";
                        break;
                    case Units.TEMP_NEWTON:
                        result = (val - 32) * 11 / 60 + " °N";
                        break;
                }
                break;
            case Units.TEMP_RANKINE:
                switch (toUnit) {
                    case Units.TEMP_CELSIUS:
                        result = (val - 491.67) * 5 / 9 + " °C";
                        break;
                    case Units.TEMP_KELVIN:
                        result = val * 5 / 9 + " K";
                        break;
                    case Units.TEMP_FAHRENHEIT:
                        result = val - 459.67 + " °F";
                        break;
                    case Units.TEMP_REAUMUR:
                        result = (val - 491.67) * 4 / 9 + " °Ré";
                        break;
                    case Units.TEMP_RøMER:
                        result = (val - 491.67) * 7 / 24 + 7.5 + " °Rø";
                        break;
                    case Units.TEMP_DELISLE:
                        result = (671.67 - val) * 5 / 6 + " °De";
                        break;
                    case Units.TEMP_NEWTON:
                        result = (val - 491.67) * 11 / 60 + " °N";
                        break;
                }
                break;
            case Units.TEMP_KELVIN:
                switch (toUnit) {
                    case Units.TEMP_CELSIUS:
                        result = val - 273.15 + " °C";
                        break;
                    case Units.TEMP_RANKINE:
                        result = val * 9 / 5 + " °R";
                        break;
                    case Units.TEMP_FAHRENHEIT:
                        result = val * 9 / 5 - 459.67 + " °F";
                        break;
                    case Units.TEMP_REAUMUR:
                        result = (val - 273.15) * 4 / 5 + " °Ré";
                        break;
                    case Units.TEMP_RøMER:
                        result = (val - 273.15) * 21 / 40 + 7.5 + " °Rø";
                        break;
                    case Units.TEMP_DELISLE:
                        result = (373.15 - val) * 3 / 2 + " °De";
                        break;
                    case Units.TEMP_NEWTON:
                        result = (val - 273.15) * 33 / 100 + " °N";
                        break;
                }
                break;
            case Units.TEMP_REAUMUR:
                switch (toUnit) {
                    case Units.TEMP_CELSIUS:
                        result = val * 5 / 4 + " °C";
                        break;
                    case Units.TEMP_RANKINE:
                        result = val * 9 / 4 + 491.67 + " °R";
                        break;
                    case Units.TEMP_FAHRENHEIT:
                        result = val * 9 / 4 + 32 - 459.67 + " °F";
                        break;
                    case Units.TEMP_KELVIN:
                        result = val * 5 / 4 + 273.15 + " K";
                        break;
                    case Units.TEMP_RøMER:
                        result = val * 21 / 32 + 7.5 + " °Rø";
                        break;
                    case Units.TEMP_DELISLE:
                        result = (80 - val) * 15 / 8 + " °De";
                        break;
                    case Units.TEMP_NEWTON:
                        result = val * 33 / 80 + " °N";
                        break;
                }
                break;
            case Units.TEMP_RøMER:
                switch (toUnit) {
                    case Units.TEMP_CELSIUS:
                        result = (val * 7.5) * 40 / 21 + " °C";
                        break;
                    case Units.TEMP_RANKINE:
                        result = (val - 7.5) * 24 / 7 + 491.67 + " °R";
                        break;
                    case Units.TEMP_FAHRENHEIT:
                        result = (val - 7.5) * 24 / 7 + 32 + " °F";
                        break;
                    case Units.TEMP_KELVIN:
                        result = (val - 7.5) * 40 / 21 + 273.15 + " K";
                        break;
                    case Units.TEMP_REAUMUR:
                        result = (val - 7.5) * 32 / 21 + " °Ré";
                        break;
                    case Units.TEMP_DELISLE:
                        result = (60 - val) * 20 / 7 + " °De";
                        break;
                    case Units.TEMP_NEWTON:
                        result = (val - 7.5) * 22 / 35 + " °N";
                        break;
                }
                break;
            case Units.TEMP_DELISLE:
                switch (toUnit) {
                    case Units.TEMP_CELSIUS:
                        result = 100 - val * 2 / 3 + " °C";
                        break;
                    case Units.TEMP_RANKINE:
                        result = 671.67 - val * 6 / 5 + " °R";
                        break;
                    case Units.TEMP_FAHRENHEIT:
                        result = 212 - val * 6 / 5 + " °F";
                        break;
                    case Units.TEMP_KELVIN:
                        result = 373.15 - val * 2 / 3 + " K";
                        break;
                    case Units.TEMP_REAUMUR:
                        result = 80 - val * 8 / 15 + " °Ré";
                        break;
                    case Units.TEMP_RøMER:
                        result = 60 - val * 7 / 20 + " °Rø";
                        break;
                    case Units.TEMP_NEWTON:
                        result = 33 - val * 11 / 50 + " °N";
                        break;
                }
                break;
            case Units.TEMP_NEWTON:
                switch (toUnit) {
                    case Units.TEMP_CELSIUS:
                        result = val * 100 / 33 + " °C";
                        break;
                    case Units.TEMP_RANKINE:
                        result = val * 60 / 11 + 491.67 + " °R";
                        break;
                    case Units.TEMP_FAHRENHEIT:
                        result = val * 60 / 11 + 32 + " °F";
                        break;
                    case Units.TEMP_KELVIN:
                        result = val * 100 / 33 + 273.15 + " K";
                        break;
                    case Units.TEMP_REAUMUR:
                        result = val * 80 / 33 + " °Ré";
                        break;
                    case Units.TEMP_RøMER:
                        result = val * 35 / 22 + 7.5 + " °Rø";
                        break;
                    case Units.TEMP_DELISLE:
                        result = (33 - val) * 50 / 11 + " °De";
                        break;
                }
                break;
        }

        return result;
    }


}
