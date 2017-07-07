package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class CurrentSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);

        ImageButton buttonPrevious = (ImageButton) findViewById(R.id.songPrevious);
        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Play previous song", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonPlay = (ImageButton) findViewById(R.id.songPlay);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Play/pause song", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton buttonNext = (ImageButton) findViewById(R.id.songNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Play next song", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_current_song, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_nav_library:
                Intent intentLibrary = new Intent(CurrentSongActivity.this, LibraryActivity.class);
                startActivity(intentLibrary);
                return true;
            case R.id.action_nav_payment:
                Intent intentPayment = new Intent(CurrentSongActivity.this, PaymentActivity.class);
                startActivity(intentPayment);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
