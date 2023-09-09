package com.example.crms;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class CardListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Create a list of card items
        List<CardItem> cardItemList = new ArrayList<>();
        cardItemList.add(new CardItem(R.drawable.ic_menu_camera, "Card 1", "Sub Heading 1"));
        cardItemList.add(new CardItem(R.drawable.ic_menu_camera, "Card 2", "Sub Heading 2"));
        // Add more card items as needed

        // Set up the RecyclerView with the CardAdapter
        CardAdapter cardAdapter = new CardAdapter(this, cardItemList);
        recyclerView.setAdapter(cardAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
