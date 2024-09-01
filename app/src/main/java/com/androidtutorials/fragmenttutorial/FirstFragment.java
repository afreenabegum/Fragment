package com.androidtutorials.fragmenttutorial;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FirstFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        Toast.makeText(getContext(), "Fragment Attached", Toast.LENGTH_SHORT).show();
        super.onAttach(context);
    }

    @Override
    public void onStart() {
        Toast.makeText(getContext(), "Fragment Started", Toast.LENGTH_SHORT).show();

        super.onStart();
    }

    // Used to inflate fragment layouts
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Toast.makeText(getContext(), "Fragment Created", Toast.LENGTH_SHORT).show();

        //Need to inflate view, before initializing attributes
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        // This method is imp ,for initializing attributes

        TextView txt1 = view.findViewById(R.id.idHeading1);
        TextView txt2 = view.findViewById(R.id.idDescription1);
        Button FirstFragBtn = view.findViewById(R.id.Button1);

        FirstFragBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Hello from Fragment 1", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        Toast.makeText(getContext(), "Fragment Resumed", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    public void onPause() {
        Toast.makeText(getContext(), "Fragment Paused", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    public void onStop() {
        Toast.makeText(getContext(), "Fragment Stopped", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getContext(), "Fragment Destroyed", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}