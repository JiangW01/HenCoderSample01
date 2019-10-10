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
class PracticeDrawArcView @JvmOverloads constructor(
    ctz: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
):View(ctz,attributeSet,defStyle){


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = Color.BLACK
        canvas.drawArc(100f,100f,300f,300f,0f,60f,true,paint)

        paint.style = Paint.Style.STROKE
        paint.strokeWidth = dip2Px(3f)
        canvas.drawArc(100f,400f,600f,800f,80f,200f,false,paint)

        paint.style = Paint.Style.STROKE
        paint.strokeWidth = dip2Px(3f)
        canvas.drawArc(500f,200f,1000f,600f,80f,100f,true,paint)

        paint.style = Paint.Style.FILL
        canvas.drawArc(500f,100f,1000f,400f,200f,100f,true,paint)
    }


}