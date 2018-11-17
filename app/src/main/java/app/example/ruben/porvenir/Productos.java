package app.example.ruben.porvenir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ruben.porvenir.R;

public class Productos extends AppCompatActivity {
    ImageView cup,pas,gel,mou,compra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        compra=(ImageView) findViewById(R.id.iv_compra);

        cup=(ImageView)findViewById(R.id.iv_cupcakes);
        pas=(ImageView)findViewById(R.id.iv_Pastel);
        gel=(ImageView)findViewById(R.id.iv_Gelatinas);
        mou=(ImageView)findViewById(R.id.iv_Mousses);

        compra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent compra=new Intent(Productos.this,Compra.class);
                startActivity(compra);
            }
        });
        mou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mou=new Intent(Productos.this,Mousse.class);
                startActivity(mou);
            }
        });
        pas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pas=new Intent(Productos.this,Pastel.class);
                startActivity(pas);
            }
        });
        gel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gel=new Intent(Productos.this,Gelatina.class);
                startActivity(gel);
            }
        });
        cup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cup=new Intent(Productos.this,Cupcake.class);
                startActivity(cup);
            }
        });
    }
}
