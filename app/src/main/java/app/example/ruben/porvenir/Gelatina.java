package app.example.ruben.porvenir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ruben.porvenir.R;

public class Gelatina extends AppCompatActivity {

    ImageView gel1,gel2,gel3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gelatina);

        gel1=(ImageView)findViewById(R.id.iv_gel1);
        gel2=(ImageView)findViewById(R.id.iv_gel2);
        gel3=(ImageView)findViewById(R.id.iv_gel3);
        gel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g3=new Intent(Gelatina.this,GelatinaVainilla.class);
                startActivity(g3);
            }
        });
        gel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g2=new Intent(Gelatina.this,GelatinaFrutas.class);
                startActivity(g2);
            }
        });
        gel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g1=new Intent(Gelatina.this,GelatinaDurazno.class);
                startActivity(g1);
            }
        });
    }
}
