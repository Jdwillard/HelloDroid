package com.example.HelloDroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MyActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.example.HelloDroid.MESSAGE";
    public final static String EXTRA_MESSAGE2 = "com.example.HelloDroid.MESSAGE2";



    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void sendMessage(View view){
        //do something in response to the button
        Intent intent = new Intent(this, DisplayMessageActivity2.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        EditText editText2 = (EditText) findViewById(R.id.edit_message2);

        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE2, message2);


        startActivity(intent);
    }

}
