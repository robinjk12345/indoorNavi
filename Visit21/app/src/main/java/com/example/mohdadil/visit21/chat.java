package com.example.mohdadil.visit21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class chat extends AppCompatActivity {

    // test tt;
  //  private AutoCompleteTextView myview;
    private int flag=0;
    private static final String[] COUNTRIES = new String[]{
            "Afghanistan", "Albania", "Algeria", "Andorra", "Angola"
    };

    List<ChatModel> lstChat = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        //setContentView(R.layout.activity_main);




        setUpMessage();
        ListView lstView = (ListView) findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(lstChat, this);
        lstView.setAdapter(adapter);
        String[] countries = getResources().getStringArray(R.array.countries);

        final AutoCompleteTextView editText = findViewById(R.id.actv);
        ImageView bt = findViewById(R.id.button3);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                R.layout.custom_list_item, R.id.text_view_list_item, countries);
        editText.setAdapter(adapter1);

editText.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        editText.showDropDown();
        return false;
    }
});



        //editText.setThreshold(1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {






                // Intent tt = new Intent(this,test.class);

                //get the input like for a normal EditText
                String input = editText.getText().toString();
                Log.d("test", input);




               // String str2 = "Angola";
                if (input.equals("Gents Staff Toilet")) {
                    // test.show();

                    Intent intent = new Intent(chat.this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("key1", 19.07600723);
                    bundle.putDouble("key2", 72.99196862);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

                if (input.equals("Ladies Staff Toilet")) {
                    // test.show();

                    Intent intent = new Intent(chat.this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("key1", 19.07606432);
                    bundle.putDouble("key2", 72.991542);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

                if (input.equals("Elevator")) {
                    // test.show();

                    Intent intent = new Intent(chat.this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("key1", 19.07591032);
                    bundle.putDouble("key2", 72.99196512);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

                if (input.equals("exam cell 4th floor")) {
                    // test.show();

                    Intent intent = new Intent(chat.this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("key1", 19.07613403);
                    bundle.putDouble("key2", 72.99198054);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

                if (input.equals("robocon room")) {
                    // test.show();

                    Intent intent = new Intent(chat.this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("key1", 19.07597505);
                    bundle.putDouble("key2", 72.99202933);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

            }
        });}


    private void setUpMessage() {
        lstChat.add(new ChatModel("Hey there!! Welcome to FCRIT", true));
        lstChat.add(new ChatModel("Hope you are having a great day!", true));
        lstChat.add(new ChatModel("We can help you to navigate to places indoors", true));
        lstChat.add(new ChatModel("Search for the place you want to navigate to..", true));
        // lstChat.add(new ChatModel("Search Places",false));
    }

}
