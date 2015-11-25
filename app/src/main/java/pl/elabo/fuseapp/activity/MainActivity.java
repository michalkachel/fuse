package pl.elabo.fuseapp.activity;

import android.os.Bundle;
import android.widget.ImageView;

import butterknife.Bind;
import pl.elabo.fuseapp.R;
import pl.elabo.fuseapp.activity.base.BaseActivity;

public class MainActivity extends BaseActivity {

	@Bind(R.id.logo)
	ImageView mLogo;

	@Bind(R.id.input)
	ImageView mInput;

	@Override
	protected int getLayoutId() {
		return R.layout.activity_main;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
