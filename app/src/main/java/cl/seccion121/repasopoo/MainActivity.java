package cl.seccion121.repasopoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cliente cli = new Cliente("1-9", "Barroso 76", 10000);
        Factura facturaUno = new Factura(1,"01/01/2000", cli);

        //Agregar productos a la factura
        Producto prodUno = new Producto(1122, "Lapiz", 1200);
        Producto prodDos = new Producto(2233, "Cuaderno", 1000);
        Producto prodTres = new Producto(3344, "Mouse", 5000);

        facturaUno.agregarProducto(prodUno);
        facturaUno.agregarProducto(prodDos);
        facturaUno.agregarProducto(prodTres);
        for (int x = 0; x <= 1000; ++x){
            facturaUno.agregarProducto(new Producto(x, "Descript " + x, 10000 + x));
        }

        if(facturaUno.eliminarProducto(3344)){
            Toast.makeText(this, "Eliminado", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "No existe en detalle de factura", Toast.LENGTH_SHORT).show();
        }

        Intent i = new Intent(this, MostrarFacturaActivity.class);

        i.putExtra("factura", facturaUno);

        startActivity(i);

    }
}