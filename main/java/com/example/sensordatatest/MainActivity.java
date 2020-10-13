package com.example.sensordatatest;

import android.hardware.SensorEvent;
import android.os.Bundle;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;
import android.hardware.Sensor;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;

public class MainActivity extends AppCompatActivity implements  SensorEventListener {


    private SensorManager mySensorManager;  //sensor manager instance
    private Sensor accelerometer, gyroscope, magnetic;  //sensor instances
    private TextView textAccelerometerX, textAccelerometerY, textAccelerometerZ, textGyroscopeX, textGyroscopeY, textGyroscopeZ, textMagneticX, textMagneticY, textMagneticZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textAccelerometerX = findViewById(R.id.accelX);
        textAccelerometerY = findViewById(R.id.accelY);
        textAccelerometerZ = findViewById(R.id.accelZ);

        textGyroscopeX = findViewById(R.id.gyroX);
        textGyroscopeY = findViewById(R.id.gyroY);
        textGyroscopeZ = findViewById(R.id.gyroZ);

        textMagneticX = findViewById(R.id.magneticX);
        textMagneticY = findViewById(R.id.magneticY);
        textMagneticZ = findViewById(R.id.magneticZ);

        mySensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        accelerometer = mySensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        gyroscope = mySensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        magnetic = mySensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);

        String sensor_error = getResources().getString(R.string.error_no_sensor);
        if (accelerometer == null) {
            textAccelerometerX.setText(sensor_error);
        }
        if (gyroscope == null) {
            textGyroscopeX.setText(sensor_error);
        }
        if (magnetic == null) {
            textMagneticX.setText(sensor_error);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (accelerometer != null) {
            mySensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_FASTEST);
        }
        if (gyroscope != null) {
            mySensorManager.registerListener(this, gyroscope, SensorManager.SENSOR_DELAY_FASTEST);
        }
        if (magnetic != null) {
            mySensorManager.registerListener(this, magnetic, SensorManager.SENSOR_DELAY_FASTEST);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        mySensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        int sensorType = event.sensor.getType();
        float[] currentVal = new float[3];
        currentVal[0] = event.values[0];
        currentVal[1] = event.values[1];
        currentVal[2] = event.values[2];

        switch (sensorType) {
            case Sensor.TYPE_LINEAR_ACCELERATION:
                textAccelerometerX.setText(getResources().getString(R.string.accelX, currentVal[0]));
                textAccelerometerY.setText(getResources().getString(R.string.accelY, currentVal[1]));
                textAccelerometerZ.setText(getResources().getString(R.string.accelZ, currentVal[2]));
                break;
            case Sensor.TYPE_GYROSCOPE:
                textGyroscopeX.setText(getResources().getString(R.string.gyroX, currentVal[0]));
                textGyroscopeY.setText(getResources().getString(R.string.gyroY, currentVal[1]));
                textGyroscopeZ.setText(getResources().getString(R.string.gyroX, currentVal[2]));
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                textMagneticX.setText(getResources().getString(R.string.magneticX, currentVal[0]));
                textMagneticY.setText(getResources().getString(R.string.magneticY, currentVal[1]));
                textMagneticZ.setText(getResources().getString(R.string.magneticZ, currentVal[2]));
                break;
            default:
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}
