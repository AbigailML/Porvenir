package app.example.ruben.porvenir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.ruben.porvenir.R;

import app.example.ruben.porvenir.BaseDatos.DatosPedido;
import app.example.ruben.porvenir.BaseDatos.Pedido;

import org.json.JSONObject;

public class Compra extends AppCompatActivity{
    private Pedido pedido;
    //Declarar variables
    private ImageView enviar;
    private EditText nombre,telefono,descripcion,id;
    private Spinner tipo;
    JsonObjectRequest recibe;
    RequestQueue envia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);
        enviar = (ImageView) findViewById(R.id.iv_realizarPedido);
        nombre = (EditText) findViewById(R.id.Nombre);
        telefono = (EditText) findViewById(R.id.Telefono);
        tipo = (Spinner) findViewById(R.id.spProductos);
        descripcion = (EditText) findViewById(R.id.Descripcion);
        id=(EditText)findViewById(R.id.et_id);
        String[] opciones = {"Cupcake", "Pastel", "Gelatinas", "Mouns"};
        tipo.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones));
       // btnConsul = (ImageView) findViewById(R.id.btnConsulta);
        envia = Volley.newRequestQueue(getApplicationContext());

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarDatos();
                limpiar();

            }
        });

//        btnConsul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "http://192.168.43.14:8000/consultaPorvenir.php?telefono=" + telefono.getText().toString();
//                consulta(url);
//            }
//            public void consulta(String url){
//
//                recibe=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        Toast.makeText(getApplicationContext(),"Listo",Toast.LENGTH_LONG).show();
//                        try {
//                            nombre.setText(response.getString("nombre"));
//                            telefono.setText(response.getString("telefono"));
//                            //tipo.setT
//                            descripcion.setText(response.getString("descripcion"));
//                        } catch (Exception e) {
//                            Toast.makeText(Compra.this, "Error en la conexion", Toast.LENGTH_LONG);
//                        }
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(getApplicationContext(),"ah ocurrido un error"+error.getMessage(),Toast.LENGTH_LONG).show();
//                    }
//                });
//        envia.add(recibe);
//            }
// });
    }


    public void guardarDatos(){
        pedido=new Pedido();
        //llenado de la instancia con la informacion
        pedido.setId(id.getText().toString());
        pedido.setNombre(nombre.getText().toString());
        pedido.setTelefono(telefono.getText().toString());
        pedido.setTipo(tipo.getSelectedItem().toString());
        pedido.setDescripcion(descripcion.getText().toString());

        DatosPedido accesoDatos=new DatosPedido(this);
        accesoDatos.open();
        final Boolean resultado=accesoDatos.AgregarPedido(pedido);
        accesoDatos.close();
//Mensaje
        if (resultado)
        {
            Toast.makeText(getApplicationContext(),"Pedido enviado",Toast.LENGTH_LONG).show();
            String url="http://192.168.43.14:8000/guardarPedido.php?nombre="+pedido.getNombre()+"&telefono="+pedido.getTelefono()+"&producto="+ pedido.getTipo()+"&descripcion="+pedido.getDescripcion()+"&id="+pedido.getId();
            Toast.makeText(getApplicationContext(),pedido.getNombre()+pedido.getTelefono()+pedido.getTipo()+pedido.getDescripcion()+pedido.getId(),Toast.LENGTH_LONG).show();
            recibe=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    Toast.makeText(getApplicationContext(),"Listo",Toast.LENGTH_LONG).show();
                    try {
                        Toast.makeText(Compra.this, response.optString("resultado"), Toast.LENGTH_LONG);
                    } catch (Exception e) {
                        Toast.makeText(Compra.this, "Error en la conexion", Toast.LENGTH_LONG);
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(),"ah ocurrido un error"+error.getMessage(),Toast.LENGTH_LONG).show();
                }
            });
            envia.add(recibe);

        }
        else {
            Toast.makeText(getApplicationContext(),"Datos no almacenados",Toast.LENGTH_LONG).show();
        }

    }
    private  void limpiar(){
        id.setText("");
        nombre.setText("");
        telefono.setText("");
        descripcion.setText("");
    }


}
