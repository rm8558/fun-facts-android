package com.reetfreelance.rm.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    //Declare view vars
    private TextView mFactTextView;
    private Button mShowNewFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView=(TextView)findViewById(R.id.factTextView);
        mShowNewFactButton=(Button)findViewById(R.id.showNewFactButton);

        View.OnClickListener showNewFactListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact="Ostriches can run faster than horses";

                mFactTextView.setText(fact);
            }
        };

        mShowNewFactButton.setOnClickListener(showNewFactListener);
    }
}
