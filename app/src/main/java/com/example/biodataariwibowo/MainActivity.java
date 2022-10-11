package com.example.biodataariwibowo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alamat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/wBNDRjsmR9wBF5qp6"));
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:arie35411@gmail.com"));
        startActivity(intent);
    }
    public void telepon(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=6285784038425"));
        startActivity(intent);
    }

}
