package fr.wcs.quetejavaui;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context=getApplicationContext();
        LinearLayout layout = (LinearLayout) findViewById(R.id.mainLinearLayout);

        // Create a TextView programmatically.
        TextView welcomeTV = new TextView(context);
        welcomeTV.setText(R.string.want_to_be_wilder_text);
        welcomeTV.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        layout.addView(welcomeTV);


    }
}
