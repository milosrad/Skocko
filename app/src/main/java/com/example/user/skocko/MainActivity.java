package com.example.user.skocko;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button mButton1,mButton2,mButton3,mButton4,mButton5,mButton6,mButton7;
    private Button mButtonStart;
    private ImageButton mImageButton1,mImageButton2,mImageButton3,mImageButton4,mImageButton5,mImageButton6;
    private ImageButton mImageButton11,mImageButton12,mImageButton13,mImageButton14;
    private ImageButton mImageButton21,mImageButton22,mImageButton23,mImageButton24;
    private ImageButton mImageButton31,mImageButton32,mImageButton33,mImageButton34;
    private ImageButton mImageButton41,mImageButton42,mImageButton43,mImageButton44;
    private ImageButton mImageButton51,mImageButton52,mImageButton53,mImageButton54;
    private ImageButton mImageButton61,mImageButton62,mImageButton63,mImageButton64;
    private ImageButton mImageButton71,mImageButton72,mImageButton73,mImageButton74;
    private ImageButton mImageButton81,mImageButton82,mImageButton83,mImageButton84;

    private TextView mTextViewTime,mTextViewPoints,mTextViewPointNumber,mTextViewAttempts,mTextViewAttemptNumber;
    private TextView mTextViewDigitalClock;

    private ImageView mImageView1,mImageView2,mImageView3,mImageView4,mImageView5,mImageView6,mImageView7;
    private ImageView mImageView8,mImageView9,mImageView10,mImageView11,mImageView12,mImageView13,mImageView14;
    private ImageView mImageView15,mImageView16,mImageView17,mImageView18,mImageView19,mImageView20,mImageView21;
    private ImageView mImageView22,mImageView23,mImageView24,mImageView25,mImageView26,mImageView27,mImageView28;

    private ProgressBar mProgressBar;

    private MyCountDownTimer myCountDownTimer;

    private int numOfAttempts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        numOfAttempts=0;
        addListenersStart();


        randomSkockoCombination();
        makingWinningCombinationGone();


    }


    private void initComponents(){

        mButton1=(Button) findViewById(R.id.button);
        mButton2=(Button) findViewById(R.id.button2);
        mButton3=(Button) findViewById(R.id.button3);
        mButton4=(Button) findViewById(R.id.button4);
        mButton5=(Button) findViewById(R.id.button5);
        mButton6=(Button) findViewById(R.id.button6);
        mButton7=(Button) findViewById(R.id.button7);

        mButtonStart=(Button) findViewById(R.id.buttonstart);

        mImageButton1=(ImageButton)findViewById(R.id.imageButton1);
        mImageButton2=(ImageButton)findViewById(R.id.imageButton2);
        mImageButton3=(ImageButton)findViewById(R.id.imageButton3);
        mImageButton4=(ImageButton)findViewById(R.id.imageButton4);
        mImageButton5=(ImageButton)findViewById(R.id.imageButton5);
        mImageButton6=(ImageButton)findViewById(R.id.imageButton6);

        mImageButton11=(ImageButton)findViewById(R.id.image11);
        mImageButton12=(ImageButton)findViewById(R.id.image12);
        mImageButton13=(ImageButton)findViewById(R.id.image13);
        mImageButton14=(ImageButton)findViewById(R.id.image14);

        mImageButton21=(ImageButton)findViewById(R.id.image21);
        mImageButton22=(ImageButton)findViewById(R.id.image22);
        mImageButton23=(ImageButton)findViewById(R.id.image23);
        mImageButton24=(ImageButton)findViewById(R.id.image24);

        mImageButton31=(ImageButton)findViewById(R.id.image31);
        mImageButton32=(ImageButton)findViewById(R.id.image32);
        mImageButton33=(ImageButton)findViewById(R.id.image33);
        mImageButton34=(ImageButton)findViewById(R.id.image34);

        mImageButton41=(ImageButton)findViewById(R.id.image41);
        mImageButton42=(ImageButton)findViewById(R.id.image42);
        mImageButton43=(ImageButton)findViewById(R.id.image43);
        mImageButton44=(ImageButton)findViewById(R.id.image44);

        mImageButton51=(ImageButton)findViewById(R.id.image51);
        mImageButton52=(ImageButton)findViewById(R.id.image52);
        mImageButton53=(ImageButton)findViewById(R.id.image53);
        mImageButton54=(ImageButton)findViewById(R.id.image54);

        mImageButton61=(ImageButton)findViewById(R.id.image61);
        mImageButton62=(ImageButton)findViewById(R.id.image62);
        mImageButton63=(ImageButton)findViewById(R.id.image63);
        mImageButton64=(ImageButton)findViewById(R.id.image64);

        mImageButton71=(ImageButton)findViewById(R.id.image71);
        mImageButton72=(ImageButton)findViewById(R.id.image72);
        mImageButton73=(ImageButton)findViewById(R.id.image73);
        mImageButton74=(ImageButton)findViewById(R.id.image74);

        mImageButton81=(ImageButton)findViewById(R.id.image81);
        mImageButton82=(ImageButton)findViewById(R.id.image82);
        mImageButton83=(ImageButton)findViewById(R.id.image83);
        mImageButton83=(ImageButton)findViewById(R.id.image84);

        mTextViewTime=(TextView)findViewById(R.id.time);
        mTextViewPoints=(TextView)findViewById(R.id.scorepoints);
        mTextViewPointNumber=(TextView)findViewById(R.id.pointnumbers);
        mTextViewAttempts=(TextView)findViewById(R.id.textViewattempts);
        mTextViewAttemptNumber=(TextView)findViewById(R.id.textViewnumofattempts);
        mTextViewDigitalClock=(TextView)findViewById(R.id.digitalClock);


        mImageView1=(ImageView)findViewById(R.id.imageView1);
        mImageView2=(ImageView)findViewById(R.id.imageView2);
        mImageView3=(ImageView)findViewById(R.id.imageView3);
        mImageView4=(ImageView)findViewById(R.id.imageView4);

        mImageView5=(ImageView)findViewById(R.id.imageView5);
        mImageView6=(ImageView)findViewById(R.id.imageView6);
        mImageView7=(ImageView)findViewById(R.id.imageView7);
        mImageView8=(ImageView)findViewById(R.id.imageView8);

        mImageView9=(ImageView)findViewById(R.id.imageView9);
        mImageView10=(ImageView)findViewById(R.id.imageView10);
        mImageView11=(ImageView)findViewById(R.id.imageView11);
        mImageView12=(ImageView)findViewById(R.id.imageView12);

        mImageView13=(ImageView)findViewById(R.id.imageView13);
        mImageView14=(ImageView)findViewById(R.id.imageView14);
        mImageView15=(ImageView)findViewById(R.id.imageView15);
        mImageView16=(ImageView)findViewById(R.id.imageView16);

        mImageView17=(ImageView)findViewById(R.id.imageView17);
        mImageView18=(ImageView)findViewById(R.id.imageView18);
        mImageView19=(ImageView)findViewById(R.id.imageView19);
        mImageView20=(ImageView)findViewById(R.id.imageView20);

        mImageView21=(ImageView)findViewById(R.id.imageView21);
        mImageView22=(ImageView)findViewById(R.id.imageView22);
        mImageView23=(ImageView)findViewById(R.id.imageView23);
        mImageView24=(ImageView)findViewById(R.id.imageView24);

        mImageView25=(ImageView)findViewById(R.id.imageView25);
        mImageView26=(ImageView)findViewById(R.id.imageView26);
        mImageView27=(ImageView)findViewById(R.id.imageView27);
        mImageView28=(ImageView)findViewById(R.id.imageView28);

        mProgressBar=(ProgressBar)findViewById(R.id.progressBar);


    }

    private void addListenersStart(){

        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myCountDownTimer= new MyCountDownTimer(120000,1000);
                myCountDownTimer.start();

            }
        });







    }

    public void randomSkockoCombination(){

        int[] combinationimages= new int[]{R.drawable.club,R.drawable.diamondnew,R.drawable.heart,R.drawable.joker,R.drawable.spade,R.drawable.star};

    /*    int Idrandom= (int) (Math.random()*combinationimages.length);

        mImageButton81.setImageResource(combinationimages[Idrandom]);

        Idrandom= (int) (Math.random()*combinationimages.length);

        mImageButton82.setImageResource(combinationimages[Idrandom]);

        Idrandom= (int) (Math.random()*combinationimages.length);

        mImageButton83.setImageResource(combinationimages[Idrandom]);

        Idrandom= (int) (Math.random()*combinationimages.length);

        mImageButton84.setImageResource(combinationimages[Idrandom]); */


        mImageButton81.setImageResource(combinationimages[(int)Math.random()*combinationimages.length]);

        mImageButton82.setImageResource(combinationimages[(int)Math.random()*combinationimages.length]);

        mImageButton83.setImageResource(combinationimages[(int)Math.random()*combinationimages.length]);

        mImageButton84.setImageResource(combinationimages[(int)Math.random()*combinationimages.length]);

    }

    private void addListenersRow1(){

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton11)){

                    mImageButton11.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton12)){

                    mImageButton12.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton13)){

                    mImageButton13.setImageDrawable(mImageButton1.getDrawable());
                }
                else if(imageComparation(mImageButton14)){

                    mImageButton14.setImageDrawable(mImageButton1.getDrawable());
                }

            }
        });

        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton11)){

                    mImageButton11.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton12)){

                    mImageButton12.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton13)){

                    mImageButton13.setImageDrawable(mImageButton2.getDrawable());
                }
                else if(imageComparation(mImageButton14)){

                    mImageButton14.setImageDrawable(mImageButton2.getDrawable());
                }

            }
        });

        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton11)){

                    mImageButton11.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton12)){

                    mImageButton12.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton13)){

                    mImageButton13.setImageDrawable(mImageButton3.getDrawable());
                }
                else if(imageComparation(mImageButton14)){

                    mImageButton14.setImageDrawable(mImageButton3.getDrawable());
                }

            }
        });

        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton11)){

                    mImageButton11.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton12)){

                    mImageButton12.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton13)){

                    mImageButton13.setImageDrawable(mImageButton4.getDrawable());
                }
                else if(imageComparation(mImageButton14)){

                    mImageButton14.setImageDrawable(mImageButton4.getDrawable());
                }

            }
        });

        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton11)){

                    mImageButton11.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton12)){

                    mImageButton12.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton13)){

                    mImageButton13.setImageDrawable(mImageButton5.getDrawable());
                }
                else if(imageComparation(mImageButton14)){

                    mImageButton14.setImageDrawable(mImageButton5.getDrawable());
                }

            }
        });

        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton11)){

                    mImageButton11.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton12)){

                    mImageButton12.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton13)){

                    mImageButton13.setImageDrawable(mImageButton6.getDrawable());
                }
                else if(imageComparation(mImageButton14)){

                    mImageButton14.setImageDrawable(mImageButton6.getDrawable());
                }

            }
        });

        mImageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton11.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton11.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton12.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton12.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton13.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton13.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton14.getDrawable().equals(R.drawable.emptyimage)){
                   mImageButton14.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOfAttempts++;
                mTextViewAttemptNumber.setText(""+numOfAttempts);
                possibleEmptyImagesInAttempt(mImageButton11,mImageButton12,mImageButton13,mImageButton14,mButton1);
                checkingYourCombination(mImageButton11,mImageButton12,mImageButton13,mImageButton14,mImageView1,mImageView2,mImageView3,mImageView4);
                addListenersRow2();

            }
        });


    }

    private void addListenersRow2(){

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton21)){

                    mImageButton21.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton22)){

                    mImageButton22.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton23)){

                    mImageButton23.setImageDrawable(mImageButton1.getDrawable());
                }
                else if(imageComparation(mImageButton24)){

                    mImageButton24.setImageDrawable(mImageButton1.getDrawable());
                }

            }
        });

        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton21)){

                    mImageButton21.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton22)){

                    mImageButton22.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton23)){

                    mImageButton23.setImageDrawable(mImageButton2.getDrawable());
                }
                else if(imageComparation(mImageButton24)){

                    mImageButton24.setImageDrawable(mImageButton2.getDrawable());
                }

            }
        });

        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton21)){

                    mImageButton21.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton22)){

                    mImageButton22.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton23)){

                    mImageButton23.setImageDrawable(mImageButton3.getDrawable());
                }
                else if(imageComparation(mImageButton24)){

                    mImageButton24.setImageDrawable(mImageButton3.getDrawable());
                }

            }
        });

        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton21)){

                    mImageButton21.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton22)){

                    mImageButton22.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton23)){

                    mImageButton23.setImageDrawable(mImageButton4.getDrawable());
                }
                else if(imageComparation(mImageButton24)){

                    mImageButton24.setImageDrawable(mImageButton4.getDrawable());
                }

            }
        });

        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton21)){

                    mImageButton21.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton22)){

                    mImageButton22.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton23)){

                    mImageButton23.setImageDrawable(mImageButton5.getDrawable());
                }
                else if(imageComparation(mImageButton24)){

                    mImageButton24.setImageDrawable(mImageButton5.getDrawable());
                }

            }
        });

        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton21)){

                    mImageButton21.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton22)){

                    mImageButton22.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton23)){

                    mImageButton23.setImageDrawable(mImageButton6.getDrawable());
                }
                else if(imageComparation(mImageButton24)){

                    mImageButton24.setImageDrawable(mImageButton6.getDrawable());
                }

            }
        });

        mImageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton21.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton21.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton22.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton22.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton23.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton23.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton24.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton24.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOfAttempts++;
                mTextViewAttemptNumber.setText(""+numOfAttempts);
                possibleEmptyImagesInAttempt(mImageButton21,mImageButton22,mImageButton23,mImageButton24,mButton2);
                checkingYourCombination(mImageButton21,mImageButton22,mImageButton23,mImageButton24,mImageView5,mImageView6,mImageView7,mImageView8);
                addListenersRow3();

            }
        });


    }

    private void addListenersRow3(){

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton31)){

                    mImageButton31.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton32)){

                    mImageButton32.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton33)){

                    mImageButton33.setImageDrawable(mImageButton1.getDrawable());
                }
                else if(imageComparation(mImageButton34)){

                    mImageButton34.setImageDrawable(mImageButton1.getDrawable());
                }

            }
        });

        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton31)){

                    mImageButton31.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton32)){

                    mImageButton32.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton33)){

                    mImageButton33.setImageDrawable(mImageButton2.getDrawable());
                }
                else if(imageComparation(mImageButton34)){

                    mImageButton34.setImageDrawable(mImageButton2.getDrawable());
                }

            }
        });

        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton31)){

                    mImageButton31.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton32)){

                    mImageButton32.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton33)){

                    mImageButton33.setImageDrawable(mImageButton3.getDrawable());
                }
                else if(imageComparation(mImageButton34)){

                    mImageButton34.setImageDrawable(mImageButton3.getDrawable());
                }

            }
        });

        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton31)){

                    mImageButton31.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton32)){

                    mImageButton32.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton33)){

                    mImageButton33.setImageDrawable(mImageButton4.getDrawable());
                }
                else if(imageComparation(mImageButton34)){

                    mImageButton34.setImageDrawable(mImageButton4.getDrawable());
                }

            }
        });

        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton31)){

                    mImageButton31.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton32)){

                    mImageButton32.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton33)){

                    mImageButton33.setImageDrawable(mImageButton5.getDrawable());
                }
                else if(imageComparation(mImageButton34)){

                    mImageButton34.setImageDrawable(mImageButton5.getDrawable());
                }

            }
        });

        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton31)){

                    mImageButton31.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton32)){

                    mImageButton32.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton33)){

                    mImageButton33.setImageDrawable(mImageButton6.getDrawable());
                }
                else if(imageComparation(mImageButton34)){

                    mImageButton34.setImageDrawable(mImageButton6.getDrawable());
                }

            }
        });

        mImageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton31.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton31.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton32.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton32.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton33.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton33.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton34.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton34.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOfAttempts++;
                mTextViewAttemptNumber.setText(""+numOfAttempts);
                possibleEmptyImagesInAttempt(mImageButton31,mImageButton32,mImageButton33,mImageButton34,mButton3);
                checkingYourCombination(mImageButton31,mImageButton32,mImageButton33,mImageButton34,mImageView9,mImageView10,mImageView11,mImageView12);
                addListenersRow4();


            }
        });


    }


    private void addListenersRow4(){

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton41)){

                    mImageButton41.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton42)){

                    mImageButton42.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton43)){

                    mImageButton43.setImageDrawable(mImageButton1.getDrawable());
                }
                else if(imageComparation(mImageButton44)){

                    mImageButton44.setImageDrawable(mImageButton1.getDrawable());
                }

            }
        });

        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton41)){

                    mImageButton41.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton42)){

                    mImageButton42.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton43)){

                    mImageButton43.setImageDrawable(mImageButton2.getDrawable());
                }
                else if(imageComparation(mImageButton44)){

                    mImageButton44.setImageDrawable(mImageButton2.getDrawable());
                }

            }
        });

        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton41)){

                    mImageButton41.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton42)){

                    mImageButton42.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton43)){

                    mImageButton43.setImageDrawable(mImageButton3.getDrawable());
                }
                else if(imageComparation(mImageButton44)){

                    mImageButton44.setImageDrawable(mImageButton3.getDrawable());
                }

            }
        });

        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton41)){

                    mImageButton41.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton42)){

                    mImageButton42.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton43)){

                    mImageButton43.setImageDrawable(mImageButton4.getDrawable());
                }
                else if(imageComparation(mImageButton44)){

                    mImageButton44.setImageDrawable(mImageButton4.getDrawable());
                }

            }
        });

        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton41)){

                    mImageButton41.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton42)){

                    mImageButton42.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton43)){

                    mImageButton43.setImageDrawable(mImageButton5.getDrawable());
                }
                else if(imageComparation(mImageButton44)){

                    mImageButton44.setImageDrawable(mImageButton5.getDrawable());
                }

            }
        });

        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton41)){

                    mImageButton41.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton42)){

                    mImageButton42.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton43)){

                    mImageButton43.setImageDrawable(mImageButton6.getDrawable());
                }
                else if(imageComparation(mImageButton44)){

                    mImageButton44.setImageDrawable(mImageButton6.getDrawable());
                }

            }
        });

        mImageButton41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton41.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton41.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton42.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton42.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton43.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton43.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton44.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton44.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOfAttempts++;
                mTextViewAttemptNumber.setText(""+numOfAttempts);
                possibleEmptyImagesInAttempt(mImageButton41,mImageButton42,mImageButton43,mImageButton44,mButton4);
                checkingYourCombination(mImageButton41,mImageButton42,mImageButton43,mImageButton44,mImageView13,mImageView14,mImageView15,mImageView16);
                addListenersRow5();

            }
        });


    }



    private void addListenersRow5(){

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton51)){

                    mImageButton51.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton52)){

                    mImageButton52.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton53)){

                    mImageButton53.setImageDrawable(mImageButton1.getDrawable());
                }
                else if(imageComparation(mImageButton54)){

                    mImageButton54.setImageDrawable(mImageButton1.getDrawable());
                }

            }
        });

        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton51)){

                    mImageButton51.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton52)){

                    mImageButton52.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton53)){

                    mImageButton53.setImageDrawable(mImageButton2.getDrawable());
                }
                else if(imageComparation(mImageButton54)){

                    mImageButton54.setImageDrawable(mImageButton2.getDrawable());
                }

            }
        });

        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton51)){

                    mImageButton51.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton52)){

                    mImageButton52.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton53)){

                    mImageButton53.setImageDrawable(mImageButton3.getDrawable());
                }
                else if(imageComparation(mImageButton54)){

                    mImageButton54.setImageDrawable(mImageButton3.getDrawable());
                }

            }
        });

        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton51)){

                    mImageButton51.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton52)){

                    mImageButton52.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton53)){

                    mImageButton53.setImageDrawable(mImageButton4.getDrawable());
                }
                else if(imageComparation(mImageButton54)){

                    mImageButton54.setImageDrawable(mImageButton4.getDrawable());
                }

            }
        });

        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton51)){

                    mImageButton51.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton52)){

                    mImageButton52.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton53)){

                    mImageButton53.setImageDrawable(mImageButton5.getDrawable());
                }
                else if(imageComparation(mImageButton54)){

                    mImageButton54.setImageDrawable(mImageButton5.getDrawable());
                }

            }
        });

        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton51)){

                    mImageButton51.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton52)){

                    mImageButton52.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton53)){

                    mImageButton53.setImageDrawable(mImageButton6.getDrawable());
                }
                else if(imageComparation(mImageButton54)){

                    mImageButton54.setImageDrawable(mImageButton6.getDrawable());
                }

            }
        });

        mImageButton51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton51.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton51.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton52.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton52.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton53.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton53.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton54.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton54.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOfAttempts++;
                mTextViewAttemptNumber.setText(""+numOfAttempts);
                possibleEmptyImagesInAttempt(mImageButton51,mImageButton52,mImageButton53,mImageButton54,mButton5);
                checkingYourCombination(mImageButton51,mImageButton52,mImageButton53,mImageButton54,mImageView17,mImageView18,mImageView19,mImageView20);
                addListenersRow6();

            }
        });
    }

    private void addListenersRow6(){

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton61)){

                    mImageButton61.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton62)){

                    mImageButton62.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton63)){

                    mImageButton63.setImageDrawable(mImageButton1.getDrawable());
                }
                else if(imageComparation(mImageButton64)){

                    mImageButton64.setImageDrawable(mImageButton1.getDrawable());
                }

            }
        });

        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton61)){

                    mImageButton61.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton62)){

                    mImageButton62.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton63)){

                    mImageButton63.setImageDrawable(mImageButton2.getDrawable());
                }
                else if(imageComparation(mImageButton64)){

                    mImageButton64.setImageDrawable(mImageButton2.getDrawable());
                }

            }
        });

        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton61)){

                    mImageButton61.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton62)){

                    mImageButton62.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton63)){

                    mImageButton63.setImageDrawable(mImageButton3.getDrawable());
                }
                else if(imageComparation(mImageButton64)){

                    mImageButton64.setImageDrawable(mImageButton3.getDrawable());
                }

            }
        });

        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton61)){

                    mImageButton61.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton62)){

                    mImageButton62.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton63)){

                    mImageButton63.setImageDrawable(mImageButton4.getDrawable());
                }
                else if(imageComparation(mImageButton64)){

                    mImageButton64.setImageDrawable(mImageButton4.getDrawable());
                }

            }
        });

        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton61)){

                    mImageButton61.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton62)){

                    mImageButton62.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton63)){

                    mImageButton63.setImageDrawable(mImageButton5.getDrawable());
                }
                else if(imageComparation(mImageButton64)){

                    mImageButton64.setImageDrawable(mImageButton5.getDrawable());
                }

            }
        });

        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton61)){

                    mImageButton61.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton62)){

                    mImageButton62.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton63)){

                    mImageButton63.setImageDrawable(mImageButton6.getDrawable());
                }
                else if(imageComparation(mImageButton64)){

                    mImageButton64.setImageDrawable(mImageButton6.getDrawable());
                }

            }
        });

        mImageButton61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton61.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton61.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton62.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton62.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton63.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton63.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton64.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton64.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOfAttempts++;
                mTextViewAttemptNumber.setText(""+numOfAttempts);
                possibleEmptyImagesInAttempt(mImageButton61,mImageButton62,mImageButton63,mImageButton64,mButton6);
                checkingYourCombination(mImageButton61,mImageButton62,mImageButton63,mImageButton64,mImageView21,mImageView22,mImageView23,mImageView24);
                addListenersRow7();

            }
        });
    }

    private void addListenersRow7(){

        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton71)){

                    mImageButton71.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton72)){

                    mImageButton72.setImageDrawable(mImageButton1.getDrawable());
                }

                else if(imageComparation(mImageButton73)){

                    mImageButton73.setImageDrawable(mImageButton1.getDrawable());
                }
                else if(imageComparation(mImageButton74)){

                    mImageButton74.setImageDrawable(mImageButton1.getDrawable());
                }

            }
        });

        mImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton71)){

                    mImageButton71.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton72)){

                    mImageButton72.setImageDrawable(mImageButton2.getDrawable());
                }

                else if(imageComparation(mImageButton73)){

                    mImageButton73.setImageDrawable(mImageButton2.getDrawable());
                }
                else if(imageComparation(mImageButton74)){

                    mImageButton74.setImageDrawable(mImageButton2.getDrawable());
                }

            }
        });

        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton71)){

                    mImageButton71.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton72)){

                    mImageButton72.setImageDrawable(mImageButton3.getDrawable());
                }

                else if(imageComparation(mImageButton73)){

                    mImageButton73.setImageDrawable(mImageButton3.getDrawable());
                }
                else if(imageComparation(mImageButton74)){

                    mImageButton74.setImageDrawable(mImageButton3.getDrawable());
                }

            }
        });

        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton71)){

                    mImageButton71.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton72)){

                    mImageButton72.setImageDrawable(mImageButton4.getDrawable());
                }

                else if(imageComparation(mImageButton73)){

                    mImageButton73.setImageDrawable(mImageButton4.getDrawable());
                }
                else if(imageComparation(mImageButton74)){

                    mImageButton74.setImageDrawable(mImageButton4.getDrawable());
                }

            }
        });

        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton71)){

                    mImageButton71.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton72)){

                    mImageButton72.setImageDrawable(mImageButton5.getDrawable());
                }

                else if(imageComparation(mImageButton73)){

                    mImageButton73.setImageDrawable(mImageButton5.getDrawable());
                }
                else if(imageComparation(mImageButton74)){

                    mImageButton74.setImageDrawable(mImageButton5.getDrawable());
                }

            }
        });

        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imageComparation(mImageButton71)){

                    mImageButton71.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton72)){

                    mImageButton72.setImageDrawable(mImageButton6.getDrawable());
                }

                else if(imageComparation(mImageButton73)){

                    mImageButton73.setImageDrawable(mImageButton6.getDrawable());
                }
                else if(imageComparation(mImageButton74)){

                    mImageButton74.setImageDrawable(mImageButton6.getDrawable());
                }

            }
        });

        mImageButton71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton71.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton71.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton72.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton72.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton73.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton73.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mImageButton74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mImageButton74.getDrawable().equals(R.drawable.emptyimage)){
                    mImageButton74.setImageResource(R.drawable.emptyimage);
                }
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOfAttempts++;
                mTextViewAttemptNumber.setText(""+numOfAttempts);
                possibleEmptyImagesInAttempt(mImageButton71,mImageButton72,mImageButton73,mImageButton74,mButton7);
                checkingYourCombination(mImageButton71,mImageButton72,mImageButton73,mImageButton74,mImageView25,mImageView26,mImageView27,mImageView28);


            }
        });
    }

    private void possibleEmptyImagesInAttempt(ImageButton imageButton1,ImageButton imageButton2,ImageButton imageButton3,ImageButton imageButton4,Button button){

         if(imageButton1.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.emptyimage).getConstantState()||
                 imageButton2.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.emptyimage).getConstantState()||
                 imageButton3.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.emptyimage).getConstantState()||
                 imageButton4.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.emptyimage).getConstantState()){

             Toast.makeText(MainActivity.this,R.string.empty_fields,Toast.LENGTH_LONG);

         }

        else {

             DisableButtons(imageButton1,imageButton2,imageButton3,imageButton4,button);

         }

    }

    private void DisableButtons(ImageButton imageButton1,ImageButton imageButton2,ImageButton imageButton3,ImageButton imageButton4,Button button){

        imageButton1.setEnabled(false);
        imageButton2.setEnabled(false);
        imageButton3.setEnabled(false);
        imageButton4.setEnabled(false);
        button.setEnabled(false);

    }

    public void checkingYourCombination(ImageButton imageButton1,ImageButton imageButton2,ImageButton imageButton3,ImageButton imageButton4,ImageView imageButton5,ImageView imageButton6,ImageView imageButton7,ImageView imageButton8){



        ArrayList<ImageButton> winningcombination = new ArrayList<>();
        winningcombination.add(mImageButton81);
        winningcombination.add(mImageButton82);
        winningcombination.add(mImageButton83);
        winningcombination.add(mImageButton84);

        ArrayList<ImageView> playerscombination = new ArrayList<>();
        playerscombination.add(imageButton1);
        playerscombination.add(imageButton2);
        playerscombination.add(imageButton3);
        playerscombination.add(imageButton4);

        int numOfCorrectGuess = 0;
        int numOfIncorrectGuess = 0;



        for (int i=0;i<winningcombination.size();i++){
            if (winningcombination.get(i).getDrawable().getConstantState()==playerscombination.get(i).getDrawable().getConstantState()){
                numOfCorrectGuess++;
                winningcombination.remove(i);
                playerscombination.remove(i);
            }
        }

        for (int i=playerscombination.size()-1;i>-1;i--) {
            for (int k = winningcombination.size()-1; k > -1; k--) {
                if (winningcombination.get(i).getDrawable().getConstantState() == playerscombination.get(k).getDrawable().getConstantState()) {
                    numOfIncorrectGuess++;
                    break;
                }
            }
        }




        if (numOfIncorrectGuess == 1) {
            imageButton8.setImageResource(R.drawable.circleyellow);
        } else if (numOfIncorrectGuess == 2) {
            imageButton8.setImageResource(R.drawable.circleyellow);
            imageButton7.setImageResource(R.drawable.circleyellow);
        } else if (numOfIncorrectGuess == 3) {
            imageButton8.setImageResource(R.drawable.circleyellow);
            imageButton7.setImageResource(R.drawable.circleyellow);
            imageButton6.setImageResource(R.drawable.circleyellow);
        } else if (numOfIncorrectGuess == 4) {
            imageButton8.setImageResource(R.drawable.circleyellow);
            imageButton7.setImageResource(R.drawable.circleyellow);
            imageButton6.setImageResource(R.drawable.circleyellow);
            imageButton5.setImageResource(R.drawable.circleyellow);
        }

        if (numOfCorrectGuess == 1) {
            imageButton5.setImageResource(R.drawable.circlered);
        } else if (numOfCorrectGuess == 2) {
            imageButton5.setImageResource(R.drawable.circlered);
            imageButton6.setImageResource(R.drawable.circlered);
        } else if (numOfCorrectGuess == 3) {
            imageButton5.setImageResource(R.drawable.circlered);
            imageButton6.setImageResource(R.drawable.circlered);
            imageButton7.setImageResource(R.drawable.circlered);
        } else if (numOfCorrectGuess == 4) {
            imageButton5.setImageResource(R.drawable.circlered);
            imageButton6.setImageResource(R.drawable.circlered);
            imageButton7.setImageResource(R.drawable.circlered);
            imageButton8.setImageResource(R.drawable.circlered);
        }



        if (mImageButton81.getDrawable().getConstantState() == imageButton1.getDrawable().getConstantState() && mImageButton82.getDrawable().getConstantState()
                == imageButton2.getDrawable().getConstantState() && mImageButton83.getDrawable().getConstantState() == imageButton3.getDrawable().getConstantState() && mImageButton84.getDrawable().getConstantState() == imageButton4.getDrawable().getConstantState()) {
            if (myCountDownTimer!=null){
                myCountDownTimer.cancel();
                myCountDownTimer=null;
            }
            makingWinningCombinationVisible();
            imageButton5.setImageResource(R.drawable.circlered);
            imageButton6.setImageResource(R.drawable.circlered);
            imageButton7.setImageResource(R.drawable.circlered);
            imageButton8.setImageResource(R.drawable.circlered);
            Toast.makeText(MainActivity.this, R.string.winning_combinations, Toast.LENGTH_LONG).show();

            if(numOfAttempts<7){
                mTextViewPointNumber.setText(""+30);
            }

            else{
                mTextViewPointNumber.setText(""+20);
            }


        } else {
        //    Toast.makeText(MainActivity.this, R.string.attempts_left6, Toast.LENGTH_LONG).show();
              mTextViewPointNumber.setText(""+0);
        //    listeners2();

        }


    }

    private class MyCountDownTimer extends CountDownTimer{

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            mTextViewDigitalClock.setText(""+ millisUntilFinished/1000);

            int progress= (int) (millisUntilFinished/1000);

            mProgressBar.setProgress(mProgressBar.getMax()-progress);

            mProgressBar.setDrawingCacheBackgroundColor(Color.RED);



        }

        @Override
        public void onFinish() {

            mTextViewTime.setText("Vreme je isteklo");

            Toast.makeText(MainActivity.this,R.string.time_ran_out,Toast.LENGTH_LONG).show();


            makingWinningCombinationVisible();

            mImageButton1.setEnabled(false);
            mImageButton2.setEnabled(false);
            mImageButton3.setEnabled(false);
            mImageButton4.setEnabled(false);
            mImageButton5.setEnabled(false);
            mImageButton6.setEnabled(false);


        }
    }

    public void makingWinningCombinationVisible(){

        mImageButton81.setVisibility(View.VISIBLE);
        mImageButton82.setVisibility(View.VISIBLE);
        mImageButton83.setVisibility(View.VISIBLE);
        mImageButton84.setVisibility(View.VISIBLE);


    }

    public void makingWinningCombinationGone(){

        mImageButton81.setVisibility(View.GONE);
        mImageButton82.setVisibility(View.GONE);
        mImageButton83.setVisibility(View.GONE);
        mImageButton84.setVisibility(View.GONE);


    }

    public boolean imageComparation(ImageButton imageButton){

        if (imageButton.getDrawable()!=mImageButton1.getDrawable()&&imageButton.getDrawable()!=mImageButton2.getDrawable()
                &&imageButton.getDrawable()!=mImageButton3.getDrawable()&&imageButton.getDrawable()!=mImageButton4.getDrawable()
                &&imageButton.getDrawable()!=mImageButton5.getDrawable()&&imageButton.getDrawable()!=mImageButton6.getDrawable())

            return true;

        else
            return false;

    }





}
