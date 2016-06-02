package com.example.bidzis.errorreportsystem.Role;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bidzis.errorreportsystem.R;

public class RoleManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_management);


        final Button btGetAllRole = (Button) findViewById(R.id.btGetAllRole);
        final Button btGetByRoleID = (Button) findViewById(R.id.btGetByRoleID);
        final Button btGetRoleByName = (Button) findViewById(R.id.btGetRoleByName);
        final Button btRemoveRoleByID = (Button) findViewById(R.id.btRemoveRoleByID);
        final Button btSaveRole = (Button) findViewById(R.id.btSaveRole);


        assert btGetAllRole != null;
        btGetAllRole.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(RoleManagementActivity.this, RoleGetAllRoleActivity.class);
                RoleManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByRoleID != null;
        btGetByRoleID.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(RoleManagementActivity.this, RoleGetByRoleIDActivity.class);
                RoleManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetRoleByName != null;
        btGetRoleByName.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(RoleManagementActivity.this, RoleGetRoleByNameActivity.class);
                RoleManagementActivity.this.startActivity(intent);
            }
        });
        assert btRemoveRoleByID != null;
        btRemoveRoleByID.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(RoleManagementActivity.this, RoleRemoveRoleByIDActivity.class);
                RoleManagementActivity.this.startActivity(intent);
            }
        });
        assert btSaveRole != null;
        btSaveRole.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(RoleManagementActivity.this, RoleSaveRoleActivity.class);
                RoleManagementActivity.this.startActivity(intent);
            }
        });





    }
}
