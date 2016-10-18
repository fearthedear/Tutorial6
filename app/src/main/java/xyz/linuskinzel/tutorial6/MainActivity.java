package xyz.linuskinzel.tutorial6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCLick_button1 (View v) {
        Intent sentosaIntent = new Intent(this, MapsActivity.class);
        startActivity(sentosaIntent);
    }

    public void onCLick_button2 (View v) {
        Intent locationIntent = new Intent(this, LocationActivity.class);
        startActivity(locationIntent);
    }
    public void onClick_button3 (View v) {
        Intent locationIntent = new Intent(this, InputActivity.class);
        startActivity(locationIntent);
    }
    public void onClick_button4 (View v) {
        Intent locationIntent = new Intent(this, showPreferences.class);
        startActivity(locationIntent);
    }
}
