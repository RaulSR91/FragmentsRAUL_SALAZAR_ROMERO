package com.salazar.raul.bkfo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.salazar.raul.bkfo.MainActivity;
import com.salazar.raul.bkfo.R;
import com.salazar.raul.bkfo.adapter.MascotaAdaptador;
import com.salazar.raul.bkfo.pojo.Mascotas;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {
    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recycler_view,container,false);

        //Lista que se va a llenar
        listaMascotas  = (RecyclerView) v.findViewById(R.id.rvMascotas);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        this.inicializarListaMascotas();
        this.inicializarAdaptador();
        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(this.mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas("UNO",3,R.drawable.gato1));
        mascotas.add(new Mascotas("DOS",23,R.drawable.gatos2));
        mascotas.add(new Mascotas("TRES",27,R.drawable.gato3));
        mascotas.add(new Mascotas("CUATRO",26,R.drawable.gato4));
        mascotas.add(new Mascotas("CINCO",9,R.drawable.gato5));
        mascotas.add(new Mascotas("SEIS",89,R.drawable.gato6));
        mascotas.add(new Mascotas("SIETE",91,R.drawable.gato7));
        mascotas.add(new Mascotas("OCHO",28,R.drawable.gato8));
        mascotas.add(new Mascotas("NUEVE",93,R.drawable.gato9));
        mascotas.add(new Mascotas("DIEZ",12,R.drawable.gato10));
    }


}
