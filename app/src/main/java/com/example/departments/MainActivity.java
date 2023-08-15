package com.example.departments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    String depart[] = {"production", "finance", "HR", "manager"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,depart);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s= spinner.getItemAtPosition(i).toString();
                if(s=="production"){
                    Intent intent=new Intent(MainActivity.this,production.class);
                    startActivity(intent);

                }

            }
        });



    }


}