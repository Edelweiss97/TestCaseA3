package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lesson6.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private CustomMath math;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        math = new CustomMath();
        setupListeners();
    }

    private void setupListeners() {


        binding.btnAdd.setOnClickListener(v -> {
            String num1 = binding.etNum1.getText().toString();
            String num2 = binding.etNum2.getText().toString();
            binding.tvResult.setText(math.add(num1,num2));

        });

        binding.btnReverse.setOnClickListener(v -> {
            String num1 = binding.etNum1.getText().toString();
            binding.tvResult.setText(math.reverseString(num1));

        });
    }
}