package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.thecoffeehouse.bottomNavigation.Cuahang_307;
import com.example.thecoffeehouse.bottomNavigation.Dathang_307;
import com.example.thecoffeehouse.bottomNavigation.Taikhoan_307;
import com.example.thecoffeehouse.bottomNavigation.Tintuc_307;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity_307 extends AppCompatActivity {

    private ActionBar toolbar_307;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_307);

        toolbar_307 = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // load the store fragment by default
        loadFragment(new Tintuc_307());
    }

     private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.tintuc_307:
                    fragment = new Tintuc_307();
                    loadFragment(fragment);
                    return true;
                case R.id.dathang_307:
                    fragment = new Dathang_307();
                    loadFragment(fragment);
                    return true;
                case R.id.cuahang_307:
                    fragment = new Cuahang_307();
                    loadFragment(fragment);
                    return true;
                case R.id.taikhoan_307:
                    fragment = new Taikhoan_307();
                    loadFragment(fragment);
                    return true;
            }

            return false;
        }
    };
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.frame_container_307, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
