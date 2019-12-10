package com.sxjs.common.base.baseadapter.listener;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by
 */
public interface OnItemDragListener {
    void onItemDragStart(RecyclerView.ViewHolder viewHolder, int pos);
    void onItemDragMoving(RecyclerView.ViewHolder source, int from, RecyclerView.ViewHolder target, int to);
    void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int pos);

}
