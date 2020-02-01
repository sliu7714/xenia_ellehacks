package com.example.ellehacks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class HomepageActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        if (findViewById(R.id.FragmentContainer)!=null)
        {
            // setting up the default fragment to be home
            if (savedInstanceState != null)
            {
                return;
            }
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

            //HomepageFragment homepageFragment = new HomepageFragment();
            HomeFragment homeFragment = new HomeFragment();

            //fragmentTransaction.add(R.id.FragmentContainer, homepageFragment, null);
            fragmentTransaction.add(R.id.FragmentContainer, homeFragment, null);
            fragmentTransaction.commit();

            // changing fragment to profile if profile icon on bottom bar is clicked
            ImageButton profileButton = (ImageButton)findViewById(R.id.profile_btn_bottom_bar);
            profileButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HomepageActivity.fragmentManager.beginTransaction()
                            .replace(R.id.FragmentContainer,new ProfileFragment(), null)
                            .addToBackStack(null)
                            .commit();
                }
            });

            // changing fragment to explore if magnifiying glass icon on bottom bar is clicked
            ImageButton exploreButton = (ImageButton)findViewById(R.id.explore_btn_bottom_bar);
            profileButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HomepageActivity.fragmentManager.beginTransaction()
                            .replace(R.id.FragmentContainer,new ExploreFragment(), null)
                            .addToBackStack(null)
                            .commit();
                }
            });

            // changing fragment to post (upload post) if plus icon on bottom bar is clicked
            ImageButton postButton = (ImageButton)findViewById(R.id.post_btn_bottom_bar);
            profileButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HomepageActivity.fragmentManager.beginTransaction()
                            .replace(R.id.FragmentContainer,new PostFragment(), null)
                            .addToBackStack(null)
                            .commit();
                }
            });

            // changing fragment to home if home icon on bottom bar is clicked
            ImageButton homeButton = (ImageButton)findViewById(R.id.home_btn_bottom_bar);
            profileButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HomepageActivity.fragmentManager.beginTransaction()
                            .replace(R.id.FragmentContainer,new HomeFragment(), null)
                            .addToBackStack(null)
                            .commit();
                }
            });
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
