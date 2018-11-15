package com.durga.balaji66.dialogfragment;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class dialog_fragment extends DialogFragment implements View.OnClickListener {
    Button okButton;
    Button cancelButton;

    public dialog_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_fragment, container, false);
        //initialize the buttons and set click events
        okButton = (Button)view.findViewById(R.id.buttonOk);
        okButton.setOnClickListener(this);
        setCancelable(false);
        cancelButton = (Button)view.findViewById(R.id.buttonCancel);
        cancelButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        if(v == cancelButton)
            dismiss();
        else if( v == okButton)
        {
            Toast.makeText(this.getActivity(), "Item is deleted.", Toast.LENGTH_LONG).show();
            dismiss();
        }

    }
}
