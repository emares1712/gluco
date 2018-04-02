package com.example.ninte.glucometric;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Glucosa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new gluco(this));
    }
    public class gluco extends View {

        public gluco(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            Paint pincel = new Paint();

            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.FILL);
            canvas.drawCircle(175,175,100,pincel);

        }
    }
}
