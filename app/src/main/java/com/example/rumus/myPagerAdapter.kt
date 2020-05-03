import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.rumus.firstfragment
import com.example.rumus.secondFragment
import com.example.rumus.thirdFragment


class MyPagerAdapter(fm:FragmentManager): FragmentPagerAdapter(fm){
    private val pages= listOf(
        firstfragment(),
        secondFragment(),
        thirdFragment()
    )
    override fun getItem(position: Int):Fragment{
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override  fun getPageTitle(position: Int): CharSequence?{
        return when(position){
            0->"first tab"
                1->"second tab"
                else->"thirdtab"
        }
    }


}
