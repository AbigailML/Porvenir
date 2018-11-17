package app.example.ruben.porvenir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ruben.porvenir.R;

public class Comentarios extends AppCompatActivity {
    ImageView face,comen;
    EditText co;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios);

        co=(EditText)findViewById(R.id.comen);
        face=(ImageView)findViewById(R.id.btnFace);
        comen=(ImageView)findViewById(R.id.iv_enviar);
        comen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarComentario();
                limpiar();
            }
        });
        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cup1=new Intent(Comentarios.this,Busqueda.class);
                startActivity(cup1);
            }
        });


    }
    public  void limpiar(){
        co.setText("");
    }
    public void enviarComentario(){
        Toast.makeText(getApplicationContext(),"Comentario enviado",Toast.LENGTH_LONG).show();
    }
}
