package com.plotpterty;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.plotpterty.databinding.ActivityConverterBinding;


public class ConverterActivity extends DrawerbaseActivity {

    private EditText num1;
    private Button convert;
    private TextView result;

    private AppOpenAd mappOpenAd;

    private boolean isshowingad= false;
    String value;
    String value1;

    Spinner spinner;
    Spinner spinner1;
    String[] field1 = {"Marla","Kanal","Sq.Yard","Sq.Meter","Sq.Ft","Acre","Murabba"};
    String[] field2 = {"Marla","Kanal","Sq.Yard","Sq.Meter","Sq.Ft","Acre","Murabba"};
    ActivityConverterBinding activityConverterBinding;

    private void showopenads(){
        AdRequest adRequest = new AdRequest.Builder().build();

        AppOpenAd.load(this, "ca-app-pub-3732416706239165/2788881723",
                adRequest, AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT,
                new AppOpenAd.AppOpenAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        super.onAdFailedToLoad(loadAdError);
                    }

                    @Override
                    public void onAdLoaded(@NonNull AppOpenAd appOpenAd) {
                        super.onAdLoaded(appOpenAd);
                        mappOpenAd = appOpenAd;

                        if(!isshowingad) {
                            mappOpenAd.show(ConverterActivity.this);
                            isshowingad=true;

                        }

                    }
                });
    }
    @Override
    protected void onResume() {
        super.onResume();

        if(!isshowingad) {
            showopenads();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        activityConverterBinding = ActivityConverterBinding.inflate(getLayoutInflater());
        setContentView(activityConverterBinding.getRoot());
        allocateActivityTitle("Converter");

        num1 = (EditText)findViewById(R.id.numberfield1);
        convert= (Button)findViewById(R.id.convertbutton);
        result=(TextView)findViewById(R.id.result);

        num1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            String input1=num1.getText().toString().trim();
            convert.setEnabled(!input1.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        spinner=findViewById(R.id.field1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ConverterActivity.this, android.R.layout.simple_spinner_item,field1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                value = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner1=findViewById(R.id.field2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(ConverterActivity.this, android.R.layout.simple_spinner_item,field2);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                value1 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int number1=Integer.parseInt(num1.getText().toString());
                String field1= value;
                String field2= value1;
                int answer;

                if(field1.equals("Marla")&& field2.equals("Marla")){
                    answer = number1;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);

                } else if (field1.equals("Marla")&& field2.equals("Kanal")) {
                    answer=number1/20;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Marla")&& field2.equals("Sq.Yard")) {
                    answer= (int) (number1*30.25);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Marla")&& field2.equals("Sq.Meter")) {
                    answer= (int) (number1*25.293);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Marla")&& field2.equals("Sq.Ft")) {
                    answer= (int) (number1*272.3);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Marla")&& field2.equals("Acre")) {
                    answer= number1/160;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Marla")&& field2.equals("Murabba")) {
                    answer=number1/4000;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if(field1.equals("Kanal")&& field2.equals("Marla")){
                    answer=number1*20;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Kanal")&& field2.equals("Kanal")) {
                    answer=number1;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Kanal")&& field2.equals("Sq.Yard")) {
                    answer=number1*605;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Kanal")&& field2.equals("Sq.Meter")) {
                    answer=(int) (number1*505.9);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Kanal")&& field2.equals("Sq.Ft")) {
                    answer=number1*5445;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Kanal")&& field2.equals("Acre")) {
                    answer=number1/8;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Kanal")&& field2.equals("Murabba")) {
                    answer=number1/200;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if(field1.equals("Sq.Yard")&& field2.equals("Marla")){
                    answer=(int) (number1*30.25);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Yard")&& field2.equals("Kanal")) {
                    answer=number1/605;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Yard")&& field2.equals("Sq.Yard")) {
                    answer=number1;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Yard")&& field2.equals("Sq.Meter")) {
                    answer=(int) (number1*1.196);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Yard")&& field2.equals("Sq.Ft")) {
                    answer=number1*9;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Yard")&& field2.equals("Acre")) {
                    answer=number1*4840;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Yard")&& field2.equals("Murabba")) {
                    answer=(int)(number1/120999.9882);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if(field1.equals("Sq.Meter")&& field2.equals("Marla")){
                    answer=(int)(number1/25.293);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Meter")&& field2.equals("Kanal")) {
                    answer=(int)(number1/505.9);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Meter")&& field2.equals("Sq.Yard")) {
                    answer=(int)(number1/1.196);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Meter")&& field2.equals("Sq.Meter")) {
                    answer=number1;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Meter")&& field2.equals("Sq.Ft")) {
                    answer=(int)(number1*10.764);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Meter")&& field2.equals("Acre")) {
                    answer=number1/4047;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Meter")&& field2.equals("Murabba")) {
                    answer=(int)(number1*101171.4106);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if(field1.equals("Sq.Ft")&& field2.equals("Marla")){
                    answer=(int)(number1/272.3);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Ft")&& field2.equals("Kanal")) {
                    answer=number1/5445;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Ft")&& field2.equals("Sq.Yard")) {
                    answer=number1/9;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Ft")&& field2.equals("Sq.Meter")) {
                    answer=(int)(number1/10.764);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Ft")&& field2.equals("Sq.Ft")) {
                    answer=number1;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Ft")&& field2.equals("Acre")) {
                    answer=number1/43560;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Sq.Ft")&& field2.equals("Murabba")) {
                    answer=number1/1089000;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if(field1.equals("Acre")&& field2.equals("Marla")){
                    answer=number1*160;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Acre")&& field2.equals("Kanal")) {
                    answer=number1*8;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Acre")&& field2.equals("Sq.Yard")) {
                    answer=number1*4840;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Acre")&& field2.equals("Sq.Meter")) {
                    answer=number1*4047;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Acre")&& field2.equals("Sq.Ft")) {
                    answer=number1/43560;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Acre")&& field2.equals("Acre")) {
                    answer=number1;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Acre")&& field2.equals("Murabba")) {
                    answer=number1/25;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if(field1.equals("Murabba")&& field2.equals("Marla")){
                    answer=number1*4000;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Murabba")&& field2.equals("Kanal")) {
                    answer=number1*200;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Murabba")&& field2.equals("Sq.Yard")) {
                    answer=(int)(number1*120999.9882);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Murabba")&& field2.equals("Sq.Meter")) {
                    answer=(int)(number1*101171.4106);
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Murabba")&& field2.equals("Sq.Ft")) {
                    answer=number1*1089000;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Murabba")&& field2.equals("Acre")) {
                    answer=number1*25;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
                else if (field1.equals("Murabba")&& field2.equals("Murabba")) {
                    answer=number1;
                    result.setText("Result: " +number1+" "+field1+" = " +answer+" "+field2);
                }
            }
        });

    }
}