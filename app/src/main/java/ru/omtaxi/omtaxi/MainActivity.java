package ru.omtaxi.omtaxi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, 0, 0);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (id == R.id.nav_online) {
            Toast.makeText(drawer.getContext(), "@string/online", Toast.LENGTH_LONG);

        } else if (id == R.id.nav_instructions) {
            Toast.makeText(drawer.getContext(), "@string/instructions", Toast.LENGTH_LONG);

        } else if (id == R.id.nav_conditions) {
            Toast.makeText(drawer.getContext(), "@string/conditions", Toast.LENGTH_LONG);

        } else if (id == R.id.nav_contacts) {
            Toast.makeText(drawer.getContext(), "@string/contacts", Toast.LENGTH_LONG);

        } else if (id == R.id.nav_share) {
            Toast.makeText(drawer.getContext(), "@string/share", Toast.LENGTH_LONG);

        } else if (id == R.id.nav_send) {
            Toast.makeText(drawer.getContext(), "@string/send", Toast.LENGTH_LONG);
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void OnClick(View item)
    {
        int id = item.getId();

        // Main activity
        if (id == R.id.btn_online) {
            Toast.makeText(item.getContext(), "@string/online", Toast.LENGTH_LONG);

        } else if (id == R.id.btn_instructions) {
            Toast.makeText(item.getContext(), "@string/instructions", Toast.LENGTH_LONG);

        } else if (id == R.id.btn_conditions) {
            Toast.makeText(item.getContext(), "@string/conditions", Toast.LENGTH_LONG);

        } else if (id == R.id.btn_contacts) {
            Toast.makeText(item.getContext(), "@string/contacts", Toast.LENGTH_LONG);

        // Instructions
        } else if (id == R.id.btn_install) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=ru.yandex.taximeter"));
            startActivity(browserIntent);

        } else if (id == R.id.btn_photocontrol) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://driver.yandex/photocontrol/"));
            startActivity(browserIntent);

        } else if (id == R.id.btn_firsttrip) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://driver.yandex/урок-№1/"));
            startActivity(browserIntent);

        } else if (id == R.id.btn_noorders) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://driver.yandex/block-new/"));
            startActivity(browserIntent);

        } else if (id == R.id.btn_faq) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://driver.yandex/новичку/"));
            startActivity(browserIntent);
        }

    }
}