package ufrn.eaj.tads.jotacisio.conheca_a_eaj_byjota;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMap extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b) {
        View v = inflater.inflate(R.layout.fragment_map, container, false);
        return v;
    }
}
