package com.example.student.fragmentexample;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


       // return inflater.inflate(R.layout.fragment_one, container, false);
        View V = inflater.inflate(R.layout.fragment_one, container, false);
        ImageView image = (ImageView)V.findViewById(R.id.imageView1);
        image.setImageResource(R.drawable.dog1);
       // image.setColorFilter();
        return V;
    }



}
