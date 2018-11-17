package app.example.ruben.porvenir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ruben.porvenir.R;

public class Cupcake extends AppCompatActivity {

    ImageView cup1,cup2,cup3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupcake);
        cup1=(ImageView)findViewById(R.id.iv_Cup1);
        cup2=(ImageView)findViewById(R.id.iv_Cup2);
        cup3=(ImageView)findViewById(R.id.iv_Cup3);
        cup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cup3=new Intent(Cupcake.this,CupcakeFrutas.class);
                startActivity(cup3);
            }
        });
        cup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cup2=new Intent(Cupcake.this,CupcakeVainilla.class);
                startActivity(cup2);
            }
        });
        cup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cup1=new Intent(Cupcake.this,CupcakeChocolate.class);
                startActivity(cup1);
            }
        });
    }
}
