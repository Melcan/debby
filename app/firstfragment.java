
import android.app.Fragment;
import android.view.LayoutInflater;
import android.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;
import androidx.annotation.Nullable;

import com.example.fragment_18.R;

public class firstfragment extends Fragment {
    View view;
    Button firstButton;
    @Override
    public View onCreateView(LayoutInflater, @Nullable ViewGroup container,Bundle savedInstanceState){
        view = inflater.inflater(R.layout.fragment_first, container, false);
        firstButton = view.findViewById(R.id.firstButton);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "first fragment",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
