package com.android.systemui.qs;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import com.android.systemui.R;

public class QSResourcesProvider {

    private Context mContext;
    private boolean mUsesCustomResources = true;

    public QSResourcesProvider(Context context) {
        mContext = context;
    }

    public int getQuickQsMaxColumns() {
        if(mUsesCustomResources) return R.integer.streak_quick_qs_panel_max_columns;
        else return R.integer.quick_qs_panel_max_columns;
    }

    public int getQuickSettingsMinNumTiles() {
        if(mUsesCustomResources) return R.integer.streak_quick_settings_min_num_tiles;
        else return R.integer.quick_settings_min_num_tiles;
    }

    public int getQuickSettingsNumColumns() {
        if(mUsesCustomResources) return R.integer.streak_quick_settings_num_columns;
        else return R.integer.quick_settings_num_columns;
    }

    public int getQsTileStartPadding() {
        if(mUsesCustomResources) return R.dimen.streak_qs_tile_start_padding;
        else return R.dimen.qs_tile_start_padding;
    }

    public int getQsTileMarginHorizontal() {
        if(mUsesCustomResources) return R.dimen.streak_qs_tile_margin_horizontal;
        else return R.dimen.qs_tile_margin_horizontal;
    }

    public int getQsTileSize() {
        if(mUsesCustomResources) return R.dimen.streak_qs_quick_tile_size;
        else return R.dimen.qs_quick_tile_size;
    }

    public int getQsTileHeight() {
        if(mUsesCustomResources) return R.dimen.streak_qs_tile_height;
        else return R.dimen.qs_tile_height;
    }

    public int getQSTileMarginVertical() {
        if(mUsesCustomResources) return R.dimen.streak_qs_tile_margin_vertical;
        else return R.dimen.qs_tile_margin_vertical;
    }

    public int getQSTileBackground() {
        if(mUsesCustomResources) return R.drawable.streak_qs_tile_background;
        else return R.drawable.qs_tile_background;
    }
}
