package amaninfra.aman_infraventure;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class lp2 extends AppCompatActivity {
    ViewPager viewPager;
    CustomSwipeAdapter a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lp2);

        viewPager=(ViewPager)findViewById(R.id.view_pager);

        final int[] ir={R.drawable.lp2a,R.drawable.lp2b,R.drawable.lp2c,R.drawable.lp2d,R.drawable.lp2e};

        a=new CustomSwipeAdapter(this,ir);
        viewPager.setAdapter(a);
    }
}
