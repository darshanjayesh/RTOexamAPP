package com.dj.vehicleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.dj.Vehicleapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVcourses);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("Learners test material(english)", R.drawable.ta));
        courseModelArrayList.add(new CourseModel("Material (malayalam)", R.drawable.ta));
        courseModelArrayList.add(new CourseModel("Demonstration ", R.drawable.wa));
        courseModelArrayList.add(new CourseModel("Mock(english)", R.drawable.la));
        courseModelArrayList.add(new CourseModel("Mock(malayalam)", R.drawable.la));
        courseModelArrayList.add(new CourseModel("About us", R.drawable.aboutus));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
        coursesGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:{
                        Intent intent =new Intent(MainActivity.this,learnerstest.class);
                        startActivity(intent);
                        break;
                    }
                    case 1:{
                        Intent intent =new Intent(MainActivity.this,learnerstestmalayalam.class);
                        startActivity(intent);
                        break;
                    }
                    case 2:{
                        Intent intent =new Intent(MainActivity.this,basicsofvehicle.class);
                        startActivity(intent);
                        break;
                    }
                    case 3:{
                        Intent intent =new Intent(MainActivity.this,mock.class);
                        startActivity(intent);
                        break;
                    }
                    case 4:{
                        Intent intent =new Intent(MainActivity.this,malayalammock.class);
                        startActivity(intent);
                        break;
                    }
                    case 5:{
                        Intent intent =new Intent(MainActivity.this,AboutUs.class);
                        startActivity(intent);
                        break;
                    }


                }
            }
        });
    }
}