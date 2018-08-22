package developer.mylibrary;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import java.io.FileNotFoundException;

/**
 * Created by developer on 5/4/18.
 */

public class CustomButton extends AppCompatButton {
    Context mContext;


    public CustomButton(Context context) throws FileNotFoundException {
        super(context);
        init(context, null, 0);
    }

    public CustomButton(Context context, AttributeSet attrs) throws FileNotFoundException {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        this.mContext = context;

//        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomButton, defStyle, 0);
//        if (typedArray != null) {
//            if (typedArray.hasValue(0)) {
//                String backgroundColor = typedArray.getString(R.styleable.CustomButton_button_type);
//                String colorName = typedArray.getString(R.styleable.CustomButton_button_text_color);
//
//                if (colorName != null && !colorName.equals("")) {
//                    /*if (colorName.equals("button_accept"))
//                        setTextColor(Color.parseColor(CL.getColor("accept_button_textcolor")));
//                    else if (colorName.equals("button_reject")) {
//                        setTextColor(Color.parseColor(CL.getColor("reject_button_textcolor")));
//                    } else {*/
//                        setTextColor(Color.parseColor(CL.getColor(colorName)));
//                } else {
//                    setTextColor(Color.parseColor(CL.getColor("accept_button_textcolor")));
//                }
//                if (backgroundColor != null && !backgroundColor.equals("")) {
//                    if (CL.getColor(backgroundColor) != null) {
//                      /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                            setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(CL.getColor(backgroundColor))));
//                        } else*/
//                            setBackgroundColor(Color.parseColor(CL.getColor(backgroundColor)));
//                    } else {
//                        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                            setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(CL.getColor("button_accept"))));
//                        } else*/
//                            setBackgroundColor(Color.parseColor(CL.getColor("button_accept")));
//                    }
//                }
//            } else {
//                setTextColor(Color.parseColor(CL.getColor("accept_button_textcolor")));
//                /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(CL.getColor("button_accept"))));
//                } else*/
//                    setBackgroundColor(Color.parseColor(CL.getColor("button_accept")));
//            }
//
//            typedArray.recycle();
//        } else {
//            Log.d("CustomButton", "TypedArray empty");
//        }
    }
}
