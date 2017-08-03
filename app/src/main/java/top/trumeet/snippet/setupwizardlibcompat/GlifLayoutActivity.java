package top.trumeet.snippet.setupwizardlibcompat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.android.setupwizardlib.GlifLayout;

/**
 * Created by Trumeet on 2017/8/3.
 * @see com.android.setupwizardlib.GlifLayout
 */

public class GlifLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GlifLayout layout = new GlifLayout(this);
        layout.setHeaderText(getTitle());
        layout.setIcon(ContextCompat.getDrawable(this,
                R.mipmap.ic_launcher));
        setContentView(layout);
    }
}
