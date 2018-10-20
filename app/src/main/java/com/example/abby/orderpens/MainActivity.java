package com.example.abby.orderpens;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int quantity = 0;



    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.displayQuantity);
        quantityTextView.setText(""+number);
    }

    private void displaySummery(String message) {

        TextView summeryTextView = (TextView) findViewById(R.id.summery);
        summeryTextView.setText(message);
    }

    public void decrement(View view){
        if (quantity>0)
        quantity -- ;
        displayQuantity(quantity);
    }
    public void increment(View view){
        quantity++ ;
        displayQuantity(quantity);
    }


    public void showSummery(View view){
        int price = quantity * 5;
        String message = "Thank you! that would be $"+price;
        displaySummery(message);
    }
}
