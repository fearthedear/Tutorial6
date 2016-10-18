package xyz.linuskinzel.tutorial6;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class showPreferences extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_preferences);

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String n = String.valueOf(pref.getInt("N", 0));
        String sgdusd = String.valueOf(pref.getFloat("SGD_2_USD", 0));
        String sgdhkd = String.valueOf(pref.getFloat("SGD_2_HKD", 0));
        String weather = pref.getString("weather_today", "no shared preference stored");

        Toast.makeText(this, "N = " + n + "\nSGD_2_USD = "+ sgdusd + "\nSGD_2_HKD = " + sgdhkd + "\nWeather = "+weather, Toast.LENGTH_LONG).show();
    }
}
