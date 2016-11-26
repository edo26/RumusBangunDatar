package com.bandung.android.rumusbangundatar;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.InputMismatchException;

/**
 * Created by anggy on 25/11/2016.
 */

public class LingkaranActivity extends AppCompatActivity {
    EditText et_jarijari;
    TextView tv_hasil;
    double jarijari,hasil;
    final double phi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);
        setTitle("Luas Lingkaran");
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

    public void hitungLuasLingkaran(View view) {

            et_jarijari = (EditText) findViewById(R.id.edt_lingkaran_jarijari);

            tv_hasil = (TextView) findViewById(R.id.lingkaran_hasil);

            if(et_jarijari.getText().toString().equals("")){
                Toast.makeText(getBaseContext(),"Tidak boleh kosong",Toast.LENGTH_SHORT).show();
            }else{
                jarijari = Double.parseDouble(et_jarijari.getText().toString());

                hasil = phi * jarijari * jarijari;

                tv_hasil.setText(String.valueOf(hasil));
            }

    }
}
