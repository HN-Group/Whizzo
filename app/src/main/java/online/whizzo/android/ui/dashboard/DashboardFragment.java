package online.whizzo.android.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import java.util.ArrayList;
import java.util.List;

import online.whizzo.android.R;
import online.whizzo.android.ui.dashboard.Entities.CourseCard;
import online.whizzo.android.ui.dashboard.Entities.Module;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;


    Button cs2020btn;
    Button cs2230btn;
    Button cs2310btn;
    Button cs2010btn;
    Button cs2130btn;
    Button cs2410btn;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        cs2020btn = root.findViewById(R.id.CS2020);
        cs2230btn = root.findViewById(R.id.CS2230);
        cs2310btn = root.findViewById(R.id.CS2130);
        cs2010btn = root.findViewById(R.id.CS2240);
        cs2130btn = root.findViewById(R.id.CS2310);
        cs2410btn = root.findViewById(R.id.CS2410);

        return root;
    }

    public void buttonController(){
        cs2020btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(DashboardFragment.this, PostScreen(new ArrayList<>())));
                //Module module = new Module((String) cs2020btn.getText());
                ArrayList<CourseCard> sample = new ArrayList<>();
                sample.add(new CourseCard("Title", "Description"));
                Fragment fragment = new Fragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.course_card, fragment);
                transaction.commit();
            }
        }
        );
    }
}



//  final TextView textView = root.findViewById(R.id.text_dashboard);
// dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//@Override
//public void onChanged(@Nullable String s) {

//textView.setText(s);
// }
//});