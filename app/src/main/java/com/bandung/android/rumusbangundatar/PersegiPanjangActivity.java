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

public class PersegiPanjangActivity extends AppCompatActivity {
    EditText et_panjang,et_lebar;
    TextView tv_hasil;
    double panjang,lebar,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegipanjang);
        setTitle("Luas Persegi Panjang");
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

    public void hitungLuasPersegiPanjang(View view){

        et_panjang = (EditText)findViewById(R.id.edt_persegipanjang_panjang);
        et_lebar = (EditText)findViewById(R.id.edt_persegipanjang_lebar);
        tv_hasil = (TextView)findViewById(R.id.persegi_panjang_hasil);

        if(et_panjang.getText().toString().equals("") || et_lebar.getText().toString().equals("")){
            Toast.makeText(getBaseContext(),"Tidak boleh kosong",Toast.LENGTH_SHORT).show();
        }else{
            panjang = Double.parseDouble(et_panjang.getText().toString());
            lebar = Double.parseDouble(et_lebar.getText().toString());

            hasil = panjang * lebar;

            tv_hasil.setText(String.valueOf(hasil));
        }
    }

}
