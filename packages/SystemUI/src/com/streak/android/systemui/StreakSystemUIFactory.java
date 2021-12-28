package com.streak.android.systemui;

import android.content.Context;

import com.streak.android.systemui.dagger.StreakGlobalRootComponent;
import com.streak.android.systemui.dagger.DaggerStreakGlobalRootComponent;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class StreakSystemUIFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerStreakGlobalRootComponent.builder()
                .context(context)
                .build();
    }
}
