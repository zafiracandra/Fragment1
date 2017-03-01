package id.sch.smktelkom_mlg.learn.fragment1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OutputFragment extends Fragment {
    TextView tvHasil;

    public OutputFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_output, container, false);

        tvHasil = (TextView) view.findViewById(R.id.textViewHasil);

        return view;
    }

    public void doProses(String nama, String umur) {
        tvHasil.setText(nama + " (" + umur + " tahun)");
    }

}
