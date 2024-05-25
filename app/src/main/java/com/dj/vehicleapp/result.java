package com.dj.vehicleapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dj.Vehicleapp.R;

public class result extends AppCompatActivity {
    TextView textView2,textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layout);
        textView2=findViewById(R.id.textView2);
        textView=findViewById(R.id.textView4);
        Intent intent=getIntent();
        int score=intent.getIntExtra("number",0);
        if(score>12){
            textView2.setText("Your score is"+score+"\n hey u have passed the exam");

        }
        else{
            textView2.setText("Your score is"+score+"\n  sorry score not enough");

        }
        textView.setText("1.Riding on clutch means\n" +
                "keeping half clutch position consistently\n" +
                "2.Emergency vehicles means\n" +
                "ambulance and fireengine vehicles\n" +
                "3.What is the meaning of continuous yellow line on the center of the road\n" +
                "Do not touch or cross the yellow line\n" +
                "4.When you allow a vehicle to overtake ,you must\n" +
                "Keep to the left of the road and slow down till the other vehicle has safely passes\n" +
                "5.Imagine a situation where a car A is moving down the hill and car B is moving up at a position one vehicle needs to be stopped as only one vehicle can pass through the road at a time, which car needs to be stopped\n" +
                "Car A should stop thus giving way to car B\n" +
                "6.Which one of these is an overtaking prohibited area\n" +
                "junctions\n" +
                "7.Use of horn is prohibited in\n" +
                "hospitals and courts of law\n" +
                "8.How many types of hand signals are there\n" +
                "5\n" +
                "9.What are mandatory traffic signals\n" +
                "traffic signal given in circle \n" +
                "10.Validity of driving vehicles (private)\n" +
                "20 years\n" +
                "11.In night what is to be done when vehicles approach from the opposite side\n" +
                "dim your head light\n" +
                "12.It is dangerous to drive vehicles with bald tyres because\n" +
                "it have too low road grip\n" +
                "13.Which of these is best way to conserve fuel\n" +
                "turn off your vehicles on traffic and drive on moderate speed\n" +
                "14.Use of rear mirror\n" +
                "to see the vehicles approaching from behind");



    }
}
