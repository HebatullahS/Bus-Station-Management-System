/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation;

import java.awt.Cursor;
import java.util.ArrayList;
import static javafx.scene.Cursor.cursor;

/**
 *
 * @author Omar
 */
public class System {
    ArrayList<Viechle> myListViechles = new ArrayList<>();
    Cursor cursor = sqlDB.query(aTable, aColumn, null, null, null, null, null);
    if (cursor.moveToFirst())
    {
        do
        {
            myListViechles.add(cursor.getString(0));
        }
        while (cursor.moveToNext());
    }
    if (cursor != null && !cursor.isClosed()) 
    {
        cursor.close();
    }

    return myListViechles;

    
    
}
