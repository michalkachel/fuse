package pl.elabo.fuseapp.app;

import android.app.Application;

import pl.elabo.fuseapp.BuildConfig;
import timber.log.Timber;

public class FuseApp extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		if (BuildConfig.DEBUG) {
			Timber.plant(new Timber.DebugTree());
		}
	}
}
