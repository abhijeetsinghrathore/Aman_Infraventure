package amaninfra.aman_infraventure;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by iesha on 30-Oct-17.
 */

public class CustomSwipeAdapter extends PagerAdapter {

    private int[] image_resouces;
    private Context c;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx, int[] ir) {
        this.c = ctx;
        this.image_resouces = ir;
    }

    @Override
    public int getCount() {
        return image_resouces.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.swipe_layout, container, false);
        ImageView v_image = (ImageView) v.findViewById(R.id.image_view);
        v_image.setImageResource(image_resouces[position]);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}