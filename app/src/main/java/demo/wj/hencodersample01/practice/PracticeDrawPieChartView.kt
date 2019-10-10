package demo.wj.hencodersample01.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import demo.wj.hencodersample01.dip2Px

/**
 * 作者 ：wangJiang
 * 时间 ：2019/10/9
 * 描述 ：
 */
class PracticeDrawPieChartView @JvmOverloads constructor(
    ctz: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
):View(ctz,attributeSet,defStyle){


    private val radiusX = dip2Px(150f)
    private val radiusY = dip2Px(150f)
    private val radius = dip2Px(100f)
    private val oval = RectF(dip2Px(50f),dip2Px(50f),dip2Px(250f),dip2Px(250f))


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.parseColor("#333333"))
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        canvas.save()
        canvas.translate(-dip2Px(2f),dip2Px(2f))
        paint.color = Color.BLUE
        canvas.drawArc(oval,80f,105f,true,paint)
        canvas.restore()
        canvas.save()
        canvas.translate(-dip2Px(8f),-dip2Px(8f))
        paint.color = Color.RED
        canvas.drawArc(oval,185f,120f,true,paint)
        canvas.restore()
        canvas.save()
        paint.color = Color.YELLOW
        canvas.drawArc(oval,305f,55f,true,paint)
        canvas.restore()
        canvas.save()
        canvas.translate(dip2Px(1f),dip2Px(1f))
        paint.color = Color.GRAY
        canvas.drawArc(oval,0f,10f,true,paint)
        canvas.restore()
        canvas.save()
        paint.color = Color.DKGRAY
        canvas.drawArc(oval,10f,10f,true,paint)
        canvas.restore()
        canvas.save()
        canvas.translate(dip2Px(2f),dip2Px(2f))
        paint.color = Color.LTGRAY
        canvas.drawArc(oval,20f,60f,true,paint)
        canvas.restore()
    }


}