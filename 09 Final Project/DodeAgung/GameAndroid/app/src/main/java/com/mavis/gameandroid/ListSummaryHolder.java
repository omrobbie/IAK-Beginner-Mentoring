package com.mavis.gameandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Dode Agung on 18-Aug-17.
 */

public class ListSummaryHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private ImageView item_image_score;
    private TextView item_title;
    private TextView item_score;
    private Context context;

    public ListSummaryHolder(View itemView) {
        super(itemView);

        item_image_score = (ImageView) itemView.findViewById(R.id.item_image_score);
        item_title = (TextView) itemView.findViewById(R.id.item_title);
        item_score = (TextView) itemView.findViewById(R.id.item_score);

        itemView.setOnClickListener(this);
    }

    public void bind(DataListScore dataScore) {
        int imageID = dataScore.getItem_image();
        item_image_score.setTag(imageID);
        item_image_score.setImageResource(dataScore.getItem_image());
        item_title.setText(dataScore.getItem_title());
        item_score.setText(dataScore.getItem_description());
    }

    @Override
    public void onClick(View view) {

        //Toast.makeText(view.getContext(), "Aha!! anda mengklik View" + item_title.getText().toString(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(view.getContext(),DetailListActivity.class);
        intent.putExtra("put_item_photo",(int) item_image_score.getTag());
        intent.putExtra("put_item_title", item_title.getText());
        intent.putExtra("put_item_score", item_score.getText());
        view.getContext().startActivity(intent);
    }
}
