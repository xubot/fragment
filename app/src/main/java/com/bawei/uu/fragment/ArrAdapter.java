package com.bawei.uu.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/5.
 */
public class ArrAdapter extends BaseAdapter
{
    private final FragmentActivity activity;
    private final String[] arr;

    public ArrAdapter(FragmentActivity activity, String[] arr) {
        this.activity = activity;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.length;
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
        convertView=View.inflate(activity,R.layout.listciew,null);
        TextView title= (TextView) convertView.findViewById(R.id.textview);
        title.setText(arr[position]);
        return convertView;
    }
}
