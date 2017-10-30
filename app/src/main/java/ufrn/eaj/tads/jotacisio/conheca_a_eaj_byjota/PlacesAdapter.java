package ufrn.eaj.tads.jotacisio.conheca_a_eaj_byjota;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class PlacesAdapter extends RecyclerView.Adapter {
    Context context;
    List<Places> PlacesList;

    public PlacesAdapter(List<Places> l, Context c){
        this.context = c;
        this.PlacesList = l;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_places, parent, false);
        PlaceViewHolder holder = new PlaceViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PlaceViewHolder placeholder = (PlaceViewHolder) holder;
        Places placechosen = PlacesList.get(position);
        placeholder.tvLocal.setText(placechosen.getName());
        placeholder.tvDepart.setText(placechosen.getDepartament());
        placeholder.Image.setImageResource(R.drawable.eaj);
    }

    @Override
    public int getItemCount() {
        return PlacesList == null ? 0 : PlacesList.size();
    }
}
