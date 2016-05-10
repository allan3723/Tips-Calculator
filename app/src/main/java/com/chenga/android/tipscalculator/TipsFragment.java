package com.chenga.android.tipscalculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TipsFragment extends Fragment {

    EditText mTaxRate;
    EditText mZipCode;
    Button mAddButton;
    Button mDelButton;
    ListView mItemsListView;
    EditText mSubtotal;
    ListView mTotalListView;
    TextView mTotalBeforeTips;
    TextView mTipsAmount;
    TextView mGrandTotal;
    ArrayAdapter<String> mItemsListAdapter;
    ArrayAdapter<String> mTotalListAdapter;
    List<String> mItemList;

    public static Fragment newInstance() {
        return new TipsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mItemList = new ArrayList<>();
        mItemsListAdapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, mItemList);
        mTotalListAdapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, mItemList);

        //initiate view
        View v = inflater.inflate(R.layout.activity_tips, container, false);

        //initiate view elements
        mTaxRate = (EditText) v.findViewById(R.id.tax_rate_text);
        mZipCode = (EditText) v.findViewById(R.id.zip_code_text);
        mAddButton = (Button) v.findViewById(R.id.add);
        mDelButton = (Button) v.findViewById(R.id.delete);
        mItemsListView = (ListView) v.findViewById(R.id.listview_items);
        mSubtotal = (EditText) v.findViewById(R.id.subtotal);
        mTotalListView = (ListView) v.findViewById(R.id.listview_total);
        mTotalBeforeTips = (TextView) v.findViewById(R.id.total_before_tips);
        mTipsAmount = (TextView) v.findViewById(R.id.tips_amount);
        mGrandTotal = (TextView) v.findViewById(R.id.grand_total);

        //define view elements
        mItemsListView.setAdapter(mItemsListAdapter);
        mItemsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        
        mTotalListView.setAdapter(mTotalListAdapter);
        mTotalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        mTaxRate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mZipCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mDelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mSubtotal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        return v;
    }
}
