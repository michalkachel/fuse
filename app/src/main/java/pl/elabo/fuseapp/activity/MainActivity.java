package pl.elabo.fuseapp.activity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.OnEditorAction;
import pl.elabo.fuseapp.R;
import pl.elabo.fuseapp.activity.base.BaseActivity;

public class MainActivity extends BaseActivity {

	@Bind(R.id.logo)
	ImageView mLogo;

	@Bind(R.id.company_input)
	EditText mCompanyInput;

	@Override
	protected int getLayoutId() {
		return R.layout.activity_main;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@OnEditorAction(R.id.company_input)
	boolean onEditorAction(int actionId) {
		if (actionId == mCompanyInput.getImeActionId()) {
			onDonePressed();
			return true;
		}
		return false;
	}

	private void onDonePressed() {
		
	}


}
