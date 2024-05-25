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

public class malayalammock extends AppCompatActivity {

    public String []questions={"\"ക്ലച്ചിൽ ഡ്രൈവിംഗ്\" എന്നാണ് അർത്ഥമാക്കുന്നത്","എമർജൻസി വാഹനങ്ങൾ എന്നാൽ","റോഡിന്റെ മധ്യഭാഗത്ത് തുടർച്ചയായ മഞ്ഞ വരയുടെ അർത്ഥമെന്താണ്","ഒരു വാഹനത്തെ മറികടക്കാൻ നിങ്ങൾ അനുവദിക്കുമ്പോൾ, നിങ്ങൾ ചെയ്യണം","ഇവയിൽ ഏതാണ് ഓവർടേക്കിംഗ് നിരോധിത മേഖല","ഹോൺ ഉപയോഗിക്കുന്നത് നിരോധിച്ചിരിക്കുന്നു","എത്ര തരം ഹാൻഡ് സിഗ്നലുകൾ ഉണ്ട്","നിർബന്ധിത ട്രാഫിക് സിഗ്നലുകൾ എന്തൊക്കെയാണ്","വാഹനങ്ങൾ ഓടിക്കുന്നതിന്റെ സാധുത (സ്വകാര്യ)","രാത്രിയിൽ എതിർവശത്ത് നിന്ന് വാഹനങ്ങൾ വരുമ്പോൾ എന്താണ് ചെയ്യേണ്ടത്","കഷണ്ടിയുള്ള ടയറുകൾ ഉപയോഗിച്ച് വാഹനങ്ങൾ ഓടിക്കുന്നത് അപകടകരമാണ്","ഇവയിൽ ഏതാണ് ഇന്ധനം സംരക്ഷിക്കാനുള്ള ഏറ്റവും നല്ല മാർഗം","\"റിയർ വ്യൂ മിറർ\" ഉപയോഗം","വാഹന ഇൻഷുറൻസ് സർട്ടിഫിക്കറ്റ് സാധുത","ഇനിപ്പറയുന്ന ചിഹ്നങ്ങൾ തിരിച്ചറിയുക","ഇനിപ്പറയുന്ന ചിഹ്നങ്ങൾ തിരിച്ചറിയുക","ഇനിപ്പറയുന്ന ചിഹ്നങ്ങൾ തിരിച്ചറിയുക","ഇനിപ്പറയുന്ന ചിഹ്നങ്ങൾ തിരിച്ചറിയുക","ഇനിപ്പറയുന്ന ചിഹ്നങ്ങൾ തിരിച്ചറിയുക","ഇനിപ്പറയുന്ന ചിഹ്നങ്ങൾ തിരിച്ചറിയുക"};
    public String[]answer1={"\"ഹാഫ് ക്ലച്ച്\" സ്ഥാനം നിരന്തര നിലനിർത്തുക","പോലീസ് വാഹനങ്ങൾ","മഞ്ഞ വര മറികടക്കാൻ കഴിയും","ഇൻഡിക്കേറ്റർ ഇടുക","ജംഗ്ഷനുകൾ","പോലീസ് സ്റ്റേഷൻ","5","നീലയിൽ ട്രാഫിക് സിഗ്നൽ നൽകി","21 വർഷം","നിങ്ങളുടെ \"ഹെഡ് ലൈറ്റ്\" മങ്ങിക്കുക","അത് കുറ്റകരമാണ്","ട്രാഫിക്കിൽ നിങ്ങളുടെ വാഹനങ്ങൾ ഓഫ് ചെയ്ത് മിതമായ വേഗതയിൽ ഓടിക്കുക","പിന്നിൽ നിന്ന് വാഹനങ്ങൾ വരുന്നത് കാണാൻ","1വർഷം","മുന്നിൽ വലിയൊരു റോഡ് ഉണ്ട്","മുന്നിൽ ഒരു കനാൽ ഉണ്ട്","സ്പീഡ് ബ്രേക്കർ ഉണ്ട്","മുന്നിൽ ഒരു കളിസ്ഥലം ഉണ്ട്","ഉരുൾപൊട്ടൽ","യൂ വളവ്"};
    public String[]answer2={"\"ഫുൾ ക്ലച്ച്\" സ്ഥാനം നിരന്തരം നിലനിർത്തുക","സ്വകാര്യ വാഹനങ്ങൾ","മഞ്ഞ വരയിൽ തൊടുകയോ കടക്കുകയോ ചെയ്യരുത്","റോഡിന്റെ വലതുവശത്ത് വയ്ക്കുക, മറ്റ് വാഹനം സുരക്ഷിതമായി കടന്നുപോകുന്നതുവരെ വേഗത കുറയ്ക്കുക","ഹൈവേകൾ","സ്കൂളുകൾ","2","ട്രാഫിക് സിഗ്നൽ ട്രയാഞ്ചിൽ നൽകിയിരിക്കുന്നു","19 വർഷം","നിങ്ങളുടെ \"പാർക്ക് ലൈറ്റ്\" മങ്ങിക്കുക","അതിന് റോഡിൽ ഉയർന്ന പിടി ഉണ്ട്","പെട്രോളിനെക്കാൾ ഡീസൽ കാർ ഉപയോഗിക്കുക","മുന്നിൽ നിന്ന് വരുന്ന വാഹനങ്ങൾ കാണാൻ","3വർഷം","മുന്നിൽ പാലമുണ്ട്","മുന്നിൽ ഇടുങ്ങിയ റോഡ് ഉണ്ട്","നിർമ്മാണം നടക്കുന്നു","മുന്നിൽ ഒരു സ്കൂൾ ഉണ്ട്","നിർമ്മാണം നടക്കുന്നു","വലത്തോട്ട് തിരിയുക"};
    public String[]answer3={"വേഗത കുറയ്ക്കൽ","ആംബുലൻസ്, ഫയർ എഞ്ചിൻ വാഹനങ്ങൾ","മഞ്ഞ വരയിൽ സ്പർശിക്കാൻ കഴിയും, പക്ഷേ അത് മറികടക്കാൻ കഴിയില്ല","റോഡിന്റെ ഇടതുവശത്ത് വയ്ക്കുക, മറ്റ് വാഹനം സുരക്ഷിതമായി കടന്നുപോകുന്നതുവരെ വേഗത കുറയ്ക്കുക","നഗരങ്ങൾക്കുള്ളിൽ","ആശുപത്രികളും കോടതി നിയമങ്ങളും","10","സർക്കിളിൽ ട്രാഫിക് സിഗ്നൽ നൽകി","20 വർഷം","നിങ്ങളുടെ \"ഹെഡ് ലൈറ്റ്\" ഓഫ് ചെയ്യുക","ഇതിന് വളരെ കുറഞ്ഞ റോഡ് ഗ്രിപ്പ് ഉണ്ട്","നിങ്ങളുടെ വാഹനം ഉപയോഗിക്കരുത്","നമ്മുടെ സ്വന്തം മുഖം കാണുന്നതിന്","2വർഷം","മുന്നിൽ ജംഗ്ഷൻ ഉണ്ട്","മുന്നിൽ ഒരു പാലമുണ്ട്","ഒരു ഗട്ടർ ഉണ്ട്","കാൽനടയാത്രക്കാരുടെ നടത്തം","വീഴുന്ന പാറ","ഇടത്തോട്ട് തിരിയുക"};
    public String[]answer4={"ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്","ഇതല്ലാത്തത്"};
    public String[]correctanswer={"\"ഹാഫ് ക്ലച്ച്\" സ്ഥാനം നിരന്തരം നിലനിർത്തുക","ആംബുലൻസ്, ഫയർ എഞ്ചിൻ വാഹനങ്ങൾ","മഞ്ഞ വരയിൽ തൊടുകയോ കടക്കുകയോ ചെയ്യരുത്","റോഡിന്റെ ഇടതുവശത്ത് വയ്ക്കുക, മറ്റ് വാഹനം സുരക്ഷിതമായി കടന്നുപോകുന്നതുവരെ വേഗത കുറയ്ക്കുക","ജംഗ്ഷനുകൾ","ആശുപത്രികളും കോടതി നിയമങ്ങളും","5","സർക്കിളിൽ ട്രാഫിക് സിഗ്നൽ നൽകി","20 വർഷം","നിങ്ങളുടെ \"ഹെഡ് ലൈറ്റ്\" മങ്ങിക്കുക","ഇതിന് വളരെ കുറഞ്ഞ റോഡ് ഗ്രിപ്പ് ഉണ്ട്","ട്രാഫിക്കിൽ നിങ്ങളുടെ വാഹനങ്ങൾ ഓഫ് ചെയ്ത് മിതമായ വേഗതയിൽ ഓടിക്കുക","പിന്നിൽ നിന്ന് വാഹനങ്ങൾ വരുന്നത് കാണാൻ","1വർഷം","മുന്നിൽ വലിയൊരു റോഡ് ഉണ്ട്","മുന്നിൽ ഇടുങ്ങിയ റോഡ് ഉണ്ട്","സ്പീഡ് ബ്രേക്കർ ഉണ്ട്","മുന്നിൽ ഒരു സ്കൂൾ ഉണ്ട്","വീഴുന്ന പാറ","വലത്തോട്ട് തിരിയുക"};
    Button but1,but2,but3,but4;
    ImageView imageView;

