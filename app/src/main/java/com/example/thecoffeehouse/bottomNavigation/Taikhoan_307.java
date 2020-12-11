package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.thecoffeehouse.Information_307;
import com.example.thecoffeehouse.Login.SignIn_Activity_307;
import com.example.thecoffeehouse.R;


public class Taikhoan_307 extends Fragment implements View.OnClickListener {

    ImageView img_307;
    Button bt1_307, bt2_307;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_navigation_taikhoan_307, container, false);

        img_307 = r.findViewById(R.id.imageView_307);
        img_307.setOnClickListener(this);

        bt1_307 = r.findViewById(R.id.button2_307);
        bt1_307.setOnClickListener(this);

        bt2_307 = r.findViewById(R.id.button_DangXuat_307);
        bt2_307.setOnClickListener(this);
        return r;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView_307) {
            Intent dsp = new Intent(Taikhoan_307.this.getActivity(), Information_307.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button2_307) {
            Intent dsp = new Intent(Taikhoan_307.this.getActivity(), Information_307.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button_DangXuat_307) {
            Intent dsp = new Intent(Taikhoan_307.this.getActivity(), SignIn_Activity_307.class);
            startActivity(dsp);
        }
    }
}