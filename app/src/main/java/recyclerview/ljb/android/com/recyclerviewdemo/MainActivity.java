package recyclerview.ljb.android.com.recyclerviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                startActivity(new Intent(this , Recycler2ListActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this , Recycler2GridActivity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(this , Recycler2PinterestActivity.class));
                break;
        }
    }
}
