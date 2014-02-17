package com.example.HelloDroid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.TextView;


/**
 * Created by user on 2/16/14.
 */
public class DisplayMessageActivity2 extends Activity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MyActivity.EXTRA_MESSAGE2);
        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        int sum = Integer.parseInt(message)+Integer.parseInt(message2);
        String final_message = Integer.toString(sum);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(final_message);
        setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}