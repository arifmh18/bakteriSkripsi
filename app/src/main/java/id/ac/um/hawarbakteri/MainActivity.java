package id.ac.um.hawarbakteri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.varunest.sparkbutton.SparkButton;
import com.varunest.sparkbutton.SparkEventListener;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout menu1;
        final SparkButton sparkButton;

        menu1 = findViewById(R.id.menu1);
        sparkButton = findViewById(R.id.spark_button);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Menu Pengenalan Hawar Bakteri", Toast.LENGTH_SHORT).show();
            }
        });

        sparkButton.setEventListener(new SparkEventListener() {
            @Override
            public void onEvent(ImageView button, boolean buttonState) {

            }

            @Override
            public void onEventAnimationEnd(ImageView button, boolean buttonState) {
                if (buttonState){
                    intent = new Intent(MainActivity.this, Hasil.class);
                    startActivity(intent);

                }
            }

            @Override
            public void onEventAnimationStart(ImageView button, boolean buttonState) {

            }
        });

    }
}
