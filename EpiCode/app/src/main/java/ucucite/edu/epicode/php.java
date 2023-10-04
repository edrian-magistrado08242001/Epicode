package ucucite.edu.epicode;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class php extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }


    public void goback(View view) {
        onBackPressed();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, R.anim.nothing);
        Intent intent = new Intent(this, ProgrammingList.class);
        startActivity(intent);
    }
}