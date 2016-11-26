package com.bandung.android.rumusbangundatar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/**
 * Created by anggy on 25/11/2016.
 */

public class AboutActivity extends AppCompatActivity {
    EditText isipesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        setTitle("Tentang Aplikasi");
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

    public void ngirimKeEmail(View view){
        isipesan = (EditText)findViewById(R.id.isipesan);
        String isi_pesan = isipesan.getText().toString();

        Intent i = new Intent(Intent.ACTION_SENDTO);
        i.setData(Uri.parse("mailto:"));
        i.putExtra(Intent.EXTRA_EMAIL,"anggyedoo@gmail.com");
        i.putExtra(Intent.EXTRA_TEXT,isi_pesan);
        i.putExtra(Intent.EXTRA_REFERRER_NAME,"Si ujang");
        startActivity(i);
    }

}
