package com.sxjs.common.base.baseadapter.entity;

import java.util.List;

/**
 * implement the interface if the item is expandable
 * Created by luoxw
 */
public interface IExpandable<T> {
    boolean isExpanded();
    void setExpanded(boolean expanded);
    List<T> getSubItems();

    /**
     * Get the level of this item. The level start from 0.
     * If you don't care about the level, just return a negative.
     */
    int getLevel();
}
