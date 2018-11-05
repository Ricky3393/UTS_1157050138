package com.ricky.utsmopro;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPertandingaanActivity extends AppCompatActivity {

    int ImageHome, ImageAway;

    ImageView lgohome, lgoaway;
    TextView home, away, des, vs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pertandingaan);

        home = findViewById(R.id.nme_home);
        away = findViewById(R.id.nme_away);
        lgohome = findViewById(R.id.image_home);
        lgoaway = findViewById(R.id.image_away);
        des = findViewById(R.id.deskripsi);

        lgohome.setImageResource(getIntent().getIntExtra("logoTimSatu", 0));
        lgoaway.setImageResource(getIntent().getIntExtra("logoTimDua", 0));

        home.setText(getIntent().getStringExtra("namaTimSatu"));
        away.setText(getIntent().getStringExtra("namaTimDua"));
        des.setText(getIntent().getStringExtra("deskripsi"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menuberita, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_news:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://liga-indonesia.id/"));
                startActivity(browserIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    }
