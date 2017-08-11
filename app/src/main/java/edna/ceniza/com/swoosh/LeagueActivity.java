package edna.ceniza.com.swoosh;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Edna Ceniza on 11/08/2017.
 */

public class LeagueActivity extends AppCompatActivity implements View.OnClickListener {
    Button next;
    Button choice;

    Button mens;
    Button womens;
    Button coed;

    public static final int requestskill = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.league);
        Button next;
        next = (Button) findViewById(R.id.next);
        next.setEnabled(false);

        mens = (Button) findViewById(R.id.mens);
        womens = (Button) findViewById(R.id.womens);
        coed = (Button) findViewById(R.id.coed);

        mens.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Button next;
                next = (Button) findViewById(R.id.next);
                next.setEnabled(true);
                next.setBackgroundResource(R.drawable.button);

                choice = (Button) findViewById(R.id.mens);

                addListenerButton();

            }
        });

        womens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button next;
                next = (Button) findViewById(R.id.next);
                next.setEnabled(true);
                next.setBackgroundResource(R.drawable.button);

                choice = (Button) findViewById(R.id.womens);

                addListenerButton();

            }
        });

        coed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button next;
                next = (Button) findViewById(R.id.next);
                next.setEnabled(true);
                next.setBackgroundResource(R.drawable.button);

                choice = (Button) findViewById(R.id.coed);

                addListenerButton();

            }
        });

    }

    public void addListenerButton(){
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //final Context context = this;
        Intent intent = new Intent(LeagueActivity.this, SkillActivity.class);
        startActivityForResult(intent, requestskill);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        TextView iam = (TextView) findViewById(R.id.iam);
        TextView skill = (TextView) findViewById(R.id.uskill);

        iam.setVisibility(View.VISIBLE);
        String userSkill = data.getStringExtra("SKILL");
        skill.setText(userSkill);
        skill.setVisibility(View.VISIBLE);

        next.setVisibility(View.GONE);

        mens.setEnabled(false);
        womens.setEnabled(false);
        coed.setEnabled(false);

        if(choice.getId()==R.id.mens){
            womens.setBackgroundResource(R.drawable.gradient);
            coed.setBackgroundResource(R.drawable.gradient);
        }

        if(choice.getId()==R.id.womens) {
            coed.setBackgroundResource(R.drawable.gradient);
            mens.setBackgroundResource(R.drawable.gradient);
        }

        if(choice.getId()==R.id.coed) {
            womens.setBackgroundResource(R.drawable.gradient);
            mens.setBackgroundResource(R.drawable.gradient);
        }


    }


}
