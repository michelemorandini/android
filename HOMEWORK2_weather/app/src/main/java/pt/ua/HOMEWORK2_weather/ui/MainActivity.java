package pt.ua.HOMEWORK2_weather.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

import pt.ua.HOMEWORK2_weather.R;

public class MainActivity extends AppCompatActivity {

    private String city1 = "Aveiro";
    private String city2 = "Beja";
    private String city3 = "Braga";
    private String city4 = "Bragança";
    private String city5 = "Castelo Branco";
    private String city6 = "Coimbra";
    private String city7 = "Évora";
    private String city8 = "Faro";
    private String city9 = "Guarda";
    private String city10 = "Leiria";
    private String city11 = "Lisboa";
    private String city12 = "Portalegre";
    private String city13 = "Porto";
    private String city14 = "Santarém";
    private String city15 = "Setúbal";
    private String city16 = "Viana do Castelo";
    private String city17 = "Vila Real";
    private String city18 = "Viseu";

    private final LinkedList<String> mWordList = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWordList.add(city1);
        mWordList.add(city2);
        mWordList.add(city3);
        mWordList.add(city4);
        mWordList.add(city5);
        mWordList.add(city6);
        mWordList.add(city7);
        mWordList.add(city8);
        mWordList.add(city9);
        mWordList.add(city10);
        mWordList.add(city11);
        mWordList.add(city12);
        mWordList.add(city13);
        mWordList.add(city14);
        mWordList.add(city15);
        mWordList.add(city16);
        mWordList.add(city17);
        mWordList.add(city18);

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mWordList);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }



}
