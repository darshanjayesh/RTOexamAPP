package com.dj.vehicleapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.dj.Vehicleapp.R;

public class basicsofvehicle extends AppCompatActivity {

String[] items={"basics of vehicles","H guidance tutorial "};
ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsofvehicle);
        listView=findViewById(R.id.listView);
        djAdapter1 ad=new djAdapter1(this,R.layout.dj_adapter1,items);
        listView.setAdapter(ad);
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             if(i==0){
                 Intent intent =new Intent(basicsofvehicle.this,youtube.class);

                 startActivity(intent);
             }
             else{
                 Intent intent =new Intent(basicsofvehicle.this,youtube2.class);

                 startActivity(intent);
             }
          }
      });





    }
}