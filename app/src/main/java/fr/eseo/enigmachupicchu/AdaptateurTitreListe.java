package fr.eseo.enigmachupicchu;
        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;

        import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.Enigme;
/**
 * Created by Asus on 04/02/2015.
 */
public class AdaptateurTitreListe extends ArrayAdapter<Enigme> {
    public AdaptateurTitreListe(Context context,  ArrayList<Enigme> enigmes) {
        super(context, R.layout.row_layout,enigmes);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        Enigme a=this.getItem(position);
        textView.setText(a.getTitre());

        if(a.getResolue() != 0 ) {
            imageView.setImageResource(R.drawable.ic_check);
        }
        return rowView;
    }
}
