package fr.wcs.quetejavaui;


import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.CompoundButtonCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.LayoutDirection;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        //change welcome TextView layaout properties
        welcomeTVLayout.setMargins(0,10,0,10);
        // Apply the layout parameters to welcome TextView widget
        welcomeTV.setLayoutParams(welcomeTVLayout);
        //change welcome TextView properties
        welcomeTV.setBackgroundColor(Color.parseColor("#ff4081"));
        welcomeTV.setTextColor(Color.parseColor("#6e1b37"));
        welcomeTV.setTextSize(20);
        welcomeTV.setPadding(10 ,5,10,5);
        welcomeTV.setText(R.string.welcome_text);
        // add welcome TextView to mainLayaout
        layout.addView(welcomeTV);


        // Create wantBeWilderCB CheckBox programmatically.
        CheckBox wantBeWilderCB = new CheckBox(context);
        // Create wantBeWilderCB CheckBox Layout
        LinearLayout.LayoutParams wantBeWilderCBLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        // Apply the layout parameters to wantBeWilderCB CheckBox widget
        wantBeWilderCB.setLayoutParams(welcomeTVLayout);
        //change wantBeWilderCB CheckBox properties
        wantBeWilderCB.setGravity(Gravity.CENTER_HORIZONTAL);
        wantBeWilderCB.setText(R.string.want_to_be_wilder_text);
        //needed for my phone
        wantBeWilderCB.setTextColor(Color.parseColor("#000000"));
        // add wantBeWilderCB CheckBox to mainLayaout
        layout.addView(wantBeWilderCB);

        //create  textsEditsButtonLL linearLayout
        LinearLayout textsEditsButtonLL = new LinearLayout(context);
        // Create textsEditsButtonLL linearLayout LinearLayout parameters
        LinearLayout.LayoutParams textsEditsButtonLLP = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        // Apply the layout parameters to textsEditsButtonLL linearLayout
       textsEditsButtonLL.setLayoutParams(textsEditsButtonLLP);
       textsEditsButtonLL.setOrientation(LinearLayout.HORIZONTAL);
       textsEditsButtonLL.setWeightSum(2);
       textsEditsButtonLL.setBackgroundColor(Color.parseColor("#374081"));
        // add textsEditsButtonLL linearLayout to mainLayaout
        layout.addView(textsEditsButtonLL);

        // Create firstnameET EditText programmatically.
        EditText firstnameET = new EditText(context);
        // Create firstnameET EditText Layout
        LinearLayout.LayoutParams firstnameETLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        // Apply the layout parameters to firstnameET EditText widget
        firstnameET.setLayoutParams(welcomeTVLayout);
        //change firstnameET EditText properties
        firstnameET.setEms(10);
        firstnameET.setGravity(1);
        firstnameET.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        firstnameET.setHint(R.string.firstname_text);
        //needed for my phone
        firstnameET.setHintTextColor(Color.GRAY);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            firstnameET.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);
        }
        // add firstnameET EditText to mainLayaout
        layout.addView(firstnameET);


/*
        <LinearLayout textsEditsButtonLL linearLayout




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
