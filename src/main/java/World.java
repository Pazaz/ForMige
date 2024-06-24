import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CRRWDRTI")
public class World {

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "I")
    private static int randomHueOffset = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!CRRWDRTI", name = "b", descriptor = "[I")
    private int[] blendChroma;

    @OriginalMember(owner = "client!CRRWDRTI", name = "c", descriptor = "[I")
    private int[] blendSaturation;

    @OriginalMember(owner = "client!CRRWDRTI", name = "d", descriptor = "[I")
    private int[] blendLightness;

    @OriginalMember(owner = "client!CRRWDRTI", name = "e", descriptor = "[I")
    private int[] blendLuminance;

    @OriginalMember(owner = "client!CRRWDRTI", name = "f", descriptor = "[I")
    private int[] blendMagnitude;

    @OriginalMember(owner = "client!CRRWDRTI", name = "g", descriptor = "[[[I")
    private int[][][] levelHeightmap;

    @OriginalMember(owner = "client!CRRWDRTI", name = "h", descriptor = "[[[B")
    private byte[][][] levelTileOverlayIds;

    @OriginalMember(owner = "client!CRRWDRTI", name = "i", descriptor = "I")
    public static int levelBuilt;

    @OriginalMember(owner = "client!CRRWDRTI", name = "j", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "client!CRRWDRTI", name = "k", descriptor = "I")
    private static int randomLightnessOffset = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!CRRWDRTI", name = "l", descriptor = "[[[B")
    private byte[][][] levelShademap;

    @OriginalMember(owner = "client!CRRWDRTI", name = "m", descriptor = "[[[I")
    private int[][][] levelOccludemap;

    @OriginalMember(owner = "client!CRRWDRTI", name = "n", descriptor = "[[[B")
    private byte[][][] levelTileOverlayShape;

    @OriginalMember(owner = "client!CRRWDRTI", name = "o", descriptor = "[I")
    private static final int[] WALL_DECORATION_ROTATION_FORWARD_X = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!CRRWDRTI", name = "p", descriptor = "I")
    private static int _flowObfuscator2 = 323;

    @OriginalMember(owner = "client!CRRWDRTI", name = "q", descriptor = "[[I")
    private int[][] levelLightmap;

    @OriginalMember(owner = "client!CRRWDRTI", name = "r", descriptor = "[I")
    private static final int[] ROTATION_WALL_CORNER_TYPE = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!CRRWDRTI", name = "s", descriptor = "Z")
    private static boolean _flowObfuscator3;

    @OriginalMember(owner = "client!CRRWDRTI", name = "t", descriptor = "[[[B")
    private byte[][][] levelTileUnderlayIds;

    @OriginalMember(owner = "client!CRRWDRTI", name = "u", descriptor = "Z")
    private boolean _flowObfuscator4 = false;

    @OriginalMember(owner = "client!CRRWDRTI", name = "v", descriptor = "[I")
    private static final int[] WALL_DECORATION_ROTATION_FORWARD_Z = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!CRRWDRTI", name = "w", descriptor = "I")
    public static int currentLevel = 99;

    @OriginalMember(owner = "client!CRRWDRTI", name = "x", descriptor = "I")
    private int maxTileX;

    @OriginalMember(owner = "client!CRRWDRTI", name = "y", descriptor = "I")
    private int maxTileZ;

    @OriginalMember(owner = "client!CRRWDRTI", name = "z", descriptor = "[[[B")
    private byte[][][] levelTileOverlayRotation;

    @OriginalMember(owner = "client!CRRWDRTI", name = "A", descriptor = "[[[B")
    private byte[][][] levelTileFlags;

    @OriginalMember(owner = "client!CRRWDRTI", name = "B", descriptor = "I")
    private int _flowObfuscator6 = -53;

    @OriginalMember(owner = "client!CRRWDRTI", name = "C", descriptor = "Z")
    public static boolean lowMemory = true;

    @OriginalMember(owner = "client!CRRWDRTI", name = "D", descriptor = "[I")
    private static final int[] ROTATION_WALL_TYPE = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!CRRWDRTI", name = "E", descriptor = "I")
    private static int _flowObfuscator7 = -388;

    @OriginalMember(owner = "client!CRRWDRTI", name = "<init>", descriptor = "([[[BIII[[[I)V")
    public World(byte[][][] arg0, int arg1, int arg2, int arg3, int[][][] arg4) {
        currentLevel = 99;
        this.maxTileX = arg3;
        this.maxTileZ = arg2;
        while (arg1 >= 0) {
            _flowObfuscator7 = -320;
        }
        this.levelHeightmap = arg4;
        this.levelTileFlags = arg0;
        this.levelTileUnderlayIds = new byte[4][this.maxTileX][this.maxTileZ];
        this.levelTileOverlayIds = new byte[4][this.maxTileX][this.maxTileZ];
        this.levelTileOverlayShape = new byte[4][this.maxTileX][this.maxTileZ];
        this.levelTileOverlayRotation = new byte[4][this.maxTileX][this.maxTileZ];
        this.levelOccludemap = new int[4][this.maxTileX + 1][this.maxTileZ + 1];
        this.levelShademap = new byte[4][this.maxTileX + 1][this.maxTileZ + 1];
        this.levelLightmap = new int[this.maxTileX + 1][this.maxTileZ + 1];
        this.blendChroma = new int[this.maxTileZ];
        this.blendSaturation = new int[this.maxTileZ];
        this.blendLightness = new int[this.maxTileZ];
        this.blendLuminance = new int[this.maxTileZ];
        this.blendMagnitude = new int[this.maxTileZ];
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(II)I")
    private static final int noise(int arg0, int arg1) {
        int var2 = arg0 + arg1 * 57;
        int var4 = var2 << 13 ^ var2;
        int var3 = var4 * (var4 * var4 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
        return var3 >> 19 & 255;
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "([LFTPNODIB;LNYFUGYQS;I)V")
    public final void build(CollisionMap[] arg0, World3D arg1, int arg2) {
        int var5;
        int var6;
        int var7;
        for (int var4 = 0; var4 < 4; var4++) {
            for (var5 = 0; var5 < 104; var5++) {
                for (var6 = 0; var6 < 104; var6++) {
                    if ((this.levelTileFlags[var4][var5][var6] & 1) == 1) {
                        var7 = var4;
                        if ((this.levelTileFlags[1][var5][var6] & 2) == 2) {
                            var7 = var4 - 1;
                        }
                        if (var7 >= 0) {
                            arg0[var7].setBlocked(var6, 0, var5);
                        }
                    }
                }
            }
        }
        if (arg2 < 2 || arg2 > 2) {
            _flowObfuscator2 = 329;
        }
        randomHueOffset += (int) (Math.random() * 5.0D) - 2;
        if (randomHueOffset < -8) {
            randomHueOffset = -8;
        }
        if (randomHueOffset > 8) {
            randomHueOffset = 8;
        }
        randomLightnessOffset += (int) (Math.random() * 5.0D) - 2;
        if (randomLightnessOffset < -16) {
            randomLightnessOffset = -16;
        }
        if (randomLightnessOffset > 16) {
            randomLightnessOffset = 16;
        }
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        for (var5 = 0; var5 < 4; var5++) {
            byte[][] var45 = this.levelShademap[var5];
            byte var46 = 96;
            short var8 = 768;
            byte var9 = -50;
            byte var10 = -10;
            byte var11 = -50;
            var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10 + var11 * var11));
            var13 = var8 * var12 >> 8;
            for (var14 = 1; var14 < this.maxTileZ - 1; var14++) {
                for (var15 = 1; var15 < this.maxTileX - 1; var15++) {
                    var16 = this.levelHeightmap[var5][var15 + 1][var14] - this.levelHeightmap[var5][var15 - 1][var14];
                    var17 = this.levelHeightmap[var5][var15][var14 + 1] - this.levelHeightmap[var5][var15][var14 - 1];
                    var18 = (int) Math.sqrt((double) (var16 * var16 + 65536 + var17 * var17));
                    var19 = (var16 << 8) / var18;
                    var20 = 65536 / var18;
                    var21 = (var17 << 8) / var18;
                    var22 = var46 + (var9 * var19 + var10 * var20 + var11 * var21) / var13;
                    var23 = (var45[var15 - 1][var14] >> 2) + (var45[var15 + 1][var14] >> 3) + (var45[var15][var14 - 1] >> 2) + (var45[var15][var14 + 1] >> 3) + (var45[var15][var14] >> 1);
                    this.levelLightmap[var15][var14] = var22 - var23;
                }
            }
            for (var15 = 0; var15 < this.maxTileZ; var15++) {
                this.blendChroma[var15] = 0;
                this.blendSaturation[var15] = 0;
                this.blendLightness[var15] = 0;
                this.blendLuminance[var15] = 0;
                this.blendMagnitude[var15] = 0;
            }
            for (var16 = -5; var16 < this.maxTileX + 5; var16++) {
                for (var17 = 0; var17 < this.maxTileZ; var17++) {
                    var18 = var16 + 5;
                    int var10002;
                    if (var18 >= 0 && var18 < this.maxTileX) {
                        var19 = this.levelTileUnderlayIds[var5][var18][var17] & 255;
                        if (var19 > 0) {
                            FloType var51 = FloType.instances[var19 - 1];
                            this.blendChroma[var17] += var51.chroma;
                            this.blendSaturation[var17] += var51.saturation;
                            this.blendLightness[var17] += var51.lightness;
                            this.blendLuminance[var17] += var51.luminance;
                            var10002 = this.blendMagnitude[var17]++;
                        }
                    }
                    var19 = var16 - 5;
                    if (var19 >= 0 && var19 < this.maxTileX) {
                        var20 = this.levelTileUnderlayIds[var5][var19][var17] & 255;
                        if (var20 > 0) {
                            FloType var52 = FloType.instances[var20 - 1];
                            this.blendChroma[var17] -= var52.chroma;
                            this.blendSaturation[var17] -= var52.saturation;
                            this.blendLightness[var17] -= var52.lightness;
                            this.blendLuminance[var17] -= var52.luminance;
                            var10002 = this.blendMagnitude[var17]--;
                        }
                    }
                }
                if (var16 >= 1 && var16 < this.maxTileX - 1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                    var22 = 0;
                    for (var23 = -5; var23 < this.maxTileZ + 5; var23++) {
                        int var24 = var23 + 5;
                        if (var24 >= 0 && var24 < this.maxTileZ) {
                            var18 += this.blendChroma[var24];
                            var19 += this.blendSaturation[var24];
                            var20 += this.blendLightness[var24];
                            var21 += this.blendLuminance[var24];
                            var22 += this.blendMagnitude[var24];
                        }
                        int var25 = var23 - 5;
                        if (var25 >= 0 && var25 < this.maxTileZ) {
                            var18 -= this.blendChroma[var25];
                            var19 -= this.blendSaturation[var25];
                            var20 -= this.blendLightness[var25];
                            var21 -= this.blendLuminance[var25];
                            var22 -= this.blendMagnitude[var25];
                        }
                        if (var23 >= 1 && var23 < this.maxTileZ - 1 && (!lowMemory || (this.levelTileFlags[0][var16][var23] & 2) != 0 || (this.levelTileFlags[var5][var16][var23] & 16) == 0 && this.getDrawLevel(var23, var5, var16, 0) == levelBuilt)) {
                            if (var5 < currentLevel) {
                                currentLevel = var5;
                            }
                            int var26 = this.levelTileUnderlayIds[var5][var16][var23] & 255;
                            int var27 = this.levelTileOverlayIds[var5][var16][var23] & 255;
                            if (var26 > 0 || var27 > 0) {
                                int var28 = this.levelHeightmap[var5][var16][var23];
                                int var29 = this.levelHeightmap[var5][var16 + 1][var23];
                                int var30 = this.levelHeightmap[var5][var16 + 1][var23 + 1];
                                int var31 = this.levelHeightmap[var5][var16][var23 + 1];
                                int var32 = this.levelLightmap[var16][var23];
                                int var33 = this.levelLightmap[var16 + 1][var23];
                                int var34 = this.levelLightmap[var16 + 1][var23 + 1];
                                int var35 = this.levelLightmap[var16][var23 + 1];
                                int var36 = -1;
                                int var37 = -1;
                                int var38;
                                int var39;
                                if (var26 > 0) {
                                    var38 = var18 * 256 / var21;
                                    var39 = var19 / var22;
                                    int var40 = var20 / var22;
                                    var36 = this.hsl24to16(var38, var39, var40);
                                    int var54 = var38 + randomHueOffset & 255;
                                    var40 += randomLightnessOffset;
                                    if (var40 < 0) {
                                        var40 = 0;
                                    } else if (var40 > 255) {
                                        var40 = 255;
                                    }
                                    var37 = this.hsl24to16(var54, var39, var40);
                                }
                                if (var5 > 0) {
                                    boolean var55 = true;
                                    if (var26 == 0 && this.levelTileOverlayShape[var5][var16][var23] != 0) {
                                        var55 = false;
                                    }
                                    if (var27 > 0 && !FloType.instances[var27 - 1].occlude) {
                                        var55 = false;
                                    }
                                    if (var55 && var28 == var29 && var28 == var30 && var28 == var31) {
                                        this.levelOccludemap[var5][var16][var23] |= 2340;
                                    }
                                }
                                var38 = 0;
                                if (var36 != -1) {
                                    var38 = Draw3D.palette[mulHSL(var37, 96)];
                                }
                                if (var27 == 0) {
                                    arg1.setTile(var5, var16, var23, 0, 0, -1, var28, var29, var30, var31, mulHSL(var36, var32), mulHSL(var36, var33), mulHSL(var36, var34), mulHSL(var36, var35), 0, 0, 0, 0, var38, 0);
                                } else {
                                    var39 = this.levelTileOverlayShape[var5][var16][var23] + 1;
                                    byte var56 = this.levelTileOverlayRotation[var5][var16][var23];
                                    FloType var41 = FloType.instances[var27 - 1];
                                    int var42 = var41.texture;
                                    int var43;
                                    int var44;
                                    if (var42 >= 0) {
                                        var44 = Draw3D.getAverageTextureRGB(var42, 12660);
                                        var43 = -1;
                                    } else if (var41.rgb == 16711935) {
                                        var44 = 0;
                                        var43 = -2;
                                        var42 = -1;
                                    } else {
                                        var43 = this.hsl24to16(var41.hue, var41.saturation, var41.lightness);
                                        var44 = Draw3D.palette[this.adjustLightness(var41.hsl, 96)];
                                    }
                                    arg1.setTile(var5, var16, var23, var39, var56, var42, var28, var29, var30, var31, mulHSL(var36, var32), mulHSL(var36, var33), mulHSL(var36, var34), mulHSL(var36, var35), this.adjustLightness(var43, var32), this.adjustLightness(var43, var33), this.adjustLightness(var43, var34), this.adjustLightness(var43, var35), var38, var44);
                                }
                            }
                        }
                    }
                }
            }
            for (var17 = 1; var17 < this.maxTileZ - 1; var17++) {
                for (var18 = 1; var18 < this.maxTileX - 1; var18++) {
                    arg1.setDrawLevel(var5, var18, var17, this.getDrawLevel(var17, var5, var18, 0));
                }
            }
        }
        arg1.buildModels(-10, (byte) 3, 64, -50, 768, -50);
        for (var6 = 0; var6 < this.maxTileX; var6++) {
            for (var7 = 0; var7 < this.maxTileZ; var7++) {
                if ((this.levelTileFlags[1][var6][var7] & 2) == 2) {
                    arg1.setBridge(var7, var6, -438);
                }
            }
        }
        var7 = 1;
        int var47 = 2;
        int var48 = 4;
        for (int var49 = 0; var49 < 4; var49++) {
            if (var49 > 0) {
                var7 <<= 3;
                var47 <<= 3;
                var48 <<= 3;
            }
            for (int var50 = 0; var50 <= var49; var50++) {
                for (var12 = 0; var12 <= this.maxTileZ; var12++) {
                    for (var13 = 0; var13 <= this.maxTileX; var13++) {
                        short var53;
                        if ((this.levelOccludemap[var50][var13][var12] & var7) != 0) {
                            var14 = var12;
                            var15 = var12;
                            var16 = var50;
                            var17 = var50;
                            while (var14 > 0 && (this.levelOccludemap[var50][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.maxTileZ && (this.levelOccludemap[var50][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label329: while (var16 > 0) {
                                for (var18 = var14; var18 <= var15; var18++) {
                                    if ((this.levelOccludemap[var16 - 1][var13][var18] & var7) == 0) {
                                        break label329;
                                    }
                                }
                                var16--;
                            }
                            label318: while (var17 < var49) {
                                for (var18 = var14; var18 <= var15; var18++) {
                                    if ((this.levelOccludemap[var17 + 1][var13][var18] & var7) == 0) {
                                        break label318;
                                    }
                                }
                                var17++;
                            }
                            var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var18 >= 8) {
                                var53 = 240;
                                var20 = this.levelHeightmap[var17][var13][var14] - var53;
                                var21 = this.levelHeightmap[var16][var13][var14];
                                World3D.addOccluder(var49, var13 * 128, var21, var13 * 128, var15 * 128 + 128, var20, this._flowObfuscator6, var14 * 128, 1);
                                for (var22 = var16; var22 <= var17; var22++) {
                                    for (var23 = var14; var23 <= var15; var23++) {
                                        this.levelOccludemap[var22][var13][var23] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.levelOccludemap[var50][var13][var12] & var47) != 0) {
                            var14 = var13;
                            var15 = var13;
                            var16 = var50;
                            var17 = var50;
                            while (var14 > 0 && (this.levelOccludemap[var50][var14 - 1][var12] & var47) != 0) {
                                var14--;
                            }
                            while (var15 < this.maxTileX && (this.levelOccludemap[var50][var15 + 1][var12] & var47) != 0) {
                                var15++;
                            }
                            label382: while (var16 > 0) {
                                for (var18 = var14; var18 <= var15; var18++) {
                                    if ((this.levelOccludemap[var16 - 1][var18][var12] & var47) == 0) {
                                        break label382;
                                    }
                                }
                                var16--;
                            }
                            label371: while (var17 < var49) {
                                for (var18 = var14; var18 <= var15; var18++) {
                                    if ((this.levelOccludemap[var17 + 1][var18][var12] & var47) == 0) {
                                        break label371;
                                    }
                                }
                                var17++;
                            }
                            var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var18 >= 8) {
                                var53 = 240;
                                var20 = this.levelHeightmap[var17][var14][var12] - var53;
                                var21 = this.levelHeightmap[var16][var14][var12];
                                World3D.addOccluder(var49, var14 * 128, var21, var15 * 128 + 128, var12 * 128, var20, this._flowObfuscator6, var12 * 128, 2);
                                for (var22 = var16; var22 <= var17; var22++) {
                                    for (var23 = var14; var23 <= var15; var23++) {
                                        this.levelOccludemap[var22][var23][var12] &= ~var47;
                                    }
                                }
                            }
                        }
                        if ((this.levelOccludemap[var50][var13][var12] & var48) != 0) {
                            var14 = var13;
                            var15 = var13;
                            var16 = var12;
                            var17 = var12;
                            while (var16 > 0 && (this.levelOccludemap[var50][var13][var16 - 1] & var48) != 0) {
                                var16--;
                            }
                            while (var17 < this.maxTileZ && (this.levelOccludemap[var50][var13][var17 + 1] & var48) != 0) {
                                var17++;
                            }
                            label435: while (var14 > 0) {
                                for (var18 = var16; var18 <= var17; var18++) {
                                    if ((this.levelOccludemap[var50][var14 - 1][var18] & var48) == 0) {
                                        break label435;
                                    }
                                }
                                var14--;
                            }
                            label424: while (var15 < this.maxTileX) {
                                for (var18 = var16; var18 <= var17; var18++) {
                                    if ((this.levelOccludemap[var50][var15 + 1][var18] & var48) == 0) {
                                        break label424;
                                    }
                                }
                                var15++;
                            }
                            if ((var15 - var14 + 1) * (var17 - var16 + 1) >= 4) {
                                var18 = this.levelHeightmap[var50][var14][var16];
                                World3D.addOccluder(var49, var14 * 128, var18, var15 * 128 + 128, var17 * 128 + 128, var18, this._flowObfuscator6, var16 * 128, 4);
                                for (var19 = var14; var19 <= var15; var19++) {
                                    for (var20 = var16; var20 <= var17; var20++) {
                                        this.levelOccludemap[var50][var19][var20] &= ~var48;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "b", descriptor = "(II)I")
    private static final int perlin(int arg0, int arg1) {
        int var2 = perlin(arg0 + 45365, arg1 + 91923, 4) - 128 + (perlin(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (perlin(arg0, arg1, 1) - 128 >> 2);
        var2 = (int) ((double) var2 * 0.3D) + 35;
        if (var2 < 10) {
            var2 = 10;
        } else if (var2 > 60) {
            var2 = 60;
        }
        return var2;
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(BLMBMGIXGO;LGHOWLKWN;)V")
    public static final void prefetchLocs(byte arg0, Packet arg1, OnDemand arg2) {
        int var3 = -1;
        if (arg0 != -107) {
            _flowObfuscator3 = !_flowObfuscator3;
        }
        while (true) {
            int var4 = arg1.gsmarts();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            LocType var5 = LocType.get(var3);
            var5.prefetch(arg2, -235);
            while (true) {
                int var6 = arg1.gsmarts();
                if (var6 == 0) {
                    break;
                }
                arg1.g1();
            }
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(IIIII)V")
    public final void stitchHeightmap(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg0; var6 <= arg0 + arg1; var6++) {
            for (int var7 = arg4; var7 <= arg4 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.maxTileX && var6 >= 0 && var6 < this.maxTileZ) {
                    this.levelShademap[0][var7][var6] = 127;
                    if (var7 == arg4 && var7 > 0) {
                        this.levelHeightmap[0][var7][var6] = this.levelHeightmap[0][var7 - 1][var6];
                    }
                    if (var7 == arg4 + arg3 && var7 < this.maxTileX - 1) {
                        this.levelHeightmap[0][var7][var6] = this.levelHeightmap[0][var7 + 1][var6];
                    }
                    if (var6 == arg0 && var6 > 0) {
                        this.levelHeightmap[0][var7][var6] = this.levelHeightmap[0][var7][var6 - 1];
                    }
                    if (var6 == arg0 + arg1 && var6 < this.maxTileZ - 1) {
                        this.levelHeightmap[0][var7][var6] = this.levelHeightmap[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg2 != 0) {
            _flowObfuscator7 = 284;
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(ILNYFUGYQS;LFTPNODIB;IIIIZI)V")
    private final void addLoc(int arg0, World3D arg1, CollisionMap arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (lowMemory && (this.levelTileFlags[0][arg5][arg0] & 2) == 0) {
            if ((this.levelTileFlags[arg4][arg5][arg0] & 16) != 0) {
                return;
            }
            if (this.getDrawLevel(arg0, arg4, arg5, 0) != levelBuilt) {
                return;
            }
        }
        if (arg4 < currentLevel) {
            currentLevel = arg4;
        }
        int var10 = this.levelHeightmap[arg4][arg5][arg0];
        int var11 = this.levelHeightmap[arg4][arg5 + 1][arg0];
        int var12 = this.levelHeightmap[arg4][arg5 + 1][arg0 + 1];
        int var13 = this.levelHeightmap[arg4][arg5][arg0 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        LocType var15 = LocType.get(arg6);
        int var16 = arg5 + (arg0 << 7) + (arg6 << 14) + 1073741824;
        if (!var15.active) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg8 << 6) + arg3);
        if (!arg7) {
            Entity var18;
            if (arg3 == 22) {
                if (!lowMemory || var15.active || var15.forcedecor) {
                    if (var15.anim == -1 && var15.multiloc == null) {
                        var18 = var15.getModel(22, arg8, var10, var11, var12, var13, -1);
                    } else {
                        var18 = new LocEntity(arg6, arg8, 22, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                    }
                    arg1.addGroundDecoration(arg4, var14, arg0, 68, var18, var17, var16, arg5);
                    if (var15.blockwalk && var15.active && arg2 != null) {
                        arg2.setBlocked(arg0, 0, arg5);
                    }
                }
            } else {
                int var19;
                if (arg3 != 10 && arg3 != 11) {
                    if (arg3 >= 12) {
                        if (var15.anim == -1 && var15.multiloc == null) {
                            var18 = var15.getModel(arg3, arg8, var10, var11, var12, var13, -1);
                        } else {
                            var18 = new LocEntity(arg6, arg8, arg3, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                        }
                        arg1.add(var16, var17, var14, 1, var18, 1, arg4, 0, (byte) 110, arg0, arg5);
                        if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
                            this.levelOccludemap[arg4][arg5][arg0] |= 2340;
                        }
                        if (var15.blockwalk && arg2 != null) {
                            arg2.addLoc(var15.blockrange, _flowObfuscator2, var15.width, var15.length, arg5, arg0, arg8);
                        }
                    } else if (arg3 == 0) {
                        if (var15.anim == -1 && var15.multiloc == null) {
                            var18 = var15.getModel(0, arg8, var10, var11, var12, var13, -1);
                        } else {
                            var18 = new LocEntity(arg6, arg8, 0, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                        }
                        arg1.setWall(ROTATION_WALL_TYPE[arg8], var18, true, var16, arg0, var17, arg5, (Entity) null, var14, 0, arg4);
                        if (arg8 == 0) {
                            if (var15.shadow) {
                                this.levelShademap[arg4][arg5][arg0] = 50;
                                this.levelShademap[arg4][arg5][arg0 + 1] = 50;
                            }
                            if (var15.occlude) {
                                this.levelOccludemap[arg4][arg5][arg0] |= 585;
                            }
                        } else if (arg8 == 1) {
                            if (var15.shadow) {
                                this.levelShademap[arg4][arg5][arg0 + 1] = 50;
                                this.levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
                            }
                            if (var15.occlude) {
                                this.levelOccludemap[arg4][arg5][arg0 + 1] |= 1170;
                            }
                        } else if (arg8 == 2) {
                            if (var15.shadow) {
                                this.levelShademap[arg4][arg5 + 1][arg0] = 50;
                                this.levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
                            }
                            if (var15.occlude) {
                                this.levelOccludemap[arg4][arg5 + 1][arg0] |= 585;
                            }
                        } else if (arg8 == 3) {
                            if (var15.shadow) {
                                this.levelShademap[arg4][arg5][arg0] = 50;
                                this.levelShademap[arg4][arg5 + 1][arg0] = 50;
                            }
                            if (var15.occlude) {
                                this.levelOccludemap[arg4][arg5][arg0] |= 1170;
                            }
                        }
                        if (var15.blockwalk && arg2 != null) {
                            arg2.addWall(arg0, arg8, arg5, arg3, (byte) 1, var15.blockrange);
                        }
                        if (var15.wallwidth != 16) {
                            arg1.setWallDecorationOffset(arg0, 441, var15.wallwidth, arg5, arg4);
                        }
                    } else if (arg3 == 1) {
                        if (var15.anim == -1 && var15.multiloc == null) {
                            var18 = var15.getModel(1, arg8, var10, var11, var12, var13, -1);
                        } else {
                            var18 = new LocEntity(arg6, arg8, 1, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                        }
                        arg1.setWall(ROTATION_WALL_CORNER_TYPE[arg8], var18, true, var16, arg0, var17, arg5, (Entity) null, var14, 0, arg4);
                        if (var15.shadow) {
                            if (arg8 == 0) {
                                this.levelShademap[arg4][arg5][arg0 + 1] = 50;
                            } else if (arg8 == 1) {
                                this.levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
                            } else if (arg8 == 2) {
                                this.levelShademap[arg4][arg5 + 1][arg0] = 50;
                            } else if (arg8 == 3) {
                                this.levelShademap[arg4][arg5][arg0] = 50;
                            }
                        }
                        if (var15.blockwalk && arg2 != null) {
                            arg2.addWall(arg0, arg8, arg5, arg3, (byte) 1, var15.blockrange);
                        }
                    } else {
                        int var26;
                        Entity var28;
                        if (arg3 == 2) {
                            var26 = arg8 + 1 & 3;
                            Entity var27;
                            if (var15.anim == -1 && var15.multiloc == null) {
                                var27 = var15.getModel(2, 4 + arg8, var10, var11, var12, var13, -1);
                                var28 = var15.getModel(2, var26, var10, var11, var12, var13, -1);
                            } else {
                                var27 = new LocEntity(arg6, 4 + arg8, 2, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                                var28 = new LocEntity(arg6, var26, 2, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                            }
                            arg1.setWall(ROTATION_WALL_TYPE[arg8], var27, true, var16, arg0, var17, arg5, var28, var14, ROTATION_WALL_TYPE[var26], arg4);
                            if (var15.occlude) {
                                if (arg8 == 0) {
                                    this.levelOccludemap[arg4][arg5][arg0] |= 585;
                                    this.levelOccludemap[arg4][arg5][arg0 + 1] |= 1170;
                                } else if (arg8 == 1) {
                                    this.levelOccludemap[arg4][arg5][arg0 + 1] |= 1170;
                                    this.levelOccludemap[arg4][arg5 + 1][arg0] |= 585;
                                } else if (arg8 == 2) {
                                    this.levelOccludemap[arg4][arg5 + 1][arg0] |= 585;
                                    this.levelOccludemap[arg4][arg5][arg0] |= 1170;
                                } else if (arg8 == 3) {
                                    this.levelOccludemap[arg4][arg5][arg0] |= 1170;
                                    this.levelOccludemap[arg4][arg5][arg0] |= 585;
                                }
                            }
                            if (var15.blockwalk && arg2 != null) {
                                arg2.addWall(arg0, arg8, arg5, arg3, (byte) 1, var15.blockrange);
                            }
                            if (var15.wallwidth != 16) {
                                arg1.setWallDecorationOffset(arg0, 441, var15.wallwidth, arg5, arg4);
                            }
                        } else if (arg3 == 3) {
                            if (var15.anim == -1 && var15.multiloc == null) {
                                var18 = var15.getModel(3, arg8, var10, var11, var12, var13, -1);
                            } else {
                                var18 = new LocEntity(arg6, arg8, 3, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                            }
                            arg1.setWall(ROTATION_WALL_CORNER_TYPE[arg8], var18, true, var16, arg0, var17, arg5, (Entity) null, var14, 0, arg4);
                            if (var15.shadow) {
                                if (arg8 == 0) {
                                    this.levelShademap[arg4][arg5][arg0 + 1] = 50;
                                } else if (arg8 == 1) {
                                    this.levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
                                } else if (arg8 == 2) {
                                    this.levelShademap[arg4][arg5 + 1][arg0] = 50;
                                } else if (arg8 == 3) {
                                    this.levelShademap[arg4][arg5][arg0] = 50;
                                }
                            }
                            if (var15.blockwalk && arg2 != null) {
                                arg2.addWall(arg0, arg8, arg5, arg3, (byte) 1, var15.blockrange);
                            }
                        } else if (arg3 == 9) {
                            if (var15.anim == -1 && var15.multiloc == null) {
                                var18 = var15.getModel(arg3, arg8, var10, var11, var12, var13, -1);
                            } else {
                                var18 = new LocEntity(arg6, arg8, arg3, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                            }
                            arg1.add(var16, var17, var14, 1, var18, 1, arg4, 0, (byte) 110, arg0, arg5);
                            if (var15.blockwalk && arg2 != null) {
                                arg2.addLoc(var15.blockrange, _flowObfuscator2, var15.width, var15.length, arg5, arg0, arg8);
                            }
                        } else {
                            if (var15.hillskew) {
                                if (arg8 == 1) {
                                    var26 = var13;
                                    var13 = var12;
                                    var12 = var11;
                                    var11 = var10;
                                    var10 = var26;
                                } else if (arg8 == 2) {
                                    var26 = var13;
                                    var13 = var11;
                                    var11 = var26;
                                    var26 = var12;
                                    var12 = var10;
                                    var10 = var26;
                                } else if (arg8 == 3) {
                                    var26 = var13;
                                    var13 = var10;
                                    var10 = var11;
                                    var11 = var12;
                                    var12 = var26;
                                }
                            }
                            if (arg3 == 4) {
                                if (var15.anim == -1 && var15.multiloc == null) {
                                    var18 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                                } else {
                                    var18 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                                }
                                arg1.setWallDecoration(var16, arg0, arg8 * 512, -460, arg4, 0, var14, var18, arg5, var17, 0, ROTATION_WALL_TYPE[arg8]);
                            } else if (arg3 == 5) {
                                var26 = 16;
                                var19 = arg1.getWallBitset(arg4, arg5, arg0);
                                if (var19 > 0) {
                                    var26 = LocType.get(var19 >> 14 & 32767).wallwidth;
                                }
                                if (var15.anim == -1 && var15.multiloc == null) {
                                    var28 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                                } else {
                                    var28 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                                }
                                arg1.setWallDecoration(var16, arg0, arg8 * 512, -460, arg4, WALL_DECORATION_ROTATION_FORWARD_X[arg8] * var26, var14, var28, arg5, var17, WALL_DECORATION_ROTATION_FORWARD_Z[arg8] * var26, ROTATION_WALL_TYPE[arg8]);
                            } else if (arg3 == 6) {
                                if (var15.anim == -1 && var15.multiloc == null) {
                                    var18 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                                } else {
                                    var18 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                                }
                                arg1.setWallDecoration(var16, arg0, arg8, -460, arg4, 0, var14, var18, arg5, var17, 0, 256);
                            } else if (arg3 == 7) {
                                if (var15.anim == -1 && var15.multiloc == null) {
                                    var18 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                                } else {
                                    var18 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                                }
                                arg1.setWallDecoration(var16, arg0, arg8, -460, arg4, 0, var14, var18, arg5, var17, 0, 512);
                            } else if (arg3 == 8) {
                                if (var15.anim == -1 && var15.multiloc == null) {
                                    var18 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
                                } else {
                                    var18 = new LocEntity(arg6, 0, 4, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                                }
                                arg1.setWallDecoration(var16, arg0, arg8, -460, arg4, 0, var14, var18, arg5, var17, 0, 768);
                            }
                        }
                    }
                } else {
                    if (var15.anim == -1 && var15.multiloc == null) {
                        var18 = var15.getModel(10, arg8, var10, var11, var12, var13, -1);
                    } else {
                        var18 = new LocEntity(arg6, arg8, 10, var11, (byte) 7, var12, var10, var13, var15.anim, true);
                    }
                    if (var18 != null) {
                        int var21 = 0;
                        if (arg3 == 11) {
                            var21 += 256;
                        }
                        int var20;
                        if (arg8 != 1 && arg8 != 3) {
                            var19 = var15.width;
                            var20 = var15.length;
                        } else {
                            var19 = var15.length;
                            var20 = var15.width;
                        }
                        if (arg1.add(var16, var17, var14, var20, var18, var19, arg4, var21, (byte) 110, arg0, arg5) && var15.shadow) {
                            Model var22;
                            if (var18 instanceof Model) {
                                var22 = (Model) var18;
                            } else {
                                var22 = var15.getModel(10, arg8, var10, var11, var12, var13, -1);
                            }
                            if (var22 != null) {
                                for (int var23 = 0; var23 <= var19; var23++) {
                                    for (int var24 = 0; var24 <= var20; var24++) {
                                        int var25 = var22.radius / 4;
                                        if (var25 > 30) {
                                            var25 = 30;
                                        }
                                        if (var25 > this.levelShademap[arg4][arg5 + var23][arg0 + var24]) {
                                            this.levelShademap[arg4][arg5 + var23][arg0 + var24] = (byte) var25;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var15.blockwalk && arg2 != null) {
                        arg2.addLoc(var15.blockrange, _flowObfuscator2, var15.width, var15.length, arg5, arg0, arg8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(III)I")
    private static final int perlin(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = smoothNoise(var3, var5);
        int var8 = smoothNoise(var3 + 1, var5);
        int var9 = smoothNoise(var3, var5 + 1);
        int var10 = smoothNoise(var3 + 1, var5 + 1);
        int var11 = interpolate(var7, var8, var4, arg2);
        int var12 = interpolate(var9, var10, var4, arg2);
        return interpolate(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "b", descriptor = "(III)I")
    private final int hsl24to16(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "c", descriptor = "(III)Z")
    public static final boolean isLocReady(int arg0, int arg1, int arg2) {
        LocType var3 = LocType.get(arg0);
        if (arg2 != 8) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.validate(arg1, true);
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(II[LFTPNODIB;III[BIII)V")
    public final void readLandRegion(int arg0, int arg1, CollisionMap[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        int var12;
        for (int var11 = 0; var11 < 8; var11++) {
            for (var12 = 0; var12 < 8; var12++) {
                if (arg4 + var11 > 0 && arg4 + var11 < 103 && arg9 + var12 > 0 && arg9 + var12 < 103) {
                    arg2[arg8].flags[arg4 + var11][arg9 + var12] &= -16777217;
                }
            }
        }
        if (arg3 < 9 || arg3 > 9) {
            for (var12 = 1; var12 > 0; var12++) {
            }
        }
        Packet var16 = new Packet(arg6, 891);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (var13 == arg0 && var14 >= arg5 && var14 < arg5 + 8 && var15 >= arg7 && var15 < arg7 + 8) {
                        this.readLandInner(arg9 + WorldRegion.rotateZ(var15 & 7, arg1, -383, var14 & 7), 0, var16, arg4 + WorldRegion.rotateX(arg1, var15 & 7, var14 & 7, false), arg8, arg1, 942, 0);
                    } else {
                        this.readLandInner(-1, 0, var16, -1, 0, 0, 942, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "([BIIIIB[LFTPNODIB;)V")
    public final void readLand(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, CollisionMap[] arg6) {
        int var10;
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 64; var9++) {
                for (var10 = 0; var10 < 64; var10++) {
                    if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg1 + var10 > 0 && arg1 + var10 < 103) {
                        arg6[var8].flags[arg2 + var9][arg1 + var10] &= -16777217;
                    }
                }
            }
        }
        Packet var13 = new Packet(arg0, 891);
        for (var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.readLandInner(var12 + arg1, arg4, var13, var11 + arg2, var10, 0, 942, arg3);
                }
            }
        }
        if (arg5 != 4) {
            this._flowObfuscator4 = !this._flowObfuscator4;
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(IILMBMGIXGO;IIIII)V")
    private final void readLandInner(int arg0, int arg1, Packet arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var11 = 36 / arg6;
        int var9;
        if (arg3 >= 0 && arg3 < 104 && arg0 >= 0 && arg0 < 104) {
            this.levelTileFlags[arg4][arg3][arg0] = 0;
            while (true) {
                var9 = arg2.g1();
                if (var9 == 0) {
                    if (arg4 == 0) {
                        this.levelHeightmap[0][arg3][arg0] = -perlin(932731 + arg3 + arg7, 556238 + arg0 + arg1) * 8;
                        return;
                    } else {
                        this.levelHeightmap[arg4][arg3][arg0] = this.levelHeightmap[arg4 - 1][arg3][arg0] - 240;
                        return;
                    }
                }
                if (var9 == 1) {
                    int var10 = arg2.g1();
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg4 == 0) {
                        this.levelHeightmap[0][arg3][arg0] = -var10 * 8;
                        return;
                    }
                    this.levelHeightmap[arg4][arg3][arg0] = this.levelHeightmap[arg4 - 1][arg3][arg0] - var10 * 8;
                    return;
                }
                if (var9 <= 49) {
                    this.levelTileOverlayIds[arg4][arg3][arg0] = arg2.g1b();
                    this.levelTileOverlayShape[arg4][arg3][arg0] = (byte) ((var9 - 2) / 4);
                    this.levelTileOverlayRotation[arg4][arg3][arg0] = (byte) (var9 - 2 + arg5 & 3);
                } else if (var9 <= 81) {
                    this.levelTileFlags[arg4][arg3][arg0] = (byte) (var9 - 49);
                } else {
                    this.levelTileUnderlayIds[arg4][arg3][arg0] = (byte) (var9 - 81);
                }
            }
        } else {
            while (true) {
                var9 = arg2.g1();
                if (var9 == 0) {
                    return;
                }
                if (var9 == 1) {
                    arg2.g1();
                    return;
                }
                if (var9 <= 49) {
                    arg2.g1();
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(IIII)I")
    public int getDrawLevel(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return 2;
        } else if ((this.levelTileFlags[arg1][arg2][arg0] & 8) != 0) {
            return 0;
        } else {
            return arg1 > 0 && (this.levelTileFlags[1][arg2][arg0] & 2) != 0 ? arg1 - 1 : arg1;
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "([LFTPNODIB;LNYFUGYQS;IIIZI[BIII)V")
    public final void readLocRegion(CollisionMap[] arg0, World3D arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        Packet var12 = new Packet(arg7, 891);
        int var13 = -1;
        if (!arg5) {
            this._flowObfuscator4 = !this._flowObfuscator4;
        }
        while (true) {
            int var14 = var12.gsmarts();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.gsmarts();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.g1();
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (var19 == arg2 && var18 >= arg8 && var18 < arg8 + 8 && var17 >= arg4 && var17 < arg4 + 8) {
                    LocType var23 = LocType.get(var13);
                    int var24 = arg3 + WorldRegion.rotateLocX(arg9, var23.length, var18 & 7, (byte) 113, var17 & 7, var23.width);
                    int var25 = arg10 + WorldRegion.rotateLocZ(-433, var17 & 7, var23.length, arg9, var23.width, var18 & 7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = var19;
                        if ((this.levelTileFlags[1][var24][var25] & 2) == 2) {
                            var26 = var19 - 1;
                        }
                        CollisionMap var27 = null;
                        if (var26 >= 0) {
                            var27 = arg0[var26];
                        }
                        this.addLoc(var25, arg1, var27, var21, arg6, var24, var13, false, var22 + arg9 & 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "b", descriptor = "(IIII)I")
    private static final int interpolate(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - Draw3D.cos[arg2 * 1024 / arg3] >> 1;
        return (arg0 * (65536 - var4) >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "c", descriptor = "(II)I")
    private final int adjustLightness(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            arg1 = arg1 * (arg0 & 127) / 128;
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return (arg0 & 65408) + arg1;
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "d", descriptor = "(II)I")
    private static final int smoothNoise(int arg0, int arg1) {
        int var2 = noise(arg0 - 1, arg1 - 1) + noise(arg0 + 1, arg1 - 1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + 1);
        int var3 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1);
        int var4 = noise(arg0, arg1);
        return var2 / 16 + var3 / 8 + var4 / 4;
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "e", descriptor = "(II)I")
    private static final int mulHSL(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        } else {
            arg1 = arg1 * (arg0 & 127) / 128;
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return (arg0 & 65408) + arg1;
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(LNYFUGYQS;IIIILFTPNODIB;[[[IIIIB)V")
    public static final void addLoc(World3D arg0, int arg1, int arg2, int arg3, int arg4, CollisionMap arg5, int[][][] arg6, int arg7, int arg8, int arg9, byte arg10) {
        int var11 = arg6[arg4][arg7][arg2];
        int var12 = arg6[arg4][arg7 + 1][arg2];
        int var13 = arg6[arg4][arg7 + 1][arg2 + 1];
        int var14 = arg6[arg4][arg7][arg2 + 1];
        if (arg10 != 93) {
            _flowObfuscator7 = -145;
        }
        int var15 = var11 + var12 + var13 + var14 >> 2;
        LocType var16 = LocType.get(arg8);
        int var17 = arg7 + (arg2 << 7) + (arg8 << 14) + 1073741824;
        if (!var16.active) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg1 << 6) + arg3);
        Entity var19;
        if (arg3 == 22) {
            if (var16.anim == -1 && var16.multiloc == null) {
                var19 = var16.getModel(22, arg1, var11, var12, var13, var14, -1);
            } else {
                var19 = new LocEntity(arg8, arg1, 22, var12, (byte) 7, var13, var11, var14, var16.anim, true);
            }
            arg0.addGroundDecoration(arg9, var15, arg2, 68, var19, var18, var17, arg7);
            if (var16.blockwalk && var16.active) {
                arg5.setBlocked(arg2, 0, arg7);
            }
        } else {
            int var20;
            if (arg3 != 10 && arg3 != 11) {
                if (arg3 >= 12) {
                    if (var16.anim == -1 && var16.multiloc == null) {
                        var19 = var16.getModel(arg3, arg1, var11, var12, var13, var14, -1);
                    } else {
                        var19 = new LocEntity(arg8, arg1, arg3, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                    }
                    arg0.add(var17, var18, var15, 1, var19, 1, arg9, 0, (byte) 110, arg2, arg7);
                    if (var16.blockwalk) {
                        arg5.addLoc(var16.blockrange, _flowObfuscator2, var16.width, var16.length, arg7, arg2, arg1);
                    }
                } else if (arg3 == 0) {
                    if (var16.anim == -1 && var16.multiloc == null) {
                        var19 = var16.getModel(0, arg1, var11, var12, var13, var14, -1);
                    } else {
                        var19 = new LocEntity(arg8, arg1, 0, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                    }
                    arg0.setWall(ROTATION_WALL_TYPE[arg1], var19, true, var17, arg2, var18, arg7, (Entity) null, var15, 0, arg9);
                    if (var16.blockwalk) {
                        arg5.addWall(arg2, arg1, arg7, arg3, (byte) 1, var16.blockrange);
                    }
                } else if (arg3 == 1) {
                    if (var16.anim == -1 && var16.multiloc == null) {
                        var19 = var16.getModel(1, arg1, var11, var12, var13, var14, -1);
                    } else {
                        var19 = new LocEntity(arg8, arg1, 1, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                    }
                    arg0.setWall(ROTATION_WALL_CORNER_TYPE[arg1], var19, true, var17, arg2, var18, arg7, (Entity) null, var15, 0, arg9);
                    if (var16.blockwalk) {
                        arg5.addWall(arg2, arg1, arg7, arg3, (byte) 1, var16.blockrange);
                    }
                } else {
                    int var23;
                    Entity var25;
                    if (arg3 == 2) {
                        var23 = arg1 + 1 & 3;
                        Entity var24;
                        if (var16.anim == -1 && var16.multiloc == null) {
                            var24 = var16.getModel(2, 4 + arg1, var11, var12, var13, var14, -1);
                            var25 = var16.getModel(2, var23, var11, var12, var13, var14, -1);
                        } else {
                            var24 = new LocEntity(arg8, 4 + arg1, 2, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                            var25 = new LocEntity(arg8, var23, 2, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                        }
                        arg0.setWall(ROTATION_WALL_TYPE[arg1], var24, true, var17, arg2, var18, arg7, var25, var15, ROTATION_WALL_TYPE[var23], arg9);
                        if (var16.blockwalk) {
                            arg5.addWall(arg2, arg1, arg7, arg3, (byte) 1, var16.blockrange);
                        }
                    } else if (arg3 == 3) {
                        if (var16.anim == -1 && var16.multiloc == null) {
                            var19 = var16.getModel(3, arg1, var11, var12, var13, var14, -1);
                        } else {
                            var19 = new LocEntity(arg8, arg1, 3, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                        }
                        arg0.setWall(ROTATION_WALL_CORNER_TYPE[arg1], var19, true, var17, arg2, var18, arg7, (Entity) null, var15, 0, arg9);
                        if (var16.blockwalk) {
                            arg5.addWall(arg2, arg1, arg7, arg3, (byte) 1, var16.blockrange);
                        }
                    } else if (arg3 == 9) {
                        if (var16.anim == -1 && var16.multiloc == null) {
                            var19 = var16.getModel(arg3, arg1, var11, var12, var13, var14, -1);
                        } else {
                            var19 = new LocEntity(arg8, arg1, arg3, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                        }
                        arg0.add(var17, var18, var15, 1, var19, 1, arg9, 0, (byte) 110, arg2, arg7);
                        if (var16.blockwalk) {
                            arg5.addLoc(var16.blockrange, _flowObfuscator2, var16.width, var16.length, arg7, arg2, arg1);
                        }
                    } else {
                        if (var16.hillskew) {
                            if (arg1 == 1) {
                                var23 = var14;
                                var14 = var13;
                                var13 = var12;
                                var12 = var11;
                                var11 = var23;
                            } else if (arg1 == 2) {
                                var23 = var14;
                                var14 = var12;
                                var12 = var23;
                                var23 = var13;
                                var13 = var11;
                                var11 = var23;
                            } else if (arg1 == 3) {
                                var23 = var14;
                                var14 = var11;
                                var11 = var12;
                                var12 = var13;
                                var13 = var23;
                            }
                        }
                        if (arg3 == 4) {
                            if (var16.anim == -1 && var16.multiloc == null) {
                                var19 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                            } else {
                                var19 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                            }
                            arg0.setWallDecoration(var17, arg2, arg1 * 512, -460, arg9, 0, var15, var19, arg7, var18, 0, ROTATION_WALL_TYPE[arg1]);
                        } else if (arg3 == 5) {
                            var23 = 16;
                            var20 = arg0.getWallBitset(arg9, arg7, arg2);
                            if (var20 > 0) {
                                var23 = LocType.get(var20 >> 14 & 32767).wallwidth;
                            }
                            if (var16.anim == -1 && var16.multiloc == null) {
                                var25 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                            } else {
                                var25 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                            }
                            arg0.setWallDecoration(var17, arg2, arg1 * 512, -460, arg9, WALL_DECORATION_ROTATION_FORWARD_X[arg1] * var23, var15, var25, arg7, var18, WALL_DECORATION_ROTATION_FORWARD_Z[arg1] * var23, ROTATION_WALL_TYPE[arg1]);
                        } else if (arg3 == 6) {
                            if (var16.anim == -1 && var16.multiloc == null) {
                                var19 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                            } else {
                                var19 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                            }
                            arg0.setWallDecoration(var17, arg2, arg1, -460, arg9, 0, var15, var19, arg7, var18, 0, 256);
                        } else if (arg3 == 7) {
                            if (var16.anim == -1 && var16.multiloc == null) {
                                var19 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                            } else {
                                var19 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                            }
                            arg0.setWallDecoration(var17, arg2, arg1, -460, arg9, 0, var15, var19, arg7, var18, 0, 512);
                        } else if (arg3 == 8) {
                            if (var16.anim == -1 && var16.multiloc == null) {
                                var19 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                            } else {
                                var19 = new LocEntity(arg8, 0, 4, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                            }
                            arg0.setWallDecoration(var17, arg2, arg1, -460, arg9, 0, var15, var19, arg7, var18, 0, 768);
                        }
                    }
                }
            } else {
                if (var16.anim == -1 && var16.multiloc == null) {
                    var19 = var16.getModel(10, arg1, var11, var12, var13, var14, -1);
                } else {
                    var19 = new LocEntity(arg8, arg1, 10, var12, (byte) 7, var13, var11, var14, var16.anim, true);
                }
                if (var19 != null) {
                    int var22 = 0;
                    if (arg3 == 11) {
                        var22 += 256;
                    }
                    int var21;
                    if (arg1 != 1 && arg1 != 3) {
                        var20 = var16.width;
                        var21 = var16.length;
                    } else {
                        var20 = var16.length;
                        var21 = var16.width;
                    }
                    arg0.add(var17, var18, var15, var21, var19, var20, arg9, var22, (byte) 110, arg2, arg7);
                }
                if (var16.blockwalk) {
                    arg5.addLoc(var16.blockrange, _flowObfuscator2, var16.width, var16.length, arg7, arg2, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(I[BII)Z")
    public static final boolean validateLocs(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 >= 6 && arg3 <= 6) {
            boolean var4 = true;
            Packet var5 = new Packet(arg1, 891);
            int var6 = -1;
            label54: while (true) {
                int var7 = var5.gsmarts();
                if (var7 == 0) {
                    return var4;
                }
                var6 += var7;
                int var8 = 0;
                boolean var9 = false;
                while (true) {
                    int var10;
                    while (!var9) {
                        var10 = var5.gsmarts();
                        if (var10 == 0) {
                            continue label54;
                        }
                        var8 += var10 - 1;
                        int var11 = var8 & 63;
                        int var12 = var8 >> 6 & 63;
                        int var13 = var5.g1() >> 2;
                        int var14 = var12 + arg0;
                        int var15 = var11 + arg2;
                        if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                            LocType var16 = LocType.get(var6);
                            if (var13 != 22 || !lowMemory || var16.active || var16.forcedecor) {
                                var4 &= var16.validate(true);
                                var9 = true;
                            }
                        }
                    }
                    var10 = var5.gsmarts();
                    if (var10 == 0) {
                        break;
                    }
                    var5.g1();
                }
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!CRRWDRTI", name = "a", descriptor = "(I[LFTPNODIB;IILNYFUGYQS;[B)V")
    public final void readLoc(int arg0, CollisionMap[] arg1, int arg2, int arg3, World3D arg4, byte[] arg5) {
        if (arg3 >= 7 && arg3 <= 7) {
            Packet var7 = new Packet(arg5, 891);
            int var8 = -1;
            while (true) {
                int var9 = var7.gsmarts();
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.gsmarts();
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 - 1;
                    int var12 = var10 & 63;
                    int var13 = var10 >> 6 & 63;
                    int var14 = var10 >> 12;
                    int var15 = var7.g1();
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = var13 + arg0;
                    int var19 = var12 + arg2;
                    if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                        int var20 = var14;
                        if ((this.levelTileFlags[1][var18][var19] & 2) == 2) {
                            var20 = var14 - 1;
                        }
                        CollisionMap var21 = null;
                        if (var20 >= 0) {
                            var21 = arg1[var20];
                        }
                        this.addLoc(var19, arg4, var21, var16, var14, var18, var8, false, var17);
                    }
                }
            }
        }
    }
}
