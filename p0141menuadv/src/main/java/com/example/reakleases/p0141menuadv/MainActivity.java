package com.example.reakleases.p0141menuadv;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    // Элементы экрана
    TextView tv;
    CheckBox chb;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // находим эдементы
        tv = (TextView) findViewById(R.id.textView);
        chb = (CheckBox) findViewById(R.id.chbExtMenu);

    }

    // создание меню
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


       getMenuInflater().inflate(R.menu.mymenu, menu);
        // TODO Auto-generated method stub
        // добавляем пункты меню
       // menu.add(0, 1, 0, "add");
       // menu.add(0, 2, 0, "edit");
        //menu.add(0, 3, 3, "delete");
        //menu.add(1, 4, 1, "copy");
        //menu.add(1, 5, 2, "paste");
//        menu.add(1, 6, 4, "exit");

        return super.onCreateOptionsMenu(menu);
    }

    // обновление меню
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // пункты меню с ID группы = 1 видны, если в CheckBox стоит галка
        menu.setGroupVisible(R.id.group2, chb.isChecked());
        //if (chb.isChecked())
            //menu.findItem(R.id.group2).getSubMenu().setGroupVisible(R.id.group2, chb.isChecked());
        //else menu.findItem(R.id.group2).setVisible(false);

        return super.onPrepareOptionsMenu(menu);
    }

    // обработка нажатий
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();

        // Выведем в TextView информацию о нажатом пункте меню
        sb.append("Item Menu");
        sb.append("\r\n groupId: " + String.valueOf(item.getGroupId()));
        sb.append("\r\n itemId: " + String.valueOf(item.getItemId()));
        sb.append("\r\n order: " + String.valueOf(item.getOrder()));
        sb.append("\r\n title: " + item.getTitle());
        tv.setText(sb.toString());

        return super.onOptionsItemSelected(item);
    }
}