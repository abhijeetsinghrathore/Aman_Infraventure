package amaninfra.aman_infraventure;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class lp3 extends AppCompatActivity {
    ViewPager viewPager;
    CustomSwipeAdapter a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lp3);

        viewPager=(ViewPager)findViewById(R.id.view_pager);

        final int[] ir={R.drawable.lp3a,R.drawable.lp3b};

        a=new CustomSwipeAdapter(this,ir);
        viewPager.setAdapter(a);
    }
}
