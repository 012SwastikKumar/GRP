package com.example.crms;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;

public class TransactionDetail extends AppCompatActivity{
//    private DatabaseReference databaseReference;
    private TextView dataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_detail);

        // Initialize views
        ImageButton backButton = findViewById(R.id.backButton);
        dataTextView = findViewById(R.id.dataTextView);

        // Set click listener for the back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Close the profile page and return to the previous page
            }
        });

        // Initialize Firebase database reference
//        databaseReference = FirebaseDatabase.getInstance().getReference("your_data_node");

        // Retrieve data from Firebase and update the TextView
        fetchDataFromFirebase();
    }

    private void fetchDataFromFirebase() {
//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                // Get the data from Firebase and update the TextView
//                String data = dataSnapshot.getValue(String.class);
//                dataTextView.setText(data);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//                // Handle any errors that may occur during data retrieval
//            }
//        });
    }
}
