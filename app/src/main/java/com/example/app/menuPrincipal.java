package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import org.w3c.dom.Text;

public class menuPrincipal extends AppCompatActivity implements View.OnClickListener{

    Button buttonTest, buttonCalculate;
    TextView nombre, logout;
    int id = 0;
    Usuario u;
    daoUsuario dao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        nombre = (TextView) findViewById(R.id.textTitleName);
        logout = (TextView) findViewById(R.id.textLogOut);
        buttonCalculate = (Button) findViewById(R.id.btnCalculate);

        logout.setOnClickListener(this);
        buttonCalculate.setOnClickListener(this);

        Spinner spinnerTabIndustrial = (Spinner) findViewById(R.id.spinnerIndu);
        String[] valores = {"Marlboro", "Winston","Ducado","Camel"};
        spinnerTabIndustrial.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        Spinner spinnerTabLiar = (Spinner) findViewById(R.id.spinnerLiar);
        String[] valores2 = {"Pueblo", "Sauvage", "Flandria"};
        spinnerTabLiar.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores2));

        Spinner spinnerHowMuch = (Spinner) findViewById(R.id.spinnerHowMany);
        String[] valoresNum = { "1","2","3","4", "5", "6", "7", "8", "9", "10", "11", "12" };
        spinnerHowMuch.setAdapter((new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valoresNum)));

        // buttonTest = (Button) findViewById(R.id.btnTest);
        //  btnCerrarsesion = (Button) findViewById(R.id.btnLogut);
        //  btnEditar = (Button) findViewById(R.id.btn);
        //  btnEliminar = (Button) findViewById(R.id.btn);
        //  btnMostrar = (Button) findViewById(R.id.btn);

        Bundle b = getIntent().getExtras();
        id = b.getInt("id");
        dao = new daoUsuario(this);
        u = dao.getUsuarioById(id);

        nombre.setText(u.getNombre());


        final DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setItemIconTintList(null);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.textTitleName:
                //Intent intentTest = new Intent (this, SlashScreen.class);
                //startActivity(intentTest);
                break;

            case R.id.textLogOut:
                Intent i1 = new Intent (this, MainActivity.class);
                startActivity(i1);

            case R.id.btnCalculate:
                Intent i2 = new Intent (this, CalculoActivity.class);
                startActivity(i2);
        }
    }
}

