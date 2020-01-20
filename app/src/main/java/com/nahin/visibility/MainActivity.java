package com.nahin.visibility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    ScrollView scrollView;
    Button check_status;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        getSupportActionBar().hide();


        linearLayout = findViewById( R.id.layout_view_id );

        scrollView = findViewById( R.id.sv_login_view_id );

       check_status= (Button)findViewById( R.id.check_statusID );
       scrollView.setVisibility( View.VISIBLE );
       check_status.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               scrollView.setVisibility( View.GONE );
               linearLayout.setVisibility( View.VISIBLE );

           }
       } );


       button=(Button)findViewById( R.id.go_to_scrollID );
       button.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               linearLayout.setVisibility( View.GONE );
               scrollView.setVisibility( View.VISIBLE );
           }
       } );



    }
}
