package com.example.testlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.testlist.adapters.Todo;
import com.example.testlist.adapters.TodoAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Todo> listTodo = new ArrayList<>();
        listTodo.add(new Todo("Récupérer ma voiture", "01/01/2019"));
        listTodo.add(new Todo("Passer l'aspirateur", "03/01/2019"));
        listTodo.add(new Todo("Acheter des tacos", "06/02/2019"));



    ListView todolist = findViewById(R.id.todolist);
    TodoAdapter adapter = new TodoAdapter(MainActivity.this, listTodo);
    todolist.setAdapter(adapter);


    }
    }

