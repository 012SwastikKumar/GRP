package com.example.crms;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private List<CardItem> cardItemList;
    private Context context;

    public CardAdapter(Context context, List<CardItem> cardItemList) {
        this.context = context;
        this.cardItemList = cardItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardItem cardItem = cardItemList.get(position);

        holder.displayPictureImageView.setImageResource(cardItem.getDisplayPicture());
        holder.headingTextView.setText(cardItem.getHeading());
        holder.subHeadingTextView.setText(cardItem.getSubHeading());

        // Set a click listener for the "View More" icon
        holder.viewMoreImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to another page when the "View More" icon is clicked
//                Intent intent = new Intent(context, AnotherPageActivity.class);
//                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cardItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView displayPictureImageView;
        TextView headingTextView;
        TextView subHeadingTextView;
        ImageView viewMoreImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            displayPictureImageView = itemView.findViewById(R.id.displayPictureImageView);
            headingTextView = itemView.findViewById(R.id.headingTextView);
            subHeadingTextView = itemView.findViewById(R.id.subHeadingTextView);
            viewMoreImageView = itemView.findViewById(R.id.viewMoreImageView);
        }
    }
}
