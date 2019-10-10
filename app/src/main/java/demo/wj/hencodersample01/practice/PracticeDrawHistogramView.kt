package demo.wj.hencodersample01.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View
import demo.wj.hencodersample01.dip2Px

/**
 * 作者 ：wangJiang
 * 时间 ：2019/10/9
 * 描述 ：
 */
class PracticeDrawHistogramView @JvmOverloads constructor(
    ctz: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
) : View(ctz, attributeSet, defStyle) {


    private val linePaint by lazy {
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.strokeWidth = dip2Px(1f)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint
    }


    private val histogramPaint by lazy {
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        paint
    }

    private val rectWidth = dip2Px(40f).toInt()
    private val divider = dip2Px(10f)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.parseColor("#333333"))
        canvas.save()
        canvas.translate(5f, 40f)
        canvas.drawLine(0f, 0f, 0f, 600f, linePaint)
        canvas.drawLine(0f, 600f, 1800f, 600f, linePaint)
        drawRect(canvas, Rect(0,590,rectWidth,600),0)
        drawRect(canvas, Rect(0,570,rectWidth,600),1)
        drawRect(canvas, Rect(0,570,rectWidth,600),2)
        drawRect(canvas, Rect(0,400,rectWidth,600),3)
        drawRect(canvas, Rect(0,200,rectWidth,600),4)
        drawRect(canvas, Rect(0,100,rectWidth,600),5)
        drawRect(canvas, Rect(0,350,rectWidth,600),6)
        canvas.restore()
    }

    private fun drawRect(canvas: Canvas, rect: Rect, index: Int) {
        canvas.save()
        canvas.translate((index + 1) * divider + index * rect.width(), 0f)
        canvas.drawRect(rect, histogramPaint)
        canvas.restore()
    }


}