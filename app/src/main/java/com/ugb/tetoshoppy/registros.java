package com.ugb.tetoshoppy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registros extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);

        editTextEmail = findViewById(R.id.editEmail);
        editTextPassword = findViewById(R.id.editPassword);
        buttonRegister = findViewById(R.id.btnRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar la lógica para registrar al usuario
                // y realizar cualquier otra validación necesaria.

                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                // Ejemplo de validación básica
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(registros.this, "", Toast.LENGTH_SHORT).show();Toast.makeText(registros.this, "Ingrese todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí puedes realizar el registro del usuario y cualquier otra acción necesaria
                    // por ejemplo, guardar los datos en una base de datos.

                    // Luego, puedes iniciar la actividad de inicio de sesión (LoginActivity)
                    // o realizar cualquier otra acción deseada.

                    Toast.makeText(registros.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                    // Aquí puedes iniciar la actividad de inicio de sesión o hacer cualquier otra acción
                }
            }
        });
    }
}