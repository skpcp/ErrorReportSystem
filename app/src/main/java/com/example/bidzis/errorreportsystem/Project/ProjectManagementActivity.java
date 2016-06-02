package com.example.bidzis.errorreportsystem.Project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bidzis.errorreportsystem.Priority.PriorityGetAllActivity;
import com.example.bidzis.errorreportsystem.Priority.PriorityGetByIdActivity;
import com.example.bidzis.errorreportsystem.R;

public class ProjectManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_management);

        final Button btGetAll = (Button) findViewById(R.id.btGetAllProjects);
        final Button btGetById = (Button) findViewById(R.id.btGetProjectById);
        final Button btGetByName = (Button) findViewById(R.id.btGetProjectByName);
        final Button btGetByPriority = (Button) findViewById(R.id.btGetProjectByPriorityName);
        final Button btChangeName = (Button) findViewById(R.id.btChangeProjectName);
        final Button btSave = (Button) findViewById(R.id.btSaveProject);
        final Button btRemove = (Button) findViewById(R.id.btRemoveProject);

        assert btGetAll != null;
        btGetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProjectManagementActivity.this, ProjectGetAllActivity.class);
                ProjectManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetById != null;
        btGetById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProjectManagementActivity.this, PriorityGetByIdActivity.class);
                ProjectManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByName != null;
        btGetByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProjectManagementActivity.this, ProjectGetByNameActivity.class);
                ProjectManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByPriority != null;
        btGetByPriority.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProjectManagementActivity.this, ProjectGetByPriorityActivity.class);
                ProjectManagementActivity.this.startActivity(intent);
            }
        });
        assert btChangeName != null;
        btChangeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProjectManagementActivity.this, ProjectChangeNameActivity.class);
                ProjectManagementActivity.this.startActivity(intent);
            }
        });
        assert btSave != null;
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProjectManagementActivity.this, ProjectSaveActivity.class);
                ProjectManagementActivity.this.startActivity(intent);
            }
        });
        assert btRemove != null;
        btRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProjectManagementActivity.this, ProjectRemoveActivity.class);
                ProjectManagementActivity.this.startActivity(intent);
            }
        });
    }
}
