package com.android.systemui.theme;

import android.content.Context;
import android.provider.Settings;
//import androidx.core.graphics.ColorUtils;

import com.streak.support.monet.colorgiber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ColorSchemeMain {
    private final List<Integer> accent1;
    private final List<Integer> accent2;
    private final List<Integer> accent3;
    private final List<Integer> neutral1;
    private final List<Integer> neutral2;
    private final List<Integer> plainShades;

    Integer[] iArr1 = new Integer[12];
    Integer[] iArr2 = new Integer[12];
    Integer[] iArr3 = new Integer[12];
    Integer[] iArr4 = new Integer[12];
    Integer[] iArr5 = new Integer[12];

    //Integer[] plainArr = new Integer[12];

    boolean plain;

    public ColorSchemeMain(Context context, int color) {
        colorgiber cg = new colorgiber(color);
        plain = Settings.System.getInt(context.getContentResolver(), Settings.System.MONET_PLAIN_THEME, 0) != 0;
        for (int i = 0; i < 12; i++) {
            iArr1[i] = cg.getMonColor(1, i);
            iArr2[i] = cg.getMonColor(2, i);
            iArr3[i] = cg.getMonColor(3, i);
            iArr4[i] = cg.getMonColor(4, i);
            iArr5[i] = cg.getMonColor(5, i);
        }
        accent1 = Arrays.asList(iArr1);
        accent2 = Arrays.asList(iArr2);
        accent3 = Arrays.asList(iArr3);
        neutral1 = Arrays.asList(iArr4);
        neutral2 = Arrays.asList(iArr5);

        /*for (int i = 0; i < 12; i++) {
            plainArr[i] = sat(cg.getMonColor(1, i), 0);
        }*/

        // Generated using the commented code here utilizing the sat function, using hardcoded values since colors look the same in all cases so better to save the time.
        plainShades = Arrays.asList(-131587, -723724, -1842205, -3487030, -5329234, -7039852, -8816263, -10395295, -11974327, -13487566, -14869219, -16777216);
    }
    
    public final List<Integer> getAccent1() {
        return plain ? plainShades : accent1;
    }

    /*public int sat(int color, int satFactor) {
        float[] hsl= new float[3];
        ColorUtils.colorToHSL(color,hsl);
        hsl[1]=satFactor;
        return ColorUtils.HSLToColor(hsl);
    }*/

    public final List<Integer> getAllAccentColors() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(plain ? plainShades : accent1);
        arrayList.addAll(plain ? plainShades : accent2);
        arrayList.addAll(plain ? plainShades : accent3);
        return arrayList;
    }

    public final List<Integer> getAllNeutralColors() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(plain ? plainShades : neutral1);
        arrayList.addAll(plain ? plainShades : neutral2);
        return arrayList;
    }

}
