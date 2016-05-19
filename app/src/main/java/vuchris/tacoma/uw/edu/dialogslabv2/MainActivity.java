package vuchris.tacoma.uw.edu.dialogslabv2;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launch(View v) {
        DialogFragment fragment = null;
        if (v.getId() == R.id.fire_missiles_button) {
            fragment = new FireMissilesDialogFragment();
        } else if (v.getId() == R.id.list_button) {
            fragment = new ListDialogFragment();
        } else if (v.getId() == R.id.multi_list_button) {
            fragment = new MultiListDialogFragment();
        } else if (v.getId() == R.id.custom_button) {
            fragment = new CustomDialogFragment();
        } else if (v.getId() == R.id.time_button) {
            fragment = new TimePickerDialogFragment();
        } else if (v.getId() == R.id.date_button) {
            fragment = new DatePickerDialogFragment();
        }
        if (fragment != null)
            fragment.show(getSupportFragmentManager(), "launch");
    }

}
