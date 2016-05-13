package com.example.andre_000.terragocodingchallenge;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by andre_000 on 5/12/2016.
 */
public class ItemAdapter extends ArrayAdapter<Item>
{

    private final Context context;
    private final ArrayList<Item> itemsArrayList;

    public ItemAdapter(Context context, ArrayList<Item> itemsArrayList)
    {
        super(context, R.layout.row, itemsArrayList);

        this.context = context;
        this.itemsArrayList = itemsArrayList;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);

        //Declaring text views in each row
        TextView userID = (TextView)rowView.findViewById(R.id.idLbl);
        TextView firstName = (TextView)rowView.findViewById(R.id.firstNameLbl);
        TextView lastName = (TextView)rowView.findViewById(R.id.lastNameLbl);
        TextView username = (TextView)rowView.findViewById(R.id.usernameLbl);

        //Making font sizes responsive on all screen sizes
        /*userID.setTextSize(TypedValue.COMPLEX_UNIT_PX, 20);
        firstName.setTextSize(TypedValue.COMPLEX_UNIT_PX, 20);
        lastName.setTextSize(TypedValue.COMPLEX_UNIT_PX, 20);
        username.setTextSize(TypedValue.COMPLEX_UNIT_PX, 20);*/

        if(position == 0)
        {
            setTextViews(userID, firstName, lastName, username, position);

            //Making all the column headers bold
            userID.setTypeface(null, Typeface.BOLD);
            firstName.setTypeface(null, Typeface.BOLD);
            lastName.setTypeface(null, Typeface.BOLD);
            username.setTypeface(null, Typeface.BOLD);

            return rowView;
        }

        setTextViews(userID, firstName, lastName, username, position);
        return rowView;
    }

    //Method that sets the text views values and also gives every odd row a different shade
    private void setTextViews(TextView userID, TextView firstName,
                              TextView lastName, TextView username, int position)
    {
        userID.setText(itemsArrayList.get(position).getUserID());
        firstName.setText(itemsArrayList.get(position).getFirstName());
        lastName.setText(itemsArrayList.get(position).getLastName());
        username.setText(itemsArrayList.get(position).getUsername());

        if(position % 2 != 0) {
            userID.setBackgroundColor(Color.parseColor("#e8e9e9"));
            firstName.setBackgroundColor(Color.parseColor("#e8e9e9"));
            lastName.setBackgroundColor(Color.parseColor("#e8e9e9"));
            username.setBackgroundColor(Color.parseColor("#e8e9e9"));
        }
    }
}
