package com.rizal.satu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.rizal.satu.databinding.ActivitySatuBinding;

public class Satu extends AppCompatActivity {
    private ActivitySatuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);
    }
}