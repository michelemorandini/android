package pt.ua.HOMEWORK2_weather.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

import pt.ua.HOMEWORK2_weather.R;
import pt.ua.HOMEWORK2_weather.fragment.WeatherFragment;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {

    private final LinkedList<String> mWordList;
    private LayoutInflater mInflater;
    private static final String ARG_PARAM1 = "param1";


    public WordListAdapter(Context context,
                           LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    class WordViewHolder extends RecyclerView.ViewHolder {

        public final TextView wordItemView;
        final WordListAdapter mAdapter;


        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
        }

    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent,
                                             int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,
                parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isTwoPane;
                AppCompatActivity activity = (AppCompatActivity)view.getContext();
                WeatherFragment weatherFragment = new WeatherFragment();
                Bundle args = new Bundle();

                args.putString(ARG_PARAM1, mWordList.get(position));
                weatherFragment.setArguments(args);

                // check if i'm using phone or tablet
                if (activity.findViewById(R.id.frame2) != null) {
                    isTwoPane = true;
                } else {
                    isTwoPane = false;
                }

                // replace fragment_weather if i'm using tablet, else replace rec
                if (isTwoPane) {
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_weather,weatherFragment).addToBackStack(null).commit();
                }
                else {
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec,weatherFragment).addToBackStack(null).commit();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
