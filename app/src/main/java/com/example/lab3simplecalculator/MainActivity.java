package com.example.lab3simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private enum Operator {none, add, minus, multiply, divide};
    private double data1 = 0, data2 = 0;
    private Operator operator = Operator.none;

    public void btn00Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "0");
    }

    public void btn01Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "1");
    }

    public void btn02Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "2");
    }

    public void btn03Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "3");
    }

    public void btn04Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "4");
    }

    public void btn05Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "5");
    }

    public void btn06Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "6");
    }

    public void btn07Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "7");
    }

    public void btn08Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "8");
    }

    public void btn09Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "9");
    }

    public void btnDotClick(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + ".");
    }

    public void btnAddClick(View view) {
        operator = Operator.add;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusClick(View view) {
        operator = Operator.minus;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMultiplyClick(View view) {
        operator = Operator.multiply;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDivideClick(View view) {
        operator = Operator.divide;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnClearClick(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText("");
    }

    public void btnResultClick(View view) {
        if (operator != Operator.none) {
            EditText eText = (EditText)findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;

            if (operator == Operator.add) {
                result = data1 + data2;
            }
            else if (operator == Operator.minus) {
                result = data1 - data2;
            }
            else if (operator == Operator.multiply) {
                result = data1 * data2;
            }
            else if (operator == Operator.divide) {
                result = data1 / data2;
            }

            operator = Operator.none;
            data1 = result;

            if ((result-(int)result) != 0) {
                eText.setText(String.valueOf(result));
            }
            else {
                eText.setText(String.valueOf((int)result));
            }
        }
    }
}