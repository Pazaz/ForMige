import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VBAXKVMG")
public class TileOverlay {

    @OriginalMember(owner = "client!VBAXKVMG", name = "a", descriptor = "[I")
    public int[] vertexX;

    @OriginalMember(owner = "client!VBAXKVMG", name = "b", descriptor = "[I")
    public int[] vertexY;

    @OriginalMember(owner = "client!VBAXKVMG", name = "c", descriptor = "[I")
    public int[] vertexZ;

    @OriginalMember(owner = "client!VBAXKVMG", name = "d", descriptor = "[I")
    public int[] triangleColorA;

    @OriginalMember(owner = "client!VBAXKVMG", name = "e", descriptor = "[I")
    public int[] triangleColorB;

    @OriginalMember(owner = "client!VBAXKVMG", name = "f", descriptor = "[I")
    public int[] triangleColorC;

    @OriginalMember(owner = "client!VBAXKVMG", name = "g", descriptor = "[I")
    public int[] triangleVertexA;

    @OriginalMember(owner = "client!VBAXKVMG", name = "h", descriptor = "[I")
    public int[] triangleVertexB;

    @OriginalMember(owner = "client!VBAXKVMG", name = "i", descriptor = "[I")
    public int[] triangleVertexC;

    @OriginalMember(owner = "client!VBAXKVMG", name = "j", descriptor = "[I")
    public int[] triangleTextureIds;

    @OriginalMember(owner = "client!VBAXKVMG", name = "k", descriptor = "Z")
    public boolean flat = true;

    @OriginalMember(owner = "client!VBAXKVMG", name = "l", descriptor = "I")
    public int shape;

    @OriginalMember(owner = "client!VBAXKVMG", name = "m", descriptor = "I")
    public int rotation;

    @OriginalMember(owner = "client!VBAXKVMG", name = "n", descriptor = "I")
    public int backgroundRgb;

    @OriginalMember(owner = "client!VBAXKVMG", name = "o", descriptor = "I")
    public int foregroundRgb;

    @OriginalMember(owner = "client!VBAXKVMG", name = "p", descriptor = "[I")
    public static int[] tmpScreenX = new int[6];

    @OriginalMember(owner = "client!VBAXKVMG", name = "q", descriptor = "[I")
    public static int[] tmpScreenY = new int[6];

    @OriginalMember(owner = "client!VBAXKVMG", name = "r", descriptor = "[I")
    public static int[] tmpViewspaceX = new int[6];

    @OriginalMember(owner = "client!VBAXKVMG", name = "s", descriptor = "[I")
    public static int[] tmpViewspaceY = new int[6];

    @OriginalMember(owner = "client!VBAXKVMG", name = "t", descriptor = "[I")
    public static int[] tmpViewspaceZ = new int[6];

    @OriginalMember(owner = "client!VBAXKVMG", name = "u", descriptor = "[I")
    public static int[] field1480 = new int[] { 1, 0 };

    @OriginalMember(owner = "client!VBAXKVMG", name = "v", descriptor = "[I")
    public static int[] field1481 = new int[] { 2, 1 };

    @OriginalMember(owner = "client!VBAXKVMG", name = "w", descriptor = "[I")
    public static int[] field1482 = new int[] { 3, 3 };

    @OriginalMember(owner = "client!VBAXKVMG", name = "x", descriptor = "[[I")
    public static final int[][] SHAPE_POINTS = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

    @OriginalMember(owner = "client!VBAXKVMG", name = "y", descriptor = "[[I")
    public static final int[][] SHAPE_PATHS = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

