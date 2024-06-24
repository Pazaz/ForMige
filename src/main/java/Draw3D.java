import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OPPOFIOL")
public class Draw3D extends Draw2D {

    @OriginalMember(owner = "client!OPPOFIOL", name = "x", descriptor = "I")
    private static int _flowObfuscator9 = -436;

    @OriginalMember(owner = "client!OPPOFIOL", name = "y", descriptor = "I")
    private static int _flowObfuscator10 = -477;

    @OriginalMember(owner = "client!OPPOFIOL", name = "z", descriptor = "Z")
    private static boolean _flowObfuscator11 = true;

    @OriginalMember(owner = "client!OPPOFIOL", name = "A", descriptor = "Z")
    public static boolean lowMemory = true;

    @OriginalMember(owner = "client!OPPOFIOL", name = "B", descriptor = "Z")
    public static boolean clipX;

    @OriginalMember(owner = "client!OPPOFIOL", name = "C", descriptor = "Z")
    public static boolean opaque;

    @OriginalMember(owner = "client!OPPOFIOL", name = "D", descriptor = "Z")
    public static boolean jagged = true;

    @OriginalMember(owner = "client!OPPOFIOL", name = "E", descriptor = "I")
    public static int alpha;

    @OriginalMember(owner = "client!OPPOFIOL", name = "F", descriptor = "I")
    public static int centerX;

    @OriginalMember(owner = "client!OPPOFIOL", name = "G", descriptor = "I")
    public static int centerY;

    @OriginalMember(owner = "client!OPPOFIOL", name = "H", descriptor = "[I")
    public static int[] reciprocal15 = new int[512];

    @OriginalMember(owner = "client!OPPOFIOL", name = "I", descriptor = "[I")
    public static int[] reciprocal16 = new int[2048];

    @OriginalMember(owner = "client!OPPOFIOL", name = "J", descriptor = "[I")
    public static int[] sin = new int[2048];

    @OriginalMember(owner = "client!OPPOFIOL", name = "K", descriptor = "[I")
    public static int[] cos = new int[2048];

    @OriginalMember(owner = "client!OPPOFIOL", name = "L", descriptor = "[I")
    public static int[] lineOffset;

    @OriginalMember(owner = "client!OPPOFIOL", name = "M", descriptor = "I")
    public static int textureOffset;

    @OriginalMember(owner = "client!OPPOFIOL", name = "N", descriptor = "[LDSMJIEPN;")
    public static Pix8[] textures;

    @OriginalMember(owner = "client!OPPOFIOL", name = "O", descriptor = "[Z")
    public static boolean[] textureTranslucent;

    @OriginalMember(owner = "client!OPPOFIOL", name = "P", descriptor = "[I")
    public static int[] averageTextureRGB;

    @OriginalMember(owner = "client!OPPOFIOL", name = "Q", descriptor = "I")
    public static int poolSize;

    @OriginalMember(owner = "client!OPPOFIOL", name = "R", descriptor = "[[I")
    public static int[][] texelPool;

    @OriginalMember(owner = "client!OPPOFIOL", name = "S", descriptor = "[[I")
    public static int[][] activeTexels;

    @OriginalMember(owner = "client!OPPOFIOL", name = "T", descriptor = "[I")
    public static int[] textureCycle;

    @OriginalMember(owner = "client!OPPOFIOL", name = "U", descriptor = "I")
    public static int cycle;

    @OriginalMember(owner = "client!OPPOFIOL", name = "V", descriptor = "[I")
    public static int[] palette;

    @OriginalMember(owner = "client!OPPOFIOL", name = "W", descriptor = "[[I")
    public static int[][] texturePalette;

