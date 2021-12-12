package com.example.fragmentapp.ui.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.fragmentapp.R;

public class CalculatorFragment extends Fragment {

    private TextView inputDisplay;
    private TextView resultDisplay;
    private boolean isShowingResult;
    private String prevCalc;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);
        inputDisplay = view.findViewById(R.id.input);
        resultDisplay = view.findViewById(R.id.result);

        isShowingResult = false;
        prevCalc = "";

        Button button1 = view.findViewById(R.id.buttonNum1);
        button1.setOnClickListener(this::buttonNum1);
        Button button2 = view.findViewById(R.id.buttonNum2);
        button2.setOnClickListener(this::buttonNum2);
        Button button3 = view.findViewById(R.id.buttonNum3);
        button3.setOnClickListener(this::buttonNum3);
        Button button4 = view.findViewById(R.id.buttonNum4);
        button4.setOnClickListener(this::buttonNum4);
        Button button5 = view.findViewById(R.id.buttonNum5);
        button5.setOnClickListener(this::buttonNum5);
        Button button6 = view.findViewById(R.id.buttonNum6);
        button6.setOnClickListener(this::buttonNum6);
        Button button7 = view.findViewById(R.id.buttonNum7);
        button7.setOnClickListener(this::buttonNum7);
        Button button8 = view.findViewById(R.id.buttonNum8);
        button8.setOnClickListener(this::buttonNum8);
        Button button9 = view.findViewById(R.id.buttonNum9);
        button9.setOnClickListener(this::buttonNum9);
        ImageButton buttonBack = view.findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(this::buttonBack);
        Button buttonZero = view.findViewById(R.id.buttonZero);
        buttonZero.setOnClickListener(this::buttonZero);
        Button buttonMinus = view.findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(this::buttonMinus);
        Button buttonPlus = view.findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(this::buttonPlus);
        Button buttonDivide = view.findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(this::buttonDivide);
        Button buttonMultiple = view.findViewById(R.id.buttonMultiple);
        buttonMultiple.setOnClickListener(this::buttonMulti);
        Button buttonNegate = view.findViewById(R.id.buttonNegate);
        buttonNegate.setOnClickListener(this::buttonNegate);
        Button buttonEqual = view.findViewById(R.id.buttonEqual);
        buttonEqual.setOnClickListener(this::buttonEqual);
        Button buttonC = view.findViewById(R.id.buttonC);
        buttonC.setOnClickListener(this::buttonC);
        Button buttonCE = view.findViewById(R.id.buttonCE);
        buttonCE.setOnClickListener(this::buttonCE);

        return view;
    }

    public void buttonZero(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            inputDisplay.setText("");
            resultDisplay.setText("0");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') return;
        curr += '0';
        resultDisplay.setText(curr);
    }

    public void buttonNum1(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            if(inputDisplay.getText().toString().indexOf('=') != -1) {
                inputDisplay.setText("");
            }
            resultDisplay.setText("1");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') {
            resultDisplay.setText("1");
            return;
        }
        curr += '1';
        resultDisplay.setText(curr);
    }

    public void buttonNum2(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            if(inputDisplay.getText().toString().indexOf('=') != -1) {
                inputDisplay.setText("");
            }
            resultDisplay.setText("2");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') {
            resultDisplay.setText("2");
            return;
        }
        curr += '2';
        resultDisplay.setText(curr);
    }

    public void buttonNum3(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            if(inputDisplay.getText().toString().indexOf('=') != -1) {
                inputDisplay.setText("");
            }
            resultDisplay.setText("3");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') {
            resultDisplay.setText("3");
            return;
        }
        curr += '3';
        resultDisplay.setText(curr);
    }

    public void buttonNum4(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            if(inputDisplay.getText().toString().indexOf('=') != -1) {
                inputDisplay.setText("");
            }
            resultDisplay.setText("4");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') {
            resultDisplay.setText("4");
            return;
        }
        curr += '4';
        resultDisplay.setText(curr);
    }

    public void buttonNum5(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            if(inputDisplay.getText().toString().indexOf('=') != -1) {
                inputDisplay.setText("");
            }
            resultDisplay.setText("5");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') {
            resultDisplay.setText("5");
            return;
        }
        curr += '5';
        resultDisplay.setText(curr);
    }

    public void buttonNum6(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            if(inputDisplay.getText().toString().indexOf('=') != -1) {
                inputDisplay.setText("");
            }
            resultDisplay.setText("6");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') {
            resultDisplay.setText("6");
            return;
        }
        curr += '6';
        resultDisplay.setText(curr);
    }

    public void buttonNum7(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            if(inputDisplay.getText().toString().indexOf('=') != -1) {
                inputDisplay.setText("");
            }
            resultDisplay.setText("7");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') {
            resultDisplay.setText("7");
            return;
        }
        curr += '7';
        resultDisplay.setText(curr);
    }

    public void buttonNum8(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            if(inputDisplay.getText().toString().indexOf('=') != -1) {
                inputDisplay.setText("");
            }
            resultDisplay.setText("8");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') {
            resultDisplay.setText("8");
            return;
        }
        curr += '8';
        resultDisplay.setText(curr);
    }

    public void buttonNum9(View view) {
        if(isShowingResult) {
            isShowingResult = false;
            if(inputDisplay.getText().toString().indexOf('=') != -1) {
                inputDisplay.setText("");
            }
            resultDisplay.setText("9");
            return;
        }
        String curr = resultDisplay.getText().toString();
        if(curr.length() == 1 && curr.charAt(0) == '0') {
            resultDisplay.setText("9");
            return;
        }
        curr += '9';
        resultDisplay.setText(curr);
    }

    private boolean checkSelecting() {
        String cur = inputDisplay.getText().toString();
        if(cur.length() < 2) return false;
        char c = cur.charAt(cur.length()-2);
        if(c == '+') return true;
        if(c == '-') return true;
        if(c == '×') return true;
        return c == '÷';
    }

    public void buttonPlus(View view) {
        String curr = inputDisplay.getText().toString();
        if(checkSelecting() && isShowingResult){
            int pos = curr.length()-2;
            curr = curr.substring(0, pos) + "+ ";
            inputDisplay.setText(curr);
        }
        else if(curr.indexOf('=') != -1) {
            inputDisplay.setText(resultDisplay.getText().toString() + " + ");
        }
        else if(curr.indexOf('+') == -1) {
            Calculate();
            curr = resultDisplay.getText().toString() + " + ";
            inputDisplay.setText(curr);
        }
        else {
            int sp = curr.indexOf(' ');
            String s1 = curr.substring(0, sp);
            String s2 = resultDisplay.getText().toString();
            if(!isShowingResult) {
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                String res = String.valueOf(i1+i2);
                resultDisplay.setText(res);
                inputDisplay.setText(res+" + ");
            }
        }
        isShowingResult = true;
    }

    public void buttonMinus(View view) {
        String curr = inputDisplay.getText().toString();
        if(checkSelecting() && isShowingResult){
            int pos = curr.length()-2;
            curr = curr.substring(0, pos) + "- ";
            inputDisplay.setText(curr);
        }
        else if(curr.indexOf('=') != -1) {
            inputDisplay.setText(resultDisplay.getText().toString() + " - ");
        }
        else if(curr.indexOf('-') == -1) {
            Calculate();
            curr = resultDisplay.getText().toString() + " - ";
            inputDisplay.setText(curr);
        }
        else {
            int sp = curr.indexOf(' ');
            String s1 = curr.substring(0, sp);
            String s2 = resultDisplay.getText().toString();
            if(!isShowingResult) {
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                String res = String.valueOf(i1-i2);
                resultDisplay.setText(res);
                inputDisplay.setText(res+" - ");
            }
        }
        isShowingResult = true;
    }

    public void buttonMulti(View view) {
        String curr = inputDisplay.getText().toString();
        if(checkSelecting() && isShowingResult){
            int pos = curr.length()-2;
            curr = curr.substring(0, pos) + "× ";
            inputDisplay.setText(curr);
        }
        else if(curr.indexOf('=') != -1) {
            inputDisplay.setText(resultDisplay.getText().toString() + " × ");
        }
        else if(curr.indexOf('×') == -1) {
            Calculate();
            curr = resultDisplay.getText().toString() + " × ";
            inputDisplay.setText(curr);
        }
        else {
            int sp = curr.indexOf(' ');
            String s1 = curr.substring(0, sp);
            String s2 = resultDisplay.getText().toString();
            if(!isShowingResult) {
                float i1 = Float.parseFloat(s1);
                float i2 = Float.parseFloat(s2);
                String res = String.valueOf(i1*i2);
                resultDisplay.setText(res);
                inputDisplay.setText(res+" × ");
            }
        }
        isShowingResult = true;
    }

    public void buttonDivide(View view) {
        String curr = inputDisplay.getText().toString();
        if(checkSelecting() && isShowingResult){
            int pos = curr.length()-2;
            curr = curr.substring(0, pos) + "÷ ";
            inputDisplay.setText(curr);
        }
        else if(curr.indexOf('=') != -1) {
            inputDisplay.setText(resultDisplay.getText().toString() + " ÷ ");
        }
        else if(curr.indexOf('÷') == -1) {
            Calculate();
            curr = resultDisplay.getText().toString() + " ÷ ";
            inputDisplay.setText(curr);
        }
        else {
            int sp = curr.indexOf(' ');
            String s1 = curr.substring(0, sp);
            String s2 = resultDisplay.getText().toString();
            if(!isShowingResult) {
                float i1 = Float.parseFloat(s1);
                float i2 = Float.parseFloat(s2);
                String res = String.valueOf(i1/i2);
                resultDisplay.setText(res);
                inputDisplay.setText(res+" ÷ ");
            }
        }
        isShowingResult = true;
    }

    public void buttonBack(View view) {
        if(!isShowingResult){
            String curr = resultDisplay.getText().toString();
            curr = curr.substring(0, curr.length()-1);
            if(curr.length() == 0) curr = "0";
            resultDisplay.setText(curr);
        }
    }

    public void buttonC(View view) {
        inputDisplay.setText("");
        resultDisplay.setText("0");
        prevCalc = "";
    }

    public void buttonCE(View view) {
        resultDisplay.setText("0");
        if(!checkSelecting()) {
            inputDisplay.setText("");
        }
    }

    public void buttonEqual(View view) {
        isShowingResult = true;
        String curr = inputDisplay.getText().toString();
        int equalPos = curr.indexOf('=');
        if(equalPos == -1) {
            if(checkSelecting()) {
                String s2 = resultDisplay.getText().toString();
                String s1 = inputDisplay.getText().toString();
                Calculate();
                inputDisplay.setText(s1 + s2 + " = ");
                int p1 = inputDisplay.getText().toString().indexOf(' ');
                int p2 = inputDisplay.getText().toString().indexOf('=');
                if (p1 != -1 && p2 != -1)
                    prevCalc = inputDisplay.getText().toString().substring(p1, p2 - 1);
                else prevCalc = "";
            }
            else if(!prevCalc.isEmpty()) {
                String copy = prevCalc;
                inputDisplay.setText(resultDisplay.getText().toString()+copy.substring(0,3));
                resultDisplay.setText(copy.substring(3));
                String s2 = resultDisplay.getText().toString();
                String s1 = inputDisplay.getText().toString();
                Calculate();
                inputDisplay.setText(s1+s2+" = ");
            }
            else {
                String s2 = resultDisplay.getText().toString();
                String s1 = inputDisplay.getText().toString();
                Calculate();
                inputDisplay.setText(s1+s2+" = ");
            }
        }
        else if(!prevCalc.isEmpty()) {
            String copy = prevCalc;
            inputDisplay.setText(resultDisplay.getText().toString()+copy.substring(0,3));
            resultDisplay.setText(copy.substring(3));
            String s2 = resultDisplay.getText().toString();
            String s1 = inputDisplay.getText().toString();
            Calculate();
            inputDisplay.setText(s1+s2+" = ");
        }

    }


    public void buttonNegate(View view) {
        String curr = resultDisplay.getText().toString();
        if(curr.charAt(0) == '-') curr = curr.substring(1);
        else curr = '-'+curr;
        if(isShowingResult) {
            inputDisplay.setText(curr + " = ");
            resultDisplay.setText(curr);
        }
        else {
            resultDisplay.setText(curr);
        }
    }

    public void Calculate() {
        String in1 = inputDisplay.getText().toString();
        String in2 = resultDisplay.getText().toString();

        int pos = in1.lastIndexOf(' ')-1;
        if(pos < 0) return;

        if(in1.charAt(pos) == '+') {
            String s1 = in1.substring(0, pos);
            String s2 = resultDisplay.getText().toString();
            float res = Float.parseFloat(s1) + Float.parseFloat(s2);
            if(((int) res) == res) {
                int ires = (int) res;
                inputDisplay.setText(String.valueOf(ires));
                resultDisplay.setText((String.valueOf(ires)));
            }
            else {
                inputDisplay.setText(s1);
                resultDisplay.setText((String.valueOf(res)));
            }
        }
        else if(in1.charAt(pos) =='-'){
            String s1 = in1.substring(0, pos);
            String s2 = resultDisplay.getText().toString();
            float res = Float.parseFloat(s1) - Float.parseFloat(s2);
            if(((int) res) == res) {
                int ires = (int) res;
                inputDisplay.setText(String.valueOf(ires));
                resultDisplay.setText((String.valueOf(ires)));
            }
            else {
                inputDisplay.setText(String.valueOf(res));
                resultDisplay.setText((String.valueOf(res)));
            }
        }
        else if(in1.charAt(pos) =='×'){
            String s1 = in1.substring(0, pos);
            String s2 = resultDisplay.getText().toString();
            float res = Float.parseFloat(s1) * Float.parseFloat(s2);
            if(((int) res) == res) {
                int ires = (int) res;
                inputDisplay.setText(String.valueOf(ires));
                resultDisplay.setText((String.valueOf(ires)));
            }
            else {
                inputDisplay.setText(String.valueOf(res));
                resultDisplay.setText((String.valueOf(res)));
            }
        }
        else if(in1.charAt(pos) =='÷'){
            String s1 = in1.substring(0, pos);
            String s2 = resultDisplay.getText().toString();
            float res = Float.parseFloat(s1) / Float.parseFloat(s2);
            if(((int) res) == res) {
                int ires = (int) res;
                inputDisplay.setText(String.valueOf(ires));
                resultDisplay.setText((String.valueOf(ires)));
            }
            else {
                inputDisplay.setText(String.valueOf(res));
                resultDisplay.setText((String.valueOf(res)));
            }
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}