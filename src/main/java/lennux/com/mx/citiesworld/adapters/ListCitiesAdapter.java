package lennux.com.mx.citiesworld.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.apache.http.entity.ContentLengthStrategy;

import java.util.ArrayList;
import java.util.zip.Inflater;

import lennux.com.mx.citiesworld.models.City;

/**
 * Created by mobilestudio06 on 01/06/15.
 */
public class ListCitiesAdapter extends ArrayAdapter {

    private Context context;
    private ArrayList<City> cities;
    private int resource;
    private LayoutInflater inflater;

    public ListCitiesAdapter(Context context, int resource, ArrayList<City> cities) {
        super(context, resource, cities);
        this.context = context;
        this.cities = cities;
        this.resource = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            holder = new ViewHolder();
            convertView = inflater.inflate(resource,parent,false);
            holder.text1 = (TextView) convertView.findViewById(android.R.id.text1);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        City city = cities.get(position);
        holder.text1.setText(city.getName());

        return convertView;
    }

    class ViewHolder {
        TextView text1;
    }
}
