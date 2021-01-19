package com.example.ali_ateeq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Crate_new_Deal_Activity extends AppCompatActivity {
    EditText name,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crate_new__deal_);
    }

    public void done(View view) {
        name= findViewById(R.id.name_editText);
        phone = findViewById(R.id.phone_editText);
        Toast.makeText(this, name.getText()+" "+phone.getText(), Toast.LENGTH_SHORT).show();
        FragmentInbox.inboxList.add(new Inbox(name.getText().toString(),phone.getText().toString(),1));
        Intent intent = new Intent(this,Transactions.class);
        startActivity(intent);
        finish();
    }
}