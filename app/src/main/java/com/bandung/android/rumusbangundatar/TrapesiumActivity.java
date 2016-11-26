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

public class TrapesiumActivity extends AppCompatActivity {
    EditText et_atas,et_bawah,et_tinggi;
    TextView tv_hasil;
    double atas,bawah,tinggi,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trapesium);
        setTitle("Luas Trapesium");
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

    public void hitungLuasTrapesium(View view){

        et_atas = (EditText)findViewById(R.id.edt_trapesium_atas);
        et_bawah = (EditText)findViewById(R.id.edt_trapesium_bawah);
        et_tinggi = (EditText)findViewById(R.id.edt_trapesium_tinggi);

        tv_hasil = (TextView)findViewById(R.id.trapesium_hasil);

        if (et_atas.getText().toString().equals("") || et_bawah.getText().toString().equals("") || et_tinggi.getText().toString().equals("")){
            Toast.makeText(getBaseContext(),"Tidak boleh kosong",Toast.LENGTH_SHORT);
        }else{

            atas = Double.parseDouble(et_atas.getText().toString());
            bawah = Double.parseDouble(et_bawah.getText().toString());
            tinggi = Double.parseDouble(et_tinggi.getText().toString());

            hasil = ((atas + bawah)/2)*tinggi;

            tv_hasil.setText(String.valueOf(hasil));

        }
    }

}
