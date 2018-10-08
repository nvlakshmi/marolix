package com.example.admin.marolixtask;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        Fragment1 fragment1=new Fragment1();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame1,fragment1);


        Fragment2 fragment2=new Fragment2();
        FragmentManager fragmentManager1=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1=fragmentManager1.beginTransaction();
        fragmentTransaction1.add(R.id.frame2,fragment2);


        Fragmentweb fragmentweb=new Fragmentweb();
        FragmentManager fragmentManager3=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction3=fragmentManager3.beginTransaction();
        fragmentTransaction3.add(R.id.frameweb,fragmentweb);

        FragmentMarketing fragmentmarketing=new FragmentMarketing();
        FragmentManager fragmentManager4=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction4=fragmentManager4.beginTransaction();
        fragmentTransaction4.add(R.id.frame1marketing,fragmentmarketing);


        FragmentInterior fragmentinterior=new FragmentInterior();
        FragmentManager fragmentManager5=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction5=fragmentManager5.beginTransaction();
        fragmentTransaction5.add(R.id.frameinterior,fragmentinterior);


        Fragment3d fragment3d=new Fragment3d();
        FragmentManager fragmentManager6=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction6=fragmentManager6.beginTransaction();
        fragmentTransaction6.add(R.id.frame3d,fragment3d);


        FragmentContacts fragmentcontacts=new FragmentContacts();
        FragmentManager fragmentManager7=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction7=fragmentManager7.beginTransaction();
        fragmentTransaction7.add(R.id.framecontacts,fragmentcontacts);


        FragmentMobile fragmentmobile=new FragmentMobile();
        FragmentManager fragmentManager8=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction8=fragmentManager8.beginTransaction();
        fragmentTransaction8.add(R.id.framemobile,fragmentmobile);

    }
}
