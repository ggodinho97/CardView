package com.gabrielluiz.cardview.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gabrielluiz.cardview.R;
import com.gabrielluiz.cardview.adapter.PostagemAdapter;
import com.gabrielluiz.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List <Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager( this, 1 );
        recyclerPostagem.setLayoutManager( layoutManager );

        //Define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter( adapter );



    }

    public void prepararPostagens() {

        Postagem p = new Postagem("Gabriel Luiz","#tbt Viagem Top!",R.drawable.imagem1);
        this.postagens.add( p );

        p = new Postagem("Hotel JM","Viaje, aproveite nossos descontos! ",R.drawable.imagem2);
        this.postagens.add( p );

        p = new Postagem("Juliana Martins","#Paris!!",R.drawable.imagem3);
        this.postagens.add( p );

        p = new Postagem("Marcos Paulo","Que lugar lindo!",R.drawable.imagem4);
        this.postagens.add( p );


    }

}
