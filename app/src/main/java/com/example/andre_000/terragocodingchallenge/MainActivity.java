package com.example.andre_000.terragocodingchallenge;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    String[] userID = {"", "1", "2", "3"};
    String[] firstNames = {"", "Mark", "Jacob", "Larry"};
    String[] lastNames = {"", "Otto", "Thornton", "the Bird"};
    String[] usernames = {"", "@mdo", "@fat", "@twitter"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemAdapter adapter = new ItemAdapter(this, generateData());
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        TextView chckOutTableTxt = (TextView) findViewById(R.id.chckOutTableTxt);
        TextView prettyCoolTxt = (TextView) findViewById(R.id.prettyCoolTxt);
        //chckOutTableTxt.setTextSize(TypedValue.COMPLEX_UNIT_PX, 30);
        //prettyCoolTxt.setTextSize(TypedValue.COMPLEX_UNIT_PX, 25);

    }

    private ArrayList<Item> generateData()
    {
        ArrayList<Item> items = new ArrayList<Item>();
        for(int x = 0; x < userID.length; x++) {
            if(x == 0) {
                items.add(new Item("#", "First Name", "Last Name", "Username"));
            }else{
                items.add(new Item(userID[x], firstNames[x], lastNames[x], usernames[x]));
            }
        }
        return items;
    }
}
