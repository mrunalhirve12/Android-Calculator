package com.example.mruna.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**Variables defined*/
    TextView result;
    TextView answer;
    EditText number1;
    EditText number2;
    Button add, subtract, multiply, division, percent, squareroot, setclear ;
    double result_num;
    double num1, num2;

    /**
     * OnCreate responsible to create an activity, first time Onclick
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = this.<TextView>findViewById(R.id.answer);
        number1 = this.<EditText>findViewById(R.id.number1);
        number2 = this.<EditText>findViewById(R.id.number2);
        add = this.<Button>findViewById(R.id.add);
        subtract = this.<Button>findViewById(R.id.subtract);
        multiply = this.<Button>findViewById(R.id.multiply);
        division = this.<Button>findViewById(R.id.division);
        percent = this.<Button>findViewById(R.id.percent);
        squareroot = this.<Button>findViewById(R.id.squareroot);

        /**
         * add.setOnClickListener gets numbers from the fields
         * and performs addition
         */
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().equals("") || number2.getText().toString().equals("") ||
                        number1.getText().toString().equals(".") || number2.getText().toString().equals(".")) {
                    answer.setText(String.valueOf(""));
                    number2.getText().clear();
                    number1.getText().clear();
                    Toast.makeText(getApplicationContext(), "ERROR:Enter new operand value(s)", Toast.LENGTH_LONG).show();
                    number1.requestFocus();
                    return;
                }
                else {
                    num1 = Double.parseDouble(number1.getText().toString());
                    num2 = Double.parseDouble(number2.getText().toString());
                    result_num = num1 + num2;
                    answer.setText(String.valueOf(result_num));
                }
            }
        });

        /**
         * subtract.setOnClickListener gets numbers from the fields
         * and performs subtraction
         */
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().equals("") || number2.getText().toString().equals("") ||
                        number1.getText().toString().equals(".") || number2.getText().toString().equals(".")) {
                    answer.setText(String.valueOf(""));
                    number2.getText().clear();
                    number1.getText().clear();
                    Toast.makeText(getApplicationContext(), "ERROR:Enter new operand value(s)", Toast.LENGTH_LONG).show();
                    number1.requestFocus();
                    return;
                }
                else {
                    num1 = Double.parseDouble(number1.getText().toString());
                    num2 = Double.parseDouble(number2.getText().toString());
                    result_num = num1 - num2;
                    answer.setText(String.valueOf(result_num));
                }
            }
        });

        /**
         * multiply.setOnClickListener gets numbers from the fields
         * and performs multiplication
         */
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().equals("") || number2.getText().toString().equals("") ||
                        number1.getText().toString().equals(".") || number2.getText().toString().equals(".")) {
                    answer.setText(String.valueOf(""));
                    number2.getText().clear();
                    number1.getText().clear();
                    Toast.makeText(getApplicationContext(), "ERROR:Enter new operand value(s)", Toast.LENGTH_LONG).show();
                    number1.requestFocus();
                    return;
                }
                else {
                    num1 = Double.parseDouble(number1.getText().toString());
                    num2 = Double.parseDouble(number2.getText().toString());
                    result_num = num1 * num2;
                    answer.setText(String.valueOf(result_num));
                }
            }
        });

        /**
         * division.setOnClickListener gets numbers from the fields
         * and performs division
         */
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().equals("") || number2.getText().toString().equals("") ||
                        number1.getText().toString().equals(".") || number2.getText().toString().equals(".")) {
                    number2.getText().clear();
                    number1.getText().clear();
                    answer.setText(String.valueOf(""));
                    Toast.makeText(getApplicationContext(), "ERROR:Enter new operand value(s)", Toast.LENGTH_LONG).show();
                    number1.requestFocus();
                    return;
                }
                else {
                    num1 = Double.parseDouble(number1.getText().toString());
                    num2 = Double.parseDouble(number2.getText().toString());
                    if (num2 !=0.00 || num2 != 0){
                        result_num = num1 / num2;
                        answer.setText(String.valueOf(result_num));
                    } else {
                        answer.setText(String.valueOf(""));
                        number2.getText().clear();
                        number1.requestFocus();
                        Toast.makeText(getApplicationContext(), "ERROR:Enter new operand value(s)", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        /**
         * percent.setOnClickListener gets first number from the field
         * and gets the percent in the form num1/100
         */
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().equals("") || number1.getText().toString().equals(".")) {
                    number2.getText().clear();
                    Toast.makeText(getApplicationContext(), "ERROR:Enter new operand value(s)", Toast.LENGTH_LONG).show();
                    number1.requestFocus();
                    return;
                } else {
                    num1 = Double.parseDouble(number1.getText().toString());
                    result_num = num1 / 100;
                    answer.setText(String.valueOf(result_num));
                }
            }
        });

        /**
         * squareroot.setOnClickListener gets first number from the field
         * and performs squareroot
         */
        squareroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().equals("") || number1.getText().toString().equals(".")) {
                    number2.getText().clear();
                    Toast.makeText(getApplicationContext(), "ERROR:Enter new operand value(s)", Toast.LENGTH_LONG).show();
                    number1.requestFocus();
                    return;
                } else {
                    num1 = Double.parseDouble(number1.getText().toString());
                    result_num = Math.sqrt(num1);
                    answer.setText(String.valueOf(result_num));
                }

            }
        });
    }
}
