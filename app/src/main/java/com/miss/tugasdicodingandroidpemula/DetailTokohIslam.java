package com.miss.tugasdicodingandroidpemula;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailTokohIslam extends AppCompatActivity {

    String idTokoh;
    ImageView imageView;
    TextView tokoh1, tokoh2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tokoh_islam);
        //inisiaisasi text view

        tokoh1 = findViewById(R.id.tvNamaTokoh);
        tokoh2 = findViewById(R.id.tvDeskripsiTokoh);
        imageView = findViewById(R.id.ivTokoh);


        idTokoh = getIntent().getStringExtra("KEY");
        if (idTokoh.equals("1")) {
            tokoh1.setText(getString(R.string.aSomad));
            tokoh2.setText(getString(R.string.aSomadDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.abdulsomad));
            Toast.makeText(this, "ust.Abdul Somad", Toast.LENGTH_SHORT).show();

        } else if (idTokoh.equals("2")) {
            tokoh1.setText(getString(R.string.aKhalid));
            tokoh2.setText(getString(R.string.aKhalidDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.khalidbasalamah));
            Toast.makeText(this, "ust.Khalid Basalamah", Toast.LENGTH_SHORT).show();
        }

        else if (idTokoh.equals("3")) {
            tokoh1.setText(getString(R.string.aSyafiq));
            tokoh2.setText(getString(R.string.aSyafiqDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.syafiqbasalamah));
            Toast.makeText(this, "ust.syafiqrizabasalamah", Toast.LENGTH_SHORT).show();
        }

        else if (idTokoh.equals("4")) {
            tokoh1.setText(getString(R.string.aZakir));
            tokoh2.setText(getString(R.string.aZakirDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.dzakirnaik));
            Toast.makeText(this, "ust.Zakir Naik", Toast.LENGTH_SHORT).show();
        }

        else if (idTokoh.equals("5")) {
            tokoh1.setText(getString(R.string.aUtsaimin));
            tokoh2.setText(getString(R.string.aUtsaiminDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.utsaimin));
            Toast.makeText(this, "ust.syekh utsaimin", Toast.LENGTH_SHORT).show();
        }

        else if (idTokoh.equals("6")) {
            tokoh1.setText(getString(R.string.aAliJaber));
            tokoh2.setText(getString(R.string.aAliJaberDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.syekhalijaber));
            Toast.makeText(this, "ust.syekh Ali Jabe", Toast.LENGTH_SHORT).show();
        }

        else if (idTokoh.equals("7")) {
            tokoh1.setText(getString(R.string.aAdiHidayat));
            tokoh2.setText(getString(R.string.aAdiHidayatDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.adihidayad));
            Toast.makeText(this, "ust.Adi Hidayat", Toast.LENGTH_SHORT).show();
        }

        else if (idTokoh.equals("8")) {
            tokoh1.setText(getString(R.string.aHananAttaki));
            tokoh2.setText(getString(R.string.aHananAttakiDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.hananataki));
            Toast.makeText(this, "ust.hanan attaki", Toast.LENGTH_SHORT).show();
        }

        else if (idTokoh.equals("9")) {
            tokoh1.setText(getString(R.string.aSudais));
            tokoh2.setText(getString(R.string.aSudaisDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.sudais));
            Toast.makeText(this, "syekh sudais", Toast.LENGTH_SHORT).show();
        }

        else if (idTokoh.equals("10")) {
            tokoh1.setText(getString(R.string.aAbdulBasit));
            tokoh2.setText(getString(R.string.aAbdulBasitDes));
            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.abdulbasit));
            Toast.makeText(this, "ust.abdul basit", Toast.LENGTH_SHORT).show();
        }




    }
}
