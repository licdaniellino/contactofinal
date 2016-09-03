package mx.licdaniellino.contactofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {


        Button siguiente;
        private EditText nombre;
        private EditText telefono;
        private  EditText email;
        private EditText descripcionContacto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       nombre = (EditText) findViewById(R.id.etxtnombre);
        telefono = (EditText) findViewById(R.id.etxttelefono);
        siguiente = (Button) findViewById(R.id.siguienteid);
        email = (EditText) findViewById(R.id.etxtemail);
        descripcionContacto = (EditText) findViewById(R.id.etxtdescripcion);
        siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                DatePicker dpfecha = (DatePicker) findViewById(R.id.datePicker);

                int day = dpfecha.getDayOfMonth();
                int month = dpfecha.getMonth();
                int year = dpfecha.getYear();

        /*Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
*/



                final String sFecha = Integer.toString(day).concat(" / ").concat(Integer.toString(month+1)).concat(" / ").concat(Integer.toString(year));


       /*final String sFecha;


        sFecha = String.valueOf(dpfecha.getDayOfMonth())+ String.valueOf(dpfecha.getMonth()) + String.valueOf(dpfecha.getYear());*/


                Intent siguiente = new Intent (MainActivity.this, Main2Activity.class);

            siguiente.putExtra(getResources().getString(R.string.pnombre), nombre.getText().toString());
            siguiente.putExtra(getResources().getString(R.string.ptelefono),telefono.getText().toString());
            siguiente.putExtra(getResources().getString(R.string.pemail),email.getText().toString());
            siguiente.putExtra(getResources().getString(R.string.pdescripcion),descripcionContacto.getText().toString());
            siguiente.putExtra(getResources().getString(R.string.pfecha),sFecha);
                startActivity (siguiente);
            }

        });

    }


}
