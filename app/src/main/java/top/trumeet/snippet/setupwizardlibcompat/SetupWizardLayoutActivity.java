package top.trumeet.snippet.setupwizardlibcompat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.android.setupwizardlib.SetupWizardLayout;
import com.android.setupwizardlib.view.NavigationBar;

/**
 * Created by Trumeet on 2017/8/3.
 * @see com.android.setupwizardlib.SetupWizardLayout
 */

public class SetupWizardLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SetupWizardLayout layout = new SetupWizardLayout(this);
        layout.setHeaderText(getTitle());
        layout.getNavigationBar().setNavigationBarListener(new NavigationBar.NavigationBarListener() {
            @Override
            public void onNavigateBack() {
                onBackPressed();
            }

            @Override
            public void onNavigateNext() {
                startActivity(new Intent(SetupWizardLayoutActivity.this,
                        GlifLayoutActivity.class));
            }
        });
        layout.setProgressBarShown(true);
        setContentView(layout);
    }
}
