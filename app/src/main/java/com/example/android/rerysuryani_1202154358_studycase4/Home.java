package com.example.android.rerysuryani_1202154358_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("AsyncTask");
    }

    public void mahasiswa(View view) {

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        //pindah ke aktivitas mahasiswa
    }

    public void gambar(View view) {

        Intent intent = new Intent(this, Gambar.class);
        startActivity(intent);
        //pindah ke aktivitas gambar
    }
}
