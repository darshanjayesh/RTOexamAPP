package com.dj.vehicleapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.dj.Vehicleapp.R;

public class AboutUs extends AppCompatActivity {
    TextView textView3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);
textView3=findViewById(R.id.textView3);
textView3.setText("About us \n" +
        ""+"->Learners to license was released on 2021\n" +

        "->An app which prepares his/her for getting license \n" +

        "->This preparation involveslearners test,basic knowledge\n" +

        "about vehicles,passing the rto driving test\n" +

        "->we train everything here our training session includes\n" +

        "1.free learners test studying material\n" +

        "2.mock test\n" +
        "3.videos demonstrating basics \n" +
        "of vehicles ,tips and tricks and also H test \n" +"ഞങ്ങളേക്കുറിച്ച് \n" +
        ""+"->ലേണേഴ്സ് ടു ലൈസൻസ് 2021 ൽ പുറത്തിറങ്ങി\n" +

        "->ലൈസൻസ് ലഭിക്കുന്നതിന് അവന്റെ/അവളെ തയ്യാറാക്കുന്ന ഒരു ആപ്പ് \n" +

        "->ഈ തയ്യാറെടുപ്പിൽ ലേണേഴ്സ് ടെസ്റ്റ്, അടിസ്ഥാന അറിവ് എന്നിവ ഉൾപ്പെടുന്നു\n" +

        "വാഹനങ്ങളെക്കുറിച്ച്, ആർടിഒ ഡ്രൈവിംഗ് ടെസ്റ്റ് പാസാകുന്നത്\n" +

        "->ഞങ്ങളുടെ പരിശീലന സെഷനിൽ ഉൾപ്പെടുന്ന എല്ലാ കാര്യങ്ങളും ഞങ്ങൾ ഇവിടെ പരിശീലിപ്പിക്കുന്നു\n" +

        "1.സൗജന്യ പഠിതാക്കൾ പഠന സാമഗ്രികൾ പരിശോധിക്കുന്നു\n" +

        "2.മോക്ക് ടെസ്റ്റ്\n" +
        "3.അടിസ്ഥാന കാര്യങ്ങൾ പ്രദർശിപ്പിക്കുന്ന വീഡിയോകൾ \n" +
        "വാഹനങ്ങൾ, നുറുങ്ങുകളും തന്ത്രങ്ങളും കൂടാതെ എച്ച് ടെസ്റ്റും \n" +"Link for registering learners test and driving test \n"+
        "ഡ്രൈവിംഗ്, ലേണേഴ്സ് ടെസ്റ്റ് രജിസ്റ്റർ ചെയ്യുന്നതിനുള്ള ലിങ്ക് \n"+
        "പരിവാഹൻ ലിങ്ക്|parivahan link \n"+
        "https://parivahan.gov.in/parivahan/");




    }
}
