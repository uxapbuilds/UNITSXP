package com.uxap.unitsxp.model;

import com.uxap.unitsxp.constants.ConversionTypes;
import com.uxap.unitsxp.constants.Units;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class CarouselData {
    public List<CarouselPicker.PickerItem> getUnitArray(String conversionType){
        List<CarouselPicker.PickerItem> textItems = new ArrayList<>();
        int textSize = 6;
        switch (conversionType){
            case ConversionTypes.LENGTH:
                //textItems.add(new CarouselPicker.TextItem("SELECT\nUNIT", textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_KM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_M, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_MILE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_CM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_MM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_microM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_nanoM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_FOOT, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_INCH, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_NAUTICAL_MILE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_FURLONG, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.LENGTH_YARD, textSize));
                //textItems.add(new CarouselPicker.TextItem(Units.LENGTH_LIGHT_YEAR, textSize));
                break;

            case ConversionTypes.ENERGY:
                //textItems.add(new CarouselPicker.TextItem("SELECT\nUNIT", textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_BRITISH_THERMAL_UNIT, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_ELECTRONVOLT, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_FOOT_POUND, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_GRAM_CALORIE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_JOULE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_KILOCALORIE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_KILOJOULE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_KILOWATT_HOUR, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_US_THERM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.ENERGY_WATT_HOUR, textSize));
                break;

            case ConversionTypes.TEMPERATURE:
                //textItems.add(new CarouselPicker.TextItem("SELECT\nUNIT", textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TEMP_CELSIUS, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TEMP_FAHRENHEIT, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TEMP_KELVIN, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TEMP_RANKINE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TEMP_REAUMUR, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TEMP_RøMER, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TEMP_NEWTON, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TEMP_DELISLE, textSize));
                break;

            case ConversionTypes.AREA:
                textItems.add(new CarouselPicker.TextItem(Units.AREA_ACRE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_ARE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_BARN, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_HECTARE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_CM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_DEKA_METER, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_FOOT, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_HECTO_METER, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_INCH, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_µM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_YARD, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_NANO_METER, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_MM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_MILE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_KM, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.AREA_SQ_M, textSize));
                break;

            case ConversionTypes.TIME:
                textItems.add(new CarouselPicker.TextItem(Units.TIME_SECOND, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_MILLISECOND, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_MINUTE, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_HOUR, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_DAY, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_WEEK, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_MONTH, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_MICRO_SECOND, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_NANO_SECOND, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_PICO_SECOND, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_FEMTO_SECOND, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_ATTO_SECOND, textSize));
                textItems.add(new CarouselPicker.TextItem(Units.TIME_PLANCK_TIME, textSize));
                break;

        }
        return textItems;
    }

}
