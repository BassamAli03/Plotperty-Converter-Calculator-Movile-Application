package com.plotpterty;

import androidx.appcompat.app.AppCompatActivity;

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

import com.plotpterty.databinding.ActivityCalculatorBinding;

public class CalculatorActivity extends DrawerbaseActivity {

    private EditText areafield;
    private EditText costfield;

    private TextView cement;
    private TextView sand;
    private TextView aggregate;
    private TextView steel;
    private TextView fittings;
    private TextView finishers;
    private TextView totalcost;

    private Button calculate;

    String value;

    Spinner spinner;

    String[] typefield = {"Grey Structure","Complete"};
    ActivityCalculatorBinding activityCalculatorBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        activityCalculatorBinding = ActivityCalculatorBinding.inflate(getLayoutInflater());
        setContentView(activityCalculatorBinding.getRoot());
        allocateActivityTitle("Calculator");

        areafield =(EditText)findViewById(R.id.areafield1);
        costfield =(EditText)findViewById(R.id.costfield1);
        calculate = (Button)findViewById(R.id.calculatebutton);
        cement =(TextView) findViewById(R.id.cement);
        sand =(TextView) findViewById(R.id.sand);
        aggregate =(TextView) findViewById(R.id.aggregate);
        steel =(TextView) findViewById(R.id.steel);
        fittings =(TextView) findViewById(R.id.fittings);
        finishers =(TextView) findViewById(R.id.finishers);
        totalcost =(TextView) findViewById(R.id.total);

        areafield.addTextChangedListener(logintext);
        costfield.addTextChangedListener(logintext);

        spinner=findViewById(R.id.typefield1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(CalculatorActivity.this, android.R.layout.simple_spinner_item,typefield);
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

        calculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int area=Integer.parseInt(areafield.getText().toString());
                int cost=Integer.parseInt(costfield.getText().toString());
                String type = value;
                int cementcost=0;
                int sandcost=0;
                int aggregatecost=0;
                int steelcost=0;
                int fittingscost=0;
                int finisherscost=0;
                int totalcost1=0;
                int totalcost2=0;

                if(type.equals("Grey Structure")){
                    totalcost1 = area*cost;
                    cementcost = (int)((16.4/100)*totalcost1);
                    sandcost = (int)((12.3/100)*totalcost1);
                    aggregatecost = (int)((7.4/100)*totalcost1);
                    steelcost = (int)((24.6/100)*totalcost1);
                    totalcost2 = (cementcost+sandcost+aggregatecost+steelcost);
                    cement.setText(" " +cementcost);
                    sand.setText(" " +sandcost);
                    aggregate.setText(" " +aggregatecost);
                    steel.setText(" " +steelcost);
                    fittings.setText(" " +fittingscost);
                    finishers.setText(" " +finisherscost);
                    totalcost.setText(" " +totalcost2);

                }
                else if(type.equals("Complete")){
                    totalcost1 = area*cost;
                    cementcost = (int)((16.4/100)*totalcost1);
                    sandcost = (int)((12.3/100)*totalcost1);
                    aggregatecost = (int)((7.4/100)*totalcost1);
                    steelcost = (int)((24.6/100)*totalcost1);
                    fittingscost = (int)((22.8/100)*totalcost1);
                    finisherscost = (int)((16.5/100)*totalcost1);

                    cement.setText(" " +cementcost);
                    sand.setText(" " +sandcost);
                    aggregate.setText(" " +aggregatecost);
                    steel.setText(" " +steelcost);
                    fittings.setText(" " +fittingscost);
                    finishers.setText(" " +finisherscost);
                    totalcost.setText(" " +totalcost1);
                }
            }
        });
    }

    private TextWatcher logintext = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String input1=areafield.getText().toString().trim();
            String input2=costfield.getText().toString().trim();
            calculate.setEnabled(!input1.isEmpty() && !input2.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}