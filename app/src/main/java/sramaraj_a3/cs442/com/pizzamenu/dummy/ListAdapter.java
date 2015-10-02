package sramaraj_a3.cs442.com.pizzamenu;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


	public class ListAdapter extends ArrayAdapter<String> {

	    Context mContext;
	    int layoutResourceId;
	    String data[] = null;
	    int pics[] = null;

	    public ListAdapter(Context mContext, int layoutResourceId, String[] data , int[] pics) {

	        super(mContext, layoutResourceId, data);

	        this.layoutResourceId = layoutResourceId;
	        this.mContext = mContext;
	        this.data = data;
	        this.pics = pics;
	    }

	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {

	        if(convertView==null){
	            // inflate the layout
	            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
	            convertView = inflater.inflate(layoutResourceId, parent, false);
	        }

	        // object item based on the position
	        String objectItem = data[position];
	        int pic = pics[position];

	        // get the TextView and then set the text (item name) and tag (item ID) values
	        
	        ImageView imageView = (ImageView) convertView.findViewById(R.id.image1);
	        imageView.setBackgroundResource(pic);
	        
	        TextView textViewItem = (TextView) convertView.findViewById(R.id.text1);
	        textViewItem.setText(objectItem);
	        textViewItem.setTag(objectItem);

	        return convertView;

	    }

	}

