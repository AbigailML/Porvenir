package app.example.ruben.porvenir.BaseDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RUBEN on 26/11/2017.
 */

public class DatosPedido {
    private SQLiteDatabase baseDatos;
    private AsistenteSQL asistenteSQL;
    private String[] listaCampos = {
            asistenteSQL.campo2,
            asistenteSQL.campo3,
            asistenteSQL.campo4,
            asistenteSQL.campo5};
    public DatosPedido(Context contexto){
        asistenteSQL=new AsistenteSQL(contexto);
    }
    public void open() throws SQLException {
        baseDatos=asistenteSQL.getWritableDatabase();
    }
    public void close(){
        asistenteSQL.close();
    }
    public Boolean AgregarPedido(Pedido datos) {
        Boolean resultado = false;
        ContentValues valoresBD = new ContentValues();
        valoresBD.put(asistenteSQL.campo2, datos.getNombre());
        valoresBD.put(asistenteSQL.campo3, datos.getTelefono());
        valoresBD.put(asistenteSQL.campo4, datos.getTipo());
        valoresBD.put(asistenteSQL.campo5, datos.getDescripcion());
        long total = baseDatos.insert(asistenteSQL.tablaPedidos, null, valoresBD);
        if (total > 0)
            resultado = true;
        return resultado;
    }
    public List<Pedido> ObtenerPedidos(){
        List<Pedido> listaDatos=new ArrayList<Pedido>();
        Cursor lector=baseDatos.query(asistenteSQL.getDatabaseName(),listaCampos,null,null,null,null,null);
        lector.moveToFirst();
        while(!lector.isAfterLast()){
            Pedido actual=new Pedido();
            actual.setNombre(lector.getString(1));
            actual.setTelefono(lector.getString(2));
            actual.setTipo(lector.getString(3));
            actual.setDescripcion(lector.getString(4));
            listaDatos.add(actual);
            lector.moveToNext();
        }
        lector.close();
        return  listaDatos;
    }
}
