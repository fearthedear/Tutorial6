package xyz.linuskinzel.tutorial6;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;

public class InputActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }

    public void onClick_submit(View v) {
        //getting the values entered by user
        EditText N = (EditText)findViewById(R.id.n);
        int n      =  Integer.parseInt(N.getText().toString());
        EditText SGDUSD = (EditText)findViewById(R.id.sgdusd);
        float sgdusd = Float.valueOf(SGDUSD.getText().toString());
        EditText SGDHKD = (EditText)findViewById(R.id.sgdhkd);
        float sgdhdk = Float.valueOf(SGDHKD.getText().toString());
        EditText weather = (EditText)findViewById(R.id.weather);
        String weatherString = weather.getText().toString();

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("N", n);
        editor.putFloat("SGD_2_USD", sgdusd);
        editor.putFloat("SGD_2_HKD", sgdhdk);
        editor.putString("weather_today", weatherString);
        editor.apply();
    }
}
