package com.example.mirimgridviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {

    public GridAdapter(Context c){
        Context context;
        int[] context;
        int[] imgRes = {R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5,
                R.drawable.m6, R.drawable.m7, R.drawable.m8, R.drawable.m9, R.drawable.m10,
                R.drawable.m11, R.drawable.m12, R.drawable.m13, R.drawable.m14, R.drawable.m15,
                R.drawable.m16, R.drawable.m17, R.drawable.m18};
        public GridAdapter(Context context){
            this.context = context;
        }
    }

    @Override
    public int getCount() {
        return 0;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new GridView.LayoutParams(300, 400));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5, 5, 5, 5);
        imgv.setImageResource(imgRes[position]);

        return imgv;
    }
}
