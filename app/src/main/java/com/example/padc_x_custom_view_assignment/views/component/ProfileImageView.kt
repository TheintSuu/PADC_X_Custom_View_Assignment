package com.example.padc_x_custom_view_assignment.views.component

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import com.example.padc_x_custom_view_assignment.R
import androidx.core.content.withStyledAttributes

class ProfileImageView @JvmOverloads  constructor(
    context : Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
)  : AppCompatImageView(context, attrs, defStyleAttr){

    private var cornerRadius = 0f
    private var borderWidth = 5f
    private var borderColor = Color.BLUE

    private val path = Path()

    init {

        context.withStyledAttributes(attrs, R.styleable.ProfileImageView) {
            cornerRadius = getDimension(R.styleable.ProfileImageView_cornerRadius, 0f)
            borderColor = getColor(R.styleable.ProfileImageView_borderColor, borderColor)
        }


    }
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        // Paint styles used for rendering are initialized here. This
        // is a performance optimization, since onDraw() is called
        // for every screen refresh.
        style = Paint.Style.STROKE

        color = borderColor

        strokeWidth = borderWidth
    }

    override fun onDraw(canvas: Canvas) {

        // val rectangle = RectF(0f, 0f, width.toFloat(), height.toFloat())

        val size = width.toFloat()
        val radius  = size/2

        canvas.drawCircle(size / 2f, size / 2f, radius - borderWidth / 2f, paint)

        // path.addRoundRect(rectangle, cornerRadius, cornerRadius, Path.Direction.CCW)


        super.onDraw(canvas)
    }


}