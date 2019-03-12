package com.sigma.sudokuworld.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sigma.sudokuworld.R;
import com.sigma.sudokuworld.masterdetail.SetListFragment;
import com.sigma.sudokuworld.masterdetail.SetListFragment.OnFragmentInteractionListener;
import com.sigma.sudokuworld.persistence.db.entities.Set;

import java.util.ArrayList;
import java.util.List;


public class SetRecyclerViewAdapter extends RecyclerView.Adapter<SetRecyclerViewAdapter.ViewHolder> {

    private List<Set> mSets;
    private final SetListFragment.OnFragmentInteractionListener mListener;

    public SetRecyclerViewAdapter(OnFragmentInteractionListener listener) {
        mSets = new ArrayList<>();
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_set_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mSetItem = mSets.get(position);
        holder.mIdView.setText(mSets.get(position).getName());
        holder.mContentView.setText(mSets.get(position).getDescription());

        if (mSets.get(position).isADownload()) holder.mDownloadIcon.setVisibility(View.VISIBLE);
        else holder.mDownloadIcon.setVisibility(View.INVISIBLE);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onClickSetFragmentInteraction(holder.mSetItem);
                }
            }
        });

        holder.mView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onLongClickSetFragmentInteraction(holder.mView, holder.mSetItem);
                }

                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSets.size();
    }

    public void setItems(List<Set> sets) {
        mSets = sets;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public final ImageView mDownloadIcon;
        public Set mSetItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = view.findViewById(R.id.item_number);
            mContentView = view.findViewById(R.id.content);
            mDownloadIcon = view.findViewById(R.id.downloadICON);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
