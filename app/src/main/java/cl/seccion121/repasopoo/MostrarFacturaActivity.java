package cl.seccion121.repasopoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MostrarFacturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_factura);


        Factura facRecibida = (Factura) getIntent().getExtras().getSerializable("factura");

        Log.d("TAG_", facRecibida.mostrarDetalle());
    }
}