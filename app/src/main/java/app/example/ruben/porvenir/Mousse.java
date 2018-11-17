package app.example.ruben.porvenir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ruben.porvenir.R;

public class Mousse extends AppCompatActivity {

    ImageView mo1,mo2,mo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mousse);

        mo1=(ImageView)findViewById(R.id.iv_mo1);
        mo2=(ImageView)findViewById(R.id.iv_mo2);
        mo3=(ImageView)findViewById(R.id.iv_mo3);
        mo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m3=new Intent(Mousse.this,MounsZarzamora.class);
                startActivity(m3);
            }
        });
        mo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m2=new Intent(Mousse.this,MounsMango.class);
                startActivity(m2);
            }
        });
        mo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m1=new Intent(Mousse.this,MounsChoco.class);
                startActivity(m1);
            }
        });

    }
}
