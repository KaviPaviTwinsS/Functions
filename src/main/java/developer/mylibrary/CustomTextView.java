package developer.mylibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import java.io.FileNotFoundException;
import java.util.WeakHashMap;


/**
 * Created by Vimal on 27/12/17.
 */

public class CustomTextView extends AppCompatTextView {
    private static final int HTML_STYLE_STRIKE_THROUGH = 0;
    private static WeakHashMap<String, Typeface> fontMap = new WeakHashMap();
    Context mContext;


    public CustomTextView(Context context) throws FileNotFoundException {
        super(context);
        init(context, null, 0);
    }

    public CustomTextView(Context context, AttributeSet attrs) throws FileNotFoundException {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        this.mContext = context;

//        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView, defStyle, 0);
//        if (typedArray != null) {
//            if (typedArray.hasValue(0)) {
//                String bg_colorName = typedArray.getString(R.styleable.CustomTextView_text_type);
//                String colorName = typedArray.getString(R.styleable.CustomTextView_text_color);
//                try {
//                    if (!colorName.equals("") && TaxiUtil.COLORJSON != null) {
//                        setTextColor(Color.parseColor(TaxiUtil.COLORJSON.getString(colorName)));
//
//                    } else {
//                        setTextColor(Color.parseColor(TaxiUtil.COLORJSON.getString("text_unselected")));
//                    }
//                    if (bg_colorName != null) {
//                        if (!bg_colorName.equals("") && !colorName.equals("")) {
//                            setBackgroundColor(Color.parseColor(CL.getColor(bg_colorName)));
//                            setTextColor(Color.parseColor(CL.getColor(colorName)));
//                        }else if (!bg_colorName.equals("")){
//                            setBackgroundColor(Color.parseColor(CL.getColor(bg_colorName)));
//                            if (bg_colorName.equals("button_accept"))
//                                setTextColor(Color.parseColor(CL.getColor("accept_button_textcolor")));
//                            else if (bg_colorName.equals("button_reject")) {
//                                setTextColor(Color.parseColor(CL.getColor("reject_button_textcolor")));
//                            }
//                        }
//                    }
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            } else {
//                setTextColor(Color.parseColor(CL.getColor("text_normal")));
//            }
//
//            typedArray.recycle();
//        } else {
//            Log.d("customCame9", "kjhkdhsfkjj");
//        }
    }

//    public void setChecked() {
//        GradientDrawable shape = new GradientDrawable();
//        shape.setShape(GradientDrawable.RECTANGLE);
//        shape.setCornerRadii(new float[]{8, 8, 8, 8, 8, 8, 8, 8});
//        shape.setColor(Color.WHITE);
//        shape.setStroke(3, Color.parseColor(CL.getColor("button_accept")));
//
//        this.setTextColor(Color.parseColor(CL.getColor("button_accept")));
//        this.setBackground(shape);
//
//    }
//
//    public void setUnChecked() {
//
//        this.setBackgroundColor(Color.parseColor(CL.getColor("text_background_color")));
//    }
}

//    if (colorName.equals("highlightcolor")) {
//            setTextColor(Color.parseColor(CL.getColor("text_highlighted")));
//            }else if (colorName.equals("normal")) {
//            setTextColor(Color.parseColor(CL.getColor("text_normal")));
//            }else if (colorName.equals("button_accept")){
//            setTextColor(Color.parseColor(CL.getColor("button_accept")));
//            }else if (colorName.equals("headerText")){
//            setTextColor(Color.parseColor(CL.getColor("header_textColor")));
//            } else {
//            setTextColor(Color.parseColor(CL.getColor("text_normal")));
//            }