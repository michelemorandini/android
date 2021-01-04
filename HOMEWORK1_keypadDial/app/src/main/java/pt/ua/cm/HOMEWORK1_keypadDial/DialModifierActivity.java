package pt.ua.cm.HOMEWORK1_keypadDial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class DialModifierActivity extends AppCompatActivity {

    public static final String REPLY = "extraReply";
    public static final String REPLY2 = "extraReply2";

    boolean slot1Pressed = false;
    boolean slot2Pressed = false;
    boolean slot3Pressed = false;

    String[] nameArray;
    String[] phoneArray;

    public String[][] twoDimensions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial_modifier);

        Intent myIntent = getIntent();
        nameArray = myIntent.getStringArrayExtra("nameArray");
        phoneArray = myIntent.getStringArrayExtra("phoneArray");
    }

    public void showSlot1(View view) {

        slot1Pressed = true;
        slot2Pressed = false;
        slot3Pressed = false;


        String firstName = nameArray[0];
        String firstNumber = phoneArray[0];

        EditText editText1 = (EditText)findViewById(R.id.editText1);
        editText1.setText(firstName);

        EditText editText2 = (EditText)findViewById(R.id.editText2);
        editText2.setText(firstNumber);

    }

    public void showSlot2(View view) {

        slot1Pressed = false;
        slot2Pressed = true;
        slot3Pressed = false;

        String secondName = nameArray[1];
        String secondNumber = phoneArray[1];

        EditText editText1 = (EditText)findViewById(R.id.editText1);
        editText1.setText(secondName);

        EditText editText2 = (EditText)findViewById(R.id.editText2);
        editText2.setText(secondNumber);

    }

    public void showSlot3(View view) {

        slot1Pressed = false;
        slot2Pressed = false;
        slot3Pressed = true;

        String thirdName = nameArray[2];
        String thirdNumber = phoneArray[2];

        EditText editText1 = (EditText)findViewById(R.id.editText1);
        editText1.setText(thirdName);

        EditText editText2 = (EditText)findViewById(R.id.editText2);
        editText2.setText(thirdNumber);


    }

    public void saveDial(View view) {

        EditText editText1 = (EditText)findViewById(R.id.editText1);
        EditText editText2 = (EditText)findViewById(R.id.editText2);

        if(slot1Pressed == true){
            nameArray[0] = editText1.getText().toString();
            phoneArray[0]= editText2.getText().toString();
            Log.d("nameArray[0]: ", nameArray[0]);
        }


        else if(slot2Pressed == true){
            nameArray[1] = editText1.getText().toString();
            phoneArray[1]= editText2.getText().toString();
            Log.d("nameArray[1]: ", nameArray[1]);
        }


        else if(slot3Pressed == true){
            nameArray[2] = editText1.getText().toString();
            phoneArray[2]= editText2.getText().toString();
            Log.d("nameArray[2]: ", nameArray[2]);
        }

    }

    public void goBack(View view) {

        Log.d("name go back: ",nameArray[0]);
        Intent intent = new Intent();
        intent.putExtra(REPLY,nameArray);
        intent.putExtra(REPLY2,phoneArray);
        setResult(RESULT_OK,intent);
        finish();

    }
}