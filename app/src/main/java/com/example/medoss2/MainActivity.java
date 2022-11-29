package com.example.medoss2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.medoss2.login.LoginActivity;
import com.example.medoss2.login.StartActivity;
import com.example.medoss2.ui.dashboard.DashboardFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.medoss2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    //Pour activer mon bouton
//    Button btnCnMedecin;
//
//    private void initUI() {
//        btnCnMedecin = findViewById(R.id.btnCnMedecin);
//    }
//
//    private void clicLinear(){
//        btnCnMedecin.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
//            @Override
//            public void onClick(View view) {
//                // Action effectuée lors du clic ici un intent pour se rendre sur l'activité des linear layout
//                // Départ                   // Arrivée
//                Intent intent = new Intent(MainActivity.this, StartActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//    // fin



    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //je declare mes bouton
        //initUI();
      //  clicLinear();

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


    }

}