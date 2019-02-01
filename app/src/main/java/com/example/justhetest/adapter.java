package com.example.justhetest;

import android.content.Context;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.justhetest.R;

import java.util.ArrayList;

public class adapter extends BaseAdapter {

    private Context mContext;

    public Integer[] drawableId = {
            R.drawable.nounbathroom,
            R.drawable.nounclothesiron,
            R.drawable.noundiningtable,
            R.drawable.noundoublebed
    };

    public adapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return drawableId.length;
    }

    @Override
    public Object getItem(int position) {
        return drawableId[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(drawableId[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(16 , 16 , 16 , 16);
        imageView.setLayoutParams(new GridView.LayoutParams(200 , 200));
        return imageView;
    }
}
