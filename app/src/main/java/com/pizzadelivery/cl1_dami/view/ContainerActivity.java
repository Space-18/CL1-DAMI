package com.pizzadelivery.cl1_dami.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.pizzadelivery.cl1_dami.LoginActivity;
import com.pizzadelivery.cl1_dami.R;
import com.pizzadelivery.cl1_dami.model.Picture;
import com.pizzadelivery.cl1_dami.view.fragments.HomeFragment;
import com.pizzadelivery.cl1_dami.view.fragments.ProfileFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.ArrayList;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setDefaultTab(R.id.pizzaStore);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {

            @Override
            public void onTabSelected(int tabId) {
                switch (tabId) {
                    case R.id.pizzaStore:
                        HomeFragment homeFragment = new HomeFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .commit();
                        break;
                    case R.id.profile:
                        ProfileFragment profileFragment = new ProfileFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, profileFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .commit();
                        break;
                }
            }
        });
    }

    private void updateUiWithUser() {
        String welcome = getString(R.string.exitApp);
        // TODO : initiate successful logged in experience
        Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();
    }

    public void onGoLogin(View view) {
        updateUiWithUser();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}