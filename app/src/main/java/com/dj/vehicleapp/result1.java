package com.dj.vehicleapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dj.Vehicleapp.R;

public class result1 extends AppCompatActivity {
    TextView textView2,textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result1_layout);
        textView2=findViewById(R.id.textView2);
        textView=findViewById(R.id.textView4);
        Intent intent=getIntent();
        int score=intent.getIntExtra("number",0);
        if(score>12){
            textView2.setText("നിങ്ങളുടെ സ്കോർ ആണ്"+score);

        }
        else{
            textView2.setText("നിങ്ങളുടെ സ്കോർ ആണ്"+score);

        }
textView.setText("1.\"ക്ലച്ചിൽ ഡ്രൈവിംഗ്\" എന്നാണ് അർത്ഥമാക്കുന്നത്\n" +
        "\"ഹാഫ് ക്ലച്ച്\" സ്ഥാനം നിരന്തരം നിലനിർത്തുക\n" +
        "2.എമർജൻസി വാഹനങ്ങൾ എന്നാൽ\n" +
        "ആംബുലൻസ്, ഫയർ എഞ്ചിൻ വാഹനങ്ങൾ\n" +
        "3.റോഡിന്റെ മധ്യഭാഗത്ത് തുടർച്ചയായ മഞ്ഞ വരയുടെ അർത്ഥമെന്താണ്\n" +
        "മഞ്ഞ വരയിൽ തൊടുകയോ കടക്കുകയോ ചെയ്യരുത്\n" +
        "4.ഒരു വാഹനത്തെ മറികടക്കാൻ നിങ്ങൾ അനുവദിക്കുമ്പോൾ, നിങ്ങൾ ചെയ്യണം\n" +
        "റോഡിന്റെ ഇടതുവശത്ത് വയ്ക്കുക, മറ്റ് വാഹനം സുരക്ഷിതമായി കടന്നുപോകുന്നതുവരെ വേഗത കുറയ്ക്കുക\n" +
        "5.ഇവയിൽ ഏതാണ് ഓവർടേക്കിംഗ് നിരോധിത മേഖല\n" +
        "ജംഗ്ഷനുകൾ\n" +
        "6.ഹോൺ ഉപയോഗിക്കുന്നത് നിരോധിച്ചിരിക്കുന്നു\n" +
        "ആശുപത്രികളും കോടതി നിയമങ്ങളും\n" +
        "7.എത്ര തരം ഹാൻഡ് സിഗ്നലുകൾ ഉണ്ട്\n" +
        "5\n" +
        "8.നിർബന്ധിത ട്രാഫിക് സിഗ്നലുകൾ എന്തൊക്കെയാണ്\n" +
        "സർക്കിളിൽ ട്രാഫിക് സിഗ്നൽ നൽകി\n" +
        "9.വാഹനങ്ങൾ ഓടിക്കുന്നതിന്റെ സാധുത (സ്വകാര്യ)\n" +
        "20 വർഷം\n" +
        "10.രാത്രിയിൽ എതിർവശത്ത് നിന്ന് വാഹനങ്ങൾ വരുമ്പോൾ എന്താണ് ചെയ്യേണ്ടത്\n" +
        "നിങ്ങളുടെ \"ഹെഡ് ലൈറ്റ്\" മങ്ങിക്കുക\n" +
        "11.കഷണ്ടിയുള്ള ടയറുകൾ ഉപയോഗിച്ച് വാഹനങ്ങൾ ഓടിക്കുന്നത് അപകടകരമാണ്\n" +
        "ഇതിന് വളരെ കുറഞ്ഞ റോഡ് ഗ്രിപ്പ് ഉണ്ട്\n" +
        "12.ഇവയിൽ ഏതാണ് ഇന്ധനം സംരക്ഷിക്കാനുള്ള ഏറ്റവും നല്ല മാർഗം\n" +
        "ട്രാഫിക്കിൽ നിങ്ങളുടെ വാഹനങ്ങൾ ഓഫ് ചെയ്ത് മിതമായ വേഗതയിൽ ഓടിക്കുക\n" +
        "13.റിയർ വ്യൂ മിറർ ഉപയോഗം\n" +
        "പിന്നിൽ നിന്ന് വാഹനങ്ങൾ വരുന്നത് കാണാൻ\n" +
        "14.വാഹന ഇൻഷുറൻസ് സർട്ടിഫിക്കറ്റ് സാധുത\n" +
        "1വർഷം\n");


    }
}
