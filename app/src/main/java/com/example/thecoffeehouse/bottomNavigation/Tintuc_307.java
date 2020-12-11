package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.Information_307;
import com.example.thecoffeehouse.Notify_307;
import com.example.thecoffeehouse.R;

public class Tintuc_307 extends Fragment implements View.OnClickListener {

    ImageView img1_307, img2_307;
    RelativeLayout rl1_307, rl2_307, rl3_307;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_navigation_tintuc_307, container, false);


        img1_307 = root.findViewById(R.id.imageNotify_307);
        img1_307.setOnClickListener(this);
        img2_307 = root.findViewById(R.id.imageAdd_307);
        img2_307.setOnClickListener(this);


        rl1_307 = root.findViewById(R.id.relativeTichdiem_307);
        rl2_307 = root.findViewById(R.id.relativeDathang_307);
        rl3_307 = root.findViewById(R.id.relativeCoupon);
        rl1_307.setOnClickListener(this);
        rl2_307.setOnClickListener(this);
        rl3_307.setOnClickListener(this);


        return root;
    }

//    public void open() {
//        Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
//        startActivity(dsp);
//    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageNotify_307) {
            Intent dsp = new Intent(Tintuc_307.this.getActivity(), Notify_307.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageAdd_307) {
            Intent dsp = new Intent(Tintuc_307.this.getActivity(), Information_307.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.relativeTichdiem_307) {
            Toast.makeText(this.getActivity(), "Tích điểm", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeDathang_307) {
            Toast.makeText(this.getActivity(), "Đặt hàng ", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeCoupon) {
            Toast.makeText(this.getActivity(), "Coupon", Toast.LENGTH_SHORT).show();
        }
    }


}