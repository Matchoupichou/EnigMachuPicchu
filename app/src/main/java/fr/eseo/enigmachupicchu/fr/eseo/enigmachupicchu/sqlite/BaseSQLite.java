package fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

public class BaseSQLite extends SQLiteOpenHelper {
    private static final String TABLE_ENIGMES = "table_enigmes";
    private static final String COL_ID = "ID";
    private static final String COL_TITRE = "Titre";
    private static final String COL_ENONCE = "Enonce";
    private static final String COL_SOLUTION = "Solution";
    private static final String COL_DIFFICULTE = "Difficulte";
    private static final String COL_RESOLUE = "Resolue";

    private static final String CREATE_BDD = "CREATE TABLE " + TABLE_ENIGMES + " ("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_TITRE + " TEXT NOT NULL, "
            + COL_ENONCE + " TEXT NOT NULL, "
            + COL_SOLUTION + " TEXT NOT NULL, "
            + COL_DIFFICULTE + " INTEGER NOT NULL, "
            + COL_RESOLUE + " INTEGER NOT NULL);";

    public BaseSQLite(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //on créé la table à partir de la requête écrite dans la variable CREATE_BDD
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //On peut fait ce qu'on veut ici moi j'ai décidé de supprimer la table et de la recréer
        //comme ça lorsque je change la version les id repartent de 0
        db.execSQL("DROP TABLE " + TABLE_ENIGMES + ";");
        onCreate(db);
    }
}