package online.whizzo.android.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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
import online.whizzo.android.ui.home.HomeViewModel;

public class DashboardFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        /*homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }

}



//  final TextView textView = root.findViewById(R.id.text_dashboard);
// dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//@Override
//public void onChanged(@Nullable String s) {

//textView.setText(s);
// }
//});