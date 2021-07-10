package com.uxap.unitsxp.fragment;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.uxap.unitsxp.R;
import com.uxap.unitsxp.constants.ConversionTypes;
import com.uxap.unitsxp.controller.ConversionProcessor;
import com.uxap.unitsxp.model.CarouselData;
import com.uxap.unitsxp.unitdata.CurrencyAPI;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import in.goodiebag.carouselpicker.CarouselPicker;

public class UnitConversionFragment extends Fragment implements View.OnClickListener, CurrencyAPI.CurrencyProcessListener {

    private final static String CONV_TYPE = "conversion_type";
    private final static String CONV_FROM = "from";
    private final static String CONV_TO = "to";
    private ImageView ivConvert;
    private ImageButton ibCopy, ibShare;
    private TextView txtFromUnit, txtToUnit, txtResultValue;
    private EditText edtConversionValue;
    private ConversionProcessor conversionProcessor;
    private CardView cvFromUnit, cvToUnit;
    private FloatingActionButton fabOne, fabTwo, fabThree, fabFour, fabFive, fabSix, fabSeven, fabEight, fabNine, fabZero, fabDot, fabMinus, fabDelete, fabClear;
    private boolean isPositive = false;
    private String conversionType;


    public UnitConversionFragment() {
        // Required empty public constructor
    }

