package dauruy.intentlaunchactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ShopActivity extends Activity implements OnClickListener {

    private Button btnBuy;
    private Button btnBackToMain;
    private OnClickListener backToMainListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        btnBuy = (Button) findViewById(R.id.btnBuy);
        btnBackToMain = (Button) findViewById(R.id.btnBackToMain);
        btnBuy.setOnClickListener(this);

        backToMainListener = new OnClickListener() {

            @Override
            public void onClick(View v) {
                btnBackToMainHandler(v);
            }
        };
        btnBackToMain.setOnClickListener(backToMainListener);
    }

    protected void btnBackToMainHandler(View v) {
        finish();
    }

    @Override
    public void onClick(View v) {
        Intent buyIntent = new Intent(this, FullscreenActivity.class);
        startActivity(buyIntent);
    }
}
