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

   @Override
   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.skill);
       addListenerButton();
        }


    public void addListenerButton(){
        btnfinish = (Button) findViewById(R.id.btnfinish);
        btnfinish.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final Context context = this;
        Intent intent = new Intent(context, LeagueActivity.class);
        startActivity(intent);
    }
}
