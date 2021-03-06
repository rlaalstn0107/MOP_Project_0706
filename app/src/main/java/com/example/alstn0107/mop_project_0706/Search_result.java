package com.example.alstn0107.mop_project_0706;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Search_result extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result); // bookmark로바꾸자

        ActionBar ab = getSupportActionBar() ;
        ab.setTitle("검색 결과") ;
/*
        ImageButton search_button=(ImageButton) findViewById(R.id.search_button);
        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //검색이 완료된 페이지로 가야합니다.

            }
        });
*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bookmark, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.nav_bookmark_on:
                onBookmark();
                return true;
            case R.id.nav_bookmark_off:
                offBookmark();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void onBookmark() {
        Toast.makeText(getApplicationContext(), "onbookmark", Toast.LENGTH_SHORT).show();

    }


    private void offBookmark() {
        Toast.makeText(getApplicationContext(), "offbookmark", Toast.LENGTH_SHORT).show();

    }
}
