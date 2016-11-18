package com.kystudio.learnsurfaceview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

/**
 * Created by 20236320 on 2016/11/18.
 */

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private Paint paint = null;

    public MySurfaceView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);
        getHolder().addCallback(this);
    }

    public void draw() {
        Canvas canvas = getHolder().lockCanvas();

        canvas.drawColor(Color.WHITE);
        canvas.drawCircle(200, 200, 50, paint);

        getHolder().unlockCanvasAndPost(canvas);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        draw();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
