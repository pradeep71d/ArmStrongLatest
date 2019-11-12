package com.example.armsrong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int number=370;
        int temp1;
        int rev=0;
        int temp2;
        temp2=number;
        while(temp2!=0){
            temp1=temp2%10;
            rev=rev+temp1*temp1*temp1;
            temp2=temp2/10;
        }if (rev==number){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
