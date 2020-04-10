package com.gabidev.listadetarefas.helper;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Utils {

    public void goToActivity(Context ct, Class<?> calledActivity) {
        Intent myIntent = new Intent(ct, calledActivity);
        ct.startActivity(myIntent);
    }

    public void showToast(Context ct, String message) {
        Toast.makeText(ct, message, Toast.LENGTH_SHORT).show();
    }

}
