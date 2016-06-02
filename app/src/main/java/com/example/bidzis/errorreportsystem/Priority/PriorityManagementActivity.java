package com.example.bidzis.errorreportsystem.Priority;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bidzis.errorreportsystem.Permission.PermissionGetAllActivity;
import com.example.bidzis.errorreportsystem.R;

public class PriorityManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priority_management);

        final Button btGetAll = (Button) findViewById(R.id.btGetAllPriorities);
        final Button btGetByName = (Button) findViewById(R.id.btGetPriorityByName);
        final Button btGetById = (Button) findViewById(R.id.btGetPriorityById);
        final Button btChangeName = (Button) findViewById(R.id.btChangePriorityName);
        final Button btSave = (Button) findViewById(R.id.btSavePriority);
        final Button btRemove = (Button) findViewById(R.id.btRemovePriority);

        assert btGetAll != null;
        btGetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PriorityManagementActivity.this, PriorityGetAllActivity.class);
                PriorityManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByName != null;
        btGetByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PriorityManagementActivity.this, PriorityGetByNameActivity.class);
                PriorityManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetById != null;
        btGetById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PriorityManagementActivity.this, PriorityGetByIdActivity.class);
                PriorityManagementActivity.this.startActivity(intent);
            }
        });
        assert btChangeName != null;
        btChangeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PriorityManagementActivity.this, PriorityChangeByNameActivity.class);
                PriorityManagementActivity.this.startActivity(intent);
            }
        });
        assert btSave != null;
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PriorityManagementActivity.this, PrioritySaveActivity.class);
                PriorityManagementActivity.this.startActivity(intent);
            }
        });
        assert btRemove != null;
        btRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PriorityManagementActivity.this, PriorityRemoveActivity.class);
                PriorityManagementActivity.this.startActivity(intent);
            }
        });
    }
}
