package com.uxap.unitsxp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.uxap.unitsxp.R;

import java.util.TimeZone;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TZConversionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TZConversionFragment extends Fragment {
    private final static String CONV_TYPE = "conversion_type";

    private TextView txtTimeP1, txtTimeP2;
    private Spinner sprAmPm;
    private RecyclerView rvTimeZones;
    private CardView cvTimeP1, cvTimeP2;
    private AutoCompleteTextView actSearchMyTimeZone;


    public TZConversionFragment() {
        // Required empty public constructor
    }

    public static TZConversionFragment newInstance(String conversionType) {
        TZConversionFragment fragment = new TZConversionFragment();
        if(conversionType!=null || conversionType != ""){

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
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtTimeP1 = view.findViewById(R.id.txtTimeP1);
        txtTimeP2 = view.findViewById(R.id.txtTimeP2);
        cvTimeP1 = view.findViewById(R.id.cvTimeP1);
        cvTimeP2 = view.findViewById(R.id.cvTimeP2);
        sprAmPm = view.findViewById(R.id.sprAM_PM);
        rvTimeZones = view.findViewById(R.id.rvTimeZones);
        actSearchMyTimeZone = view.findViewById(R.id.actSearchMyTimeZone);

        cvTimeP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTimePickerDialog();
            }
        });

        cvTimeP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTimePickerDialog();
            }
        });

    }

    private void setTimePickerDialog() {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getActivity().getSupportFragmentManager(), "timePicker");
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string + ":" + minute_string);
        System.out.println(timeMessage);

        //unable to set time to text check later
        txtTimeP1.setText(hour_string);
        txtTimeP2.setText(minute_string);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tz_conversion, container, false);
    }
}