package org.institutserpis.ed.acalculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1,rb2,rb3,rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 =(EditText) findViewById(R.id.txt_num1);
        et2 =(EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_Resultado);
        rb1 = (RadioButton) findViewById(R.id.RB_Suma);
        rb2 = (RadioButton) findViewById(R.id.RB_Resta);
        rb3 = (RadioButton) findViewById(R.id.RB_Multiplicar);
        rb4 = (RadioButton) findViewById(R.id.RB_Dividir);

    }

    public void Calcular(View view){

        double num1 = Integer.parseInt(et1.getText().toString());
        double num2 = Integer.parseInt(et2.getText().toString());

        if(rb1.isChecked()==true){
            double suma = num1 + num2;
            tv1.setText(String.valueOf(suma));
        }else if(rb2.isChecked()==true){
            double resta = num1 - num2;
            tv1.setText(String.valueOf(resta));
        }else if(rb3.isChecked()==true) {
            double multiplicar = num1 * num2;
            tv1.setText(String.valueOf(multiplicar));
        }else if(rb4.isChecked()==true){
            if(num2 == 0){
                Toast.makeText(this,"NO SE PUEDE DIVIDIR POR 0",Toast.LENGTH_LONG).show();
                tv1.setText(" ");
            } else{
                double dividir = num1 / num2;
                tv1.setText(String.valueOf(dividir));
            }

        }

    }
}

