package com.wilis.menulayout;
 
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
 
public class ViewsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        startActivity(new Intent(this, menulayout.class));
    }
}