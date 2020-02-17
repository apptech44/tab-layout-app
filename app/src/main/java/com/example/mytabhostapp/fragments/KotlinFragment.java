package com.example.mytabhostapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.mytabhostapp.R;

public class KotlinFragment extends ListFragment {

    private String items[] = {"Hello World App In Kotlin", "Integer DataType In Kotlin", "String DataType In Kotlin"
            , "Floating DataType In Kotlin", "Double DataType In Kotlin", "Long DataType In Kotlin"
            , "Array DataType In Kotlin", "ArrayList Using In Kotlin", "HashMap Using In Kotlin"
            , "Map Using In Kotlin"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kotlin, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, items);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {

        String listItems = (String) l.getItemAtPosition(position);
        Toast.makeText(getActivity(), listItems, Toast.LENGTH_LONG).show();
    }
}
