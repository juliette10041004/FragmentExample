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
public class FragmentTwo extends Fragment {


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // setting image resource from drawable

        //ImageView image = new ImageView(getActivity());
        //image.setImageResource(R.drawable.dog2);

       // return inflater.inflate(R.layout.fragment_two, container, false);

        View V = inflater.inflate(R.layout.fragment_two, container, false);
        ImageView image = (ImageView)V.findViewById(R.id.imageView2);
        image.setImageResource(R.drawable.dog2);
        return V;
    }


}
