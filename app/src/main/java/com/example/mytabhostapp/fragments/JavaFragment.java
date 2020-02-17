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

public class JavaFragment extends ListFragment {

    private String items[] = {"Hello World App In Java", "Integer DataType In Java", "String DataType In Java"
            , "Floating DataType In Java", "Double DataType In Java", "Long DataType In Java"
            , "Array DataType In Java", "ArrayList Using In Java", "HashMap Using In Java"
            , "Map Using In Java"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_java, container, false);
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

        String items = (String) l.getItemAtPosition(position);
        Toast.makeText(getActivity(), items, Toast.LENGTH_LONG).show();

    }
}
