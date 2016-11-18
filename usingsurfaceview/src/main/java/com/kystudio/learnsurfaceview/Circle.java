package com.kystudio.learnsurfaceview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by 20236320 on 2016/11/18.
 */

public class Circle extends Container {
    private Paint paint = null;

    public Circle() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    public void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.drawCircle(50, 50, 50, paint);
    }
}
