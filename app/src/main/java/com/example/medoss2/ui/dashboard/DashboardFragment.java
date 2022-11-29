package com.example.medoss2.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.medoss2.FirstActivity;
import com.example.medoss2.R;
import com.example.medoss2.databinding.FragmentDashboardBinding;
import com.example.medoss2.login.StartActivity;

public class DashboardFragment extends Fragment {



    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    // Debut de Clic de mon bouton dans fragment
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Button button3 = view.findViewById(R.id.button3);

        binding.btnCnMedecin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "TOTOO", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getContext(), StartActivity.class));
            }
        });

    }
    // fin de mon bouton


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

   }