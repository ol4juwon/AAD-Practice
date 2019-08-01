package com.atidevs.pro.aadpractice.androidcore;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.atidevs.pro.aadpractice.R;
import com.google.android.material.snackbar.Snackbar;

public class AndroidCoreActivity extends AppCompatActivity {

    private Button toastBtn;
    private Button snackBarBtn;
    private CoordinatorLayout contextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_android);

        toastBtn = findViewById(R.id.btn_toast);
        snackBarBtn = findViewById(R.id.btn_snack_bar);
        contextView = findViewById(R.id.coordinator_layout);
    }

    // Learn how to display a regular toast message to the user
    public void displayToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This is a toast message!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    // Learn to display a regular snack bar message to the user
    public void displaySnackBar(View view) {
        Snackbar snackbar = Snackbar.make(
                contextView,
                getResources().getString(R.string.custom_snack_bar_message),
                Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

    // Learn to display a custom snack bar message to the user
    public void displayActionableSnackBar(View view) {
        Snackbar snackbar = Snackbar.make(
                contextView,
                getResources().getString(R.string.custom_snack_bar_message),
                Snackbar.LENGTH_LONG);

        snackbar.setAction(R.string.undo_action, v -> {
            displayToast(v);
            snackbar.dismiss();
        });

        snackbar.show();
    }

    // Learn how to display a custom toast message to the user
    public void displayCustomToast(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_toast_container));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
