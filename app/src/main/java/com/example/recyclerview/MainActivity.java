package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.xml.sax.helpers.XMLReaderAdapter;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private static List<Article> articleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articleList = new ArrayList<>();

        Article article1 = new Article(R.drawable.img, "Pope Francis being kept in hospital for checks", "Pope Francis is being kept in hospital for checks after attending a scheduled appointment at a hospital in Rome, Vatican sources say.\n" +
                "\n" +
                "The Pontiff's closest staff, including security, are expected to stay the night at the Gemelli Hospital, a person with direct knowledge of the matter told the BBC.\n" +
                "\n" +
                "Pope Francis' schedule has reportedly been cancelled for the next two days while medical checks continue, the source added.\n" +
                "\n" +
                "In January, Pope Francis, 86, led the funeral of his predecessor Pope Benedict XVI - who was the first pope to resign due to ill health for centuries.\n" +
                "\n" +
                "Pope Francis has previously indicated that he may also wish to follow in Benedict's footsteps if his health deteriorated.");
        articleList.add(article1);
        Article article2 = new Article(R.drawable.img, "Russian spies more effective than army, say experts", "Russia's security and intelligence services have achieved greater success in Ukraine than its army, says a leading UK defence think tank.\n" +
                "\n" +
                "Russian spy agencies began preparing for the invasion of Ukraine as far back as June 2021, says a report by the Royal United Services Institute (Rusi).\n" +
                "\n" +
                "The Federal Security Service (FSB) has quickly dominated populations in occupied areas of Ukraine, Rusi adds.\n" +
                "\n");
        articleList.add(article2);
        Article article3 = new Article(R.drawable.img, "Unusually vivid Southern Lights glow over New Zealand", "The Southern (and Northern) Lights can be seen around the magnetic poles when the upper atmosphere is hit by energetic charged particles that travel along the Earth's magnetic field lines.\n" +
                "\n" +
                "When those energetic electrons collide with gases in the atmosphere, they emit light.\n" +
                "\n" +
                "In the northern hemisphere, the phenomenon is called Aurora Borealis. In the south, it's referred to as Aurora Australis.");
        articleList.add(article3);
        Article article4 = new Article(R.drawable.img, "Rare show of Northern Lights dazzles North America", "When these clouds of particles and magnetic fields from the sun hit the Earth's magnetic fields, we see these high energy particles will interact with the Earth's upper atmosphere and that will create the Northern Lights");
        articleList.add(article4);


        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, articleList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}