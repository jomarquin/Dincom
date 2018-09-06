package co.edu.udea.compumovil.gr01_20182.dincom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ArrayList<String> listDates;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recycler=findViewById(R.id.id_Recycler);
        //recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        recycler.setLayoutManager(new GridLayoutManager(this,1));

        listDates = new ArrayList<String>();

        for(int i=0; i<=50;i++){
            listDates.add("Definición palabra # "+i+" ");
        }

        AdapterDates adapter = new AdapterDates(listDates);
        recycler.setAdapter(adapter);
    }
}
