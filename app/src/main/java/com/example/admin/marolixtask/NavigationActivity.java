package com.example.admin.marolixtask;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        final AlertDialog.Builder builder=new AlertDialog.Builder(NavigationActivity.this);
        builder.setTitle("Are you want to open this website");
        builder.setMessage("Marolix.com");
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                webView=findViewById(R.id.web);
                WebSettings webSettings=webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.loadUrl("http://www.marolix.com");

            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.show();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Fragment1 fragment1 = new Fragment1();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add( R.id.frame,fragment1 );
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Home) {
           // webView.setVisibility(View.GONE);
            Fragment1 fragment1 = new Fragment1();
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace( R.id.frame,fragment1 );
            transaction.commit();
            // Handle the camera action
        } else if (id == R.id.nav_about) {
           // webView.setVisibility(View.GONE);
            Fragment2 fragment2 = new Fragment2();
            FragmentManager managerQ= getSupportFragmentManager();
            FragmentTransaction transaction1 = managerQ.beginTransaction();
            transaction1.replace( R.id.frame,fragment2 );
            transaction1.commit();

        } else if (id == R.id.nav_web) {
            //webView.setVisibility(View.GONE);
            Fragmentweb fragmentweb=new Fragmentweb();
            FragmentManager fragmentManager3=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction3=fragmentManager3.beginTransaction();
            fragmentTransaction3.replace(R.id.frame,fragmentweb);
            fragmentTransaction3.commit();



        } else if (id == R.id.nav_marketing) {
          //  webView.setVisibility(View.GONE);
            FragmentMarketing fragmentmarketing=new FragmentMarketing();
            FragmentManager fragmentManager4=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction4=fragmentManager4.beginTransaction();
            fragmentTransaction4.replace(R.id.frame,fragmentmarketing);
            fragmentTransaction4.commit();

        } else if (id == R.id.nav_Interior) {
           // webView.setVisibility(View.GONE);
            FragmentInterior fragmentinterior=new FragmentInterior();
            FragmentManager fragmentManager5=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction5=fragmentManager5.beginTransaction();
            fragmentTransaction5.replace(R.id.frame,fragmentinterior);
            fragmentTransaction5.commit();


        } else if (id == R.id.nav_mobile) {
            //webView.setVisibility(View.GONE);
            FragmentMobile fragmentmobile=new FragmentMobile();
            FragmentManager fragmentManager6=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction6=fragmentManager6.beginTransaction();
            fragmentTransaction6.replace(R.id.frame,fragmentmobile);
            fragmentTransaction6.commit();



        } else if (id == R.id.nav_3dprint) {
            //webView.setVisibility(View.GONE);
            Fragment3d fragment3d=new Fragment3d();
            FragmentManager fragmentManager7=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction7=fragmentManager7.beginTransaction();
            fragmentTransaction7.replace(R.id.frame,fragment3d);
            fragmentTransaction7.commit();


        } else if (id == R.id.nav_contact) {
           // webView.setVisibility(View.GONE);
            FragmentContacts fragmentcontacts=new FragmentContacts();
            FragmentManager fragmentManager8=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction8=fragmentManager8.beginTransaction();
            fragmentTransaction8.replace(R.id.frame,fragmentcontacts);
            fragmentTransaction8.commit();



        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
