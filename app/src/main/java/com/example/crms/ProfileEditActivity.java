package com.example.crms;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;

public class ProfileEditActivity extends AppCompatActivity {

//    private DatabaseReference databaseReference;
//    private FirebaseUser currentUser;
    private EditText nameEditText, emailEditText, phoneEditText, passwordEditText, aadharEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_edit_page);

        // Initialize views
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        aadharEditText = findViewById(R.id.aadharEditText);
        Button saveButton = findViewById(R.id.saveButton);

        // Initialize Firebase database reference
//        currentUser = FirebaseAuth.getInstance().getCurrentUser();
//        if (currentUser != null) {
//            String userId = currentUser.getUid();
//            databaseReference = FirebaseDatabase.getInstance().getReference("users").child(userId);
//        }

        // Set click listener for the "Save Changes" button
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveChanges();
            }
        });

        // Retrieve user data from Firebase and populate the EditText fields
        retrieveUserData();
    }

    private void retrieveUserData() {
//        if (databaseReference != null) {
//            databaseReference.addValueEventListener(new ValueEventListener() {
//                @Override
//                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                    // Retrieve user data from Firebase and populate the EditText fields
//                    User user = dataSnapshot.getValue(User.class);
//                    if (user != null) {
//                        nameEditText.setText(user.getName());
//                        emailEditText.setText(user.getEmail());
//                        phoneEditText.setText(user.getPhoneNumber());
//                        passwordEditText.setText(user.getPassword());
//                        aadharEditText.setText(user.getAadharNumber());
//                    }
//                }
//
//                @Override
//                public void onCancelled(@NonNull DatabaseError databaseError) {
//                    // Handle any errors that may occur during data retrieval
//                }
//            });
//        }
    }

    private void saveChanges() {
//        if (databaseReference != null && currentUser != null) {
//            String name = nameEditText.getText().toString();
//            String email = emailEditText.getText().toString();
//            String phone = phoneEditText.getText().toString();
//            String password = passwordEditText.getText().toString();
//            String aadhar = aadharEditText.getText().toString();
//
//            // Update the user data in Firebase
//            User updatedUser = new User(name, email, phone, password, aadhar);
//            databaseReference.setValue(updatedUser);
//
//            // Finish the activity and return to the previous page
//            finish();
//        }
    }
}
