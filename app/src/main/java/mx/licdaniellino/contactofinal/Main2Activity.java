package mx.licdaniellino.contactofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


        Button editarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editarDatos = (Button) findViewById(R.id.editardatosid);
        Bundle parametros = getIntent().getExtras();
        String nombrep = parametros.getString(getResources().getString(R.string.pnombre));
        String telefonop = parametros.getString(getResources().getString(R.string.ptelefono));
        String emailp = parametros.getString(getResources().getString(R.string.pemail));
        String descripcionp = parametros.getString(getResources().getString(R.string.pdescripcion));
        String fechap = parametros.getString(getResources().getString(R.string.pfecha));
        TextView resnombre = (TextView) findViewById(R.id.tvnombreactdos);
        TextView restelefono = (TextView) findViewById(R.id.tvtelefono);
        TextView resemail = (TextView) findViewById(R.id.tvemail);
        TextView resdescripcion = (TextView) findViewById(R.id.tvdescripcion);
        TextView resfecha = (TextView) findViewById(R.id.tvfecha);

        resfecha.setText(fechap);
        resnombre.setText(nombrep);
        restelefono.setText(telefonop);
        resemail.setText(emailp);
        resdescripcion.setText(descripcionp);

        editarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent editarDatos = new Intent(Main2Activity.this, MainActivity.class);

                    finish();

            }
        });


    }


    }

