
package com.chess.android.appdevthree.engine;

import android.os.Build;

public class EngineUtil {
    static {
        System.loadLibrary("nativeutil");
    }

    /** Return number of physical processors, i.e. hyper-threading ignored. */
    final static native int getNPhysicalProcessors();

    private static final class CpuAbi {
        static final String get() { return Build.CPU_ABI; }
    }

    /** Return file name of the internal stockfish executable,
     * or null if the internal stockfish engine is not supported. */
    public static String internalStockFishName() {
        final int sdkVersion = Integer.parseInt(Build.VERSION.SDK);
        if (sdkVersion < 4)
            return "stockfish15.mygz";
        String abi = CpuAbi.get();
        if (!abi.equals("x86") &&
            !abi.equals("armeabi-v7a") &&
            !abi.equals("mips"))
            abi = "armeabi"; // Unknown ABI, assume original ARM
        return "stockfish-" + abi;
    }

    /** Executes chmod 744 exePath. */
    final static native boolean chmod(String exePath);

    /** For synchronizing non thread safe native calls. */
    public static Object nativeLock = new Object();
}
