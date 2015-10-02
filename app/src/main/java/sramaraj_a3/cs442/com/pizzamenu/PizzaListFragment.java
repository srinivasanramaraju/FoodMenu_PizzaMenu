package sramaraj_a3.cs442.com.pizzamenu;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PizzaListFragment extends android.app.ListFragment {


	boolean mDualPane;

	int mCurCheckPosition = 0;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);


		sramaraj_a3.cs442.com.pizzamenu.ListAdapter connectArrayToListView = new sramaraj_a3.cs442.com.pizzamenu.ListAdapter(
				getActivity(), R.layout.custom_view,
				sramaraj_a3.cs442.com.pizzamenu.PizzaData.pizzanames, sramaraj_a3.cs442.com.pizzamenu.PizzaData.pizzaPics);

		setListAdapter(connectArrayToListView);

		View detailsFrame = getActivity().findViewById(R.id.details);

		mDualPane = detailsFrame != null
				&& detailsFrame.getVisibility() == View.VISIBLE;


		if (savedInstanceState != null) {

			mCurCheckPosition = savedInstanceState.getInt("curChoice", 0);
		}

		if (mDualPane) {

			getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
			showDetails(mCurCheckPosition);
		}
		getListView().setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub
				showDetails(position);
				
				return false;
			}
		});
		registerForContextMenu(getListView());
	}


	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("curChoice", mCurCheckPosition);
	}


	public void showDetails(int index) {

		mCurCheckPosition = index;

		if (mDualPane) {

			getListView().setItemChecked(index, true);

			PizzaDetailFragment details = (PizzaDetailFragment) getFragmentManager()
					.findFragmentById(R.id.details);

			if (details == null || details.getShownIndex() != index) {


				details = PizzaDetailFragment.newInstance(index);

				FragmentTransaction ft = getFragmentManager()
						.beginTransaction();


				ft.replace(R.id.details, details);

				ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
				ft.commit();
			}

		} else {

			Intent intent = new Intent();

			intent.setClass(getActivity(), PizzaDetailActivity.class);

			intent.putExtra("index", index);

			startActivity(intent);
		}
	}
}




