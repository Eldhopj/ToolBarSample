package com.example.eldho.toolbarsample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //NOTE : Change style to NoActionBar else there will be conflict of 2 toolbars
    private Toolbar mainToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**ToolBar the xml code also present*/
        mainToolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(mainToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Photo Blog");

            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // For back arrow on toolbar
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            //NOTE: for backButton action we have to define parent activity in manifest, check manifest
        }
    }

    /** Create Menu */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**Selection of items*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){ // get the ID
            case R.id.action_logout_btn:
                //Code inside the logout menu button starts here

                //Code inside the logout menu button ends here
                return true;
            default:
                return false;

        }
    }
    //For Back navigation Icon logic
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
