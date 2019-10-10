package demo.wj.hencodersample01

import android.view.View

/**
 * 作者 ：wangJiang
 * 时间 ：2019/10/9
 * 描述 ：
 */


fun View.dip2Px(dpValue: Float): Float {
    val scale = this.context.resources.displayMetrics.density
    return dpValue * scale + 0.5f
}