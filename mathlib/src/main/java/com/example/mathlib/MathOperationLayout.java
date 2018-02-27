package com.example.mathlib;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by Smartec on 2/27/2018.
 */

public class MathOperationLayout extends LinearLayout {

    public static EditText num1;
    public static EditText num2;
    public static Button doOperation;

    public MathOperationLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        View view = View.inflate(context, R.layout.math_activity, this);
        num1 = (EditText) view.findViewById(R.id.editText);
        num2 = (EditText) view.findViewById(R.id.editText2);
        doOperation = (Button) view.findViewById(R.id.button);
    }

    public static EditText getNum1() {
        return num1;
    }

    public static EditText getNum2() {
        return num2;
    }

    public static Button getDoOperation() {
        return doOperation;
    }
}
