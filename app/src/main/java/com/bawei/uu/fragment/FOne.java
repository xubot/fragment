package com.bawei.uu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Administrator on 2017/3/5.
 */

public class FOne extends Fragment {
    private String[]  arr=new String[]{"1","2","3"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.one, null);
        ListView listView= (ListView) view.findViewById(R.id.listview);
        listView.setAdapter(new ArrAdapter(getActivity(),arr));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FTwe fragment= (FTwe) manager.findFragmentById(R.id.frag2);
                fragment.setData(arr[position]);
            }
        });

        return view;
    }
}
