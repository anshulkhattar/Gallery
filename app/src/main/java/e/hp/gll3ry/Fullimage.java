package e.hp.gll3ry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Fullimage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullimage);

        Intent i= getIntent();

        int position= (int) i.getExtras().get("id");
        imageadapter adapter=new imageadapter(this);

        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(adapter.images[position]);
    }
}
