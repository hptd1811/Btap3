package com.example.thecoffeehouse.tablayout;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong_307;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter_307;

public class DoAnFragment extends Fragment {

    private GridView gvmon_307;
    private SanPhamAdapter_307 spadt_307;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_do_an_307, container, false);

        gvmon_307 = r.findViewById(R.id.gv_mon_307);
        spadt_307 = new SanPhamAdapter_307(DoAnFragment.this.getActivity(), R.layout.item_307);
        gvmon_307.setAdapter(spadt_307);
        registerForContextMenu(gvmon_307);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt_307.add(new DoUong_307(R.drawable.maccasocola, "Socola", "45.000"));
        spadt_307.add(new DoUong_307(R.drawable.mitsay, "Mít sấy", "20.000"));
        spadt_307.add(new DoUong_307(R.drawable.bonglantrungmuoi, "Bông lan trứng muối", "29.000"));
    }
    private void addEvents() {
        gvmon_307.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.dilg_dathang_307);
                dialog.show();
            }
        });
        gvmon_307.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.dhang_307);
                dialog.show();

                return true;
            }
        });
    }
}