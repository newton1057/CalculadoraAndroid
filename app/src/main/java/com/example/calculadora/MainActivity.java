package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,btnNueve,btnSuma,btnResta,btnMultiplica,btnDivide,btnLimpiar,btnMasMenos,btnPunto,btnIgual,btnCero,btnPorcentaje;
    TextView Resultado;
    String mostrar,operador,reserva;
    Double resultado,reservamasmenos,reservaporcentaje;
    String x, resulfinal;
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button)findViewById(R.id.uno);
        btnDos = (Button)findViewById(R.id.dos);
        btnTres = (Button)findViewById(R.id.tres);
        btnCuatro = (Button)findViewById(R.id.cuatro);
        btnCinco = (Button)findViewById(R.id.cinco);
        btnSeis = (Button)findViewById(R.id.seis);
        btnSiete = (Button)findViewById(R.id.siete);
        btnOcho = (Button)findViewById(R.id.ocho);
        btnNueve = (Button)findViewById(R.id.nueve);
        btnCero = (Button)findViewById(R.id.cero);
        btnSuma = (Button)findViewById(R.id.suma);
        btnResta = (Button)findViewById(R.id.resta);
        btnMultiplica = (Button)findViewById(R.id.mult);
        btnDivide = (Button)findViewById(R.id.div);
        btnLimpiar = (Button)findViewById(R.id.limpiar);
        btnMasMenos = (Button)findViewById(R.id.masmenos);
        Resultado = (TextView)findViewById(R.id.resultado);
        btnPunto = (Button)findViewById(R.id.punto);
        btnIgual = (Button)findViewById(R.id.igual);
        btnPorcentaje = (Button)findViewById(R.id.porcentaje);

        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="1";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "1";
                    Resultado.setText(mostrar);
                }

            }
        });

        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="2";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "2";
                    Resultado.setText(mostrar);
                }
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="3";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "3";
                    Resultado.setText(mostrar);
                }
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="4";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "4";
                    Resultado.setText(mostrar);
                }
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="5";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "5";
                    Resultado.setText(mostrar);
                }
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="6";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "6";
                    Resultado.setText(mostrar);
                }
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="7";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "7";
                    Resultado.setText(mostrar);
                }
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="8";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "8";
                    Resultado.setText(mostrar);
                }
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="9";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "9";
                    Resultado.setText(mostrar);
                }
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.equals("0"))
                {
                    mostrar="0";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "0";
                    Resultado.setText(mostrar);
                }
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("0");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("0");
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("0");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();

                operador = "/";
                Resultado.setText("0");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                if(mostrar.indexOf(".") == -1)
                {
                    mostrar = mostrar + ".";
                    Resultado.setText(mostrar);
                }
                else
                {
                    mostrar = mostrar + "";
                    Resultado.setText(mostrar);
                }

            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "0";
                reserva = "";
                Resultado.setText(mostrar);

            }
        });

        btnMasMenos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(Resultado.getText().toString().equals("0"))
                {
                    Resultado.setText("-0");
                }
                else {
                    if (Resultado.getText().toString().equals("-0")) {
                        Resultado.setText("0");
                    }
                    else {


                        reservamasmenos = -1 * Double.parseDouble(Resultado.getText().toString());
                        if (reservamasmenos % 1 == 0) {
                            result = (int) Math.round(reservamasmenos);
                            resulfinal = String.valueOf(result);
                        } else {
                            resulfinal = resultado.toString();
                        }
                        Resultado.setText(String.valueOf(resulfinal));
                    }
                }
            }
        });

        btnPorcentaje.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reservaporcentaje= Double.parseDouble(Resultado.getText().toString())/100;
                Resultado.setText(String.valueOf(reservaporcentaje));
            }
        });



        btnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                mostrar = Resultado.getText().toString();
                if (reserva == null || reserva.equals(""))
                {
                    Resultado.setText(mostrar);

                }

                else {


                    mostrar = mostrar + "1";

                    if (operador.equals("-")) {
                        resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                        transformar();
                        Resultado.setText(resulfinal);
                    }
                    if (operador.equals("+")) {
                        resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                        transformar();
                        Resultado.setText(resulfinal);
                    }
                    if (operador.equals("/")) {

                        resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                        transformar();
                        if(resulfinal.equals("NaN"))
                        {
                            resulfinal="0";
                        }
                        else{
                            Resultado.setText(resulfinal);
                        }

                    }
                    if (operador.equals("*")) {
                        resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                        transformar();
                        Resultado.setText(resulfinal);
                    }
                }
            }
        });

    }

    void transformar() {
        if(resultado%1==0) {
            result = (int) Math.round (resultado);
            resulfinal = String.valueOf(result);
        } else {
            resulfinal = resultado.toString();

        }
    }


}
