package com.dj.vehicleapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dj.Vehicleapp.R;

import java.util.ArrayList;
import java.util.List;

public class learnerstest extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnerstest);
        RecyclerView postsRecyclerView=findViewById(R.id.postsRecyclerView);
        postsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<PostItem> postItems=new ArrayList<>();
        postItems.add(new PostItem(R.drawable.image));
        postItems.add(new PostItem(R.drawable.imagea));
        postItems.add(new PostItem(R.drawable.xa));
        postItems.add(new PostItem(R.drawable.xb));
        postItems.add(new PostItem(R.drawable.xc));
        postItems.add(new PostItem(R.drawable.xd));
        postItems.add(new PostItem(R.drawable.xe));
        postItems.add(new PostItem(R.drawable.xf));
        postItems.add(new PostItem(R.drawable.xg));
        postItems.add(new PostItem(R.drawable.xh));
        postItems.add(new PostItem(R.drawable.xj));
        postItems.add(new PostItem(R.drawable.a));
        postItems.add(new PostItem(R.drawable.b));
        postItems.add(new PostItem(R.drawable.c));
        postItems.add(new PostItem(R.drawable.d));
        postItems.add(new PostItem(R.drawable.e));
        postItems.add(new PostItem(R.drawable.f));
        postItems.add(new PostItem(R.drawable.g));
        postItems.add(new PostItem(R.drawable.h));
        postItems.add(new PostItem(R.drawable.i));
        postItems.add(new PostItem(R.drawable.j));
        postItems.add(new PostItem(R.drawable.k));
        postItems.add(new PostItem(R.drawable.l));
        postItems.add(new PostItem(R.drawable.m));
        postItems.add(new PostItem(R.drawable.n));
        postItems.add(new PostItem(R.drawable.o));
        postItems.add(new PostItem(R.drawable.p));
        postItems.add(new PostItem(R.drawable.q));
        postItems.add(new PostItem(R.drawable.r));
        postItems.add(new PostItem(R.drawable.s));
        postItems.add(new PostItem(R.drawable.t));
        postItems.add(new PostItem(R.drawable.u));
        postItems.add(new PostItem(R.drawable.v));
        postItems.add(new PostItem(R.drawable.w));
        postItems.add(new PostItem(R.drawable.x));
        postItems.add(new PostItem(R.drawable.y));
        postItems.add(new PostItem(R.drawable.z));
        postItems.add(new PostItem(R.drawable.aa));
        postItems.add(new PostItem(R.drawable.ab));
        postItems.add(new PostItem(R.drawable.ac));
        postItems.add(new PostItem(R.drawable.ad));
        postItems.add(new PostItem(R.drawable.ae));
        postItems.add(new PostItem(R.drawable.af));
        postItems.add(new PostItem(R.drawable.ag));
        postItems.add(new PostItem(R.drawable.ah));
        postItems.add(new PostItem(R.drawable.ai));
        postItems.add(new PostItem(R.drawable.aj));
        postItems.add(new PostItem(R.drawable.ak));
        postItems.add(new PostItem(R.drawable.al));
        postItems.add(new PostItem(R.drawable.am));
        postItems.add(new PostItem(R.drawable.an));
        postItems.add(new PostItem(R.drawable.ao));
        postItems.add(new PostItem(R.drawable.ap));
        postItems.add(new PostItem(R.drawable.aq));
        postItems.add(new PostItem(R.drawable.ar));
        postItems.add(new PostItem(R.drawable.at));
        postItems.add(new PostItem(R.drawable.au));
        postItems.add(new PostItem(R.drawable.av));
        postItems.add(new PostItem(R.drawable.aw));
        postItems.add(new PostItem(R.drawable.ax));
        postItems.add(new PostItem(R.drawable.ay));
        postItems.add(new PostItem(R.drawable.az));


        postsRecyclerView.setAdapter(new PostsAdapter(postItems));
        }
    }









