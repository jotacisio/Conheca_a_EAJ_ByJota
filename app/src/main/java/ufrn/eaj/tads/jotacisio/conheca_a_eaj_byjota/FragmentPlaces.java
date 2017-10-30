package ufrn.eaj.tads.jotacisio.conheca_a_eaj_byjota;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class FragmentPlaces extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        final RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        rv.setHasFixedSize(true);
        final List<Places> listPlaces = Places.getPlaces();
        PlacesAdapter adapter = new PlacesAdapter(listPlaces,getContext());
        rv.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        rv.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), rv, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        MainActivity.tabLayout.getTabAt(1).select();

                        Places placechosen = listPlaces.get(position);
                        FragmentInfo.tv_info.setText(placechosen.getName());
                        FragmentInfo.tv_depart.setText(placechosen.getDepartament());
                        FragmentInfo.tv_email.setText(placechosen.getEmail());
                        FragmentInfo.tv_resp.setText(placechosen.getResp());
                        FragmentInfo.tv_tel.setText(placechosen.getTel());
                        FragmentInfo.tv_desc.setText(placechosen.getInformations());
                        FragmentInfo.image.setImageResource(placechosen.getImage());
                    }
                })
        );
        return rootView;
    }
}
