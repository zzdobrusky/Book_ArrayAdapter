package edu.utah.cs4962.book_arrayadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class BookListActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> bookAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        bookAdapter.addAll(
                "Song of Ice and Fire",
                "Words of Radience",
                "Mistborn",
                "Ende's Game",
                "Green Eggs and Ham",
                "Catcher in the Rye",
                "Harry Potter and Sorcerer's Stone"
        );

        ListView bookListView = new ListView(this);
        bookListView.setAdapter(bookAdapter);
        bookListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(BookListActivity.this, parent.getAdapter().getItem(position).toString(), Toast.LENGTH_LONG).show();
            }
        });
        setContentView(bookListView);
    }



}
