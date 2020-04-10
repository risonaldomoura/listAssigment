package com.gabidev.listadetarefas.activity;

import android.os.Bundle;

import com.gabidev.listadetarefas.R;
import com.gabidev.listadetarefas.helper.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.gabidev.listadetarefas.adapter.TarefaAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gabidev.listadetarefas.model.Tarefa;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView mRecyclerView;
    private TarefaAdapter mAssignmentAdapter;
    private FloatingActionButton mFabButton;
    private List<Tarefa> listAssignment = new ArrayList<>();
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initControl();
    }

    private void initUI() {
        mFabButton = findViewById(R.id.fab);
        mRecyclerView = findViewById(R.id.recyclerview);
    }

    private void initControl() {
        mFabButton.setOnClickListener(this);
    }

    public void loadListAssigment() {

        Tarefa tarefa1 = new Tarefa();
        tarefa1.setNomeTarefa("Ir ao mercado");

        Tarefa tarefa2 = new Tarefa();
        tarefa2.setNomeTarefa("Ir a feira");

        listAssignment.add(tarefa1);
        listAssignment.add(tarefa2);
    }

    private void initAdapter() {
        mAssignmentAdapter = new TarefaAdapter(listAssignment);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.addItemDecoration( new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        mRecyclerView.setAdapter(mAssignmentAdapter);
    }

    @Override
    public void onClick(View v) {
        if (v == mFabButton) {
            new Utils().goToActivity(this, AddAssigmentActivity.class);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadListAssigment();
        initAdapter();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
