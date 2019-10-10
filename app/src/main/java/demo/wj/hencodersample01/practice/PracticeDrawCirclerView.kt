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
class PracticeDrawCirclerView @JvmOverloads constructor(
    ctz: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
):View(ctz,attributeSet,defStyle){


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = Color.BLACK
        canvas.drawCircle(dip2Px(100f),dip2Px(50f),dip2Px(50f),paint)

        paint.style = Paint.Style.STROKE
        paint.strokeWidth = dip2Px(3f)
        canvas.drawCircle(dip2Px(230f),dip2Px(50f),dip2Px(50f),paint)

        paint.color = Color.BLUE
        paint.style = Paint.Style.FILL
        canvas.drawCircle(dip2Px(100f),dip2Px(180f),dip2Px(50f),paint)

        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = dip2Px(20f)
        canvas.drawCircle(dip2Px(230f),dip2Px(180f),dip2Px(50f),paint)

    }


}