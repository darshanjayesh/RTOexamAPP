package com.dj.vehicleapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dj.Vehicleapp.R;

public class mock extends AppCompatActivity{

        public   String[] questions={"Riding on clutch means","Emergency vehicles means","What is the meaning of continuous yellow line on the center of the road","When you allow a vehicle to overtake ,you must","Imagine a situation where a car A is moving down the hill and car B is moving up at a position one vehicle needs to be stopped as only one vehicle can pass through the road at a time, which car needs to be stopped","Which one of these is an overtaking prohibited area","Use of horn is prohibited in ","Use of rear mirror","How many types of hand signals are there","What are mandatory traffic signals","Validity of driving vehicles (private)","In night what is to be done when vehicles approach from the opposite side ","It is dangerous to drive vehicles with bald tyres because","Which of these is best way to conserve fuel","identify the signal","identify the signal","identify the signal","identify the signal","identify the signal","identify the signal"};
public String[]answer1={"keeping half clutch position consistently","police vehicles","do not cross the line but can touch the line","Keep to the left of the road and slow down till the other vehicle has safely passes","Car A should stop thus giving way to car B","Small roads with width less than 7m","school's and college's","Watching the traffic approaching from behind","5","All road signals given given in triangle","20 years","Dim your park light","Car speed may be reduced","Turn off vehicles on traffic area's","Junction ahead","narrow road","speed breaker","pedestrian walking","Road construction","turn right"};
public String[]answer2={"keeping on full clutch position consistently","costly vehicles","Can cross through those lines","you need to stop the vehicle","Car B should be stopped thus giving way to car A","highway's","Court of laws and hospitals","Watching the traffic Approaching from front","4","All road signals given in circle","21 years","Dim your head light","It have high road grip","Drive at a moderate constant speed","Major road ahead","broader road","Bridge ahead","school ahead","land sliding area","turn left"};
public String[]answer3={"car on over speed","ambulance and fireengine vehicles","Do not touch or cross the yellow line","keep to the right of the road and slow down till the other vehicle has safely passes","both need to stopped ","junctions","police station ","For watching our  face ","6","All road signals given in square ","40 years","Dim your fog lamp","It have too little road grip","Turn off vehicles on traffic signals","turn right","highway ahead","Road blocked","children play area","falling rock","u turn "};
public String[]answer4={"non of these","non of these","non of these","non of these","non of these","non of these","non of these","non of these","10","non of these","non of these","non of these","non of these","all of these","non of these","non of these","non of these","non of these","non of these","non of these"};
public String[]correctanswer={"keeping half clutch position consistently","ambulance and fireengine vehicles","Do not touch or cross the yellow line","Keep to the left of the road and slow down till the other vehicle has safely passes","Car A should stop thus giving way to car B","junctions","Court of laws and hospitals","Watching the traffic approaching from behind","5","All road signals given in circle","20 years","Dim your head light","It have too little road grip","all of these","Major road ahead","narrow road","speed breaker","school ahead","falling rock","turn right"};
   public Button but1,but2,but3,but4;

   public TextView textView,textView8;
   public ImageView imageView;
        int index=0;
        int score=0;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mock);
        Toast.makeText(mock.this, "WE ONLY HAVE ONE MOCK PLEASE WRITE IT AFTER PROPER PREPARATION", Toast.LENGTH_LONG).show();
        but1=findViewById(R.id.but1);
        but2=findViewById(R.id.but2);
        but3=findViewById(R.id.but3);
        but4=findViewById(R.id.but4);
        textView=findViewById(R.id.textView);
        textView8=findViewById(R.id.textView8);
        imageView=findViewById(R.id.imageView);
        textView.setText(questions[index]);
        but1.setText(answer1[index]);
        but2.setText(answer2[index]);
        but3.setText(answer3[index]);
        but4.setText(answer4[index]);

        but1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        if (index <= questions.length-1) {
        if (answer1[index] == correctanswer[index]) {
        score++;

        }
        ++index;
        if (index <= questions.length - 1) {
        textView.setText(questions[index]);
        but1.setText(answer1[index]);
        but2.setText(answer2[index]);
        but3.setText(answer3[index]);
        but4.setText(answer4[index]);
if(index>=13){
        imageset(index);
}


        }
        else {
                Intent intent=new Intent(mock.this,result.class);
                intent.putExtra("number",score);
                startActivity(intent);

        // answer.setText(score);
        }
        }

        }

        });

        but2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        if (index <= questions.length-1) {
        if (answer2[index] == correctanswer[index]) {
        score++;

        }

        ++index;
        if (index <= questions.length - 1) {
        textView.setText(questions[index]);
        but1.setText(answer1[index]);
        but2.setText(answer2[index]);
        but3.setText(answer3[index]);
        but4.setText(answer4[index]);

                if(index>=13){
                        imageset(index);
                }

        } else {
                Intent intent=new Intent(mock.this,result.class);
                intent.putExtra("number",score);
                startActivity(intent);
        //  answer.setText(score);
        }
        }


        }


        });
        but3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        if (index <= questions.length-1) {
        if (answer3[index] == correctanswer[index]) {
        score++;

        }

        ++index;
        if (index <= questions.length - 1) {
        textView.setText(questions[index]);
        but1.setText(answer1[index]);
        but2.setText(answer2[index]);
        but3.setText(answer3[index]);
        but4.setText(answer4[index]);
                if(index>=13){
                        imageset(index);
                }


        } else {
                Intent intent=new Intent(mock.this,result.class);
                intent.putExtra("number",score);
                startActivity(intent);
        //  answer.setText(score);
        }
        }


        }


        });
        but4.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        if (index <= questions.length-1) {
        if (answer4[index] == correctanswer[index]) {
        score++;

        }

        ++index;
        if (index <= questions.length - 1) {
        textView.setText(questions[index]);

        but1.setText(answer1[index]);
        but2.setText(answer2[index]);
        but3.setText(answer3[index]);
        but4.setText(answer4[index]);
                if(index>13){
                        imageset(index);
                }

        } else {
                Intent intent=new Intent(mock.this,result.class);
                intent.putExtra("number",score);
                startActivity(intent);

        }
        }


        }


        });

        new CountDownTimer(1200000, 1000) {

                public void onTick(long millisUntilFinished) {
                        textView8.setText("Total time(20 min)- " + millisUntilFinished / 60000+"minutes remaining");
                }

                public void onFinish() {
                        textView8.setText("done!");
                        Intent intent=new Intent(mock.this,result.class);
                        intent.putExtra("number",score);
                        startActivity(intent);
                }
        }.start();

        }
        public void imageset(int i){
        switch (i){
                case 14:{
                        imageView.setImageResource(R.drawable.ma);
                        break;

                }
                case 15:{
                        imageView.setImageResource(R.drawable.abcde);
                        break;

                }
                case 16:{
                        imageView.setImageResource(R.drawable.yoyo);
                        break;
                }
                case 17:{
                        imageView.setImageResource(R.drawable.school);
                        break;
                }
                case 18:{
                        imageView.setImageResource(R.drawable.fall);
                        break;
                }
                case 19:{
                        imageView.setImageResource(R.drawable.right);
                        break;
                }
        }
        }


        }