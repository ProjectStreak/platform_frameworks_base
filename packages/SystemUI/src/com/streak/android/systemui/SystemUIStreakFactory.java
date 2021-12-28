package com.streak.android.systemui;

import android.content.Context;

import com.streak.android.systemui.dagger.DaggerGlobalRootComponentStreak;
import com.streak.android.systemui.dagger.GlobalRootComponentStreak;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class SystemUIStreakFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentStreak.builder()
                .context(context)
                .build();
    }
}
