package net.unadeca.gastos_por_mes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //definicion de variables
    TextView resultado;
    EditText mes1, mes2, mes3, mes4, mes5, mes6, mes7, mes8, mes9, mes10, mes11, mes12;
    Button but4, but5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //asociar elementos con las variables principales
        mes1=(EditText)findViewById(R.id.mes1);
        mes2=(EditText) findViewById(R.id.mes2);
        mes3=(EditText) findViewById(R.id.mes3);
        mes4=(EditText)findViewById(R.id.mes4);
        mes5=(EditText)findViewById(R.id.mes5);
        mes6=(EditText)findViewById(R.id.mes6);
        mes7=(EditText)findViewById(R.id.mes7);
        mes8=(EditText)findViewById(R.id.mes8);
        mes9=(EditText)findViewById(R.id.mes9);
        mes10=(EditText)findViewById(R.id.mes10);
        mes11=(EditText)findViewById(R.id.mes11);
        mes12=(EditText)findViewById(R.id.mes12);

        but4=(Button)findViewById(R.id.but4);
        but5=(Button) findViewById(R.id.but5);
        resultado=(TextView)findViewById(R.id.resultado);

        // crear evento onclick
        but4.setOnClickListener(this);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mes1.setText("");
                mes2.setText("");
                mes3.setText("");
                mes4.setText("");
                mes5.setText("");
                mes6.setText("");
                mes7.setText("");
                mes8.setText("");
                mes9.setText("");
                mes10.setText("");
                mes11.setText("");
                mes12.setText("");
                resultado.setText("");

            }
        });
        ;
    }
    @Override
    public void onClick(View v) {


        //pasar de texto a entero


        int entero1=Integer.parseInt(mes1.getText().toString());

        int entero2=Integer.parseInt(mes2.getText().toString());
        int entero3=Integer.parseInt(mes3.getText().toString());
        int entero4=Integer.parseInt(mes4.getText().toString());
        int entero5=Integer.parseInt(mes5.getText().toString());
        int entero6=Integer.parseInt(mes6.getText().toString());
        int entero7=Integer.parseInt(mes7.getText().toString());
        int entero8=Integer.parseInt(mes8.getText().toString());
        int entero9=Integer.parseInt(mes9.getText().toString());
        int entero10=Integer.parseInt(mes10.getText().toString());
        int entero11=Integer.parseInt(mes11.getText().toString());
        int entero12=Integer.parseInt(mes12.getText().toString());

        int resp=entero1+entero2+entero3+entero4+entero5+entero6+entero7+entero8+entero9+entero10+entero11+entero12;


        //concatenacion de resultado en el textview
        resultado.setText(""+resp);

    }
}



