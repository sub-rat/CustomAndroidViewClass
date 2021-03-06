package np.com.subratgyawali.customviewandroidsample.customview

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import np.com.subratgyawali.customviewandroidsample.R

class CustomView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout(context, attrs) {

    init {

        val a = context.obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0)
        val target = a.getString(R.styleable.CustomView_target)
        val achievement = a.getString(R.styleable.CustomView_achievement)
        val progress = a.getInt(R.styleable.CustomView_progress,0)
        val title = a.getString(R.styleable.CustomView_title)
        a.recycle()

        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.view_color_options, this, true)
        (getChildAt(0) as TextView).text = title
        (getChildAt(1) as ProgressBar).progress = progress
        (getChildAt(3) as TextView).text = achievement
        (getChildAt(4) as TextView).text = target
    }

}