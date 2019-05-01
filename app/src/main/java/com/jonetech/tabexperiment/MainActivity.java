package com.jonetech.tabexperiment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar fToolbar;
    private TabLayout fTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fToolbar = findViewById(R.id.toolbar);

        setSupportActionBar(fToolbar);

        // Create an instance of the tab layout
        fTabLayout = findViewById(R.id.tabs_layout);

        // Add tab to tab_layout
        fTabLayout.addTab(fTabLayout.newTab().setText(R.string.tab_label1));
        fTabLayout.addTab(fTabLayout.newTab().setText(R.string.tab_label2));
        fTabLayout.addTab(fTabLayout.newTab().setText(R.string.tab_label3));
        

        // set tab to fill the entire layout
        fTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Use page adapter to manage views in the fragments
        final ViewPager fViewPager = findViewById(R.id.view_pager);

        final PageAdapter mPageAdapter = new PageAdapter(getSupportFragmentManager(),fTabLayout.getTabCount());

        fViewPager.setAdapter(mPageAdapter);

        fViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(fTabLayout));

        fTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                fViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
