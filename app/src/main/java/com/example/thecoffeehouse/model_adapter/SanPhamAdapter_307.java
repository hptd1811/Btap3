package com.example.thecoffeehouse.model_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.thecoffeehouse.R;

public class SanPhamAdapter_307 extends ArrayAdapter<DoUong_307> {
    Activity context_307;
    int resource_307;

    public SanPhamAdapter_307(@NonNull Activity context_307, int resource_307) {
        super(context_307, resource_307);
        this.context_307 = context_307;
        this.resource_307 = resource_307;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context_307.getLayoutInflater();
        View customView = inflater.inflate(this.resource_307, null);
        ImageView imghinh = customView.findViewById(R.id.imghinh_307);
        TextView txtten = customView.findViewById(R.id.txtten_307);
        TextView txtgia = customView.findViewById(R.id.txtgia_307);

        DoUong_307 sp = getItem(position);
        imghinh.setImageResource(sp.getHinh());
        txtten.setText(sp.getTen());
        txtgia.setText(sp.getGia() + "đ");

        return customView;


    }
}