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

public class PersegiActivity extends AppCompatActivity {

    EditText et_sisi;
    TextView tv_hasil;
    double sisi,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);
        setTitle("Luas Persegi/Bujur Sangkar");
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

    public void hitungLuas(View view){

        et_sisi = (EditText)findViewById(R.id.edt_persegi_sisi);
        tv_hasil = (TextView)findViewById(R.id.persegi_hasil);

        if(et_sisi.getText().toString().equals("")){
            Toast.makeText(getBaseContext(),"Tidak boleh kosong",Toast.LENGTH_SHORT).show();
        }else{
            sisi = Double.parseDouble(et_sisi.getText().toString());

            hasil = sisi * sisi;

            tv_hasil.setText(String.valueOf(hasil));
        }
    }

}
