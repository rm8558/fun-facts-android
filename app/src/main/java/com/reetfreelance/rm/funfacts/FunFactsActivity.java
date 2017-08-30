package com.reetfreelance.rm.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG=FunFactsActivity.class.getSimpleName();

    //Declare view vars
    private TextView mFactTextView;
    private Button mShowNewFactButton;
    private FactBook mFactBook = new FactBook();
    private RelativeLayout mFactLayout;
    private ColorPalette mColorPalette = new ColorPalette();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView=(TextView)findViewById(R.id.factTextView);
        mShowNewFactButton=(Button)findViewById(R.id.showNewFactButton);
        mFactLayout=(RelativeLayout)findViewById(R.id.factLayout);

        mFactBook=new FactBook();

        View.OnClickListener showNewFactListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mFactTextView.setText(mFactBook.getFact());
                String bgColor=mColorPalette.getBGColor();
                mFactLayout.setBackgroundColor(Color.parseColor(bgColor));
                mShowNewFactButton.setTextColor(Color.parseColor(bgColor));
            }
        };

        mShowNewFactButton.setOnClickListener(showNewFactListener);

        Toast.makeText(this, "Welcome to Fun Facts!", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Created FunFactsActivity");
    }
}
