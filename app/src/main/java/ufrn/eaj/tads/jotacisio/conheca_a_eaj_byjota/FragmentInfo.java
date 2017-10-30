package ufrn.eaj.tads.jotacisio.conheca_a_eaj_byjota;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentInfo extends Fragment {
    public static TextView tv_info;
    public static ImageView image;
    public static TextView tv_depart;
    public static TextView tv_resp;
    public static TextView tv_email;
    public static TextView tv_tel;
    public static TextView tv_desc;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b){
        View v = inflater.inflate(R.layout.fragment_info, container, false);
        tv_info = (TextView) v.findViewById(R.id.tv_info);
        image = (ImageView) v.findViewById(R.id.imageView);
        tv_depart = (TextView) v.findViewById(R.id.tv_depart);
        tv_resp = (TextView) v.findViewById(R.id.tv_responsavel);
        tv_email = (TextView) v.findViewById(R.id.tv_email);
        tv_tel = (TextView) v.findViewById(R.id.tv_telefone);
        tv_desc = (TextView) v.findViewById(R.id.tv_descricao);
        return v;
    }
}
