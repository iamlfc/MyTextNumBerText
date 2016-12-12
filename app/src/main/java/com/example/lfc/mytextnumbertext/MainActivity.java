package com.example.lfc.mytextnumbertext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.lfc.mytextnumbertext.widget.NumberAnimTextView;

public class MainActivity extends AppCompatActivity {
    private NumberAnimTextView tvNum1;
    private NumberAnimTextView tvNum2;
    private NumberAnimTextView tvNum3;
    private NumberAnimTextView tvNum4;
    private Button btnClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        tvNum1 = (NumberAnimTextView) findViewById(R.id.tv_num1);
        tvNum2 = (NumberAnimTextView) findViewById(R.id.tv_num2);
        tvNum3 = (NumberAnimTextView) findViewById(R.id.tv_num3);
        tvNum4 = (NumberAnimTextView) findViewById(R.id.tv_num4);
        btnClick = (Button) findViewById(R.id.btn_click);

        tvNum1.setNumberString("10000");

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNum2.setPrefixString("￥");
                tvNum2.setNumberString("1000");

                tvNum3.setNumberString("1000", "2000");

                tvNum4.setPostfixString("%");
                tvNum4.setNumberString("100");

            }
        });
    }
}
