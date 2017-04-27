package meahu.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DashboardView2 mDashboardView2 = (meahu.com.DashboardView2) findViewById(R.id.DashboardView2);
        mDashboardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDashboardView2.setCreditValueWithAnim(new Random().nextInt(950 - 350) + 350);
            }
        });
    }
}
