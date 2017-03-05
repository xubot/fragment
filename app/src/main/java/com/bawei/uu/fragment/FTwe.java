package com.bawei.uu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/5.
 */

public class FTwe extends Fragment{

    private TextView textView;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.twe, null);
        textView = (TextView) view.findViewById(R.id.twe1);
        return view;
    }
    public void setData(String name)
    {
        textView.setText(name);
    }
}
