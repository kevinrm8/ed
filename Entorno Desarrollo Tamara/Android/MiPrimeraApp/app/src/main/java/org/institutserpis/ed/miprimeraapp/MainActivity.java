package org.institutserpis.ed.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 =(EditText) findViewById(R.id.txt_num1);
        et2 =(EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_Resultado);
    }

    public void Sumar(View view){
        Double num1 = Double.parseDouble(et1.getText().toString());
        Double num2 = Double.parseDouble(et2.getText().toString());

        Double suma = num1 + num2;

        tv1.setText(String.valueOf(suma));
    }

    public void Restar(View view){
        Double num1 = Double.parseDouble(et1.getText().toString());
        Double num2 = Double.parseDouble(et2.getText().toString());

        Double resta = num1 - num2;

        tv1.setText(String.valueOf(resta));
    }

    public void Multiplicar(View view){
        Double num1 = Double.parseDouble(et1.getText().toString());
        Double num2 = Double.parseDouble(et2.getText().toString());

        Double mult = num1 * num2;

        tv1.setText(String.valueOf(mult));
    }
    public void Dividir(View view){
        Double num1 = Double.parseDouble(et1.getText().toString());
        Double num2 = Double.parseDouble(et2.getText().toString());

        Double div = num1 / num2;

        tv1.setText(String.valueOf(div));
    }

}
