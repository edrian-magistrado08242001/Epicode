package ucucite.edu.epicode;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Code Go to List of programming language
    public void gotohome(View view) {
        Intent intent = new Intent(MainActivity.this, ProgrammingList.class);
        startActivity(intent);
    }

    //    backpressed button
    @Override
    public void onBackPressed() {
        exitbackpressed();
    }

    //Alert Dialog of Back pressed
    private void exitbackpressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//        alertDialogBuilder.setMessage("Are you sure you want to Exit?");
        alertDialogBuilder.setMessage(Html.fromHtml("<font color='#000000'>Are you sure you want to exit?</font>"));
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
//                        finish();
//                        System.exit(0);
                        finishAffinity(); //Force Exit
                    }
                });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


    //Alert Dialog of Exit Button
    public void exit(View view) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//        alertDialogBuilder.setMessage("Are you sure you want to Exit?");
        alertDialogBuilder.setMessage(Html.fromHtml("<font color='#000000'>Are you sure you want to exit?</font>"));
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
//                        finish();
//                        System.exit(0);
                        finishAffinity(); //Force Exit
                    }
                });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }


    public void about(View view) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(Html.fromHtml("<font color='#000000'>EpiCode Developers</font>"))
                .setMessage(Html.fromHtml("<center><font color='#000000'>Jenny Mae Rechel Zabala</font>"+"<br>"+
                        "<font color='#000000'>Edrian Magistrado</font>"+"<br>"+
                        "<font color='#000000'>Geomel Alvarez</font>"+"<br>"+
                        "<font color='#000000'>Ayessa May Gabbac</font>" ))
                .setIcon(R.drawable.logoprog)
                .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
//
                        dialog.cancel();
                    }
                }).show();
    }
}



