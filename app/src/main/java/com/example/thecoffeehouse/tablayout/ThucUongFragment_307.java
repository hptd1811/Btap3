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

public class ThucUongFragment_307 extends Fragment {

    private GridView gvmon_307;
    private SanPhamAdapter_307 spadt_307;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon_307 = r.findViewById(R.id.gv_mon_307);
        spadt_307 = new SanPhamAdapter_307(ThucUongFragment_307.this.getActivity(), R.layout.item_307);
        gvmon_307.setAdapter(spadt_307);
        registerForContextMenu(gvmon_307);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt_307.add(new DoUong_307(R.drawable.kemdau, "Kem dâu tươi", "15.000"));
        spadt_307.add(new DoUong_307(R.drawable.trasuaday, "Trà sữa dâu tây", "17.000"));
        spadt_307.add(new DoUong_307(R.drawable.tradao , "Trà đào", "20.000"));
        spadt_307.add(new DoUong_307(R.drawable.chanhday, "Nước ép chanh dây", "17.000"));
        spadt_307.add(new DoUong_307(R.drawable.bacxiu1, "Bạc xỉu", "15.000"));
        spadt_307.add(new DoUong_307(R.drawable.caphesua, "Cà phê sữa đá", "17.000"));
        spadt_307.add(new DoUong_307(R.drawable.nuocepcam, "Nước ép cam", "20.000"));
        spadt_307.add(new DoUong_307(R.drawable.cafedenda, "Cà phê đen đá", "15.000"));

    }

    private void addEvents() {
        gvmon_307.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(ThucUongFragment_307.this.getActivity());
                dialog.setContentView(R.layout.dilg_dathang_307);
                dialog.show();
            }
        });
        gvmon_307.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(ThucUongFragment_307.this.getActivity());
                dialog.setContentView(R.layout.dhang_307);
                dialog.show();

                return true;
            }
        });
    }
}