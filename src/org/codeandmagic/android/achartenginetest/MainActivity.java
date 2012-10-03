package org.codeandmagic.android.achartenginetest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onPostCreate(final Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		if (null == savedInstanceState) {
			getSupportFragmentManager().beginTransaction().replace(R.id.chart, new ChartFragment()).commit();
		}
	}
}
