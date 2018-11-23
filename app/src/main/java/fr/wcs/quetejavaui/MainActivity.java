package fr.wcs.quetejavaui;


import android.content.Context;

import android.graphics.Color;


import android.preference.CheckBoxPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.InputType;

import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.Gravity;

import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import android.widget.Space;
import android.widget.TextView;

import java.awt.font.TextAttribute;


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
        //style needed for my phone
        CheckBox wantBeWilderCB = new CheckBox(new ContextThemeWrapper(this, R.style.Widget_AppCompat_CompoundButton_CheckBox), null, 0);
        // Create wantBeWilderCB CheckBox Layout

        LinearLayout.LayoutParams wantBeWilderCBLayout=  new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
                wantBeWilderCBLayout.gravity=Gravity.CENTER_HORIZONTAL;
        // Apply the layout parameters to wantBeWilderCB CheckBox widget
        wantBeWilderCB.setLayoutParams(wantBeWilderCBLayout);
        //change wantBeWilderCB CheckBox properties
        wantBeWilderCB.setText(R.string.want_to_be_wilder_text);
        //needed for my phone
         wantBeWilderCB.setTextColor(Color.parseColor("#000000"));
        // add wantBeWilderCB CheckBox to mainLayaout
        layout.addView(wantBeWilderCB);


        //create  firstnameLayout linearLayout
        LinearLayout firstnameLayout = new LinearLayout(context);
        // Create firstnameLayout linearLayout LinearLayout parameters
        LinearLayout.LayoutParams firstnameLayoutParameters = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        // Apply the layout parameters to firstnameLayout linearLayout
       firstnameLayout.setLayoutParams(firstnameLayoutParameters);
       firstnameLayout.setOrientation(LinearLayout.HORIZONTAL);
       firstnameLayout.setWeightSum(2);
        // add firstnameLayout linearLayout to mainLayaout
        layout.addView(firstnameLayout);


        // Create firstnameET EditText programmatically.
        EditText firstnameET = new EditText(context);
        // Create firstnameET EditText Layout
        LinearLayout.LayoutParams firstnameETLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
                firstnameETLayout.weight=1;
        // Apply the layout parameters to firstnameET EditText widget
        firstnameET.setLayoutParams(firstnameETLayout);
        //change firstnameET EditText properties
        firstnameET.setEms(10);
        firstnameET.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        firstnameET.setHint(R.string.firstname_text);
        //needed for my phone
        firstnameET.setHintTextColor(Color.GRAY);
        firstnameET.setTextColor(Color.parseColor("#000000"));
        // add firstnameET EditText to firstnameLayaout
        firstnameLayout.addView(firstnameET);

        // Create spaceFirstname Space programmatically.
        Space spaceFirstname = new Space(context);
        LinearLayout.LayoutParams spaceFirstnameLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                0); // Height of TextView
        spaceFirstnameLayout.weight=1;
        // Apply the layout parameters to spaceFirstname widget
        spaceFirstname.setLayoutParams(spaceFirstnameLayout);
        // add spaceFirstname  to  firstnameLayaout
        firstnameLayout.addView(spaceFirstname);


        //create  lastnameLayout linearLayout
        LinearLayout lastnameLayout = new LinearLayout(context);
        // Create lastnameLayout linearLayout LinearLayout parameters
        LinearLayout.LayoutParams lastnameLayoutParameters = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        // Apply the layout parameters to lastnameLayout linearLayout
        lastnameLayout.setLayoutParams(lastnameLayoutParameters);
        lastnameLayout.setOrientation(LinearLayout.HORIZONTAL);
        lastnameLayout.setWeightSum(2);
        // add lastnameLayout linearLayout to mainLayaout
        layout.addView(lastnameLayout);


        // Create lastnameET EditText programmatically.
        EditText lastnameET = new EditText(context);
        // Create lastnameET EditText Layout
        LinearLayout.LayoutParams lastnameETLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
                lastnameETLayout.weight=1;
        // Apply the layout parameters to lastnameET EditText widget
        lastnameET.setLayoutParams(lastnameETLayout);
        //change lastnameET EditText properties
        lastnameET.setEms(10);
        lastnameET.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        lastnameET.setHint(R.string.lastname_text);
        //needed for my phone
        lastnameET.setHintTextColor(Color.GRAY);
        lastnameET.setTextColor(Color.parseColor("#000000"));
        // add lastnameET EditText to  lastnameLayaout
        lastnameLayout.addView(lastnameET);


        // Create spaceLastname Space programmatically.
        Space spaceLastname = new Space(context);
        LinearLayout.LayoutParams spaceLastnameLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                0); // Height of TextView
                spaceLastnameLayout.weight=1;
        // Apply the layout parameters to spaceLastname widget
        spaceLastname.setLayoutParams(spaceLastnameLayout);
        // add spaceLastname to lastnameLayaout
        lastnameLayout.addView(spaceLastname);


        // Create acceptB Button programmatically.
        Button  acceptB= new Button(context);
        LinearLayout.LayoutParams acceptBLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                LinearLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        // Apply the layout parameters to acceptB widget
        acceptB.setLayoutParams(acceptBLayout);
        //change accept B button properties
        acceptB.setText(R.string.accept_text);
        // add acceptB to mainLayaout
        layout.addView(acceptB);







    }
}
