package com.uxap.unitsxp.model;

public class UnitInfoModel {
    private String unitName;
    private String unitNotation;

    public UnitInfoModel(String unitName, String unitNotation) {
        this.unitName = unitName;
        this.unitNotation = unitNotation;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitNotation() {
        return unitNotation;
    }

    public void setUnitNotation(String unitNotation) {
        this.unitNotation = unitNotation;
    }
}
