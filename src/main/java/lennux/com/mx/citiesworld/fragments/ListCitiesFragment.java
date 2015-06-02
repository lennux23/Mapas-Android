package lennux.com.mx.citiesworld.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import lennux.com.mx.citiesworld.R;
import lennux.com.mx.citiesworld.adapters.ListCitiesAdapter;
import lennux.com.mx.citiesworld.models.City;


public class ListCitiesFragment extends Fragment {


    private OnFragmentInteractionListener mListener;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_cities, container, false);
        ListView listCities = (ListView) view.findViewById(R.id.listCities);
        ListCitiesAdapter adapter = new ListCitiesAdapter(getActivity(),android.R.layout.simple_list_item_1,City.getData());
        listCities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mListener.onCitySelected(City.getData().get(position));
            }
        });

        listCities.setAdapter(adapter);

        return view;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onCitySelected(City city);
    }

}
