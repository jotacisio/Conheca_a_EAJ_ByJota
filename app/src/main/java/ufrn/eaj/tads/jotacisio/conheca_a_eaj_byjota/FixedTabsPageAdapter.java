package ufrn.eaj.tads.jotacisio.conheca_a_eaj_byjota;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FixedTabsPageAdapter extends FragmentPagerAdapter {

    public FixedTabsPageAdapter(FragmentManager fm) { super(fm); }

    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentPlaces();
            case 1:
                return new FragmentInfo();
            case 2:
                return new FragmentMap();
            default:
                return null;
        }
    }

    public int getCount() { return 3; }
}