    @OriginalMember(owner = "client!OPPOFIOL", name = "b", descriptor = "(I)V")
    public static final void unload(int arg0) {
        reciprocal15 = null;
        reciprocal15 = null;
        sin = null;
        cos = null;
        lineOffset = null;
        textures = null;
        textureTranslucent = null;
        averageTextureRGB = null;
        texelPool = null;
        activeTexels = null;
        textureCycle = null;
        palette = null;
        texturePalette = null;
        if (arg0 >= 0) {
            for (int var1 = 1; var1 > 0; var1++) {
            }
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "(B)V")
    public static final void init2D(byte arg0) {
        lineOffset = new int[Draw2D.height2d];
        int var1;
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            for (var1 = 1; var1 > 0; var1++) {
            }
        }
        for (var1 = 0; var1 < Draw2D.height2d; var1++) {
            lineOffset[var1] = Draw2D.width2d * var1;
        }
        centerX = Draw2D.width2d / 2;
        centerY = Draw2D.height2d / 2;
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "(III)V")
    public static final void init3D(int arg0, int arg1, int arg2) {
        lineOffset = new int[arg2];
        if (arg0 < 0) {
            for (int var3 = 0; var3 < arg2; var3++) {
                lineOffset[var3] = arg1 * var3;
            }
            centerX = arg1 / 2;
            centerY = arg2 / 2;
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "c", descriptor = "(I)V")
    public static final void clearTexels(int arg0) {
        if (arg0 >= 0 && arg0 <= 0) {
            texelPool = null;
            for (int var1 = 0; var1 < 50; var1++) {
                activeTexels[var1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "(IZ)V")
    public static final void initPool(int arg0, boolean arg1) {
        int var2;
        if (!arg1) {
            for (var2 = 1; var2 > 0; var2++) {
            }
        }
        if (texelPool == null) {
            poolSize = arg0;
            if (lowMemory) {
                texelPool = new int[poolSize][16384];
            } else {
                texelPool = new int[poolSize][65536];
            }
            for (var2 = 0; var2 < 50; var2++) {
                activeTexels[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "(LXTGLDHGX;I)V")
    public static final void unpackTextures(Jagfile arg0, int arg1) {
        textureOffset = 0;
        if (arg1 != 0) {
            _flowObfuscator11 = !_flowObfuscator11;
        }
        for (int var2 = 0; var2 < 50; var2++) {
            try {
                textures[var2] = new Pix8(arg0, String.valueOf(var2), 0);
                if (lowMemory && textures[var2].width == 128) {
                    textures[var2].shrink(false);
                } else {
                    textures[var2].crop(false);
                }
                textureOffset++;
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "(II)I")
    public static final int getAverageTextureRGB(int arg0, int arg1) {
        if (arg1 != 12660) {
            return 2;
        } else if (averageTextureRGB[arg0] != 0) {
            return averageTextureRGB[arg0];
        } else {
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int var5 = texturePalette[arg0].length;
            for (int var6 = 0; var6 < var5; var6++) {
                var2 += texturePalette[arg0][var6] >> 16 & 255;
                var3 += texturePalette[arg0][var6] >> 8 & 255;
                var4 += texturePalette[arg0][var6] & 255;
            }
            int var7 = (var2 / var5 << 16) + (var3 / var5 << 8) + var4 / var5;
            var7 = setGamma(var7, 1.4D);
            if (var7 == 0) {
                var7 = 1;
            }
            averageTextureRGB[arg0] = var7;
            return var7;
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "b", descriptor = "(II)V")
    public static final void pushTexture(int arg0, int arg1) {
        if (activeTexels[arg0] != null) {
            texelPool[poolSize++] = activeTexels[arg0];
            while (arg1 >= 0) {
                _flowObfuscator9 = 7;
            }
            activeTexels[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "d", descriptor = "(I)[I")
    public static final int[] getTexels(int arg0) {
        textureCycle[arg0] = cycle++;
        if (activeTexels[arg0] != null) {
            return activeTexels[arg0];
        } else {
            int[] var1;
            int var4;
            if (poolSize > 0) {
                var1 = texelPool[--poolSize];
                texelPool[poolSize] = null;
            } else {
                int var2 = 0;
                int var3 = -1;
                for (var4 = 0; var4 < textureOffset; var4++) {
                    if (activeTexels[var4] != null && (textureCycle[var4] < var2 || var3 == -1)) {
                        var2 = textureCycle[var4];
                        var3 = var4;
                    }
                }
                var1 = activeTexels[var3];
                activeTexels[var3] = null;
            }
            activeTexels[arg0] = var1;
            Pix8 var6 = textures[arg0];
            int[] var7 = texturePalette[arg0];
            int var5;
            if (lowMemory) {
                textureTranslucent[arg0] = false;
                for (var4 = 0; var4 < 4096; var4++) {
                    var5 = var1[var4] = var7[var6.pixels[var4]] & 16316671;
                    if (var5 == 0) {
                        textureTranslucent[arg0] = true;
                    }
                    var1[4096 + var4] = var5 - (var5 >>> 3) & 16316671;
                    var1[8192 + var4] = var5 - (var5 >>> 2) & 16316671;
                    var1[12288 + var4] = var5 - (var5 >>> 2) - (var5 >>> 3) & 16316671;
                }
            } else {
                if (var6.cropRight != 64) {
                    for (var4 = 0; var4 < 16384; var4++) {
                        var1[var4] = var7[var6.pixels[var4]];
                    }
                } else {
                    for (var4 = 0; var4 < 128; var4++) {
                        for (var5 = 0; var5 < 128; var5++) {
                            var1[var5 + (var4 << 7)] = var7[var6.pixels[(var5 >> 1) + (var4 >> 1 << 6)]];
                        }
                    }
                }
                textureTranslucent[arg0] = false;
                for (var4 = 0; var4 < 16384; var4++) {
                    var1[var4] &= 16316671;
                    var5 = var1[var4];
                    if (var5 == 0) {
                        textureTranslucent[arg0] = true;
                    }
                    var1[16384 + var4] = var5 - (var5 >>> 3) & 16316671;
                    var1[32768 + var4] = var5 - (var5 >>> 2) & 16316671;
                    var1[49152 + var4] = var5 - (var5 >>> 2) - (var5 >>> 3) & 16316671;
                }
            }
            return var1;
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "(DB)V")
    public static final void setBrightness(double arg0, byte arg1) {
        int var3;
        if (arg1 != 9) {
            for (var3 = 1; var3 > 0; var3++) {
            }
        }
        double var28 = arg0 + (Math.random() * 0.03D - 0.015D);
        var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            double var5 = (double) (var4 / 8) / 64.0D + 0.0078125D;
            double var7 = (double) (var4 & 7) / 8.0D + 0.0625D;
            for (int var9 = 0; var9 < 128; var9++) {
                double var10 = (double) var9 / 128.0D;
                double var12 = var10;
                double var14 = var10;
                double var16 = var10;
                if (var7 != 0.0D) {
                    double var18;
                    if (var10 < 0.5D) {
                        var18 = var10 * (1.0D + var7);
                    } else {
                        var18 = var10 + var7 - var10 * var7;
                    }
                    double var20 = 2.0D * var10 - var18;
                    double var22 = var5 + 0.3333333333333333D;
                    if (var22 > 1.0D) {
                        var22--;
                    }
                    double var26 = var5 - 0.3333333333333333D;
                    if (var26 < 0.0D) {
                        var26++;
                    }
                    if (6.0D * var22 < 1.0D) {
                        var12 = var20 + (var18 - var20) * 6.0D * var22;
                    } else if (2.0D * var22 < 1.0D) {
                        var12 = var18;
                    } else if (3.0D * var22 < 2.0D) {
                        var12 = var20 + (var18 - var20) * (0.6666666666666666D - var22) * 6.0D;
                    } else {
                        var12 = var20;
                    }
                    if (6.0D * var5 < 1.0D) {
                        var14 = var20 + (var18 - var20) * 6.0D * var5;
                    } else if (2.0D * var5 < 1.0D) {
                        var14 = var18;
                    } else if (3.0D * var5 < 2.0D) {
                        var14 = var20 + (var18 - var20) * (0.6666666666666666D - var5) * 6.0D;
                    } else {
                        var14 = var20;
                    }
                    if (6.0D * var26 < 1.0D) {
                        var16 = var20 + (var18 - var20) * 6.0D * var26;
                    } else if (2.0D * var26 < 1.0D) {
                        var16 = var18;
                    } else if (3.0D * var26 < 2.0D) {
                        var16 = var20 + (var18 - var20) * (0.6666666666666666D - var26) * 6.0D;
                    } else {
                        var16 = var20;
                    }
                }
                int var32 = (int) (var12 * 256.0D);
                int var19 = (int) (var14 * 256.0D);
                int var33 = (int) (var16 * 256.0D);
                int var21 = (var32 << 16) + (var19 << 8) + var33;
                var21 = setGamma(var21, var28);
                if (var21 == 0) {
                    var21 = 1;
                }
                palette[var3++] = var21;
            }
        }
        for (int var29 = 0; var29 < 50; var29++) {
            if (textures[var29] != null) {
                int[] var6 = textures[var29].palette;
                texturePalette[var29] = new int[var6.length];
                for (int var31 = 0; var31 < var6.length; var31++) {
                    texturePalette[var29][var31] = setGamma(var6[var31], var28);
                    if ((texturePalette[var29][var31] & 16316671) == 0 && var31 != 0) {
                        texturePalette[var29][var31] = 1;
                    }
                }
            }
        }
        for (int var30 = 0; var30 < 50; var30++) {
            pushTexture(var30, -477);
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "(ID)I")
    public static int setGamma(int arg0, double arg1) {
        double var3 = (double) (arg0 >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 255) / 256.0D;
        double var7 = (double) (arg0 & 255) / 256.0D;
        double var12 = Math.pow(var3, arg1);
        double var13 = Math.pow(var5, arg1);
        double var14 = Math.pow(var7, arg1);
        int var9 = (int) (var12 * 256.0D);
        int var10 = (int) (var13 * 256.0D);
        int var11 = (int) (var14 * 256.0D);
        return (var9 << 16) + (var10 << 8) + var11;
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void fillGouraudTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 0;
        int var10 = 0;
        if (arg1 != arg0) {
            var9 = (arg4 - arg3 << 16) / (arg1 - arg0);
            var10 = (arg7 - arg6 << 15) / (arg1 - arg0);
        }
        int var11 = 0;
        int var12 = 0;
        if (arg2 != arg1) {
            var11 = (arg5 - arg4 << 16) / (arg2 - arg1);
            var12 = (arg8 - arg7 << 15) / (arg2 - arg1);
        }
        int var13 = 0;
        int var14 = 0;
        if (arg2 != arg0) {
            var13 = (arg3 - arg5 << 16) / (arg0 - arg2);
            var14 = (arg6 - arg8 << 15) / (arg0 - arg2);
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < Draw2D.bottom) {
                if (arg1 > Draw2D.bottom) {
                    arg1 = Draw2D.bottom;
                }
                if (arg2 > Draw2D.bottom) {
                    arg2 = Draw2D.bottom;
                }
                if (arg1 < arg2) {
                    arg5 = arg3 <<= 16;
                    arg8 = arg6 <<= 15;
                    if (arg0 < 0) {
                        arg5 -= var13 * arg0;
                        arg3 -= var9 * arg0;
                        arg8 -= var14 * arg0;
                        arg6 -= var10 * arg0;
                        arg0 = 0;
                    }
                    arg4 <<= 16;
                    arg7 <<= 15;
                    if (arg1 < 0) {
                        arg4 -= var11 * arg1;
                        arg7 -= var12 * arg1;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var13 < var9 || arg0 == arg1 && var13 > var11) {
                        arg2 -= arg1;
                        arg1 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawGouraudScanline(Draw2D.data, arg0, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
                                    arg5 += var13;
                                    arg4 += var11;
                                    arg8 += var14;
                                    arg7 += var12;
                                    arg0 += Draw2D.width2d;
                                }
                            }
                            drawGouraudScanline(Draw2D.data, arg0, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
                            arg5 += var13;
                            arg3 += var9;
                            arg8 += var14;
                            arg6 += var10;
                            arg0 += Draw2D.width2d;
                        }
                    } else {
                        arg2 -= arg1;
                        arg1 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawGouraudScanline(Draw2D.data, arg0, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
                                    arg5 += var13;
                                    arg4 += var11;
                                    arg8 += var14;
                                    arg7 += var12;
                                    arg0 += Draw2D.width2d;
                                }
                            }
                            drawGouraudScanline(Draw2D.data, arg0, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
                            arg5 += var13;
                            arg3 += var9;
                            arg8 += var14;
                            arg6 += var10;
                            arg0 += Draw2D.width2d;
                        }
                    }
                } else {
                    arg4 = arg3 <<= 16;
                    arg7 = arg6 <<= 15;
                    if (arg0 < 0) {
                        arg4 -= var13 * arg0;
                        arg3 -= var9 * arg0;
                        arg7 -= var14 * arg0;
                        arg6 -= var10 * arg0;
                        arg0 = 0;
                    }
                    arg5 <<= 16;
                    arg8 <<= 15;
                    if (arg2 < 0) {
                        arg5 -= var11 * arg2;
                        arg8 -= var12 * arg2;
                        arg2 = 0;
                    }
                    if ((arg0 == arg2 || var13 >= var9) && (arg0 != arg2 || var11 <= var9)) {
                        arg1 -= arg2;
                        arg2 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    drawGouraudScanline(Draw2D.data, arg0, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
                                    arg5 += var11;
                                    arg3 += var9;
                                    arg8 += var12;
                                    arg6 += var10;
                                    arg0 += Draw2D.width2d;
                                }
                            }
                            drawGouraudScanline(Draw2D.data, arg0, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
                            arg4 += var13;
                            arg3 += var9;
                            arg7 += var14;
                            arg6 += var10;
                            arg0 += Draw2D.width2d;
                        }
                    } else {
                        arg1 -= arg2;
                        arg2 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    drawGouraudScanline(Draw2D.data, arg0, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
                                    arg5 += var11;
                                    arg3 += var9;
                                    arg8 += var12;
                                    arg6 += var10;
                                    arg0 += Draw2D.width2d;
                                }
                            }
                            drawGouraudScanline(Draw2D.data, arg0, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
                            arg4 += var13;
                            arg3 += var9;
                            arg7 += var14;
                            arg6 += var10;
                            arg0 += Draw2D.width2d;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < Draw2D.bottom) {
                if (arg2 > Draw2D.bottom) {
                    arg2 = Draw2D.bottom;
                }
                if (arg0 > Draw2D.bottom) {
                    arg0 = Draw2D.bottom;
                }
                if (arg2 < arg0) {
                    arg3 = arg4 <<= 16;
                    arg6 = arg7 <<= 15;
                    if (arg1 < 0) {
                        arg3 -= var9 * arg1;
                        arg4 -= var11 * arg1;
                        arg6 -= var10 * arg1;
                        arg7 -= var12 * arg1;
                        arg1 = 0;
                    }
                    arg5 <<= 16;
                    arg8 <<= 15;
                    if (arg2 < 0) {
                        arg5 -= var13 * arg2;
                        arg8 -= var14 * arg2;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var9 < var11 || arg1 == arg2 && var9 > var13) {
                        arg0 -= arg2;
                        arg2 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    drawGouraudScanline(Draw2D.data, arg1, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
                                    arg3 += var9;
                                    arg5 += var13;
                                    arg6 += var10;
                                    arg8 += var14;
                                    arg1 += Draw2D.width2d;
                                }
                            }
                            drawGouraudScanline(Draw2D.data, arg1, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
                            arg3 += var9;
                            arg4 += var11;
                            arg6 += var10;
                            arg7 += var12;
                            arg1 += Draw2D.width2d;
                        }
                    } else {
                        arg0 -= arg2;
                        arg2 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    drawGouraudScanline(Draw2D.data, arg1, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
                                    arg3 += var9;
                                    arg5 += var13;
                                    arg6 += var10;
                                    arg8 += var14;
                                    arg1 += Draw2D.width2d;
                                }
                            }
                            drawGouraudScanline(Draw2D.data, arg1, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
                            arg3 += var9;
                            arg4 += var11;
                            arg6 += var10;
                            arg7 += var12;
                            arg1 += Draw2D.width2d;
                        }
                    }
                } else {
                    arg5 = arg4 <<= 16;
                    arg8 = arg7 <<= 15;
                    if (arg1 < 0) {
                        arg5 -= var9 * arg1;
                        arg4 -= var11 * arg1;
                        arg8 -= var10 * arg1;
                        arg7 -= var12 * arg1;
                        arg1 = 0;
                    }
                    arg3 <<= 16;
                    arg6 <<= 15;
                    if (arg0 < 0) {
                        arg3 -= var13 * arg0;
                        arg6 -= var14 * arg0;
                        arg0 = 0;
                    }
                    if (var9 < var11) {
                        arg2 -= arg0;
                        arg0 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawGouraudScanline(Draw2D.data, arg1, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
                                    arg3 += var13;
                                    arg4 += var11;
                                    arg6 += var14;
                                    arg7 += var12;
                                    arg1 += Draw2D.width2d;
                                }
                            }
                            drawGouraudScanline(Draw2D.data, arg1, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
                            arg5 += var9;
                            arg4 += var11;
                            arg8 += var10;
                            arg7 += var12;
                            arg1 += Draw2D.width2d;
                        }
                    } else {
                        arg2 -= arg0;
                        arg0 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawGouraudScanline(Draw2D.data, arg1, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
                                    arg3 += var13;
                                    arg4 += var11;
                                    arg6 += var14;
                                    arg7 += var12;
                                    arg1 += Draw2D.width2d;
                                }
                            }
                            drawGouraudScanline(Draw2D.data, arg1, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
                            arg5 += var9;
                            arg4 += var11;
                            arg8 += var10;
                            arg7 += var12;
                            arg1 += Draw2D.width2d;
                        }
                    }
                }
            }
        } else if (arg2 < Draw2D.bottom) {
            if (arg0 > Draw2D.bottom) {
                arg0 = Draw2D.bottom;
            }
            if (arg1 > Draw2D.bottom) {
                arg1 = Draw2D.bottom;
            }
            if (arg0 < arg1) {
                arg4 = arg5 <<= 16;
                arg7 = arg8 <<= 15;
                if (arg2 < 0) {
                    arg4 -= var11 * arg2;
                    arg5 -= var13 * arg2;
                    arg7 -= var12 * arg2;
                    arg8 -= var14 * arg2;
                    arg2 = 0;
                }
                arg3 <<= 16;
                arg6 <<= 15;
                if (arg0 < 0) {
                    arg3 -= var9 * arg0;
                    arg6 -= var10 * arg0;
                    arg0 = 0;
                }
                if (var11 < var13) {
                    arg1 -= arg0;
                    arg0 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg0--;
                        if (arg0 < 0) {
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    return;
                                }
                                drawGouraudScanline(Draw2D.data, arg2, 0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
                                arg4 += var11;
                                arg3 += var9;
                                arg7 += var12;
                                arg6 += var10;
                                arg2 += Draw2D.width2d;
                            }
                        }
                        drawGouraudScanline(Draw2D.data, arg2, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
                        arg4 += var11;
                        arg5 += var13;
                        arg7 += var12;
                        arg8 += var14;
                        arg2 += Draw2D.width2d;
                    }
                } else {
                    arg1 -= arg0;
                    arg0 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg0--;
                        if (arg0 < 0) {
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    return;
                                }
                                drawGouraudScanline(Draw2D.data, arg2, 0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
                                arg4 += var11;
                                arg3 += var9;
                                arg7 += var12;
                                arg6 += var10;
                                arg2 += Draw2D.width2d;
                            }
                        }
                        drawGouraudScanline(Draw2D.data, arg2, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
                        arg4 += var11;
                        arg5 += var13;
                        arg7 += var12;
                        arg8 += var14;
                        arg2 += Draw2D.width2d;
                    }
                }
            } else {
                arg3 = arg5 <<= 16;
                arg6 = arg8 <<= 15;
                if (arg2 < 0) {
                    arg3 -= var11 * arg2;
                    arg5 -= var13 * arg2;
                    arg6 -= var12 * arg2;
                    arg8 -= var14 * arg2;
                    arg2 = 0;
                }
                arg4 <<= 16;
                arg7 <<= 15;
                if (arg1 < 0) {
                    arg4 -= var9 * arg1;
                    arg7 -= var10 * arg1;
                    arg1 = 0;
                }
                if (var11 < var13) {
                    arg0 -= arg1;
                    arg1 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg1--;
                        if (arg1 < 0) {
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    return;
                                }
                                drawGouraudScanline(Draw2D.data, arg2, 0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
                                arg4 += var9;
                                arg5 += var13;
                                arg7 += var10;
                                arg8 += var14;
                                arg2 += Draw2D.width2d;
                            }
                        }
                        drawGouraudScanline(Draw2D.data, arg2, 0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
                        arg3 += var11;
                        arg5 += var13;
                        arg6 += var12;
                        arg8 += var14;
                        arg2 += Draw2D.width2d;
                    }
                } else {
                    arg0 -= arg1;
                    arg1 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg1--;
                        if (arg1 < 0) {
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    return;
                                }
                                drawGouraudScanline(Draw2D.data, arg2, 0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
                                arg4 += var9;
                                arg5 += var13;
                                arg7 += var10;
                                arg8 += var14;
                                arg2 += Draw2D.width2d;
                            }
                        }
                        drawGouraudScanline(Draw2D.data, arg2, 0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
                        arg3 += var11;
                        arg5 += var13;
                        arg6 += var12;
                        arg8 += var14;
                        arg2 += Draw2D.width2d;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "([IIIIIIII)V")
    public static final void drawGouraudScanline(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var17;
        if (jagged) {
            if (clipX) {
                if (arg5 - arg4 > 3) {
                    var8 = (arg7 - arg6) / (arg5 - arg4);
                } else {
                    var8 = 0;
                }
                if (arg5 > Draw2D.boundX) {
                    arg5 = Draw2D.boundX;
                }
                if (arg4 < 0) {
                    arg6 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg4 >= arg5) {
                    return;
                }
                arg1 += arg4;
                arg3 = arg5 - arg4 >> 2;
                var8 <<= 2;
            } else {
                if (arg4 >= arg5) {
                    return;
                }
                arg1 += arg4;
                arg3 = arg5 - arg4 >> 2;
                if (arg3 > 0) {
                    var8 = (arg7 - arg6) * reciprocal15[arg3] >> 15;
                } else {
                    var8 = 0;
                }
            }
            int var13;
            if (alpha != 0) {
                var9 = alpha;
                var10 = 256 - alpha;
                while (true) {
                    arg3--;
                    if (arg3 < 0) {
                        var17 = arg5 - arg4 & 3;
                        if (var17 > 0) {
                            var11 = palette[arg6 >> 8];
                            var11 = ((var11 & 16711935) * var10 >> 8 & 16711935) + ((var11 & 65280) * var10 >> 8 & 65280);
                            do {
                                arg0[arg1++] = var11 + ((arg0[arg1] & 16711935) * var9 >> 8 & 16711935) + ((arg0[arg1] & 65280) * var9 >> 8 & 65280);
                                var17--;
                            } while (var17 > 0);
                        }
                        break;
                    }
                    var11 = palette[arg6 >> 8];
                    arg6 += var8;
                    var11 = ((var11 & 16711935) * var10 >> 8 & 16711935) + ((var11 & 65280) * var10 >> 8 & 65280);
                    var13 = arg1 + 1;
                    arg0[arg1] = var11 + ((arg0[var13] & 16711935) * var9 >> 8 & 16711935) + ((arg0[var13] & 65280) * var9 >> 8 & 65280);
                    arg0[var13++] = var11 + ((arg0[var13] & 16711935) * var9 >> 8 & 16711935) + ((arg0[var13] & 65280) * var9 >> 8 & 65280);
                    arg0[var13++] = var11 + ((arg0[var13] & 16711935) * var9 >> 8 & 16711935) + ((arg0[var13] & 65280) * var9 >> 8 & 65280);
                    arg1 = var13 + 1;
                    arg0[var13] = var11 + ((arg0[arg1] & 16711935) * var9 >> 8 & 16711935) + ((arg0[arg1] & 65280) * var9 >> 8 & 65280);
                }
            } else {
                while (true) {
                    arg3--;
                    if (arg3 < 0) {
                        var17 = arg5 - arg4 & 3;
                        if (var17 > 0) {
                            var11 = palette[arg6 >> 8];
                            do {
                                arg0[arg1++] = var11;
                                var17--;
                            } while (var17 > 0);
                            return;
                        }
                        break;
                    }
                    var11 = palette[arg6 >> 8];
                    arg6 += var8;
                    var13 = arg1 + 1;
                    arg0[arg1] = var11;
                    int var14 = var13 + 1;
                    arg0[var13] = var11;
                    int var15 = var14 + 1;
                    arg0[var14] = var11;
                    arg1 = var15 + 1;
                    arg0[var15] = var11;
                }
            }
        } else if (arg4 < arg5) {
            var8 = (arg7 - arg6) / (arg5 - arg4);
            if (clipX) {
                if (arg5 > Draw2D.boundX) {
                    arg5 = Draw2D.boundX;
                }
                if (arg4 < 0) {
                    arg6 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg4 >= arg5) {
                    return;
                }
            }
            int var16 = arg1 + arg4;
            var17 = arg5 - arg4;
            if (alpha == 0) {
                do {
                    arg0[var16++] = palette[arg6 >> 8];
                    arg6 += var8;
                    var17--;
                } while (var17 > 0);
            } else {
                var9 = alpha;
                var10 = 256 - alpha;
                do {
                    var11 = palette[arg6 >> 8];
                    arg6 += var8;
                    int var12 = ((var11 & 16711935) * var10 >> 8 & 16711935) + ((var11 & 65280) * var10 >> 8 & 65280);
                    arg0[var16++] = var12 + ((arg0[var16] & 16711935) * var9 >> 8 & 16711935) + ((arg0[var16] & 65280) * var9 >> 8 & 65280);
                    var17--;
                } while (var17 > 0);
            }
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "c", descriptor = "(IIIIIII)V")
    public static final void fillTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        if (arg1 != arg0) {
            var7 = (arg4 - arg3 << 16) / (arg1 - arg0);
        }
        int var8 = 0;
        if (arg2 != arg1) {
            var8 = (arg5 - arg4 << 16) / (arg2 - arg1);
        }
        int var9 = 0;
        if (arg2 != arg0) {
            var9 = (arg3 - arg5 << 16) / (arg0 - arg2);
        }
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < Draw2D.bottom) {
                if (arg1 > Draw2D.bottom) {
                    arg1 = Draw2D.bottom;
                }
                if (arg2 > Draw2D.bottom) {
                    arg2 = Draw2D.bottom;
                }
                if (arg1 < arg2) {
                    arg5 = arg3 <<= 16;
                    if (arg0 < 0) {
                        arg5 -= var9 * arg0;
                        arg3 -= var7 * arg0;
                        arg0 = 0;
                    }
                    arg4 <<= 16;
                    if (arg1 < 0) {
                        arg4 -= var8 * arg1;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var9 < var7 || arg0 == arg1 && var9 > var8) {
                        arg2 -= arg1;
                        arg1 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawScanline(Draw2D.data, arg0, arg6, 0, arg5 >> 16, arg4 >> 16);
                                    arg5 += var9;
                                    arg4 += var8;
                                    arg0 += Draw2D.width2d;
                                }
                            }
                            drawScanline(Draw2D.data, arg0, arg6, 0, arg5 >> 16, arg3 >> 16);
                            arg5 += var9;
                            arg3 += var7;
                            arg0 += Draw2D.width2d;
                        }
                    } else {
                        arg2 -= arg1;
                        arg1 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawScanline(Draw2D.data, arg0, arg6, 0, arg4 >> 16, arg5 >> 16);
                                    arg5 += var9;
                                    arg4 += var8;
                                    arg0 += Draw2D.width2d;
                                }
                            }
                            drawScanline(Draw2D.data, arg0, arg6, 0, arg3 >> 16, arg5 >> 16);
                            arg5 += var9;
                            arg3 += var7;
                            arg0 += Draw2D.width2d;
                        }
                    }
                } else {
                    arg4 = arg3 <<= 16;
                    if (arg0 < 0) {
                        arg4 -= var9 * arg0;
                        arg3 -= var7 * arg0;
                        arg0 = 0;
                    }
                    arg5 <<= 16;
                    if (arg2 < 0) {
                        arg5 -= var8 * arg2;
                        arg2 = 0;
                    }
                    if ((arg0 == arg2 || var9 >= var7) && (arg0 != arg2 || var8 <= var7)) {
                        arg1 -= arg2;
                        arg2 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    drawScanline(Draw2D.data, arg0, arg6, 0, arg3 >> 16, arg5 >> 16);
                                    arg5 += var8;
                                    arg3 += var7;
                                    arg0 += Draw2D.width2d;
                                }
                            }
                            drawScanline(Draw2D.data, arg0, arg6, 0, arg3 >> 16, arg4 >> 16);
                            arg4 += var9;
                            arg3 += var7;
                            arg0 += Draw2D.width2d;
                        }
                    } else {
                        arg1 -= arg2;
                        arg2 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    drawScanline(Draw2D.data, arg0, arg6, 0, arg5 >> 16, arg3 >> 16);
                                    arg5 += var8;
                                    arg3 += var7;
                                    arg0 += Draw2D.width2d;
                                }
                            }
                            drawScanline(Draw2D.data, arg0, arg6, 0, arg4 >> 16, arg3 >> 16);
                            arg4 += var9;
                            arg3 += var7;
                            arg0 += Draw2D.width2d;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < Draw2D.bottom) {
                if (arg2 > Draw2D.bottom) {
                    arg2 = Draw2D.bottom;
                }
                if (arg0 > Draw2D.bottom) {
                    arg0 = Draw2D.bottom;
                }
                if (arg2 < arg0) {
                    arg3 = arg4 <<= 16;
                    if (arg1 < 0) {
                        arg3 -= var7 * arg1;
                        arg4 -= var8 * arg1;
                        arg1 = 0;
                    }
                    arg5 <<= 16;
                    if (arg2 < 0) {
                        arg5 -= var9 * arg2;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var7 < var8 || arg1 == arg2 && var7 > var9) {
                        arg0 -= arg2;
                        arg2 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    drawScanline(Draw2D.data, arg1, arg6, 0, arg3 >> 16, arg5 >> 16);
                                    arg3 += var7;
                                    arg5 += var9;
                                    arg1 += Draw2D.width2d;
                                }
                            }
                            drawScanline(Draw2D.data, arg1, arg6, 0, arg3 >> 16, arg4 >> 16);
                            arg3 += var7;
                            arg4 += var8;
                            arg1 += Draw2D.width2d;
                        }
                    } else {
                        arg0 -= arg2;
                        arg2 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    drawScanline(Draw2D.data, arg1, arg6, 0, arg5 >> 16, arg3 >> 16);
                                    arg3 += var7;
                                    arg5 += var9;
                                    arg1 += Draw2D.width2d;
                                }
                            }
                            drawScanline(Draw2D.data, arg1, arg6, 0, arg4 >> 16, arg3 >> 16);
                            arg3 += var7;
                            arg4 += var8;
                            arg1 += Draw2D.width2d;
                        }
                    }
                } else {
                    arg5 = arg4 <<= 16;
                    if (arg1 < 0) {
                        arg5 -= var7 * arg1;
                        arg4 -= var8 * arg1;
                        arg1 = 0;
                    }
                    arg3 <<= 16;
                    if (arg0 < 0) {
                        arg3 -= var9 * arg0;
                        arg0 = 0;
                    }
                    if (var7 < var8) {
                        arg2 -= arg0;
                        arg0 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawScanline(Draw2D.data, arg1, arg6, 0, arg3 >> 16, arg4 >> 16);
                                    arg3 += var9;
                                    arg4 += var8;
                                    arg1 += Draw2D.width2d;
                                }
                            }
                            drawScanline(Draw2D.data, arg1, arg6, 0, arg5 >> 16, arg4 >> 16);
                            arg5 += var7;
                            arg4 += var8;
                            arg1 += Draw2D.width2d;
                        }
                    } else {
                        arg2 -= arg0;
                        arg0 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawScanline(Draw2D.data, arg1, arg6, 0, arg4 >> 16, arg3 >> 16);
                                    arg3 += var9;
                                    arg4 += var8;
                                    arg1 += Draw2D.width2d;
                                }
                            }
                            drawScanline(Draw2D.data, arg1, arg6, 0, arg4 >> 16, arg5 >> 16);
                            arg5 += var7;
                            arg4 += var8;
                            arg1 += Draw2D.width2d;
                        }
                    }
                }
            }
        } else if (arg2 < Draw2D.bottom) {
            if (arg0 > Draw2D.bottom) {
                arg0 = Draw2D.bottom;
            }
            if (arg1 > Draw2D.bottom) {
                arg1 = Draw2D.bottom;
            }
            if (arg0 < arg1) {
                arg4 = arg5 <<= 16;
                if (arg2 < 0) {
                    arg4 -= var8 * arg2;
                    arg5 -= var9 * arg2;
                    arg2 = 0;
                }
                arg3 <<= 16;
                if (arg0 < 0) {
                    arg3 -= var7 * arg0;
                    arg0 = 0;
                }
                if (var8 < var9) {
                    arg1 -= arg0;
                    arg0 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg0--;
                        if (arg0 < 0) {
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    return;
                                }
                                drawScanline(Draw2D.data, arg2, arg6, 0, arg4 >> 16, arg3 >> 16);
                                arg4 += var8;
                                arg3 += var7;
                                arg2 += Draw2D.width2d;
                            }
                        }
                        drawScanline(Draw2D.data, arg2, arg6, 0, arg4 >> 16, arg5 >> 16);
                        arg4 += var8;
                        arg5 += var9;
                        arg2 += Draw2D.width2d;
                    }
                } else {
                    arg1 -= arg0;
                    arg0 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg0--;
                        if (arg0 < 0) {
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    return;
                                }
                                drawScanline(Draw2D.data, arg2, arg6, 0, arg3 >> 16, arg4 >> 16);
                                arg4 += var8;
                                arg3 += var7;
                                arg2 += Draw2D.width2d;
                            }
                        }
                        drawScanline(Draw2D.data, arg2, arg6, 0, arg5 >> 16, arg4 >> 16);
                        arg4 += var8;
                        arg5 += var9;
                        arg2 += Draw2D.width2d;
                    }
                }
            } else {
                arg3 = arg5 <<= 16;
                if (arg2 < 0) {
                    arg3 -= var8 * arg2;
                    arg5 -= var9 * arg2;
                    arg2 = 0;
                }
                arg4 <<= 16;
                if (arg1 < 0) {
                    arg4 -= var7 * arg1;
                    arg1 = 0;
                }
                if (var8 < var9) {
                    arg0 -= arg1;
                    arg1 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg1--;
                        if (arg1 < 0) {
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    return;
                                }
                                drawScanline(Draw2D.data, arg2, arg6, 0, arg4 >> 16, arg5 >> 16);
                                arg4 += var7;
                                arg5 += var9;
                                arg2 += Draw2D.width2d;
                            }
                        }
                        drawScanline(Draw2D.data, arg2, arg6, 0, arg3 >> 16, arg5 >> 16);
                        arg3 += var8;
                        arg5 += var9;
                        arg2 += Draw2D.width2d;
                    }
                } else {
                    arg0 -= arg1;
                    arg1 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg1--;
                        if (arg1 < 0) {
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    return;
                                }
                                drawScanline(Draw2D.data, arg2, arg6, 0, arg5 >> 16, arg4 >> 16);
                                arg4 += var7;
                                arg5 += var9;
                                arg2 += Draw2D.width2d;
                            }
                        }
                        drawScanline(Draw2D.data, arg2, arg6, 0, arg5 >> 16, arg3 >> 16);
                        arg3 += var8;
                        arg5 += var9;
                        arg2 += Draw2D.width2d;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "([IIIIII)V")
    public static final void drawScanline(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (clipX) {
            if (arg5 > Draw2D.boundX) {
                arg5 = Draw2D.boundX;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 < arg5) {
            arg1 += arg4;
            int var15 = arg5 - arg4 >> 2;
            int var8;
            if (alpha == 0) {
                while (true) {
                    var15--;
                    if (var15 < 0) {
                        var15 = arg5 - arg4 & 3;
                        while (true) {
                            var15--;
                            if (var15 < 0) {
                                return;
                            }
                            arg0[arg1++] = arg2;
                        }
                    }
                    var8 = arg1 + 1;
                    arg0[arg1] = arg2;
                    arg0[var8++] = arg2;
                    arg0[var8++] = arg2;
                    arg1 = var8 + 1;
                    arg0[var8] = arg2;
                }
            } else {
                int var6 = alpha;
                int var7 = 256 - alpha;
                int var10 = ((arg2 & 16711935) * var7 >> 8 & 16711935) + ((arg2 & 65280) * var7 >> 8 & 65280);
                while (true) {
                    var15--;
                    if (var15 < 0) {
                        var15 = arg5 - arg4 & 3;
                        while (true) {
                            var15--;
                            if (var15 < 0) {
                                return;
                            }
                            arg0[arg1++] = var10 + ((arg0[arg1] & 16711935) * var6 >> 8 & 16711935) + ((arg0[arg1] & 65280) * var6 >> 8 & 65280);
                        }
                    }
                    var8 = arg1 + 1;
                    arg0[arg1] = var10 + ((arg0[var8] & 16711935) * var6 >> 8 & 16711935) + ((arg0[var8] & 65280) * var6 >> 8 & 65280);
                    int var9 = var8 + 1;
                    arg0[var8] = var10 + ((arg0[var9] & 16711935) * var6 >> 8 & 16711935) + ((arg0[var9] & 65280) * var6 >> 8 & 65280);
                    int var11 = var9 + 1;
                    arg0[var9] = var10 + ((arg0[var11] & 16711935) * var6 >> 8 & 16711935) + ((arg0[var11] & 65280) * var6 >> 8 & 65280);
                    arg1 = var11 + 1;
                    arg0[var11] = var10 + ((arg0[arg1] & 16711935) * var6 >> 8 & 16711935) + ((arg0[arg1] & 65280) * var6 >> 8 & 65280);
                }
            }
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
    public static final void fillTexturedTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        int[] var19 = getTexels(arg18);
        opaque = !textureTranslucent[arg18];
        int var36 = arg9 - arg10;
        int var38 = arg12 - arg13;
        int var40 = arg15 - arg16;
        int var37 = arg11 - arg9;
        int var39 = arg14 - arg12;
        int var41 = arg17 - arg15;
        int var20 = var37 * arg12 - var39 * arg9 << 14;
        int var21 = var39 * arg15 - var41 * arg12 << 8;
        int var22 = var41 * arg9 - var37 * arg15 << 5;
        int var23 = var36 * arg12 - var38 * arg9 << 14;
        int var24 = var38 * arg15 - var40 * arg12 << 8;
        int var25 = var40 * arg9 - var36 * arg15 << 5;
        int var26 = var38 * var37 - var36 * var39 << 14;
        int var27 = var40 * var39 - var38 * var41 << 8;
        int var28 = var36 * var41 - var40 * var37 << 5;
        int var29 = 0;
        int var30 = 0;
        if (arg1 != arg0) {
            var29 = (arg4 - arg3 << 16) / (arg1 - arg0);
            var30 = (arg7 - arg6 << 16) / (arg1 - arg0);
        }
        int var31 = 0;
        int var32 = 0;
        if (arg2 != arg1) {
            var31 = (arg5 - arg4 << 16) / (arg2 - arg1);
            var32 = (arg8 - arg7 << 16) / (arg2 - arg1);
        }
        int var33 = 0;
        int var34 = 0;
        if (arg2 != arg0) {
            var33 = (arg3 - arg5 << 16) / (arg0 - arg2);
            var34 = (arg6 - arg8 << 16) / (arg0 - arg2);
        }
        int var35;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < Draw2D.bottom) {
                if (arg1 > Draw2D.bottom) {
                    arg1 = Draw2D.bottom;
                }
                if (arg2 > Draw2D.bottom) {
                    arg2 = Draw2D.bottom;
                }
                if (arg1 < arg2) {
                    arg5 = arg3 <<= 16;
                    arg8 = arg6 <<= 16;
                    if (arg0 < 0) {
                        arg5 -= var33 * arg0;
                        arg3 -= var29 * arg0;
                        arg8 -= var34 * arg0;
                        arg6 -= var30 * arg0;
                        arg0 = 0;
                    }
                    arg4 <<= 16;
                    arg7 <<= 16;
                    if (arg1 < 0) {
                        arg4 -= var31 * arg1;
                        arg7 -= var32 * arg1;
                        arg1 = 0;
                    }
                    var35 = arg0 - centerY;
                    var20 += var22 * var35;
                    var23 += var25 * var35;
                    var26 += var28 * var35;
                    if ((arg0 == arg1 || var33 >= var29) && (arg0 != arg1 || var33 <= var31)) {
                        arg2 -= arg1;
                        arg1 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawTexturedScanline(Draw2D.data, var19, 0, 0, arg0, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
                                    arg5 += var33;
                                    arg4 += var31;
                                    arg8 += var34;
                                    arg7 += var32;
                                    arg0 += Draw2D.width2d;
                                    var20 += var22;
                                    var23 += var25;
                                    var26 += var28;
                                }
                            }
                            drawTexturedScanline(Draw2D.data, var19, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
                            arg5 += var33;
                            arg3 += var29;
                            arg8 += var34;
                            arg6 += var30;
                            arg0 += Draw2D.width2d;
                            var20 += var22;
                            var23 += var25;
                            var26 += var28;
                        }
                    } else {
                        arg2 -= arg1;
                        arg1 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg1--;
                            if (arg1 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawTexturedScanline(Draw2D.data, var19, 0, 0, arg0, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
                                    arg5 += var33;
                                    arg4 += var31;
                                    arg8 += var34;
                                    arg7 += var32;
                                    arg0 += Draw2D.width2d;
                                    var20 += var22;
                                    var23 += var25;
                                    var26 += var28;
                                }
                            }
                            drawTexturedScanline(Draw2D.data, var19, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
                            arg5 += var33;
                            arg3 += var29;
                            arg8 += var34;
                            arg6 += var30;
                            arg0 += Draw2D.width2d;
                            var20 += var22;
                            var23 += var25;
                            var26 += var28;
                        }
                    }
                } else {
                    arg4 = arg3 <<= 16;
                    arg7 = arg6 <<= 16;
                    if (arg0 < 0) {
                        arg4 -= var33 * arg0;
                        arg3 -= var29 * arg0;
                        arg7 -= var34 * arg0;
                        arg6 -= var30 * arg0;
                        arg0 = 0;
                    }
                    arg5 <<= 16;
                    arg8 <<= 16;
                    if (arg2 < 0) {
                        arg5 -= var31 * arg2;
                        arg8 -= var32 * arg2;
                        arg2 = 0;
                    }
                    var35 = arg0 - centerY;
                    var20 += var22 * var35;
                    var23 += var25 * var35;
                    var26 += var28 * var35;
                    if (arg0 != arg2 && var33 < var29 || arg0 == arg2 && var31 > var29) {
                        arg1 -= arg2;
                        arg2 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    drawTexturedScanline(Draw2D.data, var19, 0, 0, arg0, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
                                    arg5 += var31;
                                    arg3 += var29;
                                    arg8 += var32;
                                    arg6 += var30;
                                    arg0 += Draw2D.width2d;
                                    var20 += var22;
                                    var23 += var25;
                                    var26 += var28;
                                }
                            }
                            drawTexturedScanline(Draw2D.data, var19, 0, 0, arg0, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
                            arg4 += var33;
                            arg3 += var29;
                            arg7 += var34;
                            arg6 += var30;
                            arg0 += Draw2D.width2d;
                            var20 += var22;
                            var23 += var25;
                            var26 += var28;
                        }
                    } else {
                        arg1 -= arg2;
                        arg2 -= arg0;
                        arg0 = lineOffset[arg0];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg1--;
                                    if (arg1 < 0) {
                                        return;
                                    }
                                    drawTexturedScanline(Draw2D.data, var19, 0, 0, arg0, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
                                    arg5 += var31;
                                    arg3 += var29;
                                    arg8 += var32;
                                    arg6 += var30;
                                    arg0 += Draw2D.width2d;
                                    var20 += var22;
                                    var23 += var25;
                                    var26 += var28;
                                }
                            }
                            drawTexturedScanline(Draw2D.data, var19, 0, 0, arg0, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
                            arg4 += var33;
                            arg3 += var29;
                            arg7 += var34;
                            arg6 += var30;
                            arg0 += Draw2D.width2d;
                            var20 += var22;
                            var23 += var25;
                            var26 += var28;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < Draw2D.bottom) {
                if (arg2 > Draw2D.bottom) {
                    arg2 = Draw2D.bottom;
                }
                if (arg0 > Draw2D.bottom) {
                    arg0 = Draw2D.bottom;
                }
                if (arg2 < arg0) {
                    arg3 = arg4 <<= 16;
                    arg6 = arg7 <<= 16;
                    if (arg1 < 0) {
                        arg3 -= var29 * arg1;
                        arg4 -= var31 * arg1;
                        arg6 -= var30 * arg1;
                        arg7 -= var32 * arg1;
                        arg1 = 0;
                    }
                    arg5 <<= 16;
                    arg8 <<= 16;
                    if (arg2 < 0) {
                        arg5 -= var33 * arg2;
                        arg8 -= var34 * arg2;
                        arg2 = 0;
                    }
                    var35 = arg1 - centerY;
                    var20 += var22 * var35;
                    var23 += var25 * var35;
                    var26 += var28 * var35;
                    if ((arg1 == arg2 || var29 >= var31) && (arg1 != arg2 || var29 <= var33)) {
                        arg0 -= arg2;
                        arg2 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    drawTexturedScanline(Draw2D.data, var19, 0, 0, arg1, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
                                    arg3 += var29;
                                    arg5 += var33;
                                    arg6 += var30;
                                    arg8 += var34;
                                    arg1 += Draw2D.width2d;
                                    var20 += var22;
                                    var23 += var25;
                                    var26 += var28;
                                }
                            }
                            drawTexturedScanline(Draw2D.data, var19, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
                            arg3 += var29;
                            arg4 += var31;
                            arg6 += var30;
                            arg7 += var32;
                            arg1 += Draw2D.width2d;
                            var20 += var22;
                            var23 += var25;
                            var26 += var28;
                        }
                    } else {
                        arg0 -= arg2;
                        arg2 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg2--;
                            if (arg2 < 0) {
                                while (true) {
                                    arg0--;
                                    if (arg0 < 0) {
                                        return;
                                    }
                                    drawTexturedScanline(Draw2D.data, var19, 0, 0, arg1, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
                                    arg3 += var29;
                                    arg5 += var33;
                                    arg6 += var30;
                                    arg8 += var34;
                                    arg1 += Draw2D.width2d;
                                    var20 += var22;
                                    var23 += var25;
                                    var26 += var28;
                                }
                            }
                            drawTexturedScanline(Draw2D.data, var19, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
                            arg3 += var29;
                            arg4 += var31;
                            arg6 += var30;
                            arg7 += var32;
                            arg1 += Draw2D.width2d;
                            var20 += var22;
                            var23 += var25;
                            var26 += var28;
                        }
                    }
                } else {
                    arg5 = arg4 <<= 16;
                    arg8 = arg7 <<= 16;
                    if (arg1 < 0) {
                        arg5 -= var29 * arg1;
                        arg4 -= var31 * arg1;
                        arg8 -= var30 * arg1;
                        arg7 -= var32 * arg1;
                        arg1 = 0;
                    }
                    arg3 <<= 16;
                    arg6 <<= 16;
                    if (arg0 < 0) {
                        arg3 -= var33 * arg0;
                        arg6 -= var34 * arg0;
                        arg0 = 0;
                    }
                    var35 = arg1 - centerY;
                    var20 += var22 * var35;
                    var23 += var25 * var35;
                    var26 += var28 * var35;
                    if (var29 < var31) {
                        arg2 -= arg0;
                        arg0 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawTexturedScanline(Draw2D.data, var19, 0, 0, arg1, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
                                    arg3 += var33;
                                    arg4 += var31;
                                    arg6 += var34;
                                    arg7 += var32;
                                    arg1 += Draw2D.width2d;
                                    var20 += var22;
                                    var23 += var25;
                                    var26 += var28;
                                }
                            }
                            drawTexturedScanline(Draw2D.data, var19, 0, 0, arg1, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
                            arg5 += var29;
                            arg4 += var31;
                            arg8 += var30;
                            arg7 += var32;
                            arg1 += Draw2D.width2d;
                            var20 += var22;
                            var23 += var25;
                            var26 += var28;
                        }
                    } else {
                        arg2 -= arg0;
                        arg0 -= arg1;
                        arg1 = lineOffset[arg1];
                        while (true) {
                            arg0--;
                            if (arg0 < 0) {
                                while (true) {
                                    arg2--;
                                    if (arg2 < 0) {
                                        return;
                                    }
                                    drawTexturedScanline(Draw2D.data, var19, 0, 0, arg1, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
                                    arg3 += var33;
                                    arg4 += var31;
                                    arg6 += var34;
                                    arg7 += var32;
                                    arg1 += Draw2D.width2d;
                                    var20 += var22;
                                    var23 += var25;
                                    var26 += var28;
                                }
                            }
                            drawTexturedScanline(Draw2D.data, var19, 0, 0, arg1, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
                            arg5 += var29;
                            arg4 += var31;
                            arg8 += var30;
                            arg7 += var32;
                            arg1 += Draw2D.width2d;
                            var20 += var22;
                            var23 += var25;
                            var26 += var28;
                        }
                    }
                }
            }
        } else if (arg2 < Draw2D.bottom) {
            if (arg0 > Draw2D.bottom) {
                arg0 = Draw2D.bottom;
            }
            if (arg1 > Draw2D.bottom) {
                arg1 = Draw2D.bottom;
            }
            if (arg0 < arg1) {
                arg4 = arg5 <<= 16;
                arg7 = arg8 <<= 16;
                if (arg2 < 0) {
                    arg4 -= var31 * arg2;
                    arg5 -= var33 * arg2;
                    arg7 -= var32 * arg2;
                    arg8 -= var34 * arg2;
                    arg2 = 0;
                }
                arg3 <<= 16;
                arg6 <<= 16;
                if (arg0 < 0) {
                    arg3 -= var29 * arg0;
                    arg6 -= var30 * arg0;
                    arg0 = 0;
                }
                var35 = arg2 - centerY;
                var20 += var22 * var35;
                var23 += var25 * var35;
                var26 += var28 * var35;
                if (var31 < var33) {
                    arg1 -= arg0;
                    arg0 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg0--;
                        if (arg0 < 0) {
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    return;
                                }
                                drawTexturedScanline(Draw2D.data, var19, 0, 0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
                                arg4 += var31;
                                arg3 += var29;
                                arg7 += var32;
                                arg6 += var30;
                                arg2 += Draw2D.width2d;
                                var20 += var22;
                                var23 += var25;
                                var26 += var28;
                            }
                        }
                        drawTexturedScanline(Draw2D.data, var19, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
                        arg4 += var31;
                        arg5 += var33;
                        arg7 += var32;
                        arg8 += var34;
                        arg2 += Draw2D.width2d;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                    }
                } else {
                    arg1 -= arg0;
                    arg0 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg0--;
                        if (arg0 < 0) {
                            while (true) {
                                arg1--;
                                if (arg1 < 0) {
                                    return;
                                }
                                drawTexturedScanline(Draw2D.data, var19, 0, 0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
                                arg4 += var31;
                                arg3 += var29;
                                arg7 += var32;
                                arg6 += var30;
                                arg2 += Draw2D.width2d;
                                var20 += var22;
                                var23 += var25;
                                var26 += var28;
                            }
                        }
                        drawTexturedScanline(Draw2D.data, var19, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
                        arg4 += var31;
                        arg5 += var33;
                        arg7 += var32;
                        arg8 += var34;
                        arg2 += Draw2D.width2d;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                    }
                }
            } else {
                arg3 = arg5 <<= 16;
                arg6 = arg8 <<= 16;
                if (arg2 < 0) {
                    arg3 -= var31 * arg2;
                    arg5 -= var33 * arg2;
                    arg6 -= var32 * arg2;
                    arg8 -= var34 * arg2;
                    arg2 = 0;
                }
                arg4 <<= 16;
                arg7 <<= 16;
                if (arg1 < 0) {
                    arg4 -= var29 * arg1;
                    arg7 -= var30 * arg1;
                    arg1 = 0;
                }
                var35 = arg2 - centerY;
                var20 += var22 * var35;
                var23 += var25 * var35;
                var26 += var28 * var35;
                if (var31 < var33) {
                    arg0 -= arg1;
                    arg1 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg1--;
                        if (arg1 < 0) {
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    return;
                                }
                                drawTexturedScanline(Draw2D.data, var19, 0, 0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
                                arg4 += var29;
                                arg5 += var33;
                                arg7 += var30;
                                arg8 += var34;
                                arg2 += Draw2D.width2d;
                                var20 += var22;
                                var23 += var25;
                                var26 += var28;
                            }
                        }
                        drawTexturedScanline(Draw2D.data, var19, 0, 0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8, arg8 >> 8, var20, var23, var26, var21, var24, var27);
                        arg3 += var31;
                        arg5 += var33;
                        arg6 += var32;
                        arg8 += var34;
                        arg2 += Draw2D.width2d;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                    }
                } else {
                    arg0 -= arg1;
                    arg1 -= arg2;
                    arg2 = lineOffset[arg2];
                    while (true) {
                        arg1--;
                        if (arg1 < 0) {
                            while (true) {
                                arg0--;
                                if (arg0 < 0) {
                                    return;
                                }
                                drawTexturedScanline(Draw2D.data, var19, 0, 0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8, arg7 >> 8, var20, var23, var26, var21, var24, var27);
                                arg4 += var29;
                                arg5 += var33;
                                arg7 += var30;
                                arg8 += var34;
                                arg2 += Draw2D.width2d;
                                var20 += var22;
                                var23 += var25;
                                var26 += var28;
                            }
                        }
                        drawTexturedScanline(Draw2D.data, var19, 0, 0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8, arg6 >> 8, var20, var23, var26, var21, var24, var27);
                        arg3 += var31;
                        arg5 += var33;
                        arg6 += var32;
                        arg8 += var34;
                        arg2 += Draw2D.width2d;
                        var20 += var22;
                        var23 += var25;
                        var26 += var28;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!OPPOFIOL", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
    public static final void drawTexturedScanline(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if (arg5 < arg6) {
            int var15;
            int var16;
            if (clipX) {
                var15 = (arg8 - arg7) / (arg6 - arg5);
                if (arg6 > Draw2D.boundX) {
                    arg6 = Draw2D.boundX;
                }
                if (arg5 < 0) {
                    arg7 -= arg5 * var15;
                    arg5 = 0;
                }
                if (arg5 >= arg6) {
                    return;
                }
                var16 = arg6 - arg5 >> 3;
                var15 <<= 12;
                arg7 <<= 9;
            } else {
                if (arg6 - arg5 > 7) {
                    var16 = arg6 - arg5 >> 3;
                    var15 = (arg8 - arg7) * reciprocal15[var16] >> 6;
                } else {
                    var16 = 0;
                    var15 = 0;
                }
                arg7 <<= 9;
            }
            arg4 += arg5;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var25;
            int var32;
            int var33;
            int var34;
            if (lowMemory) {
                var17 = 0;
                var18 = 0;
                var20 = arg5 - centerX;
                var32 = arg9 + (arg12 >> 3) * var20;
                var33 = arg10 + (arg13 >> 3) * var20;
                var34 = arg11 + (arg14 >> 3) * var20;
                var19 = var34 >> 12;
                if (var19 != 0) {
                    arg2 = var32 / var19;
                    arg3 = var33 / var19;
                    if (arg2 < 0) {
                        arg2 = 0;
                    } else if (arg2 > 4032) {
                        arg2 = 4032;
                    }
                }
                arg9 = var32 + arg12;
                arg10 = var33 + arg13;
                arg11 = var34 + arg14;
                var19 = arg11 >> 12;
                if (var19 != 0) {
                    var17 = arg9 / var19;
                    var18 = arg10 / var19;
                    if (var17 < 7) {
                        var17 = 7;
                    } else if (var17 > 4032) {
                        var17 = 4032;
                    }
                }
                var21 = var17 - arg2 >> 3;
                var22 = var18 - arg3 >> 3;
                arg2 += (arg7 & 6291456) >> 3;
                var23 = arg7 >> 23;
                if (!opaque) {
                    while (var16-- > 0) {
                        int var43;
                        if ((var43 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
                            arg0[arg4] = var43;
                        }
                        var25 = arg4 + 1;
                        arg2 += var21;
                        arg3 += var22;
                        int var44;
                        if ((var44 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
                            arg0[var25] = var44;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var45;
                        if ((var45 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
                            arg0[var25] = var45;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var46;
                        if ((var46 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
                            arg0[var25] = var46;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var47;
                        if ((var47 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
                            arg0[var25] = var47;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var48;
                        if ((var48 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
                            arg0[var25] = var48;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var49;
                        if ((var49 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
                            arg0[var25] = var49;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var50;
                        if ((var50 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
                            arg0[var25] = var50;
                        }
                        arg4 = var25 + 1;
                        arg2 = var17;
                        arg3 = var18;
                        arg9 += arg12;
                        arg10 += arg13;
                        arg11 += arg14;
                        var19 = arg11 >> 12;
                        if (var19 != 0) {
                            var17 = arg9 / var19;
                            var18 = arg10 / var19;
                            if (var17 < 7) {
                                var17 = 7;
                            } else if (var17 > 4032) {
                                var17 = 4032;
                            }
                        }
                        var21 = var17 - arg2 >> 3;
                        var22 = var18 - arg3 >> 3;
                        arg7 += var15;
                        arg2 += (arg7 & 6291456) >> 3;
                        var23 = arg7 >> 23;
                    }
                    var16 = arg6 - arg5 & 7;
                    while (var16-- > 0) {
                        int var51;
                        if ((var51 = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23) != 0) {
                            arg0[arg4] = var51;
                        }
                        arg4++;
                        arg2 += var21;
                        arg3 += var22;
                    }
                } else {
                    while (var16-- > 0) {
                        var25 = arg4 + 1;
                        arg0[arg4] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        arg0[var25++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        arg4 = var25 + 1;
                        arg0[var25] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
                        arg2 = var17;
                        arg3 = var18;
                        arg9 += arg12;
                        arg10 += arg13;
                        arg11 += arg14;
                        var19 = arg11 >> 12;
                        if (var19 != 0) {
                            var17 = arg9 / var19;
                            var18 = arg10 / var19;
                            if (var17 < 7) {
                                var17 = 7;
                            } else if (var17 > 4032) {
                                var17 = 4032;
                            }
                        }
                        var21 = var17 - arg2 >> 3;
                        var22 = var18 - arg3 >> 3;
                        arg7 += var15;
                        arg2 += (arg7 & 6291456) >> 3;
                        var23 = arg7 >> 23;
                    }
                    var16 = arg6 - arg5 & 7;
                    while (var16-- > 0) {
                        arg0[arg4++] = arg1[(arg3 & 4032) + (arg2 >> 6)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                    }
                }
            } else {
                var17 = 0;
                var18 = 0;
                var20 = arg5 - centerX;
                var32 = arg9 + (arg12 >> 3) * var20;
                var33 = arg10 + (arg13 >> 3) * var20;
                var34 = arg11 + (arg14 >> 3) * var20;
                var19 = var34 >> 14;
                if (var19 != 0) {
                    arg2 = var32 / var19;
                    arg3 = var33 / var19;
                    if (arg2 < 0) {
                        arg2 = 0;
                    } else if (arg2 > 16256) {
                        arg2 = 16256;
                    }
                }
                arg9 = var32 + arg12;
                arg10 = var33 + arg13;
                arg11 = var34 + arg14;
                var19 = arg11 >> 14;
                if (var19 != 0) {
                    var17 = arg9 / var19;
                    var18 = arg10 / var19;
                    if (var17 < 7) {
                        var17 = 7;
                    } else if (var17 > 16256) {
                        var17 = 16256;
                    }
                }
                var21 = var17 - arg2 >> 3;
                var22 = var18 - arg3 >> 3;
                arg2 += arg7 & 6291456;
                var23 = arg7 >> 23;
                if (!opaque) {
                    while (var16-- > 0) {
                        int var24;
                        if ((var24 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
                            arg0[arg4] = var24;
                        }
                        var25 = arg4 + 1;
                        arg2 += var21;
                        arg3 += var22;
                        int var35;
                        if ((var35 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
                            arg0[var25] = var35;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var36;
                        if ((var36 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
                            arg0[var25] = var36;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var37;
                        if ((var37 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
                            arg0[var25] = var37;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var38;
                        if ((var38 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
                            arg0[var25] = var38;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var39;
                        if ((var39 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
                            arg0[var25] = var39;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var40;
                        if ((var40 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
                            arg0[var25] = var40;
                        }
                        var25++;
                        arg2 += var21;
                        arg3 += var22;
                        int var41;
                        if ((var41 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
                            arg0[var25] = var41;
                        }
                        arg4 = var25 + 1;
                        arg2 = var17;
                        arg3 = var18;
                        arg9 += arg12;
                        arg10 += arg13;
                        arg11 += arg14;
                        var19 = arg11 >> 14;
                        if (var19 != 0) {
                            var17 = arg9 / var19;
                            var18 = arg10 / var19;
                            if (var17 < 7) {
                                var17 = 7;
                            } else if (var17 > 16256) {
                                var17 = 16256;
                            }
                        }
                        var21 = var17 - arg2 >> 3;
                        var22 = var18 - arg3 >> 3;
                        arg7 += var15;
                        arg2 += arg7 & 6291456;
                        var23 = arg7 >> 23;
                    }
                    var16 = arg6 - arg5 & 7;
                    while (var16-- > 0) {
                        int var42;
                        if ((var42 = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23) != 0) {
                            arg0[arg4] = var42;
                        }
                        arg4++;
                        arg2 += var21;
                        arg3 += var22;
                    }
                } else {
                    while (var16-- > 0) {
                        var25 = arg4 + 1;
                        arg0[arg4] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        int var26 = var25 + 1;
                        arg0[var25] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        int var27 = var26 + 1;
                        arg0[var26] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        int var28 = var27 + 1;
                        arg0[var27] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        int var29 = var28 + 1;
                        arg0[var28] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        int var30 = var29 + 1;
                        arg0[var29] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        int var31 = var30 + 1;
                        arg0[var30] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                        arg4 = var31 + 1;
                        arg0[var31] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
                        arg2 = var17;
                        arg3 = var18;
                        arg9 += arg12;
                        arg10 += arg13;
                        arg11 += arg14;
                        var19 = arg11 >> 14;
                        if (var19 != 0) {
                            var17 = arg9 / var19;
                            var18 = arg10 / var19;
                            if (var17 < 7) {
                                var17 = 7;
                            } else if (var17 > 16256) {
                                var17 = 16256;
                            }
                        }
                        var21 = var17 - arg2 >> 3;
                        var22 = var18 - arg3 >> 3;
                        arg7 += var15;
                        arg2 += arg7 & 6291456;
                        var23 = arg7 >> 23;
                    }
                    var16 = arg6 - arg5 & 7;
                    while (var16-- > 0) {
                        arg0[arg4++] = arg1[(arg3 & 16256) + (arg2 >> 7)] >>> var23;
                        arg2 += var21;
                        arg3 += var22;
                    }
                }
            }
        }
    }

    static {
        for (int var0 = 1; var0 < 512; var0++) {
            reciprocal15[var0] = 32768 / var0;
        }
        for (int var1 = 1; var1 < 2048; var1++) {
            reciprocal16[var1] = 65536 / var1;
        }
        for (int var2 = 0; var2 < 2048; var2++) {
            sin[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
            cos[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
        }
        textures = new Pix8[50];
        textureTranslucent = new boolean[50];
        averageTextureRGB = new int[50];
        activeTexels = new int[50][];
        textureCycle = new int[50];
        palette = new int[65536];
        texturePalette = new int[50][];
    }
}
