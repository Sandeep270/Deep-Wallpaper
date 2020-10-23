package com.DeepWallpaper.Wallpaper.deepwallpapersapp;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;
    private List<Custom_Items> list;
    public CustomAdapter adapter;
    private Toolbar toolbar;
    private TextView textView;
    NetworkInfo info;
    ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        dialog = new ProgressDialog(this);


        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(CONNECTIVITY_SERVICE);
        info = cm.getActiveNetworkInfo();
        if (info != null) {


            Toast.makeText(MainActivity.this, "Loading..", Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(this, "No Internet Connection!", Toast.LENGTH_LONG).show();

        }

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        list = new ArrayList<>();


        list.add(new Custom_Items("https://images.pexels.com/photos/1535162/pexels-photo-1535162.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1156684/pexels-photo-1156684.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-003-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1366919/pexels-photo-1366919.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1236701/pexels-photo-1236701.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://images.pexels.com/photos/1433052/pexels-photo-1433052.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-001-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-002-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-004-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-005-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-006-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-007-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-008-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-009-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-010-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-011-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-012-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-013-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-014-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-015-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-016-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-017-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-018-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-019-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-020-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-021-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-022-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-023-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-024-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-025-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-026-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-027-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-028-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-029-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-030-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-031-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-032-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-033-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-034-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-035-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-036-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-037-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-038-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-039-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-040-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-041-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-042-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-043-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-044-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-045-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-046-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-047-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-048-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-049-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-050-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-051-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-052-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-053-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-054-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-055-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-056-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-057-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-058-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-059-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-060-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-061-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-062-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-063-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-064-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-065-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-066-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-067-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-068-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-069-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-070-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-071-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-072-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-073-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-074-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-075-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-076-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-077-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-078-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-079-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-080-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-081-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-082-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-083-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-084-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-085-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-086-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-087-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-088-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-089-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-090-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-091-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-092-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-093-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-094-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-095-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-096-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-097-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-098-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-099-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-100-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-101-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-102-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-103-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-104-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-105-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-106-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-107-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-108-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-109-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-110-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-111-1080x2340-254x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/03/3D-Phone-Wallpaper-112-1080x2340.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-01-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-02-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-03-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-04-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-05-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-06-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-08-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-09-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-10-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-11-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-12-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-13-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-14-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-15-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-16-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-17-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-18-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-19-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-20-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-21-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-22-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-23-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-24-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-25-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-26-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-27-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-28-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-29-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-30-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-31-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-32-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-33-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-35-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-36-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-37-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-38-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-39-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-40-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-41-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-42-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-43-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-44-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-45-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-46-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-47-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-48-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-49-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-50-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-51-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/11/PUBG-Phone-Wallpaper-07-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-01-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-02-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-03-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-04-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-05-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-06-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-07-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-08-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-09-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-10-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-11-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-12-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-12-1080x2160.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-13-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-14-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-15-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-16-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-17-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-18-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-19-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-20-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-21-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-22-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-23-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-24-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/12/PUBG-Smartphones-Wallpaper-25-1080x2160-380x760.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-001-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-002-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-003-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-004-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-005-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-006-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-007-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-007-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-008-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-009-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-010-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-011-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-012-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-013-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-014-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-015-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-016-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-017-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-018-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-019-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-020-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-021-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-022-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-023-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-024-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-026-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-027-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-028-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-029-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-030-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-031-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-032-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-034-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-035-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-036-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-037-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-038-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-039-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-040-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-041-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-042-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-043-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-044-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-045-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-046-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-047-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-048-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-049-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-050-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-051-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-052-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-053-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-057-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-058-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-059-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-063-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-065-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-067-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-069-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-076-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-077-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-078-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-080-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-081-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-083-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-125-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-127-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-148-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-177-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-187-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-190-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-189-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2018/04/Amoled-Phone-Wallpaper-192-1080x2340-340x550.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-346-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-347-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-348-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-351-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-352-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-356-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-358-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-360-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-361-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-362-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-365-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-369-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2017/05/Minimal-Phone-Wallpaper-370-1080x2340-340x552.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-102-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-111-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-112-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-113-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-072-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-001-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-002-768x1365.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-120-768x1365.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-121-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-122-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-005-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-008-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-009-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-010-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-011-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-012-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-013-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-021-380x676.jpg"));
        list.add(new Custom_Items("https://www.setaswall.com/wp-content/uploads/2019/08/Whatsapp-Wallpaper-022-380x676.jpg"));


        getdata();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    private void getdata() {


        adapter = new CustomAdapter(list, this);
        recyclerView.setAdapter(adapter);

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
        getMenuInflater().inflate(R.menu.main, menu);
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
            startActivity(new Intent(MainActivity.this, SettingsActivity.class));

        }
        if (id == R.id.action_exit) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to Exit?");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();

                }
            });
            AlertDialog d = builder.create();
            d.show();

        }

        if (id == R.id.action_search) {

            finish();
            startActivity(getIntent());
            if (info != null) {
                getdata();

            } else {


                Toast.makeText(this, "Internet Not Connected!", Toast.LENGTH_SHORT).show();
            }


        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.wallpaper) {

            getdata();


        } else if (id == R.id.favorites) {

            getdata();

        } else if (id == R.id.Settings) {

            startActivity(new Intent(MainActivity.this, SettingsActivity.class));


        } else if (id == R.id.rate_us) {
            //rateme();
        } else if (id == R.id.more_app) {

            //MoreApp();


        }


        //Shere


        else if (id == R.id.shere) {


            Intent myintent = new Intent(Intent.ACTION_SEND);
            myintent.setType("text/plan");

            String shereBoday = "Your Boday Here";

            String shereSub = "\"http://play.google.com/store/apps/details?id=" + getPackageName();
            myintent.putExtra(Intent.EXTRA_SUBJECT, shereBoday);
            myintent.putExtra(Intent.EXTRA_TEXT, shereSub);
            startActivity(Intent.createChooser(myintent, "shere Using"));

        }


        //Exit


        else if (id == R.id.exit) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to Exit?");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();

                }
            });
            AlertDialog d = builder.create();
            d.show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void MoreApp() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://developer?id=" + "Account Name!")));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/developer?id=" + "Account Name!")));


        }
    }




    public void rateme() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + "Your Package name!")));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
        }
    }


}