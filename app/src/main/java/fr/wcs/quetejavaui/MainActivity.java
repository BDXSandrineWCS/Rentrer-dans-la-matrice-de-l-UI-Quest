package fr.wcs.quetejavaui;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context=getApplicationContext();
        LinearLayout layout = (LinearLayout) findViewById(R.id.mainLinearLayout);

        // Create welcome TextView programmatically.
        TextView welcomeTV = new TextView(context);
        // Create welcome TextView Layout
        LinearLayout.LayoutParams welcomeTVLayout = new LinearLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        //change welcome TextView layaout properties
        welcomeTVLayout.setMargins(0,10,0,10);
        // Apply the layout parameters to TextView widget
        welcomeTV.setLayoutParams(welcomeTVLayout);
        //change welcome TextView properties
        welcomeTV.setBackgroundColor(Color.parseColor("#ff4081"));
        welcomeTV.setTextColor(Color.parseColor("#6e1b37"));
        welcomeTV.setTextSize(20);
        welcomeTV.setPadding(10 ,5,10,5);
        welcomeTV.setText(R.string.welcome_text);

        layout.addView(welcomeTV);


/*

desiredSp = getResources().getDimension(R.dimen.desired_sp);
density = getResources().getDisplayMetrics().density;
textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, desiredSp / density);


        <CheckBox
            android:id="@+id/checkbox"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:text="Yes, I want to be a Wilder" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:weightSum="2" >

            <EditText
                android:id="@+id/firstname"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:layout_weight="1"
                android:inputType="textPersonName"
                android:hint="Firstname" />

            <Space
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1"/>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:weightSum="2" >

            <EditText
                android:id="@+id/lastname"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:ems="10"
                android:layout_weight="1"
                android:inputType="textPersonName"
                android:hint="Lastname" />

            <Space
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1"/>
        </LinearLayout>

        <Button
            android:id="@+id/validate"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="ACCEPT" />
    </LinearLayout>
*/

    }
}