package com.cookandroid.davin;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class tuto_12 extends AppCompatActivity{
    Button next11;
    Button back11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_12);
        next11 = findViewById(R.id.next11);
        back11 = findViewById(R.id.back11);
        View decor_View = getWindow().getDecorView();
        int ui_Options = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decor_View.setSystemUiVisibility(ui_Options);
    }
    public void onDestroy(){
        tuto_1.stopBgm();
        android.util.Log.i("액티비티 테스트","ondestroy()");
        super.onDestroy();
    }
    public void onBackPressed(){
        tuto_1.stopBgm();
        android.util.Log.i("액티비티 테스트","onbackpressed()");
        super.onBackPressed();
    }
    public void skipBtnclick(View v)
    {
        tuto_1.stopBgm();
        Intent mintent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(mintent);
    }
    public void next11OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_13.class);
        startActivity(intent);
    }
    public void back11OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_11.class);
        startActivity(intent);
    }

}
