package pl.elabo.fuseapp.activity;

import android.os.Bundle;

import pl.elabo.fuseapp.R;
import pl.elabo.fuseapp.activity.base.BaseActivity;

public class MainActivity extends BaseActivity {

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
