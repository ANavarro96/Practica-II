package com.p2.cicloactividad;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Actividad2 extends Activity {

    // Utiliza estas variables para guardar los datos
    private static final String RESTART_KEY = "restart";
    private static final String RESUME_KEY = "resume";
    private static final String START_KEY = "start";
    private static final String CREATE_KEY = "create";

    // String para el Log 
    private final static String TAG = "Actividad II";
    // Lifecycle counters

    // TODO:
    // Crea 4 variables que hagan de contador para contar las llamadas que se hacen en cada función
    // onCreate(), onRestart(), onStart() and
    // onResume().

    // Tendréis que aumentar el contador cuando
    // se hagan llamadas a las funciones del ciclo de la actividad

    // TODO: Crea variables para los TextView que mostrarán el valor de cada contador


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2_layout);

        // TODO: Asigna las instancias de los TextViews a sus variables
        // PISTA: Para acceder a un objeto en la interfaz, hay que utilizar findViewById()
        // Ejemplo: miTextView = findViewById(R.id.miTextView);


        Button closeButton = (Button) findViewById(R.id.bClose);
        closeButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO:
                // Este código tiene que FINALIZAR la actividad 2
            }
        });

        // Has previous state been saved?
        if (savedInstanceState != null) {

            // TODO:
            // Restaura el valor de los contadores desde el Bundle savedInstanceState


        }

        // Emit LogCat message
        Log.i(TAG, "Entered the onCreate() method");

        // TODO:
        // Actualiza el contador de la variable asociada al método
        // Actualiza la interfaz llamando a la función displayCounts()


    }

    // Lifecycle callback methods overrides

    @Override
    public void onStart() {
        super.onStart();

        // Emit LogCat message
        Log.i(TAG, "Entered the onStart() method");

        // TODO:
        // Update the appropriate count variable
        // Update the user interface
    }

    @Override
    public void onResume() {
        super.onResume();

        // Emit LogCat message
        Log.i(TAG, "Entered the onResume() method");

        // TODO:
        // Actualiza el contador de la variable asociada al método
        // Actualiza la interfaz llamando a la función displayCounts()

    }

    @Override
    public void onPause() {
        super.onPause();

        // Emit LogCat message
        Log.i(TAG, "Entered the onPause() method");
    }

    @Override
    public void onStop() {
        super.onStop();

        // Emit LogCat message
        Log.i(TAG, "Entered the onStop() method");
    }

    @Override
    public void onRestart() {
        super.onRestart();

        // Emit LogCat message
        Log.i(TAG, "Entered the onRestart() method");

        // TODO:
        // Actualiza el contador de la variable asociada al método
        // Actualiza la interfaz llamando a la función displayCounts()
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // Emit LogCat message
        Log.i(TAG, "Entered the onDestroy() method");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // TODO:
        // Guarda la información de las variables de contador en el Bundle savedInstanceState

    }


    public void displayCounts() {

        // TODO - descomenta estas lineas
    /*
		mTvCreate.setText("onCreate() calls: " + mCreate);
		mTvStart.setText("onStart() calls: " + mStart);
		mTvResume.setText("onResume() calls: " + mResume);
		mTvRestart.setText("onRestart() calls: " + mRestart);
    */

    }
}

