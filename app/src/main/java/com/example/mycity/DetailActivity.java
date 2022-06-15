package com.example.mycity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView sehirIsmi;
    private TextView sehirAciklama;
    private TextView plakaNo;
    private ImageView sehirResmi;
    private String sAciklama, sIsim, sPlaka;
    private Bitmap secilenSehir;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        sehirIsmi = (TextView) findViewById(R.id.detail_activity_textViewSehirIsmi);
        sehirAciklama = (TextView) findViewById(R.id.detail_activity_textViewDetay);
        sehirResmi = (ImageView) findViewById(R.id.detail_activity_imageViewSehirResmi);
        plakaNo = (TextView) findViewById(R.id.detail_activity_textViewPlakaNo);


        sIsim = MainActivity.sehir.getIsim();
        sAciklama = MainActivity.sehir.getAciklama();
        secilenSehir = MainActivity.sehir.getResim();
        sPlaka = MainActivity.sehir.getPlaka();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //sResim = get_intent.getIntExtra("sehirresmi", -1);

        if (!TextUtils.isEmpty(sIsim) && !TextUtils.isEmpty(sAciklama)){
            sehirIsmi.setText(sIsim);
            sehirAciklama.setText(sAciklama);
            sehirResmi.setImageBitmap(secilenSehir);
            plakaNo.setText(sPlaka);

        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /* Tıklanan itemin geri tuşu olup olmadığını kontrol ediyoruz. Eğer tıklanan toolbar itemi geri tuşu ise koşulun içine giriyoruz. */
        if (item.getItemId() == android.R.id.home) {
            /* Geri tuşuna basınca açılacak olan sınıfı seçiyoruz. Birinci parametre bulunduğumuz sınıfı temsil ediyor. İkinci parametre ise açılacak sınıfı temsil ediyor. */
            Intent geriButonu = new Intent(getApplicationContext(), MainActivity.class);
            // geriButonu intentini çalıştırıyoruz.
            NavUtils.navigateUpTo(this, geriButonu);
            return true;
        }
        return true;
    }

}