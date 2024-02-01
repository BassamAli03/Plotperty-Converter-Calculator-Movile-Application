package com.plotpterty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.plotpterty.databinding.ActivityAboutusBinding;

public class AboutusActivity extends DrawerbaseActivity {

    ImageView email;
    TextView email1;
    ImageView rating;
    TextView rating1;
    ImageView website;
    TextView website1;
    ImageView whatsapp;
    TextView whatsapp1;


    ActivityAboutusBinding activityAboutusBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        activityAboutusBinding = ActivityAboutusBinding.inflate(getLayoutInflater());
        setContentView(activityAboutusBinding.getRoot());
        allocateActivityTitle("About Us");

        email= findViewById(R.id.mail);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            sendmail();
            }
        });

        email1 = findViewById(R.id.mail1);
        email1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendmail();
            }
        });
        rating = findViewById(R.id.rate);
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://play.google.com/store/apps/details?id=com.plotpterty");
            }
        });
        rating1 = findViewById(R.id.rate1);
        rating1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://play.google.com/store/apps/details?id=com.plotpterty");
            }
        });
        website = findViewById(R.id.visit);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.plotperty.com");
            }
        });

        website1 = findViewById(R.id.visit1);
        website1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.plotperty.com");
            }
        });
        whatsapp = findViewById(R.id.contact);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://wa.me/923355088550");
            }
        });
        whatsapp1= findViewById(R.id.contact1);
        whatsapp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://wa.me/923355088550");
            }
        });
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
    private void sendmail(){
        String reclist = "p.plotperty@gmail.com";
        String[] recipent=reclist.split(",");

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipent);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose Mail"));
    }
}