package com.bandung.android.rumusbangundatar;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by anggy on 25/11/2016.
 */

public class SegitigaActivity extends AppCompatActivity {
    EditText et_alas,et_tinggi;
    TextView tv_hasil;
    double alas,tinggi,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);
        setTitle("Luas Segitiga");
        ActionBar tes = getSupportActionBar();
        tes.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (android.R.id.home){

            case android.R.id.home:
                this.finish();
                return true;

        }
        return false;
    }

    public void hitungLuasSegitiga(View view){

        et_alas = (EditText)findViewById(R.id.edt_segitiga_alas);
        et_tinggi = (EditText)findViewById(R.id.edt_segitiga_tinggi);
        tv_hasil = (TextView)findViewById(R.id.segitiga_hasil);

        if(et_alas.getText().toString().equals("") || et_tinggi.getText().toString().equals("")){
            Toast.makeText(getBaseContext(),"Tidak boleh kosong",Toast.LENGTH_SHORT);
        }else{
            alas = Double.parseDouble(et_alas.getText().toString());
            tinggi = Double.parseDouble(et_tinggi.getText().toString());

            hasil = (alas + tinggi)/2;

            tv_hasil.setText(String.valueOf(hasil));
        }
    }

}
