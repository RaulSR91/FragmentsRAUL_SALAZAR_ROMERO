package com.salazar.raul.bkfo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.salazar.raul.bkfo.R;
import com.salazar.raul.bkfo.adapter.MascotaAdaptador;
import com.salazar.raul.bkfo.pojo.Mascotas;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilMascota extends Fragment {

    ArrayList<Mascotas> mascotas;
    private RecyclerView fotosMascotas;


    public PerfilMascota() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil_mascota, container, false);



        //Lista que se va a llenar
        fotosMascotas  = (RecyclerView) v.findViewById(R.id.rvFotosMascotas);


       // LinearLayoutManager llm = new LinearLayoutManager(getActivity());
       // llm.setOrientation(LinearLayoutManager.VERTICAL);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);

        fotosMascotas.setLayoutManager(gridLayoutManager);

        this.inicializarListaMascotas();
        this.inicializarAdaptador();


        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(this.mascotas,getActivity());
        fotosMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas("",3,R.drawable.cat_96));
        mascotas.add(new Mascotas("",23,R.drawable.cat_96));
        mascotas.add(new Mascotas("",27,R.drawable.cat_96));
        mascotas.add(new Mascotas("",26,R.drawable.cat_96));
        mascotas.add(new Mascotas("",9,R.drawable.cat_96));
        mascotas.add(new Mascotas("",89,R.drawable.cat_96));
        mascotas.add(new Mascotas("",91,R.drawable.cat_96));
        mascotas.add(new Mascotas("",28,R.drawable.cat_96));
        mascotas.add(new Mascotas("",93,R.drawable.cat_96));
        mascotas.add(new Mascotas("",12,R.drawable.cat_96));
    }


}
