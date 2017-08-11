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

public class SkillActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnfinish;
    Button beginner;
    Button baller;
    Button skill;

   @Override
   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.skill);

       btnfinish = (Button) findViewById(R.id.btnfinish);
       btnfinish.setOnClickListener(this);

       beginner = (Button) findViewById(R.id.beginner);
       baller = (Button) findViewById(R.id.baller);

       btnfinish.setEnabled(false);

       beginner.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               btnfinish.setBackgroundResource(R.drawable.button);
               btnfinish.setEnabled(true);
               skill = (Button) findViewById(R.id.beginner);

               addListenerButton();
           }
       });

       baller.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               btnfinish.setBackgroundResource(R.drawable.button);
               btnfinish.setEnabled(true);
               skill = (Button) findViewById(R.id.baller);

               addListenerButton();
           }
       });

        }


    public void addListenerButton(){
        btnfinish = (Button) findViewById(R.id.btnfinish);
        btnfinish.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //final Context context = this;
        String choice = skill.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("SKILL",choice);
        setResult(101,intent);
        finish();
    }
}
