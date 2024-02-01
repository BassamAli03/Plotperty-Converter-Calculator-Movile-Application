package com.plotpterty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.navigation.NavigationView;

public class DrawerbaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    private InterstitialAd mInterstitialAd;

    @Override
    public void setContentView(View view) {
        drawerLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_drawerbase,null);
        FrameLayout container = drawerLayout.findViewById(R.id.activitycontainter);
        container.addView(view);
        super.setContentView(drawerLayout);

        Toolbar toolbar = drawerLayout.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = drawerLayout.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.opendrawer,R.string.closedrawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        loadint();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        drawerLayout.closeDrawer(GravityCompat.START);

        switch (item.getItemId()){
            case R.id.converter:
                startActivity(new Intent(this,ConverterActivity.class));
                overridePendingTransition(0,0);
                break;

            case R.id.calculator:
                if (mInterstitialAd != null ) {
                    mInterstitialAd.show(DrawerbaseActivity.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {

                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            startActivity(new Intent(DrawerbaseActivity.this,CalculatorActivity.class));
                            overridePendingTransition(0,0);
                            loadint();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {

                            mInterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {

                        }

                        @Override
                        public void onAdShowedFullScreenContent() {

                        }
                    });
                } else {
                    startActivity(new Intent(this,CalculatorActivity.class));
                    overridePendingTransition(0,0);
                }
                break;

            case R.id.internship:

                gotourl("https://plotperty.com/internship");

                break;

            case R.id.aboutus:
                startActivity(new Intent(this,AboutusActivity.class));
                overridePendingTransition(0,0);
                break;

            case R.id.share:
                Intent shareintent1 = new Intent();
                shareintent1.setAction(Intent.ACTION_SEND);
                shareintent1.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.plotpterty");
                shareintent1.setType("text/plain");
                startActivity(Intent.createChooser(shareintent1,"Share Via"));
                break;


        }

        return false;
    }

    public void loadint(){
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {}
        });
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-3732416706239165/2632845348", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;
                    }
                });
    }

    protected void allocateActivityTitle(String titleString){
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle(titleString);
        }
    }
    public void gotourl(String s){
        try{
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"No Website Linked",Toast.LENGTH_SHORT).show();
        }
    }
}