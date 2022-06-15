package com.example.mycity;

import android.graphics.Bitmap;
import android.widget.TextView;

public class Sehir {
    private String aciklama;
    private String isim;
    private String plaka;
    private Bitmap resim;

    public Sehir(String aciklama, String isim, Bitmap resim, String plaka) {
        this.aciklama = aciklama;
        this.isim = isim;
        this.resim = resim;
        this.plaka = plaka;
    }


    public String getAciklama() { return aciklama; }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getPlaka() { return plaka;}

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public Bitmap getResim() {
        return resim;
    }

    public void setResim(Bitmap resim) {
        this.resim = resim;
    }
}
