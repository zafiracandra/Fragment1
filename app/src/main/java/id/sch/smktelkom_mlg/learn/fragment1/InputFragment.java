package id.sch.smktelkom_mlg.learn.fragment1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class InputFragment extends Fragment {
    EditText etNama;
    EditText etUmur;
    IListener mListener;

    public InputFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);

        etNama = (EditText) view.findViewById(R.id.editTextNama);
        etUmur = (EditText) view.findViewById(R.id.editTextUmur);

        view.findViewById(R.id.buttonProses)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        doProses();
                    }
                });

        return view;
    }

    private void doProses() {
        if (mListener != null) {
            mListener.doProses(etNama.getText().toString(),
                    etUmur.getText().toString());
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InputFragment.IListener) {
            mListener = (InputFragment.IListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement InputFragment.IListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface IListener {
        void doProses(String nama, String umur);
    }

}
