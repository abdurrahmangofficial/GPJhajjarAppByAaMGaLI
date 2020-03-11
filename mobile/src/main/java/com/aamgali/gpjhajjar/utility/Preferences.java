package com.aamgali.gpjhajjar.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.aamgali.gpjhajjar.R;
import com.aamgali.gpjhajjar.WebViewAppApplication;

public class Preferences {
	private Context mContext;
	private SharedPreferences mSharedPreferences;

	public Preferences() {
		mContext = WebViewAppApplication.getContext();
		mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
	}

	public void clearPreferences() {
		mSharedPreferences.edit().clear().apply();
	}

	public int getRateCounter() {
		String key = mContext.getString(R.string.prefs_key_rate_counter);
		return mSharedPreferences.getInt(key, 0);
	}

	public void setRateCounter(int rateCounter) {
		String key = mContext.getString(R.string.prefs_key_rate_counter);
		mSharedPreferences.edit().putInt(key, rateCounter).apply();
	}
}
