package online.whizzo.android.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import java.util.ArrayList;

import online.whizzo.android.R;
import online.whizzo.android.ui.dashboard.DashboardViewModel;
import online.whizzo.android.ui.dashboard.Entities.CourseCard;

public class HomeFragment extends Fragment {


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
        View root = inflater.inflate(R.layout.fragment_home, container, false);
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