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
class PracticeDrawRoundRectView @JvmOverloads constructor(
    ctz: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
):View(ctz,attributeSet,defStyle){


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = Color.BLACK
        canvas.drawRoundRect(100f,100f,400f,600f,dip2Px(10f),dip2Px(10f),paint)
    }


}