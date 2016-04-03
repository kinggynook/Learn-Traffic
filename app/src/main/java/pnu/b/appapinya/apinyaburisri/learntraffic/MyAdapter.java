package pnu.b.appapinya.apinyaburisri.learntraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apinyaburisri on 4/3/2016 AD.
 */
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context context;
    private String[] titleStrings, descriptionStrings;

    private int[] iconInts;

    public MyAdapter(Context context,
                     int[] iconInts,
                     String[] descriptionStrings,
                     String[] titleStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.descriptionStrings = descriptionStrings;
        this.titleStrings = titleStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length;  //นับรูปได้เท่าไหร่ จะสร้าง listview ตาม icon
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //เปิ
        //ทำการขอเปิด service เช่น การต่อกล้อง
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);//สร้าง view

        // FOR TextView
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);//เชื่อม listview กับ code
        titleTextView.setText(titleStrings[i]);
        TextView descripTextView = (TextView) view1.findViewById(R.id.textView3);
        descripTextView.setText(descriptionStrings[i]);

        //FOR Image
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);//เปลี่ยนแหล่งกำเนิดของภาพ


        return view1;
    }
}//Main Class
