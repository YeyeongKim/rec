package com.example.recommend;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.text1);
        checkBox2 = findViewById(R.id.text2);
        checkBox3 = findViewById(R.id.text3);
        checkBox4 = findViewById(R.id.text4);
        checkBox5 = findViewById(R.id.text5);
        checkBox6 = findViewById(R.id.text6);
        checkBox7 = findViewById(R.id.text7);
        checkBox8 = findViewById(R.id.text8);

        btnResult = findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder("[추천하는 영양제] ");
                if (checkBox1.isChecked()) {
                    result.append("멀티비타민, ");
                }
                if (checkBox2.isChecked()) {
                    result.append("테아닌, ");
                }
                if (checkBox3.isChecked()) {
                    result.append("오메가-3, ");
                }
                if (checkBox4.isChecked()) {
                    result.append("루테인, ");
                }
                if (checkBox5.isChecked()) {
                    result.append("칼슘, 비타민D, ");
                }
                if (checkBox6.isChecked()) {
                    result.append("철분, ");
                }
                if (checkBox7.isChecked()) {
                    result.append("프로바이오틱스(유산균), ");
                }
                if (checkBox8.isChecked()) {
                    result.append("콜라겐, ");
                }

                if (result.toString().equals("선택한 정보: ")) {
                    Toast.makeText(MainActivity.this, "정보를 선택해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    // 여기서 영양제 추천을 수행하고 결과를 표시하는 로직을 추가할 수 있습니다.
                    result.delete(result.length() - 2, result.length());
                    Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
