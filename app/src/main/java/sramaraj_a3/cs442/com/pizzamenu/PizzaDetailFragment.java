package sramaraj_a3.cs442.com.pizzamenu;

import android.app.Fragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;



public class PizzaDetailFragment extends android.app.Fragment {

        public static PizzaDetailFragment newInstance(int index) {
            PizzaDetailFragment f = new PizzaDetailFragment();


            Bundle args = new Bundle();
            args.putInt("index", index);


            f.setArguments(args);

            return f;
        }

        public int getShownIndex() {


            return getArguments().getInt("index", 0);
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            View scroller = inflater.inflate(R.layout.details_fragment, container , false);



            int padding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                    4, getActivity().getResources().getDisplayMetrics());


            TextView text = (TextView) scroller.findViewById(R.id.text);
            text.setText(sramaraj_a3.cs442.com.pizzamenu.PizzaData.pizzadesc[getShownIndex()]);
            
	        ImageView imageView = (ImageView) scroller.findViewById(R.id.pizzaPic);
	        imageView.setBackgroundResource(sramaraj_a3.cs442.com.pizzamenu.PizzaData.pizzaPics[getShownIndex()]);


            return scroller;
        }
    }