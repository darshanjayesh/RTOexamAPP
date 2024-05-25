package com.dj.vehicleapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dj.Vehicleapp.R;

import java.util.ArrayList;
import java.util.List;

public class learnerstestmalayalam extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnerstestmalayalam);
        RecyclerView postsRecyclerView=findViewById(R.id.postsRecyclerView);
        postsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<PostItem> postItems=new ArrayList<>();
        postItems.add(new PostItem(R.drawable.image1));
        postItems.add(new PostItem(R.drawable.imagea1));
        postItems.add(new PostItem(R.drawable.a1));
        postItems.add(new PostItem(R.drawable.b1));
        postItems.add(new PostItem(R.drawable.c1));
        postItems.add(new PostItem(R.drawable.d1));
        postItems.add(new PostItem(R.drawable.e1));
        postItems.add(new PostItem(R.drawable.g1));
        postItems.add(new PostItem(R.drawable.h1));
        postItems.add(new PostItem(R.drawable.j1));
        postItems.add(new PostItem(R.drawable.ca));
        postItems.add(new PostItem(R.drawable.cc));
        postItems.add(new PostItem(R.drawable.cb));
        postItems.add(new PostItem(R.drawable.cd));
        postItems.add(new PostItem(R.drawable.ce));
        postItems.add(new PostItem(R.drawable.cf));
        postItems.add(new PostItem(R.drawable.cg));
        postItems.add(new PostItem(R.drawable.ch));
        postItems.add(new PostItem(R.drawable.ci));
        postItems.add(new PostItem(R.drawable.cl));
        postItems.add(new PostItem(R.drawable.cm));
        postItems.add(new PostItem(R.drawable.cn));
        postItems.add(new PostItem(R.drawable.co));
        postItems.add(new PostItem(R.drawable.cp));
        postItems.add(new PostItem(R.drawable.cq));
        postItems.add(new PostItem(R.drawable.ddd));
        postItems.add(new PostItem(R.drawable.ct));
        postItems.add(new PostItem(R.drawable.cu));
        postItems.add(new PostItem(R.drawable.cv));
        postItems.add(new PostItem(R.drawable.cw));
        postItems.add(new PostItem(R.drawable.cx));
        postItems.add(new PostItem(R.drawable.cy));
        postItems.add(new PostItem(R.drawable.cz));
        postItems.add(new PostItem(R.drawable.da));
        postItems.add(new PostItem(R.drawable.db));
        postItems.add(new PostItem(R.drawable.dc));
        postItems.add(new PostItem(R.drawable.dd));
        postItems.add(new PostItem(R.drawable.de));
        postItems.add(new PostItem(R.drawable.df));
        postItems.add(new PostItem(R.drawable.dg));
        postItems.add(new PostItem(R.drawable.dh));
        postItems.add(new PostItem(R.drawable.di));
        postItems.add(new PostItem(R.drawable.dk));
        postItems.add(new PostItem(R.drawable.dl));
        postItems.add(new PostItem(R.drawable.dm));
        postItems.add(new PostItem(R.drawable.yu));
        postItems.add(new PostItem(R.drawable.dp));
        postItems.add(new PostItem(R.drawable.dq));
        postItems.add(new PostItem(R.drawable.dr));
        postItems.add(new PostItem(R.drawable.ds));
        postItems.add(new PostItem(R.drawable.dt));
        postItems.add(new PostItem(R.drawable.du));
        postItems.add(new PostItem(R.drawable.dv));
        postItems.add(new PostItem(R.drawable.dw));
        postItems.add(new PostItem(R.drawable.dx));
        postItems.add(new PostItem(R.drawable.dy));
        postItems.add(new PostItem(R.drawable.dz));
        postItems.add(new PostItem(R.drawable.za));
        postItems.add(new PostItem(R.drawable.zb));
        postItems.add(new PostItem(R.drawable.zc));
        postItems.add(new PostItem(R.drawable.zd));


        postsRecyclerView.setAdapter(new PostsAdapter(postItems));
    }
}




