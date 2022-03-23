package com.example.loginandregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class todoscreen extends AppCompatActivity {
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todoscreen);
    listView=findViewById(R.id.listview);
    button=findViewById(R.id.button);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            addItem(view);
        }
    });
items =new ArrayList<>();
itemsAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
listView.setAdapter(itemsAdapter);
setUpListViewListener();
    
    }

    private void setUpListViewListener() {

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Context context=getApplicationContext();
                Toast.makeText(context,"items removed",Toast.LENGTH_LONG).show();

                items.remove(i);

                itemsAdapter.notifyDataSetChanged();
                return  true;
            }
        });
    }

    private void addItem(View view) {

        EditText input=findViewById(R.id.additem);
        String itemText=input.getText().toString();
        if (!(itemText.equals(""))){
            itemsAdapter.add(itemText);
            input.setText("");
        }else{
           Toast.makeText(getApplicationContext(),"Please enter text...",Toast.LENGTH_LONG).show();
        }

    }
}