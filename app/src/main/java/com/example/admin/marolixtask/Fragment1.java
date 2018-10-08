package com.example.admin.marolixtask;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Fragment1 extends Fragment {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        Log.i("onAttach", "called");
        imageView1=view.findViewById(R.id.image1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentMobile fragmentmobile=new FragmentMobile();
                FragmentManager fragmentManager6=getFragmentManager();
                FragmentTransaction fragmentTransaction6=fragmentManager6.beginTransaction();
                fragmentTransaction6.replace(R.id.frame,fragmentmobile);
                fragmentTransaction6.commit();


            }
        });
        imageView2=view.findViewById(R.id.image2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentMarketing fragmentmarketing=new FragmentMarketing();
                FragmentManager fragmentManager4=getFragmentManager();
                FragmentTransaction fragmentTransaction4=fragmentManager4.beginTransaction();
                fragmentTransaction4.replace(R.id.frame,fragmentmarketing);
                fragmentTransaction4.commit();

            }
        });
        imageView3=view.findViewById(R.id.image3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment3d fragment3d=new Fragment3d();
                FragmentManager fragmentManager7=getFragmentManager();
                FragmentTransaction fragmentTransaction7=fragmentManager7.beginTransaction();
                fragmentTransaction7.replace(R.id.frame,fragment3d);
                fragmentTransaction7.commit();


            }
        });

        imageView4=view.findViewById(R.id.image4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment2 fragment2 = new Fragment2();
                FragmentManager managerQ= getFragmentManager();
                FragmentTransaction transaction1 = managerQ.beginTransaction();
                transaction1.replace( R.id.frame,fragment2 );
                transaction1.commit();

            }
        });

        imageView5=view.findViewById(R.id.image5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentInterior fragmentinterior=new FragmentInterior();
                FragmentManager fragmentManager5=getFragmentManager();
                FragmentTransaction fragmentTransaction5=fragmentManager5.beginTransaction();
                fragmentTransaction5.replace(R.id.frame,fragmentinterior);
                fragmentTransaction5.commit();



            }
        });




        return view;

    }
}
