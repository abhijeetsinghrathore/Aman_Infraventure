package amaninfra.aman_infraventure;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class lp4 extends AppCompatActivity {
    ViewPager viewPager;
    CustomSwipeAdapter a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lp4);

        viewPager=(ViewPager)findViewById(R.id.view_pager);

        final int[] ir={R.drawable.lp4a,R.drawable.lp4b,R.drawable.lp4c};

        a=new CustomSwipeAdapter(this,ir);
        viewPager.setAdapter(a);
    }
}
