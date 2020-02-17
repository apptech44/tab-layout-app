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

public class PhpFragment extends ListFragment {

    private String items[] =
            {"Hello World App In PHP", "Integer Data In PHP", "String Data In PHP"
                    , "Floating Data In PHP", "Double Data In PHP", "Long Data In PHP"
                    , "Array Using In PHP", "Insert Record Into Database Using PHP",
                    "Select Records From Database Using PHP"
                    , "Update Record Into Database Using PHP"
                    , "Delete Record From Database Using PHP"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_php, container, false);
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

        String listItem = (String) l.getItemAtPosition(position);
        Toast.makeText(getActivity(), listItem, Toast.LENGTH_LONG).show();
    }
}
