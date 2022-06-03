package com.pizzadelivery.cl1_dami.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pizzadelivery.cl1_dami.R;
import com.pizzadelivery.cl1_dami.adapter.PictureAdapterRecyclerView;
import com.pizzadelivery.cl1_dami.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private ArrayList<Picture> listPicture;
    private RecyclerView recyclerData;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        listPicture = new ArrayList<>();

        recyclerData = (RecyclerView) view.findViewById(R.id.pictureRecycle);
        recyclerData.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarData();

        PictureAdapterRecyclerView adapter = new PictureAdapterRecyclerView(listPicture);
        recyclerData.setAdapter(adapter);
        return view;

    }

    private void llenarData() {
        for (int i=0;i<=10;i++){
            listPicture.add(new Picture(R.drawable.pizza_americana, "Pizza Americana","S/ 44.90","Disponible"));
            listPicture.add(new Picture(R.drawable.pizza_marinara, "Pizza Marinara","S/ 54.90","No Disponible"));
            listPicture.add(new Picture(R.drawable.pizza_pepperoni, "Pizza Peperoni","S/ 59.90","Disponible"));
            listPicture.add(new Picture(R.drawable.pizza_hawaiana, "Pizza Hawaiana","S/ 47.90","Disponible"));
            listPicture.add(new Picture(R.drawable.pizza_napolitana, "Pizza Napolitana","S/ 49.90","No Disponible"));
            listPicture.add(new Picture(R.drawable.pizza_margarita, "Pizza Margarita","S/ 54.90","Disponible"));
        }
    }
}

