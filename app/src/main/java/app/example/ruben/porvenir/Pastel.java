package app.example.ruben.porvenir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ruben.porvenir.R;

public class Pastel extends AppCompatActivity {
    ImageView pa1,pa2,pa3,pa4,pa5,pa6,pa7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastel);

        pa1=(ImageView)findViewById(R.id.iv_pas1);
        pa2=(ImageView)findViewById(R.id.iv_pas2);
        pa3=(ImageView)findViewById(R.id.iv_pas3);
        pa4=(ImageView)findViewById(R.id.iv_pas4);
        pa5=(ImageView)findViewById(R.id.iv_pas5);
        pa6=(ImageView)findViewById(R.id.iv_pas6);
        pa7=(ImageView)findViewById(R.id.iv_pas7);

        pa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pa1=new Intent(Pastel.this,PastelKiwi.class);
                startActivity(pa1);
            }
        });
        pa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pa2=new Intent(Pastel.this,PastelOlaf.class);
                startActivity(pa2);
            }
        });
        pa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pa3=new Intent(Pastel.this,PastelGraduacion.class);
                startActivity(pa3);
            }
        });
        pa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pa4=new Intent(Pastel.this,PastelMinions.class);
                startActivity(pa4);
            }
        });
        pa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pa5=new Intent(Pastel.this,PastelFrozen.class);
                startActivity(pa5);
            }
        });
        pa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pa6=new Intent(Pastel.this,PastelSpaider.class);
                startActivity(pa6);
            }
        });
    }
}
