package com.example.cozart.cvapp;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProjectActivity extends Fragment {

    public TextView mWinstateBt;
    public TextView mMilos28Bt;
    public TextView mTruck2FoodBt;
    public Boolean mWinstateCard;
    public Boolean mMilos28Card;
    public Boolean mTruck2FoodCard;
    public TextView mWinstateText;
    public TextView mMilos28Text;
    public TextView mTruck2FoodText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_project, container, false);
        mWinstateCard = false;
        mMilos28Card = false;
        mTruck2FoodCard = false;
        mWinstateBt = rootview.findViewById(R.id.winstate_bt);
        mMilos28Bt = rootview.findViewById(R.id.milos28_bt);
        mTruck2FoodBt = rootview.findViewById(R.id.truck2food_bt);
        mWinstateText = rootview.findViewById(R.id.winstate_text);
        mMilos28Text = rootview.findViewById(R.id.milos28_text);
        mTruck2FoodText = rootview.findViewById(R.id.truck2food_text);

    onWinstateBtPress();
    onMilos28BtPress();
    onTruck2FoodBtPress();





        return rootview;
    }

    @SuppressLint("ClickableViewAccessibility")
    private void onWinstateBtPress(){
        mWinstateBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mWinstateCard){
                    mWinstateBt.setText("+");
                    mWinstateText.setText(R.string.descr_winstate);
                    mWinstateCard = false;
                }else {
                    mWinstateBt.setText("-");
                    mWinstateText.setText(R.string.project_winstate);
                    mWinstateCard = true;
                }
            }
        });
        mWinstateBt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        mWinstateBt.setAlpha(0.5f);
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL: {
                        mWinstateBt.setAlpha(1f);
                        break;
                    }
                }
                return false;
            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void onMilos28BtPress(){
        mMilos28Bt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (mMilos28Card){
                mMilos28Bt.setText("+");
                mMilos28Text.setText(R.string.descr_milos28);
                mMilos28Card = false;

            }else {
                mMilos28Bt.setText("-");
                mMilos28Text.setText(R.string.project_milos28);
                mMilos28Card = true;
            }
        }
        });
        mMilos28Bt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        mMilos28Bt.setAlpha(0.5f);
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL: {
                        mMilos28Bt.setAlpha(1f);
                        break;
                    }
                }
                return false;
            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void onTruck2FoodBtPress(){
        mTruck2FoodBt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (mTruck2FoodCard){
                mTruck2FoodBt.setText("+");
                mTruck2FoodText.setText(R.string.descr_truck2food);
                mTruck2FoodCard = false;

            }else {
                mTruck2FoodBt.setText("-");
                mTruck2FoodText.setText(R.string.project_truck2food);
                mTruck2FoodCard = true;
            }
        }
        });
     mTruck2FoodBt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        mTruck2FoodBt.setAlpha(0.5f);
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL: {
                        mTruck2FoodBt.setAlpha(1f);
                        break;
                    }
                }
                return false;
            }
        });
    }
}
