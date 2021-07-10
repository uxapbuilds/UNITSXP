package com.uxap.unitsxp.unitdata;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

import com.uxap.unitsxp.fragment.UnitConversionFragment;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class CurrencyAPI {
    private String fromUnit;
    private String toUnit;
    private static final String COUNTRY_CODE = "countryCode";
    private static final String CURRENCY_SYMBOLE = "currencyCode";

    public interface CurrencyProcessListener {
        void setConvertedCurrency(String value);
    }

    private CurrencyProcessListener currencyProcessListener;

    private UnitConversionFragment ucFrag;

    public CurrencyAPI(String fromUnit, String toUnit, UnitConversionFragment ucFrag) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.ucFrag = ucFrag;
        this.currencyProcessListener = (CurrencyProcessListener) ucFrag;
    }


    public void doConversion(Double val) {

        if (fromUnit.equals(toUnit)) {
            currencyProcessListener.setConvertedCurrency(val + " -");
        } else {

            String countryCodeFrom = extractText(fromUnit, COUNTRY_CODE);
            String countryCodeTo = extractText(toUnit, COUNTRY_CODE);
            String currencySymbolTo = extractText(toUnit, CURRENCY_SYMBOLE);

            OkHttpClient client = new OkHttpClient();

            String apiUrl = "https://currency-exchange.p.rapidapi.com/exchange?to=" +
                    countryCodeTo + "&from=" + countryCodeFrom + "&q=1";

            Request request = new Request.Builder()
                    .url(apiUrl)
                    .get()
                    .addHeader("x-rapidapi-key", "f78537387fmsh2a13a70e8fc3c02p11b1c0jsnc349bb8d989e")
                    .addHeader("x-rapidapi-host", "currency-exchange.p.rapidapi.com")
                    .build();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Response response = client.newCall(request).execute();
                        ucFrag.getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    currencyProcessListener.setConvertedCurrency(Double.parseDouble(response.body().string()) * val + " " + currencySymbolTo);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        });

                    } catch (IOException e) {
                        Log.i("CURRENCY_EXP", e.getStackTrace() + "");
                    }
                }
            }).start();
        }
    }

    public String extractText(String textString, String type) {
        String result = "";
        Pattern pattern = Pattern.compile("");
        switch (type) {
            case CURRENCY_SYMBOLE:
                pattern = Pattern.compile("'(.*?)'");
                break;
            case COUNTRY_CODE:
                pattern = Pattern.compile("\\((.*?)\\)");
        }
        Matcher matcher = pattern.matcher(textString);
        if (matcher.find()) {
            result = matcher.group(1);
        }
        return result;
    }
}

