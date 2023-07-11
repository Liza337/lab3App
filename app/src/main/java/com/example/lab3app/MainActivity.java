package com.example.lab3app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnDel,btnAC ,btnPercent, btnNine,btnEight,btnSeven,btnPlus,

    btnSix,btnFive,btnFour,btnMinus,btnThree,btnTwo,

    btnOne,btnMul,btnPoint,btnEqual,btnZero,btnDivide;
     EditText edtName;
    float mValueOne,mbValueTwo;
    boolean add,sub,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDel=findViewById(R.id.btnDel);
        btnAC=findViewById(R.id.btnAC);
        btnPercent=findViewById(R.id.btnPercent);
        btnNine=findViewById(R.id.btnNine);
        btnEight=findViewById(R.id.btnEight);
        btnSeven=findViewById(R.id.btnSeven);
        btnPlus=findViewById(R.id.btnPlus);
        btnSix=findViewById(R.id.btnSix);
        btnFive=findViewById(R.id.btnFive);
        btnFour=findViewById(R.id.btnFour);
        btnMinus=findViewById(R.id.btnMinus);
        btnThree=findViewById(R.id.btnThree);
        btnTwo=findViewById(R.id.btnTwo);
        btnOne=findViewById(R.id.btnOne);
        btnMul=findViewById(R.id.btnMul);
        btnPoint=findViewById(R.id.btnPoint);
        btnEqual=findViewById(R.id.btnEqual);
        btnZero=findViewById(R.id.btnZero);
        btnDivide=findViewById(R.id.btnDivide);

        edtName =findViewById(R.id.edtName);



        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+ "0");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+"1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+"5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+"7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+"9");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText(edtName.getText()+".");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( edtName == null)
                    edtName.setText("");
                else
                {
                    mValueOne=Float.parseFloat(edtName.getText()+"");
                    add=true;
                    edtName.setText(null);
                }
            }

        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    mValueOne=Float.parseFloat(edtName.getText()+"");
                    sub=true;
                    edtName.setText(null);

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne=Float.parseFloat(edtName.getText()+"");
                mul=true;
                edtName.setText(null);

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne=Float.parseFloat(edtName.getText()+"");
                div=true;
                edtName.setText(null);

            }
        });



        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtName.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mbValueTwo =Float.parseFloat(edtName.getText()+"");
                if(add==true)
                {
                    edtName.setText(mValueOne+mbValueTwo +"");
                    add=false;
                }
                if(sub==true)
                {
                    edtName.setText(mValueOne-mbValueTwo +"");
                    sub=false;
                }
                if(mul==true)
                {
                    edtName.setText(mValueOne*mbValueTwo +"");
                    mul=false;
                }
                if(div==true)
                {
                    edtName.setText(mValueOne/mbValueTwo +"");
                    div=false;
                }
            }
        });


    }

}