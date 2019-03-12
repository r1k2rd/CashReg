package com.richardriispere.cashreg.cashreg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/*
Sisesta kupüüride arv kassas ning programm summeerib kupüürid.
 */

public class MainActivity extends AppCompatActivity {

    private EditText eur50;
    private EditText eur20;
    private EditText eur10;
    private EditText eur5;
    private EditText eur2;
    private EditText eur1;
    private EditText sent50;
    private EditText sent20;
    private EditText sent10;
    private EditText sent5;

    private Button resetbtn;

    private float fifty = 0.00f;
    private float twenty = 0.00f;
    private float ten = 0.00f;
    private float five = 0.00f;
    private float two = 0.00f;
    private float one = 0.00f;
    private float fiftyCents = 0.00f;
    private float twentyCents = 0.00f;
    private float tenCents = 0.00f;
    private float fiveCents = 0.00f;

    private float summa = 0.00f;

    private TextView sum;


    private ArrayList<EditText> moneyList = new ArrayList<EditText>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eur50 = (EditText) findViewById(R.id.editText50);
        eur20 = (EditText) findViewById(R.id.editText20);
        eur10 = (EditText) findViewById(R.id.editText10);
        eur5 = (EditText) findViewById(R.id.editText5);
        eur2 = (EditText) findViewById(R.id.editText2);
        eur1 = (EditText) findViewById(R.id.editText1);
        sent50 = (EditText) findViewById(R.id.editText50s);
        sent20 = (EditText) findViewById(R.id.editText20s);
        sent10 = (EditText) findViewById(R.id.editText10s);
        sent5 = (EditText) findViewById(R.id.editText5s);

        resetbtn = (Button) findViewById(R.id.resetBtnID);

        sum = (TextView) findViewById(R.id.cashSumID);

        moneyList.add(eur50);
        moneyList.add(eur20);
        moneyList.add(eur10);
        moneyList.add(eur5);
        moneyList.add(eur2);
        moneyList.add(eur1);
        moneyList.add(sent50);
        moneyList.add(sent20);
        moneyList.add(sent10);
        moneyList.add(sent10);
        moneyList.add(sent5);

        for(final EditText textField : moneyList){
            textField.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            textField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if(hasFocus){
                        textField.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }
                    else{
                        textField.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                }
            });
        }



        eur50.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(eur50.getText().toString().equals("") == false) {
                    fifty = Float.parseFloat(eur50.getText().toString()) * 50;
                }else{fifty = 0.0f;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        eur20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(eur20.getText().toString().equals("") == false) {
                    twenty = Float.parseFloat(eur20.getText().toString()) * 20;
                }else{twenty = 0.0f;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        eur10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(eur10.getText().toString().equals("") == false) {
                    ten = Float.parseFloat(eur10.getText().toString()) * 10;
                }else{ten = 0.0f;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        eur5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(eur5.getText().toString().equals("") == false) {
                    five = Float.parseFloat(eur5.getText().toString()) * 5;
                }else{five = 0.0f;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        eur2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(eur2.getText().toString().equals("") == false) {
                    two = Float.parseFloat(eur2.getText().toString()) * 2;
                }else{two = 0.0f;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        eur1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(eur1.getText().toString().equals("") == false) {
                    one = Float.parseFloat(eur1.getText().toString()) ;
                }else{one = 0.0f;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        sent50.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(sent50.getText().toString().equals("") == false) {
                    fiftyCents = Float.parseFloat(sent50.getText().toString()) * 0.5f ;
                }else{fiftyCents = 0.0f;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        sent20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(sent20.getText().toString().equals("") == false) {
                    twentyCents = Float.parseFloat(sent20.getText().toString()) * 0.2f ;
                }else{twentyCents = 0.0f;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        sent10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(sent10.getText().toString().equals("") == false) {
                    tenCents = Float.parseFloat(sent10.getText().toString()) * 0.1f;
                }else{tenCents = 0.0f;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        sent5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable box) {
                if(sent5.getText().toString().equals("") == false) {
                    fiveCents = Float.parseFloat(sent5.getText().toString()) *0.05f;
                }else{fiveCents = 0;}
                summa = fifty + twenty + ten + five + two + one + fiftyCents + twentyCents + tenCents + fiveCents;
                sum.setText(String.valueOf(summa));

            }
        });

        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(EditText textField : moneyList){
                    textField.setText("");
                }
            }
        });




    }


}
