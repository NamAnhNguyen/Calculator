package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button[] numberButtons;
    public TextView textView;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, C, CE, add, sub, mul, div, equal, BS, negative, toForm;
    int currValue = 0;
    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        C = (Button) findViewById(R.id.C);
        CE = (Button) findViewById(R.id.CE);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        equal = (Button) findViewById(R.id.equal);
        BS = (Button) findViewById(R.id.BS);
        negative = (Button) findViewById(R.id.negative);
        toForm = (Button) findViewById(R.id.toForm);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("1");
                } else {
                    textView.setText(currTextView + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("2");
                } else {
                    textView.setText(currTextView + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("3");
                } else {
                    textView.setText(currTextView + "3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("4");
                } else {
                    textView.setText(currTextView + "4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("5");
                } else {
                    textView.setText(currTextView + "5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("6");
                } else {
                    textView.setText(currTextView + "6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("7");
                } else {
                    textView.setText(currTextView + "7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("8");
                } else {
                    textView.setText(currTextView + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("9");
                } else {
                    textView.setText(currTextView + "9");
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("0");
                } else {
                    textView.setText(currTextView + "0");
                }
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });

        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = 0;
                textView.setText("0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = Integer.parseInt(textView.getText().toString());
                mode = 0;
                textView.setText("0");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = Integer.parseInt(textView.getText().toString());
                mode = 1;
                textView.setText("0");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = Integer.parseInt(textView.getText().toString());
                mode = 2;
                textView.setText("0");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = Integer.parseInt(textView.getText().toString());
                mode = 3;
                textView.setText("0");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int secondValue = Integer.parseInt(textView.getText().toString());
                int result;
                switch (mode) {
                    case 0:
                        result = currValue + secondValue;
                        textView.setText(String.valueOf(result));
                        currValue = result;
                        break;

                    case 1:
                        result = currValue - secondValue;
                        textView.setText(String.valueOf(result));
                        currValue = result;
                        break;

                    case 2:
                        result = currValue * secondValue;
                        textView.setText(String.valueOf(result));
                        currValue = result;
                        break;

                    case 3:
                        if (secondValue == 0) {
                            currValue = 0;
                            textView.setText("0");
                        } else {
                            result = currValue / secondValue;
                            textView.setText(String.valueOf(result));
                            currValue = result;
                        }
                        break;
                    default:
                        break;
                }
            }
        });

        BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer currTextView = new StringBuffer(textView.getText().toString());
                currTextView.deleteCharAt(currTextView.length() - 1);
                textView.setText(currTextView);
            }
        });

        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currTextView = Integer.parseInt(textView.getText().toString());
                textView.setText(String.valueOf(0 - currTextView));
            }
        });

        toForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchForm();
            }
        });
    }

    private  void launchForm(){
        Intent intent = new Intent(this, FormActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}