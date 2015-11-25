package pl.elabo.fuseapp.model;

import com.google.gson.annotations.SerializedName;

public class PasswordChanging {

	@SerializedName("enabled")
	boolean mIsEnabled;

	@SerializedName("secure_field")
	String mSecureField;

}
