package app.example.ruben.porvenir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ruben.porvenir.R;

public class Conocenos extends AppCompatActivity {
    Button mision,vision,valores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conocenos);

        mision=(Button)findViewById(R.id.btn_Mision);
        vision=(Button)findViewById(R.id.btn_Vision);
        valores=(Button)findViewById(R.id.btn_Valores);
        valores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent com=new Intent(Conocenos.this,Valores.class);
                startActivity(com);
            }
        });
        vision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent com=new Intent(Conocenos.this,Vision.class);
                startActivity(com);
            }
        });
        mision.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent com=new Intent(Conocenos.this,Mision.class);
                startActivity(com);
            }
        });
    }
}
