package app.example.ruben.porvenir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ruben.porvenir.R;

public class Menu extends AppCompatActivity {
    ImageView producto,zarza,ubicacion,comentarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        producto=(ImageView) findViewById((R.id.iv_producto));
        zarza=(ImageView) findViewById(R.id.iv_conocenos);
        ubicacion=(ImageView) findViewById(R.id.iv_ubicacion);
        comentarios=(ImageView) findViewById(R.id.iv_comentarios);

        comentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent com=new Intent(Menu.this,Comentarios.class);
                startActivity(com);
            }
        });

        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ubi=new Intent(Menu.this,Ubicacion.class);
                startActivity(ubi);
            }
        });
        zarza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zar=new Intent(Menu.this,Conocenos.class);
                startActivity(zar);
            }
        });
        producto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prod=new Intent(Menu.this,Productos.class);
                startActivity(prod);
            }
        });
    }
}