    public static UnitConversionFragment newInstance(String conversionType) {
        UnitConversionFragment fragment = new UnitConversionFragment();
        if (conversionType != null || conversionType != "") {

            Bundle bundle = new Bundle();
            bundle.putString(CONV_TYPE, conversionType);
            fragment.setArguments(bundle);

        }
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        conversionType = getArguments().getString(CONV_TYPE).trim();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        conversionProcessor = new ConversionProcessor(this);
        if (view != null) {

            txtFromUnit = view.findViewById(R.id.txtFromUnitName);
            txtToUnit = view.findViewById(R.id.txtToUnitName);
            txtResultValue = view.findViewById(R.id.txtConversionResultValue);
            edtConversionValue = view.findViewById(R.id.edtConversionValue);
            cvFromUnit = view.findViewById(R.id.card_view_fromUnit);
            cvToUnit = view.findViewById(R.id.card_view_toUnit);
            ivConvert = view.findViewById(R.id.ivConvertUnits);
            ibCopy = view.findViewById(R.id.ibCopy);
            ibShare = view.findViewById(R.id.ibShare);

            fabOne = view.findViewById(R.id.fabOne);
            fabTwo = view.findViewById(R.id.fabTwo);
            fabThree = view.findViewById(R.id.fabThree);
            fabFour = view.findViewById(R.id.fabFour);
            fabFive = view.findViewById(R.id.fabFive);
            fabSix = view.findViewById(R.id.fabSix);
            fabSeven = view.findViewById(R.id.fabSeven);
            fabEight = view.findViewById(R.id.fabEight);
            fabNine = view.findViewById(R.id.fabNine);
            fabZero = view.findViewById(R.id.fabZero);
            fabDot = view.findViewById(R.id.fabDot);
            fabMinus = view.findViewById(R.id.fabMinusPlus);
            fabDelete = view.findViewById(R.id.fabDelete);
            fabClear = view.findViewById(R.id.fabClear);

            fabOne.setOnClickListener(this);
            fabTwo.setOnClickListener(this);
            fabThree.setOnClickListener(this);
            fabFour.setOnClickListener(this);
            fabFive.setOnClickListener(this);
            fabSix.setOnClickListener(this);
            fabSeven.setOnClickListener(this);
            fabEight.setOnClickListener(this);
            fabNine.setOnClickListener(this);
            fabZero.setOnClickListener(this);
            fabDot.setOnClickListener(this);
            fabMinus.setOnClickListener(this);
            fabDelete.setOnClickListener(this);
            fabClear.setOnClickListener(this);

            ibCopy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!txtResultValue.getText().toString().equalsIgnoreCase("--")) {
                        ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(getContext().CLIPBOARD_SERVICE);
                        ClipData clip = ClipData.newPlainText("Converted Value", txtResultValue.getText().toString().trim());
                        clipboard.setPrimaryClip(clip);
                        Toast.makeText(getContext(), txtResultValue.getText().toString() + " copied to clipboard.", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            ibShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!txtResultValue.getText().toString().equalsIgnoreCase("--")) {
                        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                        String share_subject = "Converted value from " + txtFromUnit.getText().toString() + " to " + txtToUnit.getText().toString() + ".";
                        intent.setType("text/plain");
                        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, share_subject);
                        intent.putExtra(android.content.Intent.EXTRA_TEXT, txtResultValue.getText().toString());
                        startActivity(Intent.createChooser(intent, "Share Via"));
                    }
                }
            });

            //SET INITIAL CARDS
            List<CarouselPicker.PickerItem> textItems = null;
            try {
                textItems = new CarouselData().getUnitArray(conversionType, getContext());
                if (textItems.size() > 0) {
                    txtFromUnit.setText(textItems.get(0).getText());
                    txtToUnit.setText(textItems.get(0).getText());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }


            //SET ONCLICK FOR UNIT CARDS
            cvFromUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        showUnitsChooserDialog(conversionType, CONV_FROM);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });

            cvToUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        showUnitsChooserDialog(conversionType, CONV_TO);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });


            //CALCULATION ON TEXT CHANGE
            edtConversionValue.addTextChangedListener(new TextWatcher() {
                double conversionValue;

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    String conversionValue = edtConversionValue.getText().toString().trim();
                    txtResultValue.setText("");
                    if (!conversionValue.equalsIgnoreCase("") && Pattern.matches("^[0-9.-]*$", conversionValue)) {
                        if (conversionType.equalsIgnoreCase(ConversionTypes.CURRENCY)) {
                            conversionProcessor.setCnvLayout(conversionType, txtFromUnit.getText().toString().trim(), txtToUnit.getText().toString().trim(), conversionValue);
                        } else {
                            txtResultValue
                                    .setText(conversionProcessor
                                            .setCnvLayout(conversionType,
                                                    txtFromUnit.getText().toString().trim(),
                                                    txtToUnit.getText().toString().trim(),
                                                    conversionValue));
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                }
            });

            ivConvert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String currentFromUnit = txtFromUnit.getText().toString().trim();
                    String currentToUnit = txtToUnit.getText().toString().trim();
                    txtFromUnit.setText(currentToUnit);
                    txtToUnit.setText(currentFromUnit);
                    if (!edtConversionValue.getText().toString().trim().equalsIgnoreCase("")) {
                        if (conversionType.equalsIgnoreCase(ConversionTypes.CURRENCY)) {
                            conversionProcessor.setCnvLayout(conversionType, txtFromUnit.getText().toString().trim(), txtToUnit.getText().toString().trim(), edtConversionValue.getText().toString().trim());
                        } else {
                            txtResultValue
                                    .setText(conversionProcessor
                                            .setCnvLayout(conversionType,
                                                    txtFromUnit.getText().toString().trim(),
                                                    txtToUnit.getText().toString().trim(),
                                                    edtConversionValue.getText().toString().trim()));
                        }
                    }
                }
            });
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_unit_conversion, container, false);
    }

    private void showUnitsChooserDialog(String conversionType, String convToFrom) throws JSONException {
        List<CarouselPicker.PickerItem> textItems = new CarouselData().getUnitArray(conversionType, getContext());
        if (textItems.size() > 0) {
            Dialog unitChooserDialog = new Dialog(getContext());
            unitChooserDialog.setContentView(R.layout.unit_chooser_dialog_layout);
            unitChooserDialog.getWindow().setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), R.drawable.dialog_background_drawable));
            unitChooserDialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            unitChooserDialog.getWindow().getAttributes().windowAnimations = R.style.baseAnimation;
            unitChooserDialog.setCancelable(false);
            CarouselPicker carouselPicker = unitChooserDialog.findViewById(R.id.unitCarousel);
            CarouselPicker.CarouselViewAdapter carouselViewAdapter = new CarouselPicker.CarouselViewAdapter(getContext(), textItems, 0);
            carouselPicker.setAdapter(carouselViewAdapter);
            carouselPicker.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override
                public void onPageSelected(int position) {
                    if (convToFrom.equalsIgnoreCase("from")) {
                        txtFromUnit.setText(textItems.get(position).getText());
                    } else {
                        txtToUnit.setText(textItems.get(position).getText());
                    }
                }

                @Override
                public void onPageScrollStateChanged(int state) {
                }
            });

            Button btnSetUnit = unitChooserDialog.findViewById(R.id.btnSetUnit);
            btnSetUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!edtConversionValue.getText().toString().trim().equalsIgnoreCase("")) {
                        if (conversionType.equalsIgnoreCase(ConversionTypes.CURRENCY)) {
                            conversionProcessor.setCnvLayout(conversionType, txtFromUnit.getText().toString().trim(), txtToUnit.getText().toString().trim(), edtConversionValue.getText().toString().trim());
                        } else {
                            txtResultValue.setText(conversionProcessor.setCnvLayout(conversionType, txtFromUnit.getText().toString().trim(), txtToUnit.getText().toString().trim(), edtConversionValue.getText().toString().trim()));
                        }
                    }
                    unitChooserDialog.dismiss();
                }
            });
            unitChooserDialog.show();
        }
    }

    @Override
    public void setConvertedCurrency(String value) {
        System.out.println(value);
        NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
        if (!value.equalsIgnoreCase("") || value != null) { //didn't work check it
            String[] splitVal = value.split(" ");
            txtResultValue.setText(format.format(Double.parseDouble(splitVal[0])) + " " + splitVal[1]);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fabOne:
                edtConversionValue.setText(edtConversionValue.getText() + "1");
                break;
            case R.id.fabTwo:
                edtConversionValue.setText(edtConversionValue.getText() + "2");
                break;
            case R.id.fabThree:
                edtConversionValue.setText(edtConversionValue.getText() + "3");
                break;
            case R.id.fabFour:
                edtConversionValue.setText(edtConversionValue.getText() + "4");
                break;
            case R.id.fabFive:
                edtConversionValue.setText(edtConversionValue.getText() + "5");
                break;
            case R.id.fabSix:
                edtConversionValue.setText(edtConversionValue.getText() + "6");
                break;
            case R.id.fabSeven:
                edtConversionValue.setText(edtConversionValue.getText() + "7");
                break;
            case R.id.fabEight:
                edtConversionValue.setText(edtConversionValue.getText() + "8");
                break;
            case R.id.fabNine:
                edtConversionValue.setText(edtConversionValue.getText() + "9");
                break;
            case R.id.fabZero:
                edtConversionValue.setText(edtConversionValue.getText() + "0");
                break;
            case R.id.fabDot:
                if (edtConversionValue.getText().toString().equalsIgnoreCase("")) {
                    edtConversionValue.setText("0." + edtConversionValue.getText());
                } else if (!edtConversionValue.getText().toString().contains(".")) {
                    edtConversionValue.setText(edtConversionValue.getText() + ".");
                }
                break;

            case R.id.fabMinusPlus:
                if (isPositive) {
                    edtConversionValue.setText(edtConversionValue.getText().toString().replace("-", ""));
                    isPositive = false;
                } else {
                    if (!edtConversionValue.getText().toString().contains("-") && !edtConversionValue.getText().toString().equalsIgnoreCase("")) {
                        edtConversionValue.setText("-" + edtConversionValue.getText());
                        isPositive = true;
                    }
                }
                break;

            case R.id.fabDelete:
                String modifiable = edtConversionValue.getText().toString().trim();
                if (!modifiable.equalsIgnoreCase("")) {
                    edtConversionValue.setText(modifiable.substring(0, modifiable.length() - 1));
                }
                break;

            case R.id.fabClear:
                edtConversionValue.setText("");
                break;
        }
    }
}