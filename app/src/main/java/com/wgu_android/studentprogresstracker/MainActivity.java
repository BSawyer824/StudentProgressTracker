package com.wgu_android.studentprogresstracker;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        int id = item.getItemId();

        //Terms Menu Option Selected
        if (id == R.id.action_terms) {
            Intent intent= new Intent(MainActivity.this, TermsActivity.class);
            startActivity(intent);
            return true;
        }

        //Courses Menu Option Selected
        if (id == R.id.action_courses) {
            Intent intent= new Intent(MainActivity.this, CoursesActivity.class);
            startActivity(intent);
            return true;
        }


        //Courses Menu Option Selected
        if (id == R.id.action_assessments) {
            Intent intent= new Intent(MainActivity.this, AssessmentsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
