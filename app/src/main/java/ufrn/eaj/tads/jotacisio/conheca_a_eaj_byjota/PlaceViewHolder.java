package ufrn.eaj.tads.jotacisio.conheca_a_eaj_byjota;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceViewHolder extends RecyclerView.ViewHolder{

    final TextView tvLocal;
    final TextView tvDepart;
    final ImageView Image;

    public PlaceViewHolder(View v) {
        super(v);
        tvLocal = v.findViewById(R.id.local);
        tvDepart = v.findViewById(R.id.departamento);
        Image = v.findViewById(R.id.img);
    }
}
