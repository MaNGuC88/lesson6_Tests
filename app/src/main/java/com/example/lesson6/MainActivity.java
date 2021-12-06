package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lesson6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Math math = new Math();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.etNum1.getText().toString().trim().length() == 0 &&
                        binding.etNum2.getText().toString().trim().length() == 0) {
                    binding.result.setText("");
                } else if (binding.etNum1.getText().toString().trim().contains(".") &&
                        binding.etNum2.getText().toString().trim().contains(".")) {
                    double num1 = Double.parseDouble(binding.etNum1.getText().toString().trim());
                    double num2 = Double.parseDouble(binding.etNum2.getText().toString().trim());
                    binding.result.setText(String.valueOf(num1 + num2));
                } else if (!binding.etNum1.getText().toString().trim().matches("-?\\d+(.\\d+)?") &&
                        !binding.etNum2.getText().toString().trim().matches("-?\\d+(.\\d+)?")) {
                    binding.result.setText("");
                } else {
                    int num1 = Integer.parseInt(binding.etNum1.getText().toString().trim());
                    int num2 = Integer.parseInt(binding.etNum2.getText().toString().trim());
                    binding.result.setText(String.valueOf(math.add(num1, num2)));
                }
            }
        });

        binding.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.etNum1.getText().toString().trim().length() == 0 &&
                        binding.etNum2.getText().toString().trim().length() == 0) {
                    binding.result.setText("");
                } else if (binding.etNum1.getText().toString().trim().contains(".") &&
                        binding.etNum2.getText().toString().trim().contains(".")) {
                    double num1 = Double.parseDouble(binding.etNum1.getText().toString().trim());
                    double num2 = Double.parseDouble(binding.etNum2.getText().toString().trim());
                    binding.result.setText(String.valueOf(java.lang.Math.round((num1 - num2)*100) / 100.0));
                } else if (!binding.etNum1.getText().toString().trim().matches("-?\\d+(.\\d+)?") &&
                        !binding.etNum2.getText().toString().trim().matches("-?\\d+(.\\d+)?")) {
                    binding.result.setText("");
                } else {
                    int num1 = Integer.parseInt(binding.etNum1.getText().toString().trim());
                    int num2 = Integer.parseInt(binding.etNum2.getText().toString().trim());
                    binding.result.setText(String.valueOf(math.sub(num1, num2)));
                }
            }
        });

        binding.btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.etNum1.getText().toString().trim().length() == 0 &&
                        binding.etNum2.getText().toString().trim().length() == 0) {
                    binding.result.setText("");
                } else if (binding.etNum1.getText().toString().trim().contains(".") &&
                        binding.etNum2.getText().toString().trim().contains(".")) {
                    double num1 = Double.parseDouble(binding.etNum1.getText().toString().trim());
                    double num2 = Double.parseDouble(binding.etNum2.getText().toString().trim());
                    binding.result.setText(String.valueOf(java.lang.Math.round((num1 * num2)*100) / 100.00));
                } else if (!binding.etNum1.getText().toString().trim().matches("-?\\d+(.\\d+)?") &&
                        !binding.etNum2.getText().toString().trim().matches("-?\\d+(.\\d+)?")) {
                    binding.result.setText("");
                } else {
                    int num1 = Integer.parseInt(binding.etNum1.getText().toString().trim());
                    int num2 = Integer.parseInt(binding.etNum2.getText().toString().trim());
                    binding.result.setText(String.valueOf(math.multiply(num1, num2)));
                }
            }
        });

        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.etNum1.getText().toString().trim().length() == 0 &&
                        binding.etNum2.getText().toString().trim().length() == 0) {
                    binding.result.setText("");
                } else if (binding.etNum1.getText().toString().trim().contains(".") &&
                        binding.etNum2.getText().toString().trim().contains(".")) {
                    double num1 = Double.parseDouble(binding.etNum1.getText().toString().trim());
                    double num2 = Double.parseDouble(binding.etNum2.getText().toString().trim());
                    binding.result.setText(String.valueOf(java.lang.Math.round((num1 / num2)*100) / 100.0));
                } else if (!binding.etNum1.getText().toString().trim().matches("-?\\d+(.\\d+)?") &&
                        !binding.etNum2.getText().toString().trim().matches("-?\\d+(.\\d+)?")) {
                    binding.result.setText("");
                } else {
                    int num1 = Integer.parseInt(binding.etNum1.getText().toString().trim());
                    int num2 = Integer.parseInt(binding.etNum2.getText().toString().trim());
                    binding.result.setText(String.valueOf(math.div(num1, num2)));
                }
            }
        });

    }


}