package com.gabidev.listadetarefas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gabidev.listadetarefas.R;

public class AddAssigmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_tarefa);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
