package net.pixelion.koktelguru;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.pixelion.koktelguru.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Omiljeni extends Fragment {

    public static Omiljeni newInstance() {
        Omiljeni fragment = new Omiljeni();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_omiljeni, container, false);
    }

}
