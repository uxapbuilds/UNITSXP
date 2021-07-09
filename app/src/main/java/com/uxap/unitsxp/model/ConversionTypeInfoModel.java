package com.uxap.unitsxp.model;

public class ConversionTypeInfoModel {
    private int imgDrawableId;
    private String conversionType;

    public ConversionTypeInfoModel(int imgDrawableId, String unitName) {
        this.imgDrawableId = imgDrawableId;
        this.conversionType = unitName;
    }

    public int getImgDrawableId() {
        return imgDrawableId;
    }

    public String getConversionTypeName() {
        return conversionType;
    }
}
