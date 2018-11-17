package app.example.ruben.porvenir.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RUBEN on 26/11/2017.
 */

public class AsistenteSQL  extends SQLiteOpenHelper {
    // se crea la base de datos, la tablas y se hace referencia a los datos de la misma datos
    public static final String baseDatos="BDPedido";
    public static final String tablaPedidos="Pedidos";
    public static final  int verBD=1;

    public static final String campo1="id_pedido";
    public static final String campo2="Nombre";
    public static final String campo3="Telefono";
    public static final String campo4="Tipo";
    public static final String campo5="Descripcion";


    public static final String creaTablaPed=
            "create table "+ tablaPedidos+"("+
                    campo1 +" integer primary key autoincrement,"+
                    campo2 +" text,"+ campo3 +" text,"+
                    campo4 +" text,"+ campo5 +" text)";
    public AsistenteSQL(Context contexto)
    {
        super(contexto,baseDatos,null,verBD);
    }
    @Override
    public void onCreate(SQLiteDatabase baseDatos) {
        baseDatos.execSQL(creaTablaPed);

    }

    @Override
    public void onUpgrade(SQLiteDatabase baseDatos, int verAnt, int verNva) {
        baseDatos.execSQL("Drop table if exists "+ tablaPedidos);
        baseDatos.execSQL(creaTablaPed);
    }
}
