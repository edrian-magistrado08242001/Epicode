package ucucite.edu.epicode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ProgrammingList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

         if(item.getItemId()==R.id.aboutus){
             new AlertDialog.Builder(ProgrammingList.this)
                     .setTitle(Html.fromHtml("<font color='#000000'>EpiCode Developers</font>"))
                     .setMessage(Html.fromHtml("<center><font color='#000000'>Jenny Mae Rechel Zabala</font>"+"<br>"+
                             "<font color='#000000'>Edrian Magistrado</font>"+"<br>"+
                             "<font color='#000000'>Geomel Alvarez</font>"+"<br>"+
                             "<font color='#000000'>Ayessa May Gabbac</font>" ))
                     .setIcon(R.drawable.logoprog)
                     .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                         public void onClick(DialogInterface dialog, int id) {
                             dialog.cancel();
                         }
                     }).show();
         }

        return super.onOptionsItemSelected(item);
    }


    public void cplusplus(View view) {
//        Toast.makeText(this, "Welcome to C++!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,cplusplus.class);
        startActivity(intent);
    }

    public void java(View view) {
//        Toast.makeText(this, "Welcome to Java!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,java.class);
        startActivity(intent);
    }

    public void javascript(View view) {
//        Toast.makeText(this, "Welcome to JavaScript!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,javascript.class);
        startActivity(intent);
    }

    public void sql(View view) {
//        Toast.makeText(this, "Welcome to SQL!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,php.class);
        startActivity(intent);
    }

    public void python(View view) {
//        Toast.makeText(this, "Welcome to Python!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,python.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, R.anim.nothing);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}