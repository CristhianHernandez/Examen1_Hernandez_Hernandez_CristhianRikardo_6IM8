package com.example.cristhianhernandez.examen1_hernandez_hernandez_cristhianrikardo_6im8;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Correo extends Activity {
EditText cantidad;
Double respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);

        cantidad = (EditText)findViewById(R.id.envio);

        Bundle recibo = new Bundle();

        recibo = getIntent().getExtras();
        respuesta = recibo.getDouble("convertido");

        cantidad.setText("Hernandez Hernandez Cristhian Rikardo ," + respuesta);
    }

    public void onClickEnviar(View v)
    {
String correo = cantidad.getText().toString();
        Intent correos = new Intent(Intent.ACTION_SEND);
        correos.setType("text/plain");
        correos.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen primer parcial");
        correos.putExtra(Intent.EXTRA_TEXT, correo);
        correos.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(correos);

    }


}
