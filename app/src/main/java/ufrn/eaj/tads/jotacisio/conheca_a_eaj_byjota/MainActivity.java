package ufrn.eaj.tads.jotacisio.conheca_a_eaj_byjota;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tab Layout
        ViewPager vp = (ViewPager) findViewById(R.id.pager);
        PagerAdapter pa = new FixedTabsPageAdapter(getSupportFragmentManager());
        vp.setAdapter(pa);
        tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(vp);

        tabLayout.getTabAt(0).setText("LOCAIS");
        tabLayout.getTabAt(1).setText("INFORMAÇÕES");
        tabLayout.getTabAt(2).setText("MAPA");
        //Finish Tab Layout
    }
}
