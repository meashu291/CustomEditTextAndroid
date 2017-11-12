package com.androidcodehub.customedittext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;


@SuppressLint("AppCompatCustomView")
public class CustomEditText extends EditText {



        public CustomEditText(Context context) {
            super(context);
        }

        public CustomEditText(Context context, AttributeSet attrs) {
            super(context, attrs);
            parseAttributes(context, attrs);
        }

        public CustomEditText(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            parseAttributes(context, attrs);
        }

        private void parseAttributes(Context context, AttributeSet attrs) {
            TypedArray values = context.obtainStyledAttributes(attrs, R.styleable.CustomFont);

            values.recycle();


        }

    }




