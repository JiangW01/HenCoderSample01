package demo.wj.hencodersample01.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import demo.wj.hencodersample01.dip2Px

/**
 * 作者 ：wangJiang
 * 时间 ：2019/10/9
 * 描述 ：
 */
class PracticeDrawPointView @JvmOverloads constructor(
    ctz: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
):View(ctz,attributeSet,defStyle){


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = dip2Px(45f)
        paint.strokeCap = Paint.Cap.ROUND
        canvas.drawPoint(100f,300f,paint)

        val paint1 = Paint(Paint.ANTI_ALIAS_FLAG)
        paint1.color = Color.BLACK
        paint1.style = Paint.Style.STROKE
        paint1.strokeWidth = dip2Px(45f)
        canvas.drawPoint(600f,300f,paint1)
    }


}