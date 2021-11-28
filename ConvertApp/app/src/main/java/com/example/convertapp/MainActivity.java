package com.example.convertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    private CategoryAdapter adapter1;
    private CategoryAdapter adapter2;
    private EditText value;
    private TextView result;
    private ImageView switch_convert;
    private int radix1 = 2;
    private int radix2 = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value = findViewById(R.id.insert_value);
        result = findViewById(R.id.result_view);
        switch_convert = findViewById(R.id.switch_convert);
        switch_convert.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getActionMasked() == 1) {
                    int i1 = spinner1.getSelectedItemPosition();
                    int i2 = spinner2.getSelectedItemPosition();
                    spinner1.setSelection(i2);
                    spinner2.setSelection(i1);
                    return true;
                }
                return true;
            }
        });

        value.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                String res = _convert(s.toString());
                result.setText(res);
            }
        });

        spinner1 = findViewById(R.id.spinner_from);
        spinner2 = findViewById(R.id.spinner_to);

        adapter1 = new CategoryAdapter(this, R.layout.item_selected, getListCategory());
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                radix1 = adapter1.getItem(position).getRadix();
                String res = _convert(value.getText().toString());
                result.setText(res);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        adapter2 = new CategoryAdapter(this, R.layout.item_selected, getListCategory());
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                radix2 = adapter2.getItem(position).getRadix();
                String res = _convert(value.getText().toString());
                result.setText(res);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private List<Category> getListCategory() {
        List<Category> list = new ArrayList<>();
        list.add(new Category("Binary", 2));
        list.add(new Category("Decimal", 10));
        list.add(new Category("Octal", 8));
        list.add(new Category("Hexadecimal", 16));
        return list;
    }

    private String _convert(String value) {
        int sub_value;
        try {
            sub_value = Integer.parseInt(value, radix1);
        }catch (Exception e) {
            return "error";
        }
        if(radix2 == 2) return Integer.toBinaryString(sub_value);
        else if(radix2 == 8) return Integer.toOctalString(sub_value);
        else if(radix2 == 16) return Integer.toHexString(sub_value).toUpperCase(Locale.ROOT);
        return String.valueOf(sub_value);
    }
}