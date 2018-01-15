package amaninfra.aman_infraventure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by iesha on 29-Oct-17.
 */

public class tab2Livepro extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2_livepro, container, false);

        LinearLayout linearLayoutlp1=(LinearLayout)rootView.findViewById(R.id.linear_layout_lp1);
        linearLayoutlp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lp1();
            }
        });
        ImageView imageLp1 = (ImageView)rootView.findViewById(R.id.image_lp1);
        imageLp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lp1();
            }
        });

        LinearLayout linearLayoutlp2=(LinearLayout)rootView.findViewById(R.id.linear_layout_lp2);
        linearLayoutlp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lp2();
            }
        });
        ImageView imageLp2 = (ImageView)rootView.findViewById(R.id.image_lp2);
        imageLp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                lp2();
            }
        });

        LinearLayout linearLayoutlp3=(LinearLayout)rootView.findViewById(R.id.linear_layout_lp3);
        linearLayoutlp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lp3();
            }
        });
        ImageView imageLp3 = (ImageView)rootView.findViewById(R.id.image_lp3);
        imageLp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lp3();
            }
        });

        LinearLayout linearLayoutlp4=(LinearLayout)rootView.findViewById(R.id.linear_layout_lp4);
        linearLayoutlp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lp4();
            }
        });
        ImageView imageLp4 = (ImageView)rootView.findViewById(R.id.image_lp4);
        imageLp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lp4();
            }
        });

        return rootView;
    }
    public void lp1() {
        Intent i = new Intent(getActivity(), lp1.class);
        startActivity(i);
    }
    public void lp2() {
        Intent i = new Intent(getActivity(), lp2.class);
        startActivity(i);
    }
    public void lp3() {
        Intent i = new Intent(getActivity(), lp3.class);
        startActivity(i);
    }
    public void lp4() {
        Intent i = new Intent(getActivity(), lp4.class);
        startActivity(i);
    }
}
