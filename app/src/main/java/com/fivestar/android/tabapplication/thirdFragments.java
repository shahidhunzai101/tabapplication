package com.fivestar.android.tabapplication;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by hunzai on 2/28/2019.
 */

public class thirdFragments extends Fragment {


    Button datapickers;
    DatePickerDialog datePickerDialog;
    Calendar calendar;
    int year;
    int month;
    int dayOfMonth;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View itemview = inflater.inflate(R.layout.thirdlayout,container,false);
          datapickers = itemview.findViewById(R.id.datebtn);
          datapickers.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  calendar = Calendar.getInstance();
                  year = calendar.get(Calendar.YEAR);
                  month = calendar.get(Calendar.MONTH);
                  dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                  datePickerDialog = new DatePickerDialog(getActivity(),
                          new DatePickerDialog.OnDateSetListener() {
                              @Override
                              public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                  datapickers.setText(day + "/" + (month + 1) + "/" + year);
                              }
                          }, year, month, dayOfMonth);
                  datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
                  datePickerDialog.show();
              }
          });
        return itemview;
    }
}
