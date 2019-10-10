package demo.wj.hencodersample01.practice

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

/**
 * 作者 ：wangJiang
 * 时间 ：2019/10/9
 * 描述 ：
 */
class PracticeDrawPathView @JvmOverloads constructor(
    ctz: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
) : View(ctz, attributeSet, defStyle) {


    val path = Path()

    init {
        path.addArc(200f, 200f, 400f, 400f, -225f, 225f)
        path.arcTo(400f, 200f, 600f, 400f, -180f, 225f, false)
        path.lineTo(400f, 542f)
    }



    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = Color.BLACK
        canvas.drawPath(path,paint)
    }


}