    @OriginalMember(owner = "client!VBAXKVMG", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg12 != arg11 || arg12 != arg3 || arg12 != arg10) {
            this.flat = false;
        }
        this.shape = arg13;
        this.rotation = arg6;
        this.backgroundRgb = arg8;
        this.foregroundRgb = arg19;
        short var21 = 128;
        int var22 = var21 / 2;
        int var23 = var21 / 4;
        int var24 = var21 * 3 / 4;
        int[] var25 = SHAPE_POINTS[arg13];
        int var26 = var25.length;
        this.vertexX = new int[var26];
        this.vertexY = new int[var26];
        this.vertexZ = new int[var26];
        int[] var27 = new int[var26];
        int[] var28 = new int[var26];
        int var29 = arg18 * var21;
        int var30 = arg0 * var21;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        for (int var31 = 0; var31 < var26; var31++) {
            int var32 = var25[var31];
            if ((var32 & 1) == 0 && var32 <= 8) {
                var32 = (var32 - arg6 - arg6 - 1 & 7) + 1;
            }
            if (var32 > 8 && var32 <= 12) {
                var32 = (var32 - 9 - arg6 & 3) + 9;
            }
            if (var32 > 12 && var32 <= 16) {
                var32 = (var32 - 13 - arg6 & 3) + 13;
            }
            if (var32 == 1) {
                var33 = var29;
                var34 = var30;
                var35 = arg12;
                var36 = arg7;
                var37 = arg1;
            } else if (var32 == 2) {
                var33 = var29 + var22;
                var34 = var30;
                var35 = arg12 + arg11 >> 1;
                var36 = arg7 + arg16 >> 1;
                var37 = arg1 + arg15 >> 1;
            } else if (var32 == 3) {
                var33 = var29 + var21;
                var34 = var30;
                var35 = arg11;
                var36 = arg16;
                var37 = arg15;
            } else if (var32 == 4) {
                var33 = var29 + var21;
                var34 = var30 + var22;
                var35 = arg11 + arg3 >> 1;
                var36 = arg16 + arg9 >> 1;
                var37 = arg15 + arg5 >> 1;
            } else if (var32 == 5) {
                var33 = var29 + var21;
                var34 = var30 + var21;
                var35 = arg3;
                var36 = arg9;
                var37 = arg5;
            } else if (var32 == 6) {
                var33 = var29 + var22;
                var34 = var30 + var21;
                var35 = arg3 + arg10 >> 1;
                var36 = arg9 + arg2 >> 1;
                var37 = arg5 + arg14 >> 1;
            } else if (var32 == 7) {
                var33 = var29;
                var34 = var30 + var21;
                var35 = arg10;
                var36 = arg2;
                var37 = arg14;
            } else if (var32 == 8) {
                var33 = var29;
                var34 = var30 + var22;
                var35 = arg10 + arg12 >> 1;
                var36 = arg2 + arg7 >> 1;
                var37 = arg14 + arg1 >> 1;
            } else if (var32 == 9) {
                var33 = var29 + var22;
                var34 = var30 + var23;
                var35 = arg12 + arg11 >> 1;
                var36 = arg7 + arg16 >> 1;
                var37 = arg1 + arg15 >> 1;
            } else if (var32 == 10) {
                var33 = var29 + var24;
                var34 = var30 + var22;
                var35 = arg11 + arg3 >> 1;
                var36 = arg16 + arg9 >> 1;
                var37 = arg15 + arg5 >> 1;
            } else if (var32 == 11) {
                var33 = var29 + var22;
                var34 = var30 + var24;
                var35 = arg3 + arg10 >> 1;
                var36 = arg9 + arg2 >> 1;
                var37 = arg5 + arg14 >> 1;
            } else if (var32 == 12) {
                var33 = var29 + var23;
                var34 = var30 + var22;
                var35 = arg10 + arg12 >> 1;
                var36 = arg2 + arg7 >> 1;
                var37 = arg14 + arg1 >> 1;
            } else if (var32 == 13) {
                var33 = var29 + var23;
                var34 = var30 + var23;
                var35 = arg12;
                var36 = arg7;
                var37 = arg1;
            } else if (var32 == 14) {
                var33 = var29 + var24;
                var34 = var30 + var23;
                var35 = arg11;
                var36 = arg16;
                var37 = arg15;
            } else if (var32 == 15) {
                var33 = var29 + var24;
                var34 = var30 + var24;
                var35 = arg3;
                var36 = arg9;
                var37 = arg5;
            } else {
                var33 = var29 + var23;
                var34 = var30 + var24;
                var35 = arg10;
                var36 = arg2;
                var37 = arg14;
            }
            this.vertexX[var31] = var33;
            this.vertexY[var31] = var35;
            this.vertexZ[var31] = var34;
            var27[var31] = var36;
            var28[var31] = var37;
        }
        int[] var40 = SHAPE_PATHS[arg13];
        var33 = var40.length / 4;
        this.triangleVertexA = new int[var33];
        this.triangleVertexB = new int[var33];
        this.triangleVertexC = new int[var33];
        this.triangleColorA = new int[var33];
        this.triangleColorB = new int[var33];
        this.triangleColorC = new int[var33];
        if (arg4 != -1) {
            this.triangleTextureIds = new int[var33];
        }
        var34 = 0;
        int var38;
        for (var35 = 0; var35 < var33; var35++) {
            var36 = var40[var34];
            var37 = var40[var34 + 1];
            var38 = var40[var34 + 2];
            int var39 = var40[var34 + 3];
            var34 += 4;
            if (var37 < 4) {
                var37 = var37 - arg6 & 3;
            }
            if (var38 < 4) {
                var38 = var38 - arg6 & 3;
            }
            if (var39 < 4) {
                var39 = var39 - arg6 & 3;
            }
            this.triangleVertexA[var35] = var37;
            this.triangleVertexB[var35] = var38;
            this.triangleVertexC[var35] = var39;
            if (var36 == 0) {
                this.triangleColorA[var35] = var27[var37];
                this.triangleColorB[var35] = var27[var38];
                this.triangleColorC[var35] = var27[var39];
                if (this.triangleTextureIds != null) {
                    this.triangleTextureIds[var35] = -1;
                }
            } else {
                this.triangleColorA[var35] = var28[var37];
                this.triangleColorB[var35] = var28[var38];
                this.triangleColorC[var35] = var28[var39];
                if (this.triangleTextureIds != null) {
                    this.triangleTextureIds[var35] = arg4;
                }
            }
        }
        var36 = arg12;
        var37 = arg11;
        if (arg11 < arg12) {
            var36 = arg11;
        }
        if (arg11 > arg11) {
            var37 = arg11;
        }
        if (arg3 < var36) {
            var36 = arg3;
        }
        if (arg3 > var37) {
            var37 = arg3;
        }
        if (arg10 < var36) {
            var36 = arg10;
        }
        if (arg10 > var37) {
            var37 = arg10;
        }
        var36 /= 14;
        var37 /= 14;
        if (arg17 < 3 || arg17 > 3) {
            for (var38 = 1; var38 > 0; var38++) {
            }
        }
        if (Linkable._flowObfuscator2) {
        }
    }
}
