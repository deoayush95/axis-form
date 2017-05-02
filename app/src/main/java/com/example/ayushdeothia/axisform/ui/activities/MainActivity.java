package com.example.ayushdeothia.axisform.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.ayushdeothia.axisform.R;
import com.example.ayushdeothia.axisform.utils.Constantsutil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.name)
    EditText name;

    @BindView(R.id.email)
    EditText email;

    @BindView(R.id.contact_number)
    EditText contactNumber;

    @BindView(R.id.mobile_number)
    EditText mobileNumber;

    @BindView(R.id.gender)
    Spinner gender;

    @BindView(R.id.age)
    Spinner age;

    @BindView(R.id.residence)
    EditText residence;

    @BindView(R.id.town)
    EditText town;

    @BindView(R.id.geography)
    Spinner geography;

    @BindView(R.id.state)
    Spinner state;

    @BindView(R.id.district)
    EditText district;

    @BindView(R.id.pincode)
    EditText pincode;

    @BindView(R.id.lok_sabha)
    EditText lokSabha;

    @BindView(R.id.vidhan_sabha)
    EditText vidhanSabha;

    @BindView(R.id.no_of_family)
    EditText noOfFamily;

    @BindView(R.id.income)
    Spinner income;

    @BindView(R.id.occupation)
    Spinner occupation;

    @BindView(R.id.school)
    Spinner school;

    @BindView(R.id.internet)
    Spinner internet;

    @BindView(R.id.monthly_recharge)
    Spinner monthyRechagre;

    @BindView(R.id.whatsapp_usage)
    Spinner whatsappUsage;

    @BindView(R.id.computer_usage)
    Spinner computerUsage;

    @BindView(R.id.fb_account)
    Spinner fbAccount;

    @BindView(R.id.hospital)
    Spinner hospital;

    @BindView(R.id.vehicle)
    Spinner vehicle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        String[] stateArray = getResources().getStringArray(R.array.india_states);

        createSpinner(gender, Constantsutil.GENDER);
        createSpinner(age, Constantsutil.AGE);
        createSpinner(geography, Constantsutil.GEOGRAPHY);
        createSpinner(state, stateArray);
        createSpinner(income, Constantsutil.INCOME);
        createSpinner(occupation, Constantsutil.OCCUPATION);
        createSpinner(school, Constantsutil.SCHOOL);
        createSpinner(internet, Constantsutil.INTERNET);
        createSpinner(monthyRechagre, Constantsutil.RECHARGE);
        createSpinner(whatsappUsage, Constantsutil.WHATSAPP);
        createSpinner(computerUsage, Constantsutil.LAPTOP);
        createSpinner(fbAccount, Constantsutil.FACEBOOK_ACCOUNT);
        createSpinner(hospital, Constantsutil.HOSPITAL);
        createSpinner(vehicle, Constantsutil.VEHICLE);

    }


    public void createSpinner(Spinner spinner, String[] array) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, array);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
