package com.aoji.ihero.Activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aoji.ihero.Fragments.DetailFragment;
import com.aoji.ihero.Fragments.MainFragment;
import com.aoji.ihero.Fragments.PickPowerFragment;
import com.aoji.ihero.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentIteractionListener,
        PickPowerFragment.PickPowerInteractionListener, DetailFragment.DetailInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if (fragment == null){
            fragment = new MainFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container, fragment);
            transaction.commit();
        }
    }

    public void loadPickPowerScreen(){

        PickPowerFragment pickPowerFragment = new PickPowerFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, pickPowerFragment)
                .addToBackStack(null).commit();
    }

    public void loadDeatilScreen(){
        DetailFragment detailFragment = new DetailFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, detailFragment)
                .addToBackStack(null).commit();
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickPowerFragmenttInteraction(Uri uri) {

    }

    @Override
    public void onDetailFragmentInteraction(Uri uri) {

    }
}
