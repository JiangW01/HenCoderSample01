package demo.wj.hencodersample01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {


    var pageModels: MutableList<PageModel> = arrayListOf(
        PageModel(R.layout.sample_color, R.string.title_draw_color, R.layout.practice_color),
        PageModel(R.layout.sample_circle, R.string.title_draw_circle, R.layout.practice_circle),
        PageModel(R.layout.sample_rect, R.string.title_draw_rect, R.layout.practice_rect),
        PageModel(R.layout.sample_point, R.string.title_draw_point, R.layout.practice_point),
        PageModel(R.layout.sample_oval, R.string.title_draw_oval, R.layout.practice_oval),
        PageModel(R.layout.sample_line, R.string.title_draw_line, R.layout.practice_line),
        PageModel(R.layout.sample_round_rect, R.string.title_draw_round_rect, R.layout.practice_round_rect),
        PageModel(R.layout.sample_arc, R.string.title_draw_arc, R.layout.practice_arc),
        PageModel(R.layout.sample_path, R.string.title_draw_path, R.layout.practice_path),
        PageModel(R.layout.sample_histogram, R.string.title_draw_histogram, R.layout.practice_histogram),
        PageModel(R.layout.sample_pie_chart, R.string.title_draw_pie_chart, R.layout.practice_pie_chart)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.setAdapter(object : FragmentPagerAdapter(supportFragmentManager) {

            override fun getItem(position: Int): Fragment {
                val pageModel = pageModels.get(position)
                return PageFragment.newInstance(
                    pageModel.sampleLayoutRes,
                    pageModel.practiceLayoutRes
                )
            }

            override fun getCount(): Int {
                return pageModels.size
            }

            override fun getPageTitle(position: Int): CharSequence? {
                return getString(pageModels[position].titleRea)
            }
        })
        tablayout.setupWithViewPager(viewpager)
    }

}
