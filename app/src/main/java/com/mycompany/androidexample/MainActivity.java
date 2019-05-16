package com.mycompany.androidexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.facebook.stetho.Stetho;
import com.mycompany.androidexample.Storage.SQLiteActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Stetho.initializeWithDefaults(this);
        Button buttonStorageSqlite=(Button) findViewById(R.id.main_storage_sqlite);
        buttonStorageSqlite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this, SQLiteActivity.class);
                startActivity(intent);
            }
        });
    }
}
