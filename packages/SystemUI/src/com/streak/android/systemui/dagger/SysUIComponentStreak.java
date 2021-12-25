package com.streak.android.systemui.dagger;

import com.android.systemui.dagger.DefaultComponentBinder;
import com.android.systemui.dagger.DependencyProvider;
import com.android.systemui.dagger.SysUISingleton;
import com.android.systemui.dagger.SystemUIBinder;
import com.android.systemui.dagger.SysUIComponent;
import com.android.systemui.dagger.SystemUIModule;

import com.streak.android.systemui.gamedashboard.GameDashboardModule;
import com.streak.android.systemui.keyguard.KeyguardSliceProviderStreak;
import com.streak.android.systemui.smartspace.KeyguardSmartspaceController;

import dagger.Subcomponent;

@SysUISingleton
@Subcomponent(modules = {
        DefaultComponentBinder.class,
        DependencyProvider.class,
        GameDashboardModule.class,
        SystemUIModule.class,
        SystemUIStreakBinder.class,
        SystemUIStreakModule.class})
public interface SysUIComponentStreak extends SysUIComponent {
    @SysUISingleton
    @Subcomponent.Builder
    interface Builder extends SysUIComponent.Builder {
        SysUIComponentStreak build();
    }

    /**
     * Member injection into the supplied argument.
     */
    void inject(KeyguardSliceProviderStreak keyguardSliceProviderStreak);

    @SysUISingleton
    KeyguardSmartspaceController createKeyguardSmartspaceController();
}
