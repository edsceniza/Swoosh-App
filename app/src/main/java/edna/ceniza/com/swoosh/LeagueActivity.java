package edna.ceniza.com.swoosh;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Edna Ceniza on 11/08/2017.
 */

public class LeagueActivity extends AppCompatActivity implements View.OnClickListener {
    Button next;
    Button choice;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.league);
        Button next;
        next = (Button) findViewById(R.id.next);
        next.setEnabled(false);

        Button mens;
        Button womens;
        Button coed;
        mens = (Button) findViewById(R.id.mens);
        womens = (Button) findViewById(R.id.womens);
        coed = (Button) findViewById(R.id.coed);

        mens.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Button mens;
                Button womens;
                Button coed;
                mens = (Button) findViewById(R.id.mens);
                womens = (Button) findViewById(R.id.womens);
                coed = (Button) findViewById(R.id.coed);

                Button next;
                next = (Button) findViewById(R.id.next);
                next.setEnabled(true);
                next.setBackgroundResource(R.drawable.button);

                choice = (Button) findViewById(R.id.mens);

                addListenerButton();

                womens.setBackgroundResource(R.drawable.gradient);
                coed.setBackgroundResource(R.drawable.gradient);
            }
        });

        womens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button mens;
                Button womens;
                Button coed;
                mens = (Button) findViewById(R.id.mens);
                womens = (Button) findViewById(R.id.womens);
                coed = (Button) findViewById(R.id.coed);

                Button next;
                next = (Button) findViewById(R.id.next);
                next.setEnabled(true);
                next.setBackgroundResource(R.drawable.button);

                addListenerButton();

                coed.setBackgroundResource(R.drawable.gradient);
                mens.setBackgroundResource(R.drawable.gradient);


            }
        });

        coed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button mens;
                Button womens;
                Button coed;
                mens = (Button) findViewById(R.id.mens);
                womens = (Button) findViewById(R.id.womens);
                coed = (Button) findViewById(R.id.coed);

                Button next;
                next = (Button) findViewById(R.id.next);
                next.setEnabled(true);
                next.setBackgroundResource(R.drawable.button);

                addListenerButton();

                womens.setBackgroundResource(R.drawable.gradient);
                mens.setBackgroundResource(R.drawable.gradient);
            }
        });







    }

    public void addListenerButton(){
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final Context context = this;
        Intent intent = new Intent(context, SkillActivity.class);
        startActivity(intent);

        Button mens;
        Button womens;
        Button coed;
        mens = (Button) findViewById(R.id.mens);
        womens = (Button) findViewById(R.id.womens);
        coed = (Button) findViewById(R.id.coed);

        mens.setEnabled(false);
        womens.setEnabled(false);
        coed.setEnabled(false);
    }


}
