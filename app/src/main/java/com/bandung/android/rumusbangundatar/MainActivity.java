package com.bandung.android.rumusbangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pindahHalamanPersegi(View view){

        Intent i = new Intent(MainActivity.this,PersegiActivity.class);
        startActivity(i);

    }

    public void pindahHalamanPersegiPanjang(View view){

        Intent i = new Intent(MainActivity.this,PersegiPanjangActivity.class);
        startActivity(i);

    }

    public void pindahHalamanSegitiga(View view){

        Intent i = new Intent(MainActivity.this,SegitigaActivity.class);
        startActivity(i);

    }

    public void pindahHalamanLingkaran(View view){

        Intent i = new Intent(MainActivity.this,LingkaranActivity.class);
        startActivity(i);

    }

    public void pindahHalamanTrapesium(View view){

        Intent i = new Intent(MainActivity.this,TrapesiumActivity.class);
        startActivity(i);

    }

    //Tes
    //Tes lagi

    public void pindahHalamanAbout(View view){

        Intent i = new Intent(MainActivity.this,AboutActivity.class);
        startActivity(i);

    }

}
