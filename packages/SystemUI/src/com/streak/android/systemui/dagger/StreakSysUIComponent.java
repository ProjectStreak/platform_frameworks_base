package com.streak.android.systemui.dagger;

import com.android.systemui.dagger.DefaultComponentBinder;
import com.android.systemui.dagger.DependencyProvider;
import com.android.systemui.dagger.SysUISingleton;
import com.android.systemui.dagger.SystemUIBinder;
import com.android.systemui.dagger.SysUIComponent;
import com.android.systemui.dagger.SystemUIModule;

import com.streak.android.systemui.keyguard.StreakKeyguardSliceProvider;
import com.streak.android.systemui.smartspace.KeyguardSmartspaceController;

import dagger.Subcomponent;

@SysUISingleton
@Subcomponent(modules = {
        DefaultComponentBinder.class,
        DependencyProvider.class,
        SystemUIBinder.class,
        SystemUIModule.class,
        StreakSystemUIModule.class})
public interface StreakSysUIComponent extends SysUIComponent {
    @SysUISingleton
    @Subcomponent.Builder
    interface Builder extends SysUIComponent.Builder {
        StreakSysUIComponent build();
    }

    /**
     * Member injection into the supplied argument.
     */
    void inject(StreakKeyguardSliceProvider keyguardSliceProvider);

    @SysUISingleton
    KeyguardSmartspaceController createKeyguardSmartspaceController();
}
