package com.raitots.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnMultiply;
    Button btnDivide;
    Button btnSubstract;
    Button btnAdd;
    Button btnEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find view elements
        tvDisplay = (TextView)findViewById(R.id.textViewDisplay);
        btnOne = (Button)findViewById(R.id.buttonOne);
        btnTwo = (Button)findViewById(R.id.buttonTwo);
        btnThree = (Button)findViewById(R.id.buttonThree);
        btnFour = (Button)findViewById(R.id.buttonFour);
        btnFive = (Button)findViewById(R.id.buttonFive);
        btnSix = (Button)findViewById(R.id.buttonSix);
        btnSeven = (Button)findViewById(R.id.buttonSeven);
        btnEight = (Button)findViewById(R.id.buttonEight);
        btnNine = (Button)findViewById(R.id.buttonNine);
        btnZero = (Button)findViewById(R.id.buttonZero);
        btnMultiply = (Button)findViewById(R.id.buttonMultiply);
        btnDivide = (Button)findViewById(R.id.buttonDivide);
        btnSubstract = (Button)findViewById(R.id.buttonSubtract);
        btnAdd = (Button)findViewById(R.id.buttonAdd);
        btnEquals = (Button)findViewById(R.id.buttonEquals);

        // restore tvDisplay text value from last saved instance
        if(savedInstanceState != null){
            tvDisplay.setText(savedInstanceState.getString("tvDisplayText"));
        }
        else {
            tvDisplay.setText("0");
        }

        // create a listener
        OnClickListener oclBtn = new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Implement onClick for buttons
                if(tvDisplay.getText()=="0")
                    tvDisplay.setText(((Button)v).getText() );
                else
                    tvDisplay.append(((Button)v).getText() );
            }
        };

        // assign listener to buttons
        btnOne.setOnClickListener(oclBtn);
        btnTwo.setOnClickListener(oclBtn);
        btnThree.setOnClickListener(oclBtn);
        btnFour.setOnClickListener(oclBtn);
        btnFive.setOnClickListener(oclBtn);
        btnSix.setOnClickListener(oclBtn);
        btnSeven.setOnClickListener(oclBtn);
        btnEight.setOnClickListener(oclBtn);
        btnNine.setOnClickListener(oclBtn);
        btnZero.setOnClickListener(oclBtn);
        btnMultiply.setOnClickListener(oclBtn);
        btnDivide.setOnClickListener(oclBtn);
        btnSubstract.setOnClickListener(oclBtn);
        btnAdd.setOnClickListener(oclBtn);

    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("tvDisplayText", tvDisplay.getText().toString());
    }

    public void calculate(View view){
        if(tvDisplay.getText() != "0"){

        }
    }

    public void clearDisplay(View view){
        tvDisplay.setText("0");
    }

}
