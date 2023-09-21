package com.example.mvvmex;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;


public class MainActivity extends AppCompatActivity {

    private CounterViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ViewModel 초기화
        viewModel = new ViewModelProvider(this).get(CounterViewModel.class);

        TextView tvNumber = findViewById(R.id.tv_number);
        Button btnIncrease = findViewById(R.id.btn_increase);

        //Button 클릭 -> ViewModel에서 count 증가
        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.incrementCount();
                updateTextView(tvNumber);
            }
        });
    }

    private void updateTextView(TextView textView) {
        // ViewModel에서 가져온 숫자를 TextView에 설정
        textView.setText(String.valueOf(viewModel.getCount()));
    }
}