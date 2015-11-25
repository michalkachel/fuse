package pl.elabo.fuseapp.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.OnEditorAction;
import pl.elabo.fuseapp.MessageManager;
import pl.elabo.fuseapp.R;
import pl.elabo.fuseapp.activity.base.BaseActivity;
import pl.elabo.fuseapp.model.Company;
import pl.elabo.fuseapp.network.RestClient;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends BaseActivity {

	@Bind(R.id.logo)
	ImageView mLogo;

	@Bind(R.id.company_input)
	EditText mCompanyInput;

	Call<Company> mCompanyCall;

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
		final Editable mCompanyInputText = mCompanyInput.getText();
		if (mCompanyInputText.length() > 0) {
			String companyName = mCompanyInputText.toString();
			companyName = companyName.replaceAll("\\s", "");
			requestForCompany(companyName);
		} else {
			MessageManager.showMessage(this, R.string.message_type_company_name, false);
		}
	}

	private void requestForCompany(String companyName) {
		mCompanyCall = RestClient.getFuseApi().company(companyName);
		mCompanyCall.enqueue(new Callback<Company>() {
			@Override
			public void onResponse(Response<Company> response, Retrofit retrofit) {
				if (response.code() == 200 && response.body() != null) {
					setInputSuccessful(true);
				} else {
					setInputSuccessful(false);
				}
			}

			@Override
			public void onFailure(Throwable t) {
				setInputSuccessful(false);
			}
		});
	}

	private void setInputSuccessful(boolean success) {
		mCompanyInput.setTextColor(success ? Color.GREEN : Color.RED);
	}


}
