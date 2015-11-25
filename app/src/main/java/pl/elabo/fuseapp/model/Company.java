package pl.elabo.fuseapp.model;

import com.google.gson.annotations.SerializedName;

public class Company {

	@SerializedName("name")
	String mName;

	@SerializedName("logo")
	String mLogoUrl;

	@SerializedName("custom_color")
	String mCustomColor;

	@SerializedName("password_changing")
	PasswordChanging mPasswordChanging;

	public String getName() {
		return mName;
	}

	public String getLogoUrl() {
		return mLogoUrl;
	}

	public String getCustomColor() {
		return mCustomColor;
	}
}
