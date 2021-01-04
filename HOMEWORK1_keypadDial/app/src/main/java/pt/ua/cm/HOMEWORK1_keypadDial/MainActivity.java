package pt.ua.cm.HOMEWORK1_keypadDial;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    public String[][] twoDimensions = {
            {"Mum","3389239442"},
            {"Dad","3375843998"},
            {"Pedro","3472231689"},
    };
    private String[] nameArray = new String[0];
    private String[] numberArray = new String[0];
    private String[] nameArrayDial;
    private String[] numberArrayDial;
    Button button0 = null;
    private String[] phoneNumber = new String[0];
    private final String zero = "0";
    private final String one = "1";
    private final String two = "2";
    private final String three = "3";
    private final String four = "4";
    private final String five = "5";
    private final String six = "6";
    private final String seven = "7";
    private final String eight = "8";
    private final String nine = "9";
    private final String canc = "#";
    private final String ast = "*";
    private final String plus = "+";
    private TextView showNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showNumbers = (TextView) findViewById(R.id.textView);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        nameArray = getColumn(twoDimensions,0);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,nameArray);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        button0 = (Button) findViewById(R.id.button0);

        button0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View V){
                onLongClickPlus();
                return true;
            }
        });

        findViewById(R.id.buttonCall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone(phoneNumber);
            }
        });

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        nameArrayDial = data.getStringArrayExtra(DialModifierActivity.REPLY);
        numberArrayDial = data.getStringArrayExtra(DialModifierActivity.REPLY2);

        twoDimensions[0][0] = nameArrayDial[0];
        twoDimensions[0][1] = numberArrayDial[0];
        twoDimensions[1][0] = nameArrayDial[1];
        twoDimensions[1][1] = numberArrayDial[1];
        twoDimensions[2][0] = nameArrayDial[2];
        twoDimensions[2][1] = numberArrayDial[2];


        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        nameArray = getColumn(twoDimensions,0);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,nameArray);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        int i;
        String temp = "";
        numberArray = getColumn(twoDimensions,1);
        phoneNumber = numberArray[position].split("");
        int n=phoneNumber.length;
        for(i=0;i<n;i++) {
            temp = temp + phoneNumber[i];
        }
        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public void onLongClickPlus(){
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,plus);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addOne(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,one);
        for(i=0;i<=n;i++) {
                temp = temp + phoneNumber[i];
            }

        if (showNumbers != null)
            showNumbers.setText(temp);

    }

    public void addTwo(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,two);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addThree(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,three);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addFour(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,four);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addFive(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,five);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addSix(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,six);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addSeven(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,seven);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addEight(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,eight);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addNine(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,nine);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addZero(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,zero);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addCanc(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,canc);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void addAst(View view) {
        int i;
        String temp = "";

        int n=phoneNumber.length;
        phoneNumber=updateArray(n,phoneNumber,ast);
        for(i=0;i<=n;i++) {
            temp = temp + phoneNumber[i];
        }

        if (showNumbers != null)
            showNumbers.setText(temp);
    }

    public void undo(View view) {
        int i;
        String temp = "";
        if(phoneNumber.length > 0){
            phoneNumber=pop(phoneNumber);
            int n=phoneNumber.length;
            for(i=0;i<n;i++) {
                temp = temp + phoneNumber[i];
            }

            if (showNumbers != null)
                showNumbers.setText(temp);
        }

    }

    public String[] updateArray(int n, String arr[], String x) {
        int i;
        String newArr[] = new String[n + 1];
        for (i = 0; i < n; i++)
            newArr[i] = arr[i];
        newArr[n] = x;
        return newArr;
    }

    public static <T> T[] pop(T[] arr) {
        T[] tmp = Arrays.copyOf(arr, arr.length - 1);
        return tmp;
    }

    private void dialContactPhone(String[] phoneNumber) {
        int i;
        String temp = "";
        int n=phoneNumber.length;
        for(i=0;i<n;i++) {
            temp = temp + phoneNumber[i];
        }
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", temp, null)));
    }

    public static String[] getColumn(String[][] array, int index){
        String[] column = new String[3];
        for(int i=0; i<column.length; i++){
            column[i] = array[i][index];
        }
        return column;
    }

    public void editDial(View view) {

        String[] nameArray = new String[3];
        for(int i=0; i<nameArray.length; i++){
            nameArray[i] = twoDimensions[i][0];
        }

        String[] phoneArray = new String[3];
        for(int i=0; i<phoneArray.length; i++){
            phoneArray[i] = twoDimensions[i][1];
        }

        Intent myIntent = new Intent(this, DialModifierActivity.class);
        //myIntent.putExtra("key", value); //Optional parameters
        myIntent.putExtra("nameArray",nameArray);
        myIntent.putExtra("phoneArray",phoneArray);

        startActivityForResult(myIntent,1);

    }
}