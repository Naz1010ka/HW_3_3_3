package com.example.hw_3_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;


public class Fragment_F extends Fragment {

    private RecyclerView rvFood;
    private ArrayList<String> foodList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFood = requireActivity().findViewById(R.id.rv_food);
        loadData();
        FoodAdapter adapter = new FoodAdapter(foodList);
        rvFood.setAdapter(adapter);
    }
    private void loadData(){
        foodList.add("Pizza");
        foodList.add("Besh Barmak");
        foodList.add("Bulion");
        foodList.add("Pelmeni");
        foodList.add("Borsh");
        foodList.add("Burger");
        foodList.add("Kebab");
        foodList.add("Pasta");
        foodList.add("Lagman");
        foodList.add("Manty");
        foodList.add("Gan Fan");
        foodList.add("Ramen");
        foodList.add("Suhsi");
        foodList.add("Henkali");
        foodList.add("Vareniki");
        foodList.add("Zapekanka");

    }
}