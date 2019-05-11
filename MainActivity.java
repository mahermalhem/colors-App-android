package com.example.myapplication.colors;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    static ImageButton black, green, yellow, orange, brightBlue, darkBlue, pink, red;
    static ImageButton colorsField;
    static Button searchGoButton;
    static EditText searchTextField;
    static TextView colorId;
    static int numOfColorBox = -1;
    static LinkedList blackColorsList, greenColorList, yellowColorList, orangColorList, brightBlueColorList, darkBlueColorList, pinkColorList, redColorList;
    static int indexOfEachColorId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        black = (ImageButton) findViewById(R.id.blackcolor);
        green = (ImageButton) findViewById(R.id.greencolor);
        yellow = (ImageButton) findViewById(R.id.yallowcolor);
        orange = (ImageButton) findViewById(R.id.orangecolor);
        brightBlue = (ImageButton) findViewById(R.id.brightbluecolor);
        darkBlue = (ImageButton) findViewById(R.id.darkbluecolor);
        pink = (ImageButton) findViewById(R.id.pinkcolor);
        red = (ImageButton) findViewById(R.id.redcolor);

        colorsField = (ImageButton) findViewById(R.id.colorChangeField);
        colorId = (TextView) findViewById(R.id.colornumbers);


        adding_colors_lists();

        handling_main_colors_buttons();

        on_colors_field_click();

        searchButtonClick();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if (id == R.id.about_hexe_number) {
            Intent i = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(i);
        }
        if (id == R.id.Exit) {
            System.exit(0);
        }

        return super.onOptionsItemSelected(item);


    }


    private void handling_main_colors_buttons() {


        try {
            black.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    colorsField.setBackgroundColor(Color.parseColor("#212121"));
                    colorId.setText("#212121");
                    numOfColorBox = 0;
                    indexOfEachColorId = 0;
                }
            });

            green.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    colorsField.setBackgroundColor(Color.parseColor("#4CAF50"));
                    colorId.setText("#4CAF50");
                    numOfColorBox = 1;
                    indexOfEachColorId = 0;
                }
            });


            yellow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    colorsField.setBackgroundColor(Color.parseColor("#FFEA00"));
                    colorId.setText("#FFEA00");
                    numOfColorBox = 2;
                    indexOfEachColorId = 0;
                }
            });
            orange.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    colorsField.setBackgroundColor(Color.parseColor("#FF3D00"));
                    colorId.setText("#FF3D00");
                    numOfColorBox = 3;
                    indexOfEachColorId = 0;
                }
            });

            brightBlue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    colorsField.setBackgroundColor(Color.parseColor("#00B0FF"));
                    colorId.setText("#00B0FF");
                    numOfColorBox = 4;
                    indexOfEachColorId = 0;
                }
            });

            darkBlue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    colorsField.setBackgroundColor(Color.parseColor("#311B92"));
                    colorId.setText("#311B92");
                    numOfColorBox = 5;
                    indexOfEachColorId = 0;
                }
            });

            pink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    colorsField.setBackgroundColor(Color.parseColor("#F50057"));
                    colorId.setText("#F50057");
                    numOfColorBox = 6;
                    indexOfEachColorId = 0;
                }
            });

            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    colorsField.setBackgroundColor(Color.parseColor("#d50000"));
                    colorId.setText("#d50000");
                    numOfColorBox = 7;
                    indexOfEachColorId = 0;

                }
            });
        } catch (Exception e) {
        }


    }


    public void adding_colors_lists() {

        blackColorsList = new LinkedList();
        blackColorsList.add("#424242");
        blackColorsList.add("#616161");
        blackColorsList.add("#757575");
        blackColorsList.add("#9E9E9E");
        blackColorsList.add("#BDBDBD");
        blackColorsList.add("#E0E0E0");
        blackColorsList.add("#EEEEEE");
        blackColorsList.add("#90A4AE");
        blackColorsList.add("#78909C");
        blackColorsList.add("#607D8B");
        blackColorsList.add("#546E7A");
        blackColorsList.add("#455A64");
        blackColorsList.add("#37474F");
        blackColorsList.add("#A1887F");
        blackColorsList.add("#8D6E63");
        blackColorsList.add("#5D4037");
        blackColorsList.add("#6D4C41");
        blackColorsList.add("#5D4037");
        blackColorsList.add("#4E342E");
        blackColorsList.add("#37474F");
        blackColorsList.add("#455A64");
        blackColorsList.add("#607D8B");
        blackColorsList.add("#546E7A");
        blackColorsList.add("#78909C");
        blackColorsList.add("#90A4AE");

        greenColorList = new LinkedList();
        greenColorList.add("#2E7D32");
        greenColorList.add("#388E3C");
        greenColorList.add("#43A047");
        greenColorList.add("#4CAF50");
        greenColorList.add("#66BB6A");
        greenColorList.add("#9CCC65");
        greenColorList.add("#8BC34A");
        greenColorList.add("#7CB342");
        greenColorList.add("#689F38");
        greenColorList.add("#558B2F");
        greenColorList.add("#33691E");
        greenColorList.add("#C5E1A5");
        greenColorList.add("#A5D6A7");
        greenColorList.add("#AED581");
        greenColorList.add("#9E9D24");
        greenColorList.add("#C0CA33");
        greenColorList.add("#AFB42B");

        yellowColorList = new LinkedList();
        yellowColorList.add("#F9A825");
        yellowColorList.add("#FBC02D");
        yellowColorList.add("#FDD835");
        yellowColorList.add("#FFEB3B");
        yellowColorList.add("#FFEE58");
        yellowColorList.add("#FFF176");
        yellowColorList.add("#FFD54F");
        yellowColorList.add("#FFE082");
        yellowColorList.add("#FFF59D");
        yellowColorList.add("#FFCA28");
        yellowColorList.add("#FFC107");
        yellowColorList.add("#FFB300");
        yellowColorList.add("#FFA000");
        yellowColorList.add("#FF8F00");


        orangColorList = new LinkedList();
        orangColorList.add("#D84315");
        orangColorList.add("#E64A19");
        orangColorList.add("#F4511E");
        orangColorList.add("#FF5722");
        orangColorList.add("#FF7043");
        orangColorList.add("#FF8A65");
        orangColorList.add("#FFAB91");
        orangColorList.add("#E65100");
        orangColorList.add("#EF6C00");
        orangColorList.add("#F57C00");
        orangColorList.add("#FB8C00");
        orangColorList.add("#FFA726");
        orangColorList.add("#FFB74D");
        orangColorList.add("#FFCC80");


        brightBlueColorList = new LinkedList();
        brightBlueColorList.add("#80DEEA");
        brightBlueColorList.add("#4DD0E1");
        brightBlueColorList.add("#26C6DA");
        brightBlueColorList.add("#00BCD4");
        brightBlueColorList.add("#00ACC1");
        brightBlueColorList.add("#0097A7");
        brightBlueColorList.add("#00838F");
        brightBlueColorList.add("#006064");
        brightBlueColorList.add("#81D4FA");
        brightBlueColorList.add("#4FC3F7");
        brightBlueColorList.add("#29B6F6");
        brightBlueColorList.add("#03A9F4");
        brightBlueColorList.add("#039BE5");
        brightBlueColorList.add("#0288D1");
        brightBlueColorList.add("#0277BD");
        brightBlueColorList.add("#64B5F6");
        brightBlueColorList.add("#42A5F5");
        brightBlueColorList.add("#2196F3");
        brightBlueColorList.add("#1E88E5");
        brightBlueColorList.add("#1976D2");
        brightBlueColorList.add("#1565C0");
        brightBlueColorList.add("#0D47A1");


        darkBlueColorList = new LinkedList();
        darkBlueColorList.add("#283593");
        darkBlueColorList.add("#303F9F");
        darkBlueColorList.add("#3949AB");
        darkBlueColorList.add("#3F51B5");
        darkBlueColorList.add("#5C6BC0");
        darkBlueColorList.add("#7986CB");
        darkBlueColorList.add("#9575CD");
        darkBlueColorList.add("#7E57C2");
        darkBlueColorList.add("#673AB7");
        darkBlueColorList.add("#5E35B1");
        darkBlueColorList.add("#512DA8");
        darkBlueColorList.add("#4527A0");
        darkBlueColorList.add("#9C27B0");
        darkBlueColorList.add("#AB47BC");
        darkBlueColorList.add("#7B1FA2");
        darkBlueColorList.add("#6A1B9A");
        darkBlueColorList.add("#4A148C");


        pinkColorList = new LinkedList();
        pinkColorList.add("#AD1457");
        pinkColorList.add("#C2185B");
        pinkColorList.add("#D81B60");
        pinkColorList.add("#E91E63");
        pinkColorList.add("#EC407A");
        pinkColorList.add("#F06292");
        pinkColorList.add("#F48FB1");
        pinkColorList.add("#F50057");


        redColorList = new LinkedList();
        redColorList.add("#c62828");
        redColorList.add("#d32f2f");
        redColorList.add("#e53935");
        redColorList.add("#b71c1c");
        redColorList.add("#ef5350");
        redColorList.add("#e57373");
        redColorList.add("#ff1744");
        redColorList.add("#ff5252");


    }


    private void on_colors_field_click() {

        try {
            colorsField.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    switch (numOfColorBox) {
                        case 0:
                            colorsField.setBackgroundColor(Color.parseColor(blackColorsList.get(indexOfEachColorId).toString()));
                            colorId.setText(blackColorsList.get(indexOfEachColorId).toString());
                            indexOfEachColorId++;
                            if (indexOfEachColorId == 24)
                                indexOfEachColorId = 0;
                            break;


                        case 1:
                            colorsField.setBackgroundColor(Color.parseColor(greenColorList.get(indexOfEachColorId).toString()));
                            colorId.setText(greenColorList.get(indexOfEachColorId).toString());
                            indexOfEachColorId++;
                            if (indexOfEachColorId == 16)
                                indexOfEachColorId = 0;
                            break;

                        case 2:
                            colorsField.setBackgroundColor(Color.parseColor(yellowColorList.get(indexOfEachColorId).toString()));
                            colorId.setText(yellowColorList.get(indexOfEachColorId).toString());
                            indexOfEachColorId++;
                            if (indexOfEachColorId == 13)
                                indexOfEachColorId = 0;
                            break;

                        case 3:
                            colorsField.setBackgroundColor(Color.parseColor(orangColorList.get(indexOfEachColorId).toString()));
                            colorId.setText(orangColorList.get(indexOfEachColorId).toString());
                            indexOfEachColorId++;
                            if (indexOfEachColorId == 14)
                                indexOfEachColorId = 0;
                            break;

                        case 4:
                            colorsField.setBackgroundColor(Color.parseColor(brightBlueColorList.get(indexOfEachColorId).toString()));
                            colorId.setText(brightBlueColorList.get(indexOfEachColorId).toString());
                            indexOfEachColorId++;
                            if (indexOfEachColorId == 21)
                                indexOfEachColorId = 0;
                            break;

                        case 5:
                            colorsField.setBackgroundColor(Color.parseColor(darkBlueColorList.get(indexOfEachColorId).toString()));
                            colorId.setText(darkBlueColorList.get(indexOfEachColorId).toString());
                            indexOfEachColorId++;
                            if (indexOfEachColorId == 16)
                                indexOfEachColorId = 0;
                            break;

                        case 6:
                            colorsField.setBackgroundColor(Color.parseColor(pinkColorList.get(indexOfEachColorId).toString()));
                            colorId.setText(pinkColorList.get(indexOfEachColorId).toString());
                            indexOfEachColorId++;
                            if (indexOfEachColorId == 7)
                                indexOfEachColorId = 0;
                            break;

                        case 7:
                            colorsField.setBackgroundColor(Color.parseColor(redColorList.get(indexOfEachColorId).toString()));
                            colorId.setText(redColorList.get(indexOfEachColorId).toString());
                            indexOfEachColorId++;
                            if (indexOfEachColorId == 7)
                                indexOfEachColorId = 0;
                            break;

                        default:
                            Toast.makeText(MainActivity.this, "choose color form the left boxes", Toast.LENGTH_LONG).show();

                    }


                }
            });
        } catch (Exception e) {
        }

    }


    private void searchButtonClick() {


        searchTextField = (EditText) findViewById(R.id.searchtext);
        searchGoButton = (Button) findViewById(R.id.searchbtn);


        searchGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    String textColor = searchTextField.getText().toString();

                    if (textColor.charAt(0) != '#' || textColor.length() < 7 || textColor.length() > 7)
                        Toast.makeText(MainActivity.this, "put # at first  //  the whole word = 7 characters "
                                , Toast.LENGTH_LONG).show();
                    else {
                        try {
                            colorsField.setBackgroundColor(Color.parseColor(textColor));
                            colorId.setText(textColor);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "you didn`t use hexe number " +
                                            " \n or this color dose not exist"
                                    , Toast.LENGTH_LONG).show();
                        }
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "put color name in the search"
                            , Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}



/*

here i tried to solve the error that comes from any other character except for hexe numbers but i couldn`t so i use try and catch



    public boolean  charsThatCouldNotCountain(String text){
       for (int i=1 ;i <= 6 ;i++)
       {
           if ( !(text.charAt(i)=='a')|| ! (text.charAt(i)=='b')||!(text.charAt(i)=='c')||text.charAt(i)=='d'||
                   text.charAt(i)=='e'||text.charAt(i)=='f'||text.charAt(i)=='A'
           ||text.charAt(i)=='B'||text.charAt(i)=='C'||text.charAt(i)=='D'||
                   text.charAt(i)=='E'||text.charAt(i)=='F'||text.charAt(i)==0||!(text.charAt(i)==1)
                   ||!(text.charAt(i)==2)||!(text.charAt(i)==3)||text.charAt(i)==4||text.charAt(i)==5
                   ||text.charAt(i)==6||text.charAt(i)==7||text.charAt(i)==8||text.charAt(i)==9)
               return true;
       }
       return false;
    }
*/



