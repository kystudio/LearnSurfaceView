package com.kystudio.learnsurfaceview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by 20236320 on 2016/11/18.
 */

public class Rect extends Container {
    private Paint paint = null;

    public Rect() {
        paint = new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    public void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.drawRect(0, 0, 100, 100, paint);
        this.setY(this.getY() + 1);
    }
}
