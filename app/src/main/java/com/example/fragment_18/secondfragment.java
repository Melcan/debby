package com.example.fragment_18;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.Nullable;

public class secondfragment extends Fragment {
    View view;
    Button secondButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.second_fragment, container, false);
            secondButton = view.findViewById(R.id.secondButton);
            secondButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "first fragment",Toast.LENGTH_LONG).show();
                }
            });
            return view;
    }
}
