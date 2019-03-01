package com.fivestar.android.tabapplication;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

/**
 * Created by hunzai on 2/28/2019.
 */

public class secondFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View itemview = inflater.inflate(R.layout.secondlayout,container,false);
        CalendarView datepicker = (CalendarView)itemview.findViewById(R.id.simpleDatePicker);



        datepicker.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {


                int Monts = month+1;
                Toast.makeText(getContext(), ""+dayOfMonth +"/"+Monts+ "/"+year,Toast.LENGTH_SHORT).show();



            }
        });
        return itemview;
    }
}
