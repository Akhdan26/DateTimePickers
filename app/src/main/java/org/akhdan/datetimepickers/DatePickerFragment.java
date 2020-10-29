package org.akhdan.datetimepickers;

import android.app.DatePickerDialog;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment
    implements DatePickerDialog.OnDateSetListener{
        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle saveInstanceState) {
            //use the current date as the default date in the picker.
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            //create a new instance of DatePickerDialog and return it.
            return new DatePickerDialog(getActivity(),this,year,month,day);
        }
        public void onDateSet(DatePicker view, int year, int month, int day) {
            //set the activity to the Main Activity.
            MainActivity activity = (MainActivity) getActivity();
            // Invoke Main Activity's processDatePickerResult() method.
            activity.processDatePickerResult(year, month, day);

        }
    }