    TextView textView,textView12;
    int index=0;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.malayalam_mock);
        Toast.makeText(malayalammock.this, "ഞങ്ങൾക്ക് ഒരു മേക്ക് മാത്രമേയുള്ളൂ, അത് തയ്യാറാക്കുന്നതിനുമുമ്പ് എഴുതുക", Toast.LENGTH_LONG).show();
        but1=findViewById(R.id.but1);
        but2=findViewById(R.id.but2);
        but3=findViewById(R.id.but3);
        but4=findViewById(R.id.but4);
        textView=findViewById(R.id.textView);
        textView12=findViewById(R.id.textView12);
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
                        if(index>13){
                            imageset(index);
                        }

                    } else {
                        Intent intent=new Intent(malayalammock.this,result1.class);
                        intent.putExtra("number",score);
                        startActivity(intent);
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
                        if(index>13){
                            imageset(index);
                        }
                    } else {
                        Intent intent=new Intent(malayalammock.this,result1.class);
                        intent.putExtra("number",score);
                        startActivity(intent);
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
                        if(index>13){
                            imageset(index);
                        }
                    } else {
                        Intent intent=new Intent(malayalammock.this,result1.class);
                        intent.putExtra("number",score);
                        startActivity(intent);
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
                        Intent intent=new Intent(malayalammock.this,result1.class);
                        intent.putExtra("number",score);
                        startActivity(intent);

                    }
                }


            }


        });
        new CountDownTimer(1200000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView12.setText("ആകെ സമയം(20 min)- " + millisUntilFinished / 60000+"മിനിറ്റ് ശേഷിക്കുന്നു");
            }

            public void onFinish() {
                textView12.setText("done!");
                Intent intent=new Intent(malayalammock.this,result.class);
                intent.putExtra("number",score);
                startActivity(intent);
            }
        }.start();


    }
    public void imageset(int index){
        switch(index) {
            case 14: {
                imageView.setImageResource(R.drawable.ma);
                break;

            }
            case 15: {
                imageView.setImageResource(R.drawable.abcde);
                break;

            }
            case 16: {
                imageView.setImageResource(R.drawable.yoyo);
                break;
            }
            case 17: {
                imageView.setImageResource(R.drawable.school);
                break;
            }
            case 18: {
                imageView.setImageResource(R.drawable.fall);
                break;
            }
            case 19: {
                imageView.setImageResource(R.drawable.right);
                break;
            }
        }

    }
}