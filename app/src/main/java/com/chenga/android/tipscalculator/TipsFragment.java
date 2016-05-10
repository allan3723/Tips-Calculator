package com.chenga.android.tipscalculator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

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
        return v;
    }
}
