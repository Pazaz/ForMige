import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NYFUGYQS")
public class World3D {

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "client!NYFUGYQS", name = "b", descriptor = "I")
    private int _flowObfuscator2;

    @OriginalMember(owner = "client!NYFUGYQS", name = "c", descriptor = "I")
    private static int _flowObfuscator3 = 360;

    @OriginalMember(owner = "client!NYFUGYQS", name = "d", descriptor = "I")
    private static int _flowObfuscator4 = 1;

    @OriginalMember(owner = "client!NYFUGYQS", name = "e", descriptor = "I")
    private static int _flowObfuscator5 = -460;

    @OriginalMember(owner = "client!NYFUGYQS", name = "f", descriptor = "Z")
    private boolean _flowObfuscator6 = true;

    @OriginalMember(owner = "client!NYFUGYQS", name = "g", descriptor = "Z")
    private boolean _flowObfuscator7 = false;

    @OriginalMember(owner = "client!NYFUGYQS", name = "h", descriptor = "Z")
    public static boolean lowMemory = true;

    @OriginalMember(owner = "client!NYFUGYQS", name = "i", descriptor = "I")
    public int maxLevel;

    @OriginalMember(owner = "client!NYFUGYQS", name = "j", descriptor = "I")
    public int maxTileX;

    @OriginalMember(owner = "client!NYFUGYQS", name = "k", descriptor = "I")
    public int maxTileZ;

    @OriginalMember(owner = "client!NYFUGYQS", name = "l", descriptor = "[[[I")
    public int[][][] levelHeightmaps;

    @OriginalMember(owner = "client!NYFUGYQS", name = "m", descriptor = "[[[LQTKGMFHL;")
    public Tile[][][] levelTiles;

    @OriginalMember(owner = "client!NYFUGYQS", name = "n", descriptor = "I")
    public int minLevel;

    @OriginalMember(owner = "client!NYFUGYQS", name = "o", descriptor = "I")
    public int temporaryLocCount;

    @OriginalMember(owner = "client!NYFUGYQS", name = "p", descriptor = "[LOPNPFUJE;")
    public Loc[] temporaryLocs = new Loc[5000];

    @OriginalMember(owner = "client!NYFUGYQS", name = "q", descriptor = "[[[I")
    public int[][][] levelTileOcclusionCycles;

    @OriginalMember(owner = "client!NYFUGYQS", name = "r", descriptor = "I")
    public static int tilesRemaining;

    @OriginalMember(owner = "client!NYFUGYQS", name = "s", descriptor = "I")
    public static int topLevel;

    @OriginalMember(owner = "client!NYFUGYQS", name = "t", descriptor = "I")
    public static int cycle;

    @OriginalMember(owner = "client!NYFUGYQS", name = "u", descriptor = "I")
    public static int minDrawTileX;

    @OriginalMember(owner = "client!NYFUGYQS", name = "v", descriptor = "I")
    public static int maxDrawTileX;

    @OriginalMember(owner = "client!NYFUGYQS", name = "w", descriptor = "I")
    public static int minDrawTileZ;

    @OriginalMember(owner = "client!NYFUGYQS", name = "x", descriptor = "I")
    public static int maxDrawTileZ;

    @OriginalMember(owner = "client!NYFUGYQS", name = "y", descriptor = "I")
    public static int eyeTileX;

    @OriginalMember(owner = "client!NYFUGYQS", name = "z", descriptor = "I")
    public static int eyeTileZ;

    @OriginalMember(owner = "client!NYFUGYQS", name = "A", descriptor = "I")
    public static int eyeX;

    @OriginalMember(owner = "client!NYFUGYQS", name = "B", descriptor = "I")
    public static int eyeY;

    @OriginalMember(owner = "client!NYFUGYQS", name = "C", descriptor = "I")
    public static int eyeZ;

    @OriginalMember(owner = "client!NYFUGYQS", name = "D", descriptor = "I")
    public static int sinEyePitch;

    @OriginalMember(owner = "client!NYFUGYQS", name = "E", descriptor = "I")
    public static int cosEyePitch;

    @OriginalMember(owner = "client!NYFUGYQS", name = "F", descriptor = "I")
    public static int sinEyeYaw;

    @OriginalMember(owner = "client!NYFUGYQS", name = "G", descriptor = "I")
    public static int cosEyeYaw;

    @OriginalMember(owner = "client!NYFUGYQS", name = "H", descriptor = "[LOPNPFUJE;")
    public static Loc[] locBuffer = new Loc[100];

    @OriginalMember(owner = "client!NYFUGYQS", name = "I", descriptor = "[I")
    public static final int[] WALL_DECORATION_INSET_X = new int[] { 53, -53, -53, 53 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "J", descriptor = "[I")
    public static final int[] WALL_DECORATION_INSET_Z = new int[] { -53, -53, 53, 53 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "K", descriptor = "[I")
    public static final int[] WALL_DECORATION_OUTSET_X = new int[] { -45, 45, 45, -45 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "L", descriptor = "[I")
    public static final int[] WALL_DECORATION_OUTSET_Z = new int[] { 45, 45, -45, -45 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "M", descriptor = "Z")
    public static boolean takingInput;

    @OriginalMember(owner = "client!NYFUGYQS", name = "N", descriptor = "I")
    public static int mouseX;

    @OriginalMember(owner = "client!NYFUGYQS", name = "O", descriptor = "I")
    public static int mouseY;

    @OriginalMember(owner = "client!NYFUGYQS", name = "P", descriptor = "I")
    public static int clickTileX = -1;

    @OriginalMember(owner = "client!NYFUGYQS", name = "Q", descriptor = "I")
    public static int clickTileZ = -1;

    @OriginalMember(owner = "client!NYFUGYQS", name = "R", descriptor = "I")
    public static int levelCount = 4;

    @OriginalMember(owner = "client!NYFUGYQS", name = "S", descriptor = "[I")
    public static int[] levelOccluderCount = new int[levelCount];

    @OriginalMember(owner = "client!NYFUGYQS", name = "T", descriptor = "[[LZARDZRHZ;")
    public static Occluder[][] levelOccluders = new Occluder[levelCount][500];

    @OriginalMember(owner = "client!NYFUGYQS", name = "U", descriptor = "I")
    public static int activeOccluderCount;

    @OriginalMember(owner = "client!NYFUGYQS", name = "V", descriptor = "[LZARDZRHZ;")
    public static Occluder[] activeOccluders = new Occluder[500];

    @OriginalMember(owner = "client!NYFUGYQS", name = "W", descriptor = "LLHGXPZPG;")
    public static LinkList drawTileQueue = new LinkList(169);

    @OriginalMember(owner = "client!NYFUGYQS", name = "X", descriptor = "[I")
    public static final int[] FRONT_WALL_TYPES = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "Y", descriptor = "[I")
    public static final int[] DIRECTION_ALLOW_WALL_CORNER_TYPE = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "Z", descriptor = "[I")
    public static final int[] BACK_WALL_TYPES = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "ab", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "bb", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "cb", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "db", descriptor = "[I")
    public static final int[] WALL_CORNER_TYPE_128_BLOCK_LOC_SPANS = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "eb", descriptor = "[I")
    public static final int[] TEXTURE_HSL = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

    @OriginalMember(owner = "client!NYFUGYQS", name = "fb", descriptor = "[I")
    public int[] mergeIndexA = new int[10000];

    @OriginalMember(owner = "client!NYFUGYQS", name = "gb", descriptor = "[I")
    public int[] mergeIndexB = new int[10000];

    @OriginalMember(owner = "client!NYFUGYQS", name = "hb", descriptor = "I")
    public int tmpMergeIndex;

    @OriginalMember(owner = "client!NYFUGYQS", name = "ib", descriptor = "[[I")
    public int[][] MINIMAP_OVERLAY_SHAPE = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!NYFUGYQS", name = "jb", descriptor = "[[I")
    public int[][] MINIMAP_OVERLAY_ROTATION = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!NYFUGYQS", name = "kb", descriptor = "[[[[Z")
    public static boolean[][][][] visibilityMatrix = new boolean[8][32][51][51];

    @OriginalMember(owner = "client!NYFUGYQS", name = "lb", descriptor = "[[Z")
    public static boolean[][] visibilityMap;

    @OriginalMember(owner = "client!NYFUGYQS", name = "mb", descriptor = "I")
    public static int viewportCenterX;

    @OriginalMember(owner = "client!NYFUGYQS", name = "nb", descriptor = "I")
    public static int viewportCenterY;

    @OriginalMember(owner = "client!NYFUGYQS", name = "ob", descriptor = "I")
    public static int viewportLeft;

    @OriginalMember(owner = "client!NYFUGYQS", name = "pb", descriptor = "I")
    public static int viewportTop;

    @OriginalMember(owner = "client!NYFUGYQS", name = "qb", descriptor = "I")
    public static int viewportRight;

    @OriginalMember(owner = "client!NYFUGYQS", name = "rb", descriptor = "I")
    public static int viewportBottom;

    @OriginalMember(owner = "client!NYFUGYQS", name = "<init>", descriptor = "(IBI[[[II)V")
    public World3D(int arg0, byte arg1, int arg2, int[][][] arg3, int arg4) {
        this.maxLevel = arg4;
        this.maxTileX = arg2;
        this.maxTileZ = arg0;
        if (arg1 != 43) {
            throw new NullPointerException();
        } else {
            this.levelTiles = new Tile[arg4][arg2][arg0];
            this.levelTileOcclusionCycles = new int[arg4][arg2 + 1][arg0 + 1];
            this.levelHeightmaps = arg3;
            this.reset(619);
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(I)V")
    public static void unload(int arg0) {
        locBuffer = null;
        while (arg0 >= 0) {
            _flowObfuscator4 = -333;
        }
        levelOccluderCount = null;
        levelOccluders = null;
        drawTileQueue = null;
        visibilityMatrix = null;
        visibilityMap = null;
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "b", descriptor = "(I)V")
    public void reset(int arg0) {
        int var3;
        int var4;
        for (int var2 = 0; var2 < this.maxLevel; var2++) {
            for (var3 = 0; var3 < this.maxTileX; var3++) {
                for (var4 = 0; var4 < this.maxTileZ; var4++) {
                    this.levelTiles[var2][var3][var4] = null;
                }
            }
        }
        int var6 = 37 / arg0;
        for (var3 = 0; var3 < levelCount; var3++) {
            for (var4 = 0; var4 < levelOccluderCount[var3]; var4++) {
                levelOccluders[var3][var4] = null;
            }
            levelOccluderCount[var3] = 0;
        }
        for (var4 = 0; var4 < this.temporaryLocCount; var4++) {
            this.temporaryLocs[var4] = null;
        }
        this.temporaryLocCount = 0;
        for (int var5 = 0; var5 < locBuffer.length; var5++) {
            locBuffer[var5] = null;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(II)V")
    public void setMinLevel(int arg0, int arg1) {
        if (arg1 == -34686) {
            this.minLevel = arg0;
            for (int var3 = 0; var3 < this.maxTileX; var3++) {
                for (int var4 = 0; var4 < this.maxTileZ; var4++) {
                    if (this.levelTiles[arg0][var3][var4] == null) {
                        this.levelTiles[arg0][var3][var4] = new Tile(arg0, var3, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(III)V")
    public void setBridge(int arg0, int arg1, int arg2) {
        Tile var4 = this.levelTiles[0][arg1][arg0];
        for (int var5 = 0; var5 < 3; var5++) {
            Tile var6 = this.levelTiles[var5][arg1][arg0] = this.levelTiles[var5 + 1][arg1][arg0];
            if (var6 != null) {
                var6.level--;
                for (int var7 = 0; var7 < var6.locCount; var7++) {
                    Loc var8 = var6.locs[var7];
                    if ((var8.bitset >> 29 & 3) == 2 && var8.minSceneTileX == arg1 && var8.minSceneTileZ == arg0) {
                        var8.level--;
                    }
                }
            }
        }
        while (arg2 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (this.levelTiles[0][arg1][arg0] == null) {
            this.levelTiles[0][arg1][arg0] = new Tile(0, arg1, arg0);
        }
        this.levelTiles[0][arg1][arg0].bridge = var4;
        this.levelTiles[3][arg1][arg0] = null;
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIIIIIII)V")
    public static void addOccluder(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        while (arg6 >= 0) {
            _flowObfuscator4 = -170;
        }
        Occluder var9 = new Occluder();
        var9.minTileX = arg1 / 128;
        var9.maxTileX = arg3 / 128;
        var9.minTileZ = arg7 / 128;
        var9.maxTileZ = arg4 / 128;
        var9.type = arg8;
        var9.minX = arg1;
        var9.maxX = arg3;
        var9.minZ = arg7;
        var9.maxZ = arg4;
        var9.minY = arg5;
        var9.maxY = arg2;
        levelOccluders[arg0][levelOccluderCount[arg0]++] = var9;
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIII)V")
    public void setDrawLevel(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.levelTiles[arg0][arg1][arg2];
        if (var5 != null) {
            this.levelTiles[arg0][arg1][arg2].drawLevel = arg3;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public void setTile(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        TileUnderlay var21;
        int var22;
        if (arg3 == 0) {
            var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (var22 = arg0; var22 >= 0; var22--) {
                if (this.levelTiles[var22][arg1][arg2] == null) {
                    this.levelTiles[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.levelTiles[arg0][arg1][arg2].underlay = var21;
        } else if (arg3 != 1) {
            TileOverlay var23 = new TileOverlay(arg2, arg14, arg13, arg8, arg5, arg16, arg4, arg10, arg18, arg12, arg9, arg7, arg6, arg3, arg17, arg15, arg11, 3, arg1, arg19);
            for (var22 = arg0; var22 >= 0; var22--) {
                if (this.levelTiles[var22][arg1][arg2] == null) {
                    this.levelTiles[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.levelTiles[arg0][arg1][arg2].overlay = var23;
        } else {
            var21 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (var22 = arg0; var22 >= 0; var22--) {
                if (this.levelTiles[var22][arg1][arg2] == null) {
                    this.levelTiles[var22][arg1][arg2] = new Tile(var22, arg1, arg2);
                }
            }
            this.levelTiles[arg0][arg1][arg2].underlay = var21;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIILXHHRODPC;BII)V")
    public void addGroundDecoration(int arg0, int arg1, int arg2, int arg3, Entity arg4, byte arg5, int arg6, int arg7) {
        if (arg4 != null) {
            GroundDecoration var9 = new GroundDecoration();
            var9.model = arg4;
            var9.x = arg7 * 128 + 64;
            var9.z = arg2 * 128 + 64;
            if (arg3 <= 0) {
                this._flowObfuscator7 = !this._flowObfuscator7;
            }
            var9.level = arg1;
            var9.bitset = arg6;
            var9.info = arg5;
            if (this.levelTiles[arg0][arg7][arg2] == null) {
                this.levelTiles[arg0][arg7][arg2] = new Tile(arg0, arg7, arg2);
            }
            this.levelTiles[arg0][arg7][arg2].groundDecoration = var9;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(BIILXHHRODPC;ILXHHRODPC;LXHHRODPC;II)V")
    public void addObjStack(byte arg0, int arg1, int arg2, Entity arg3, int arg4, Entity arg5, Entity arg6, int arg7, int arg8) {
        ObjStack var10 = new ObjStack();
        var10.topObj = arg6;
        var10.x = arg1 * 128 + 64;
        var10.z = arg8 * 128 + 64;
        if (arg0 == 7) {
            var10.level = arg4;
            var10.bitset = arg2;
            var10.bottomObj = arg3;
            var10.middleObj = arg5;
            int var11 = 0;
            Tile var12 = this.levelTiles[arg7][arg1][arg8];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.locCount; var13++) {
                    if (var12.locs[var13].model instanceof Model) {
                        int var14 = ((Model) var12.locs[var13].model).objRaise;
                        if (var14 > var11) {
                            var11 = var14;
                        }
                    }
                }
            }
            var10.offset = var11;
            if (this.levelTiles[arg7][arg1][arg8] == null) {
                this.levelTiles[arg7][arg1][arg8] = new Tile(arg7, arg1, arg8);
            }
            this.levelTiles[arg7][arg1][arg8].objStack = var10;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(ILXHHRODPC;ZIIBILXHHRODPC;III)V")
    public void setWall(int arg0, Entity arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, Entity arg7, int arg8, int arg9, int arg10) {
        if (!arg2) {
            this._flowObfuscator6 = !this._flowObfuscator6;
        }
        if (arg1 != null || arg7 != null) {
            Wall var12 = new Wall();
            var12.bitset = arg3;
            var12.info = arg5;
            var12.x = arg6 * 128 + 64;
            var12.z = arg4 * 128 + 64;
            var12.level = arg8;
            var12.modelA = arg1;
            var12.modelB = arg7;
            var12.typeA = arg0;
            var12.typeB = arg9;
            for (int var13 = arg10; var13 >= 0; var13--) {
                if (this.levelTiles[var13][arg6][arg4] == null) {
                    this.levelTiles[var13][arg6][arg4] = new Tile(var13, arg6, arg4);
                }
            }
            this.levelTiles[arg10][arg6][arg4].wall = var12;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIIIIILXHHRODPC;IBII)V")
    public void setWallDecoration(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Entity arg7, int arg8, byte arg9, int arg10, int arg11) {
        if (arg7 != null) {
            WallDecoration var13 = new WallDecoration();
            var13.bitset = arg0;
            while (arg3 >= 0) {
                this._flowObfuscator7 = !this._flowObfuscator7;
            }
            var13.info = arg9;
            var13.x = arg8 * 128 + 64 + arg5;
            var13.z = arg1 * 128 + 64 + arg10;
            var13.y = arg6;
            var13.model = arg7;
            var13.type = arg11;
            var13.angle = arg2;
            for (int var14 = arg4; var14 >= 0; var14--) {
                if (this.levelTiles[var14][arg8][arg1] == null) {
                    this.levelTiles[var14][arg8][arg1] = new Tile(var14, arg8, arg1);
                }
            }
            this.levelTiles[arg4][arg8][arg1].wallDecoration = var13;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IBIILXHHRODPC;IIIBII)Z")
    public boolean add(int arg0, byte arg1, int arg2, int arg3, Entity arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        if (arg8 != 110) {
            _flowObfuscator3 = 250;
        }
        if (arg4 == null) {
            return true;
        } else {
            int var12 = arg10 * 128 + 64 * arg5;
            int var13 = arg9 * 128 + 64 * arg3;
            return this.add(arg6, arg10, arg9, arg5, arg3, var12, var13, arg2, arg4, arg7, false, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIBIIIIILXHHRODPC;Z)Z")
    public boolean addTemporary(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, boolean arg9) {
        if (arg8 == null) {
            return true;
        } else {
            int var11 = arg7 - arg6;
            int var12 = arg5 - arg6;
            int var13 = arg7 + arg6;
            int var14 = arg5 + arg6;
            if (arg9) {
                if (arg1 > 640 && arg1 < 1408) {
                    var14 += 128;
                }
                if (arg1 > 1152 && arg1 < 1920) {
                    var13 += 128;
                }
                if (arg1 > 1664 || arg1 < 384) {
                    var12 -= 128;
                }
                if (arg1 > 128 && arg1 < 896) {
                    var11 -= 128;
                }
            }
            var11 /= 128;
            if (arg2 == 6) {
                boolean var15 = false;
                var12 /= 128;
                var13 /= 128;
                var14 /= 128;
                return this.add(arg0, var11, var12, var13 - var11 + 1, var14 - var12 + 1, arg7, arg5, arg3, arg8, arg1, true, arg4, (byte) 0);
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIILXHHRODPC;IIIIIIIIB)Z")
    public boolean addTemporary(int arg0, int arg1, int arg2, Entity arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12) {
        if (arg12 != 35) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        return arg3 == null ? true : this.add(arg1, arg8, arg11, arg9 - arg8 + 1, arg5 - arg11 + 1, arg6, arg2, arg7, arg3, arg4, true, arg10, (byte) 0);
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIIIIIILXHHRODPC;IZIB)Z")
    private boolean add(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
        for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
            for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
                if (var14 < 0 || var15 < 0 || var14 >= this.maxTileX || var15 >= this.maxTileZ) {
                    return false;
                }
                Tile var16 = this.levelTiles[arg0][var14][var15];
                if (var16 != null && var16.locCount >= 5) {
                    return false;
                }
            }
        }
        Loc var21 = new Loc();
        var21.bitset = arg11;
        var21.info = arg12;
        var21.level = arg0;
        var21.x = arg5;
        var21.z = arg6;
        var21.y = arg7;
        var21.model = arg8;
        var21.yaw = arg9;
        var21.minSceneTileX = arg1;
        var21.minSceneTileZ = arg2;
        var21.maxSceneTileX = arg1 + arg3 - 1;
        var21.maxSceneTileZ = arg2 + arg4 - 1;
        for (int var22 = arg1; var22 < arg1 + arg3; var22++) {
            for (int var17 = arg2; var17 < arg2 + arg4; var17++) {
                int var18 = 0;
                if (var22 > arg1) {
                    var18++;
                }
                if (var22 < arg1 + arg3 - 1) {
                    var18 += 4;
                }
                if (var17 > arg2) {
                    var18 += 8;
                }
                if (var17 < arg2 + arg4 - 1) {
                    var18 += 2;
                }
                for (int var19 = arg0; var19 >= 0; var19--) {
                    if (this.levelTiles[var19][var22][var17] == null) {
                        this.levelTiles[var19][var22][var17] = new Tile(var19, var22, var17);
                    }
                }
                Tile var20 = this.levelTiles[arg0][var22][var17];
                var20.locs[var20.locCount] = var21;
                var20.locSpan[var20.locCount] = var18;
                var20.locSpans |= var18;
                var20.locCount++;
            }
        }
        if (arg10) {
            this.temporaryLocs[this.temporaryLocCount++] = var21;
        }
        return true;
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(B)V")
    public void clearTemporaryLocs(byte arg0) {
        if (arg0 != 104) {
            this._flowObfuscator7 = !this._flowObfuscator7;
        }
        for (int var2 = 0; var2 < this.temporaryLocCount; var2++) {
            Loc var3 = this.temporaryLocs[var2];
            this.removeLoc(-997, var3);
            this.temporaryLocs[var2] = null;
        }
        this.temporaryLocCount = 0;
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(ILOPNPFUJE;)V")
    private void removeLoc(int arg0, Loc arg1) {
        if (arg0 < 0) {
            for (int var3 = arg1.minSceneTileX; var3 <= arg1.maxSceneTileX; var3++) {
                for (int var4 = arg1.minSceneTileZ; var4 <= arg1.maxSceneTileZ; var4++) {
                    Tile var5 = this.levelTiles[arg1.level][var3][var4];
                    if (var5 != null) {
                        int var7;
                        for (int var6 = 0; var6 < var5.locCount; var6++) {
                            if (var5.locs[var6] == arg1) {
                                var5.locCount--;
                                for (var7 = var6; var7 < var5.locCount; var7++) {
                                    var5.locs[var7] = var5.locs[var7 + 1];
                                    var5.locSpan[var7] = var5.locSpan[var7 + 1];
                                }
                                var5.locs[var5.locCount] = null;
                                break;
                            }
                        }
                        var5.locSpans = 0;
                        for (var7 = 0; var7 < var5.locCount; var7++) {
                            var5.locSpans |= var5.locSpan[var7];
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIII)V")
    public void setWallDecorationOffset(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Tile var6 = this.levelTiles[arg4][arg3][arg0];
        if (arg1 <= 0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        if (var6 != null) {
            WallDecoration var7 = var6.wallDecoration;
            if (var7 != null) {
                int var8 = arg3 * 128 + 64;
                int var9 = arg0 * 128 + 64;
                var7.x = var8 + (var7.x - var8) * arg2 / 16;
                var7.z = var9 + (var7.z - var9) * arg2 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIB)V")
    public void removeWall(int arg0, int arg1, int arg2, byte arg3) {
        Tile var5 = this.levelTiles[arg1][arg0][arg2];
        if (arg3 != -119) {
            this._flowObfuscator6 = !this._flowObfuscator6;
        }
        if (var5 != null) {
            var5.wall = null;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "b", descriptor = "(IIII)V")
    public void removeWallDecoration(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.levelTiles[arg2][arg3][arg1];
        if (var5 != null) {
            var5.wallDecoration = null;
            if (arg0 == 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "c", descriptor = "(IIII)V")
    public void removeLoc(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Tile var8 = this.levelTiles[arg0][arg2][arg3];
        if (var8 != null) {
            for (int var6 = 0; var6 < var8.locCount; var6++) {
                Loc var7 = var8.locs[var6];
                if ((var7.bitset >> 29 & 3) == 2 && var7.minSceneTileX == arg2 && var7.minSceneTileZ == arg3) {
                    this.removeLoc(-997, var7);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(BIII)V")
    public void removeGroundDecoration(byte arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.levelTiles[arg1][arg3][arg2];
        if (var5 != null) {
            var5.groundDecoration = null;
            if (arg0 == 9) {
                boolean var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "b", descriptor = "(III)V")
    public void removeObjStack(int arg0, int arg1, int arg2) {
        Tile var4 = this.levelTiles[arg0][arg1][arg2];
        if (var4 != null) {
            var4.objStack = null;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIZ)LFEHPTPDG;")
    public Wall getWall(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            _flowObfuscator5 = -195;
        }
        Tile var5 = this.levelTiles[arg0][arg1][arg2];
        return var5 == null ? null : var5.wall;
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "d", descriptor = "(IIII)LOFQAEXFV;")
    public WallDecoration getWallDecoration(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        } else {
            Tile var5 = this.levelTiles[arg3][arg0][arg2];
            return var5 == null ? null : var5.wallDecoration;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIBI)LOPNPFUJE;")
    public Loc getLoc(int arg0, int arg1, byte arg2, int arg3) {
        Tile var5 = this.levelTiles[arg3][arg0][arg1];
        if (var5 == null) {
            return null;
        } else {
            for (int var6 = 0; var6 < var5.locCount; var6++) {
                Loc var7 = var5.locs[var6];
                if ((var7.bitset >> 29 & 3) == 2 && var7.minSceneTileX == arg0 && var7.minSceneTileZ == arg1) {
                    return var7;
                }
            }
            if (arg2 == 4) {
                boolean var8 = false;
            } else {
                _flowObfuscator4 = -376;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "e", descriptor = "(IIII)LZIKPHIFI;")
    public GroundDecoration getGroundDecoration(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.levelTiles[arg2][arg1][arg0];
        if (arg3 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var5 != null && var5.groundDecoration != null ? var5.groundDecoration : null;
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "c", descriptor = "(III)I")
    public int getWallBitset(int arg0, int arg1, int arg2) {
        Tile var4 = this.levelTiles[arg0][arg1][arg2];
        return var4 != null && var4.wall != null ? var4.wall.bitset : 0;
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "f", descriptor = "(IIII)I")
    public int getWallDecorationBitset(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.levelTiles[arg0][arg1][arg3];
        if (arg2 != 0) {
            return this._flowObfuscator2;
        } else {
            return var5 != null && var5.wallDecoration != null ? var5.wallDecoration.bitset : 0;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "d", descriptor = "(III)I")
    public int getLocBitset(int arg0, int arg1, int arg2) {
        Tile var4 = this.levelTiles[arg0][arg1][arg2];
        if (var4 == null) {
            return 0;
        } else {
            for (int var5 = 0; var5 < var4.locCount; var5++) {
                Loc var6 = var4.locs[var5];
                if ((var6.bitset >> 29 & 3) == 2 && var6.minSceneTileX == arg1 && var6.minSceneTileZ == arg2) {
                    return var6.bitset;
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "e", descriptor = "(III)I")
    public int getGroundDecorationBitset(int arg0, int arg1, int arg2) {
        Tile var4 = this.levelTiles[arg0][arg1][arg2];
        return var4 != null && var4.groundDecoration != null ? var4.groundDecoration.bitset : 0;
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "g", descriptor = "(IIII)I")
    public int getInfo(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.levelTiles[arg0][arg1][arg2];
        if (var5 == null) {
            return -1;
        } else if (var5.wall != null && var5.wall.bitset == arg3) {
            return var5.wall.info & 255;
        } else if (var5.wallDecoration != null && var5.wallDecoration.bitset == arg3) {
            return var5.wallDecoration.info & 255;
        } else if (var5.groundDecoration != null && var5.groundDecoration.bitset == arg3) {
            return var5.groundDecoration.info & 255;
        } else {
            for (int var6 = 0; var6 < var5.locCount; var6++) {
                if (var5.locs[var6].bitset == arg3) {
                    return var5.locs[var6].info & 255;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IBIIII)V")
    public void buildModels(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (int) Math.sqrt((double) (arg3 * arg3 + arg0 * arg0 + arg5 * arg5));
        int var8 = arg4 * var7 >> 8;
        if (arg1 != 3) {
            this._flowObfuscator6 = !this._flowObfuscator6;
        }
        for (int var9 = 0; var9 < this.maxLevel; var9++) {
            for (int var10 = 0; var10 < this.maxTileX; var10++) {
                for (int var11 = 0; var11 < this.maxTileZ; var11++) {
                    Tile var12 = this.levelTiles[var9][var10][var11];
                    if (var12 != null) {
                        Wall var13 = var12.wall;
                        if (var13 != null && var13.modelA != null && var13.modelA.vertexNormal != null) {
                            this.mergeLocNormals(var9, 1, 1, var10, (byte) 115, var11, (Model) var13.modelA);
                            if (var13.modelB != null && var13.modelB.vertexNormal != null) {
                                this.mergeLocNormals(var9, 1, 1, var10, (byte) 115, var11, (Model) var13.modelB);
                                this.mergeNormals((Model) var13.modelA, (Model) var13.modelB, 0, 0, 0, false);
                                ((Model) var13.modelB).applyLighting(arg2, var8, arg3, arg0, arg5);
                            }
                            ((Model) var13.modelA).applyLighting(arg2, var8, arg3, arg0, arg5);
                        }
                        for (int var14 = 0; var14 < var12.locCount; var14++) {
                            Loc var15 = var12.locs[var14];
                            if (var15 != null && var15.model != null && var15.model.vertexNormal != null) {
                                this.mergeLocNormals(var9, var15.maxSceneTileX - var15.minSceneTileX + 1, var15.maxSceneTileZ - var15.minSceneTileZ + 1, var10, (byte) 115, var11, (Model) var15.model);
                                ((Model) var15.model).applyLighting(arg2, var8, arg3, arg0, arg5);
                            }
                        }
                        GroundDecoration var16 = var12.groundDecoration;
                        if (var16 != null && var16.model.vertexNormal != null) {
                            this.mergeGroundDecorationNormals(var10, var9, (Model) var16.model, (byte) 37, var11);
                            ((Model) var16.model).applyLighting(arg2, var8, arg3, arg0, arg5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IILZKARKDQW;BI)V")
    private void mergeGroundDecorationNormals(int arg0, int arg1, Model arg2, byte arg3, int arg4) {
        if (arg3 != 37) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        Tile var7;
        if (arg0 < this.maxTileX) {
            var7 = this.levelTiles[arg1][arg0 + 1][arg4];
            if (var7 != null && var7.groundDecoration != null && var7.groundDecoration.model.vertexNormal != null) {
                this.mergeNormals(arg2, (Model) var7.groundDecoration.model, 128, 0, 0, true);
            }
        }
        if (arg4 < this.maxTileX) {
            var7 = this.levelTiles[arg1][arg0][arg4 + 1];
            if (var7 != null && var7.groundDecoration != null && var7.groundDecoration.model.vertexNormal != null) {
                this.mergeNormals(arg2, (Model) var7.groundDecoration.model, 0, 0, 128, true);
            }
        }
        if (arg0 < this.maxTileX && arg4 < this.maxTileZ) {
            var7 = this.levelTiles[arg1][arg0 + 1][arg4 + 1];
            if (var7 != null && var7.groundDecoration != null && var7.groundDecoration.model.vertexNormal != null) {
                this.mergeNormals(arg2, (Model) var7.groundDecoration.model, 128, 0, 128, true);
            }
        }
        if (arg0 < this.maxTileX && arg4 > 0) {
            var7 = this.levelTiles[arg1][arg0 + 1][arg4 - 1];
            if (var7 != null && var7.groundDecoration != null && var7.groundDecoration.model.vertexNormal != null) {
                this.mergeNormals(arg2, (Model) var7.groundDecoration.model, 128, 0, -128, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIIBILZKARKDQW;)V")
    private void mergeLocNormals(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, Model arg6) {
        boolean var8 = true;
        if (arg4 != 115) {
            _flowObfuscator3 = 350;
        }
        int var9 = arg3;
        int var10 = arg3 + arg1;
        int var11 = arg5 - 1;
        int var12 = arg5 + arg2;
        for (int var13 = arg0; var13 <= arg0 + 1; var13++) {
            if (var13 != this.maxLevel) {
                for (int var14 = var9; var14 <= var10; var14++) {
                    if (var14 >= 0 && var14 < this.maxTileX) {
                        for (int var15 = var11; var15 <= var12; var15++) {
                            if (var15 >= 0 && var15 < this.maxTileZ && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg5 && var14 != arg3)) {
                                Tile var16 = this.levelTiles[var13][var14][var15];
                                if (var16 != null) {
                                    int var17 = (this.levelHeightmaps[var13][var14][var15] + this.levelHeightmaps[var13][var14 + 1][var15] + this.levelHeightmaps[var13][var14][var15 + 1] + this.levelHeightmaps[var13][var14 + 1][var15 + 1]) / 4 - (this.levelHeightmaps[arg0][arg3][arg5] + this.levelHeightmaps[arg0][arg3 + 1][arg5] + this.levelHeightmaps[arg0][arg3][arg5 + 1] + this.levelHeightmaps[arg0][arg3 + 1][arg5 + 1]) / 4;
                                    Wall var18 = var16.wall;
                                    if (var18 != null && var18.modelA != null && var18.modelA.vertexNormal != null) {
                                        this.mergeNormals(arg6, (Model) var18.modelA, (var14 - arg3) * 128 + (1 - arg1) * 64, var17, (var15 - arg5) * 128 + (1 - arg2) * 64, var8);
                                    }
                                    if (var18 != null && var18.modelB != null && var18.modelB.vertexNormal != null) {
                                        this.mergeNormals(arg6, (Model) var18.modelB, (var14 - arg3) * 128 + (1 - arg1) * 64, var17, (var15 - arg5) * 128 + (1 - arg2) * 64, var8);
                                    }
                                    for (int var19 = 0; var19 < var16.locCount; var19++) {
                                        Loc var20 = var16.locs[var19];
                                        if (var20 != null && var20.model != null && var20.model.vertexNormal != null) {
                                            int var21 = var20.maxSceneTileX - var20.minSceneTileX + 1;
                                            int var22 = var20.maxSceneTileZ - var20.minSceneTileZ + 1;
                                            this.mergeNormals(arg6, (Model) var20.model, (var20.minSceneTileX - arg3) * 128 + (var21 - arg1) * 64, var17, (var20.minSceneTileZ - arg5) * 128 + (var22 - arg2) * 64, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var9--;
                var8 = false;
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(LZKARKDQW;LZKARKDQW;IIIZ)V")
    private void mergeNormals(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.tmpMergeIndex++;
        int var7 = 0;
        int[] var8 = arg1.vertexX;
        int var9 = arg1.vertexCount;
        for (int var10 = 0; var10 < arg0.vertexCount; var10++) {
            VertexNormal var11 = arg0.vertexNormal[var10];
            VertexNormal var12 = arg0.vertexNormalOriginal[var10];
            if (var12.w != 0) {
                int var13 = arg0.vertexY[var10] - arg3;
                if (var13 <= arg1.maxY) {
                    int var14 = arg0.vertexX[var10] - arg2;
                    if (var14 >= arg1.minX && var14 <= arg1.maxX) {
                        int var15 = arg0.vertexZ[var10] - arg4;
                        if (var15 >= arg1.minZ && var15 <= arg1.maxZ) {
                            for (int var16 = 0; var16 < var9; var16++) {
                                VertexNormal var17 = arg1.vertexNormal[var16];
                                VertexNormal var18 = arg1.vertexNormalOriginal[var16];
                                if (var14 == var8[var16] && var15 == arg1.vertexZ[var16] && var13 == arg1.vertexY[var16] && var18.w != 0) {
                                    var11.x += var18.x;
                                    var11.y += var18.y;
                                    var11.z += var18.z;
                                    var11.w += var18.w;
                                    var17.x += var12.x;
                                    var17.y += var12.y;
                                    var17.z += var12.z;
                                    var17.w += var12.w;
                                    var7++;
                                    this.mergeIndexA[var10] = this.tmpMergeIndex;
                                    this.mergeIndexB[var16] = this.tmpMergeIndex;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 >= 3 && arg5) {
            for (int var19 = 0; var19 < arg0.faceCount; var19++) {
                if (this.mergeIndexA[arg0.faceVertexA[var19]] == this.tmpMergeIndex && this.mergeIndexA[arg0.faceVertexB[var19]] == this.tmpMergeIndex && this.mergeIndexA[arg0.faceVertexC[var19]] == this.tmpMergeIndex) {
                    arg0.faceInfo[var19] = -1;
                }
            }
            for (int var20 = 0; var20 < arg1.faceCount; var20++) {
                if (this.mergeIndexB[arg1.faceVertexA[var20]] == this.tmpMergeIndex && this.mergeIndexB[arg1.faceVertexB[var20]] == this.tmpMergeIndex && this.mergeIndexB[arg1.faceVertexC[var20]] == this.tmpMergeIndex) {
                    arg1.faceInfo[var20] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "([IIIIII)V")
    public void drawMinimapTile(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Tile var7 = this.levelTiles[arg3][arg4][arg5];
        if (var7 != null) {
            TileUnderlay var8 = var7.underlay;
            int var10;
            if (var8 == null) {
                TileOverlay var18 = var7.overlay;
                if (var18 != null) {
                    var10 = var18.shape;
                    int var11 = var18.rotation;
                    int var12 = var18.backgroundRgb;
                    int var13 = var18.foregroundRgb;
                    int[] var14 = this.MINIMAP_OVERLAY_SHAPE[var10];
                    int[] var15 = this.MINIMAP_OVERLAY_ROTATION[var11];
                    int var16 = 0;
                    int var17;
                    if (var12 != 0) {
                        for (var17 = 0; var17 < 4; var17++) {
                            arg0[arg1] = var14[var15[var16++]] == 0 ? var12 : var13;
                            arg0[arg1 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                            arg0[arg1 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                            arg0[arg1 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                            arg1 += arg2;
                        }
                    } else {
                        for (var17 = 0; var17 < 4; var17++) {
                            if (var14[var15[var16++]] != 0) {
                                arg0[arg1] = var13;
                            }
                            if (var14[var15[var16++]] != 0) {
                                arg0[arg1 + 1] = var13;
                            }
                            if (var14[var15[var16++]] != 0) {
                                arg0[arg1 + 2] = var13;
                            }
                            if (var14[var15[var16++]] != 0) {
                                arg0[arg1 + 3] = var13;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var9 = var8.rgb;
                if (var9 != 0) {
                    for (var10 = 0; var10 < 4; var10++) {
                        arg0[arg1] = var9;
                        arg0[arg1 + 1] = var9;
                        arg0[arg1 + 2] = var9;
                        arg0[arg1 + 3] = var9;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIII[IZ)V")
    public static void init(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        viewportLeft = 0;
        viewportTop = 0;
        viewportRight = arg2;
        viewportBottom = arg3;
        viewportCenterX = arg2 / 2;
        viewportCenterY = arg3 / 2;
        boolean[][][][] var6 = new boolean[9][32][53][53];
        if (arg5) {
            _flowObfuscator5 = 168;
        }
        int var8;
        int var9;
        int var10;
        int var11;
        int var13;
        int var14;
        for (int var7 = 128; var7 <= 384; var7 += 32) {
            for (var8 = 0; var8 < 2048; var8 += 64) {
                sinEyePitch = Model.sin[var7];
                cosEyePitch = Model.cos[var7];
                sinEyeYaw = Model.sin[var8];
                cosEyeYaw = Model.cos[var8];
                var9 = (var7 - 128) / 32;
                var10 = var8 / 64;
                for (var11 = -26; var11 <= 26; var11++) {
                    for (int var12 = -26; var12 <= 26; var12++) {
                        var13 = var11 * 128;
                        var14 = var12 * 128;
                        boolean var15 = false;
                        for (int var16 = -arg0; var16 <= arg1; var16 += 128) {
                            if (testPoint((byte) 9, arg4[var9] + var16, var14, var13)) {
                                var15 = true;
                                break;
                            }
                        }
                        var6[var9][var10][var11 + 25 + 1][var12 + 25 + 1] = var15;
                    }
                }
            }
        }
        for (var8 = 0; var8 < 8; var8++) {
            for (var9 = 0; var9 < 32; var9++) {
                for (var10 = -25; var10 < 25; var10++) {
                    for (var11 = -25; var11 < 25; var11++) {
                        boolean var17 = false;
                        label82: for (var13 = -1; var13 <= 1; var13++) {
                            for (var14 = -1; var14 <= 1; var14++) {
                                if (var6[var8][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var17 = true;
                                    break label82;
                                }
                                if (var6[var8][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var17 = true;
                                    break label82;
                                }
                                if (var6[var8 + 1][var9][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var17 = true;
                                    break label82;
                                }
                                if (var6[var8 + 1][(var9 + 1) % 31][var10 + var13 + 25 + 1][var11 + var14 + 25 + 1]) {
                                    var17 = true;
                                    break label82;
                                }
                            }
                        }
                        visibilityMatrix[var8][var9][var10 + 25][var11 + 25] = var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "b", descriptor = "(BIII)Z")
    public static boolean testPoint(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 * sinEyeYaw + arg3 * cosEyeYaw >> 16;
        int var5 = arg2 * cosEyeYaw - arg3 * sinEyeYaw >> 16;
        if (arg0 != 9) {
            _flowObfuscator3 = -346;
        }
        int var6 = arg1 * sinEyePitch + var5 * cosEyePitch >> 16;
        int var7 = arg1 * cosEyePitch - var5 * sinEyePitch >> 16;
        if (var6 >= 50 && var6 <= 3500) {
            int var8 = viewportCenterX + (var4 << 9) / var6;
            int var9 = viewportCenterY + (var7 << 9) / var6;
            return var8 >= viewportLeft && var8 <= viewportRight && var9 >= viewportTop && var9 <= viewportBottom;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(ZII)V")
    public void click(boolean arg0, int arg1, int arg2) {
        takingInput = true;
        mouseX = arg2;
        mouseY = arg1;
        clickTileX = -1;
        clickTileZ = -1;
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIIIIZ)V")
    public void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= this.maxTileX * 128) {
            arg0 = this.maxTileX * 128 - 1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        } else if (arg1 >= this.maxTileZ * 128) {
            arg1 = this.maxTileZ * 128 - 1;
        }
        cycle++;
        sinEyePitch = Model.sin[arg5];
        cosEyePitch = Model.cos[arg5];
        if (!arg6) {
            sinEyeYaw = Model.sin[arg2];
            cosEyeYaw = Model.cos[arg2];
            visibilityMap = visibilityMatrix[(arg5 - 128) / 32][arg2 / 64];
            eyeX = arg0;
            eyeY = arg3;
            eyeZ = arg1;
            eyeTileX = arg0 / 128;
            eyeTileZ = arg1 / 128;
            topLevel = arg4;
            minDrawTileX = eyeTileX - 25;
            if (minDrawTileX < 0) {
                minDrawTileX = 0;
            }
            minDrawTileZ = eyeTileZ - 25;
            if (minDrawTileZ < 0) {
                minDrawTileZ = 0;
            }
            maxDrawTileX = eyeTileX + 25;
            if (maxDrawTileX > this.maxTileX) {
                maxDrawTileX = this.maxTileX;
            }
            maxDrawTileZ = eyeTileZ + 25;
            if (maxDrawTileZ > this.maxTileZ) {
                maxDrawTileZ = this.maxTileZ;
            }
            this.updateActiveOccluders(0);
            tilesRemaining = 0;
            int var10;
            int var11;
            for (int var8 = this.minLevel; var8 < this.maxLevel; var8++) {
                Tile[][] var9 = this.levelTiles[var8];
                for (var10 = minDrawTileX; var10 < maxDrawTileX; var10++) {
                    for (var11 = minDrawTileZ; var11 < maxDrawTileZ; var11++) {
                        Tile var12 = var9[var10][var11];
                        if (var12 != null) {
                            if (var12.drawLevel <= arg4 && (visibilityMap[var10 - eyeTileX + 25][var11 - eyeTileZ + 25] || this.levelHeightmaps[var8][var10][var11] - arg3 >= 2000)) {
                                var12.visible = true;
                                var12.update = true;
                                if (var12.locCount > 0) {
                                    var12.containsLocs = true;
                                } else {
                                    var12.containsLocs = false;
                                }
                                tilesRemaining++;
                            } else {
                                var12.visible = false;
                                var12.update = false;
                                var12.checkLocSpans = 0;
                            }
                        }
                    }
                }
            }
            int var13;
            int var14;
            int var15;
            int var16;
            int var22;
            for (int var19 = this.minLevel; var19 < this.maxLevel; var19++) {
                Tile[][] var20 = this.levelTiles[var19];
                for (var11 = -25; var11 <= 0; var11++) {
                    var22 = eyeTileX + var11;
                    var13 = eyeTileX - var11;
                    if (var22 >= minDrawTileX || var13 < maxDrawTileX) {
                        for (var14 = -25; var14 <= 0; var14++) {
                            var15 = eyeTileZ + var14;
                            var16 = eyeTileZ - var14;
                            Tile var17;
                            if (var22 >= minDrawTileX) {
                                if (var15 >= minDrawTileZ) {
                                    var17 = var20[var22][var15];
                                    if (var17 != null && var17.visible) {
                                        this.drawTile(var17, true);
                                    }
                                }
                                if (var16 < maxDrawTileZ) {
                                    var17 = var20[var22][var16];
                                    if (var17 != null && var17.visible) {
                                        this.drawTile(var17, true);
                                    }
                                }
                            }
                            if (var13 < maxDrawTileX) {
                                if (var15 >= minDrawTileZ) {
                                    var17 = var20[var13][var15];
                                    if (var17 != null && var17.visible) {
                                        this.drawTile(var17, true);
                                    }
                                }
                                if (var16 < maxDrawTileZ) {
                                    var17 = var20[var13][var16];
                                    if (var17 != null && var17.visible) {
                                        this.drawTile(var17, true);
                                    }
                                }
                            }
                            if (tilesRemaining == 0) {
                                takingInput = false;
                                return;
                            }
                        }
                    }
                }
            }
            for (var10 = this.minLevel; var10 < this.maxLevel; var10++) {
                Tile[][] var21 = this.levelTiles[var10];
                for (var22 = -25; var22 <= 0; var22++) {
                    var13 = eyeTileX + var22;
                    var14 = eyeTileX - var22;
                    if (var13 >= minDrawTileX || var14 < maxDrawTileX) {
                        for (var15 = -25; var15 <= 0; var15++) {
                            var16 = eyeTileZ + var15;
                            int var23 = eyeTileZ - var15;
                            Tile var18;
                            if (var13 >= minDrawTileX) {
                                if (var16 >= minDrawTileZ) {
                                    var18 = var21[var13][var16];
                                    if (var18 != null && var18.visible) {
                                        this.drawTile(var18, false);
                                    }
                                }
                                if (var23 < maxDrawTileZ) {
                                    var18 = var21[var13][var23];
                                    if (var18 != null && var18.visible) {
                                        this.drawTile(var18, false);
                                    }
                                }
                            }
                            if (var14 < maxDrawTileX) {
                                if (var16 >= minDrawTileZ) {
                                    var18 = var21[var14][var16];
                                    if (var18 != null && var18.visible) {
                                        this.drawTile(var18, false);
                                    }
                                }
                                if (var23 < maxDrawTileZ) {
                                    var18 = var21[var14][var23];
                                    if (var18 != null && var18.visible) {
                                        this.drawTile(var18, false);
                                    }
                                }
                            }
                            if (tilesRemaining == 0) {
                                takingInput = false;
                                return;
                            }
                        }
                    }
                }
            }
            takingInput = false;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(LQTKGMFHL;Z)V")
    public void drawTile(Tile arg0, boolean arg1) {
        drawTileQueue.addTail(arg0);
        while (true) {
            Tile var3;
            int var4;
            int var5;
            int var6;
            int var7;
            Tile[][] var8;
            Tile var9;
            int var11;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            Wall var26;
            int var27;
            int var29;
            do {
                do {
                    do {
                        do {
                            do {
                                do {
                                    while (true) {
                                        Loc var12;
                                        int var19;
                                        int var23;
                                        boolean var24;
                                        Tile var35;
                                        while (true) {
                                            do {
                                                var3 = (Tile) drawTileQueue.removeHead();
                                                if (var3 == null) {
                                                    return;
                                                }
                                            } while (!var3.update);
                                            var4 = var3.x;
                                            var5 = var3.z;
                                            var6 = var3.level;
                                            var7 = var3.occludeLevel;
                                            var8 = this.levelTiles[var6];
                                            if (!var3.visible) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var6 > 0) {
                                                    var9 = this.levelTiles[var6 - 1][var4][var5];
                                                    if (var9 != null && var9.update) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= eyeTileX && var4 > minDrawTileX) {
                                                    var9 = var8[var4 - 1][var5];
                                                    if (var9 != null && var9.update && (var9.visible || (var3.locSpans & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= eyeTileX && var4 < maxDrawTileX - 1) {
                                                    var9 = var8[var4 + 1][var5];
                                                    if (var9 != null && var9.update && (var9.visible || (var3.locSpans & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 <= eyeTileZ && var5 > minDrawTileZ) {
                                                    var9 = var8[var4][var5 - 1];
                                                    if (var9 != null && var9.update && (var9.visible || (var3.locSpans & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var5 >= eyeTileZ && var5 < maxDrawTileZ - 1) {
                                                    var9 = var8[var4][var5 + 1];
                                                    if (var9 != null && var9.update && (var9.visible || (var3.locSpans & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var3.visible = false;
                                            if (var3.bridge != null) {
                                                var9 = var3.bridge;
                                                if (var9.underlay != null) {
                                                    if (!this.tileVisible(0, var4, var5)) {
                                                        this.drawTileUnderlay(var9.underlay, 0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var4, var5);
                                                    }
                                                } else if (var9.overlay != null && !this.tileVisible(0, var4, var5)) {
                                                    this.drawTileOverlay(var4, (byte) 99, sinEyePitch, sinEyeYaw, var9.overlay, cosEyePitch, var5, cosEyeYaw);
                                                }
                                                Wall var10 = var9.wall;
                                                if (var10 != null) {
                                                    var10.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var10.x - eyeX, var10.level - eyeY, var10.z - eyeZ, var10.bitset);
                                                }
                                                for (var11 = 0; var11 < var9.locCount; var11++) {
                                                    var12 = var9.locs[var11];
                                                    if (var12 != null) {
                                                        var12.model.draw(var12.yaw, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var12.x - eyeX, var12.y - eyeY, var12.z - eyeZ, var12.bitset);
                                                    }
                                                }
                                            }
                                            var24 = false;
                                            if (var3.underlay != null) {
                                                if (!this.tileVisible(var7, var4, var5)) {
                                                    var24 = true;
                                                    this.drawTileUnderlay(var3.underlay, var7, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var4, var5);
                                                }
                                            } else if (var3.overlay != null && !this.tileVisible(var7, var4, var5)) {
                                                var24 = true;
                                                this.drawTileOverlay(var4, (byte) 99, sinEyePitch, sinEyeYaw, var3.overlay, cosEyePitch, var5, cosEyeYaw);
                                            }
                                            var23 = 0;
                                            var11 = 0;
                                            Wall var25 = var3.wall;
                                            WallDecoration var13 = var3.wallDecoration;
                                            if (var25 != null || var13 != null) {
                                                if (eyeTileX == var4) {
                                                    var23++;
                                                } else if (eyeTileX < var4) {
                                                    var23 += 2;
                                                }
                                                if (eyeTileZ == var5) {
                                                    var23 += 3;
                                                } else if (eyeTileZ > var5) {
                                                    var23 += 6;
                                                }
                                                var11 = FRONT_WALL_TYPES[var23];
                                                var3.backWallTypes = BACK_WALL_TYPES[var23];
                                            }
                                            if (var25 != null) {
                                                if ((var25.typeA & DIRECTION_ALLOW_WALL_CORNER_TYPE[var23]) != 0) {
                                                    if (var25.typeA == 16) {
                                                        var3.checkLocSpans = 3;
                                                        var3.blockLocSpans = WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS[var23];
                                                        var3.inverseBlockLocSpans = 3 - var3.blockLocSpans;
                                                    } else if (var25.typeA == 32) {
                                                        var3.checkLocSpans = 6;
                                                        var3.blockLocSpans = WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS[var23];
                                                        var3.inverseBlockLocSpans = 6 - var3.blockLocSpans;
                                                    } else if (var25.typeA == 64) {
                                                        var3.checkLocSpans = 12;
                                                        var3.blockLocSpans = WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS[var23];
                                                        var3.inverseBlockLocSpans = 12 - var3.blockLocSpans;
                                                    } else {
                                                        var3.checkLocSpans = 9;
                                                        var3.blockLocSpans = WALL_CORNER_TYPE_128_BLOCK_LOC_SPANS[var23];
                                                        var3.inverseBlockLocSpans = 9 - var3.blockLocSpans;
                                                    }
                                                } else {
                                                    var3.checkLocSpans = 0;
                                                }
                                                if ((var25.typeA & var11) != 0 && !this.wallVisible(var7, var4, var5, var25.typeA)) {
                                                    var25.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var25.x - eyeX, var25.level - eyeY, var25.z - eyeZ, var25.bitset);
                                                }
                                                if ((var25.typeB & var11) != 0 && !this.wallVisible(var7, var4, var5, var25.typeB)) {
                                                    var25.modelB.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var25.x - eyeX, var25.level - eyeY, var25.z - eyeZ, var25.bitset);
                                                }
                                            }
                                            if (var13 != null && !this.visible(var7, var4, var5, var13.model.minY)) {
                                                if ((var13.type & var11) != 0) {
                                                    var13.model.draw(var13.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var13.x - eyeX, var13.y - eyeY, var13.z - eyeZ, var13.bitset);
                                                } else if ((var13.type & 768) != 0) {
                                                    var14 = var13.x - eyeX;
                                                    var15 = var13.y - eyeY;
                                                    var16 = var13.z - eyeZ;
                                                    var17 = var13.angle;
                                                    if (var17 != 1 && var17 != 2) {
                                                        var18 = var14;
                                                    } else {
                                                        var18 = -var14;
                                                    }
                                                    if (var17 != 2 && var17 != 3) {
                                                        var19 = var16;
                                                    } else {
                                                        var19 = -var16;
                                                    }
                                                    int var20;
                                                    int var21;
                                                    if ((var13.type & 256) != 0 && var19 < var18) {
                                                        var20 = var14 + WALL_DECORATION_INSET_X[var17];
                                                        var21 = var16 + WALL_DECORATION_INSET_Z[var17];
                                                        var13.model.draw(var17 * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var20, var15, var21, var13.bitset);
                                                    }
                                                    if ((var13.type & 512) != 0 && var19 > var18) {
                                                        var20 = var14 + WALL_DECORATION_OUTSET_X[var17];
                                                        var21 = var16 + WALL_DECORATION_OUTSET_Z[var17];
                                                        var13.model.draw(var17 * 512 + 1280 & 2047, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var20, var15, var21, var13.bitset);
                                                    }
                                                }
                                            }
                                            if (var24) {
                                                GroundDecoration var30 = var3.groundDecoration;
                                                if (var30 != null) {
                                                    var30.model.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var30.x - eyeX, var30.level - eyeY, var30.z - eyeZ, var30.bitset);
                                                }
                                                ObjStack var34 = var3.objStack;
                                                if (var34 != null && var34.offset == 0) {
                                                    if (var34.bottomObj != null) {
                                                        var34.bottomObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.level - eyeY, var34.z - eyeZ, var34.bitset);
                                                    }
                                                    if (var34.middleObj != null) {
                                                        var34.middleObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.level - eyeY, var34.z - eyeZ, var34.bitset);
                                                    }
                                                    if (var34.topObj != null) {
                                                        var34.topObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var34.x - eyeX, var34.level - eyeY, var34.z - eyeZ, var34.bitset);
                                                    }
                                                }
                                            }
                                            var14 = var3.locSpans;
                                            if (var14 != 0) {
                                                if (var4 < eyeTileX && (var14 & 4) != 0) {
                                                    var35 = var8[var4 + 1][var5];
                                                    if (var35 != null && var35.update) {
                                                        drawTileQueue.addTail(var35);
                                                    }
                                                }
                                                if (var5 < eyeTileZ && (var14 & 2) != 0) {
                                                    var35 = var8[var4][var5 + 1];
                                                    if (var35 != null && var35.update) {
                                                        drawTileQueue.addTail(var35);
                                                    }
                                                }
                                                if (var4 > eyeTileX && (var14 & 1) != 0) {
                                                    var35 = var8[var4 - 1][var5];
                                                    if (var35 != null && var35.update) {
                                                        drawTileQueue.addTail(var35);
                                                    }
                                                }
                                                if (var5 > eyeTileZ && (var14 & 8) != 0) {
                                                    var35 = var8[var4][var5 - 1];
                                                    if (var35 != null && var35.update) {
                                                        drawTileQueue.addTail(var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var3.checkLocSpans != 0) {
                                            var24 = true;
                                            for (var23 = 0; var23 < var3.locCount; var23++) {
                                                if (var3.locs[var23].cycle != cycle && (var3.locSpan[var23] & var3.checkLocSpans) == var3.blockLocSpans) {
                                                    var24 = false;
                                                    break;
                                                }
                                            }
                                            if (var24) {
                                                var26 = var3.wall;
                                                if (!this.wallVisible(var7, var4, var5, var26.typeA)) {
                                                    var26.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var26.x - eyeX, var26.level - eyeY, var26.z - eyeZ, var26.bitset);
                                                }
                                                var3.checkLocSpans = 0;
                                            }
                                        }
                                        if (!var3.containsLocs) {
                                            break;
                                        }
                                        try {
                                            int var28 = var3.locCount;
                                            var3.containsLocs = false;
                                            var23 = 0;
                                            label559: for (var11 = 0; var11 < var28; var11++) {
                                                var12 = var3.locs[var11];
                                                if (var12.cycle != cycle) {
                                                    for (var29 = var12.minSceneTileX; var29 <= var12.maxSceneTileX; var29++) {
                                                        for (var14 = var12.minSceneTileZ; var14 <= var12.maxSceneTileZ; var14++) {
                                                            var35 = var8[var29][var14];
                                                            if (var35.visible) {
                                                                var3.containsLocs = true;
                                                                continue label559;
                                                            }
                                                            if (var35.checkLocSpans != 0) {
                                                                var16 = 0;
                                                                if (var29 > var12.minSceneTileX) {
                                                                    var16++;
                                                                }
                                                                if (var29 < var12.maxSceneTileX) {
                                                                    var16 += 4;
                                                                }
                                                                if (var14 > var12.minSceneTileZ) {
                                                                    var16 += 8;
                                                                }
                                                                if (var14 < var12.maxSceneTileZ) {
                                                                    var16 += 2;
                                                                }
                                                                if ((var16 & var35.checkLocSpans) == var3.inverseBlockLocSpans) {
                                                                    var3.containsLocs = true;
                                                                    continue label559;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    locBuffer[var23++] = var12;
                                                    var14 = eyeTileX - var12.minSceneTileX;
                                                    var15 = var12.maxSceneTileX - eyeTileX;
                                                    if (var15 > var14) {
                                                        var14 = var15;
                                                    }
                                                    var16 = eyeTileZ - var12.minSceneTileZ;
                                                    var17 = var12.maxSceneTileZ - eyeTileZ;
                                                    if (var17 > var16) {
                                                        var12.distance = var14 + var17;
                                                    } else {
                                                        var12.distance = var14 + var16;
                                                    }
                                                }
                                            }
                                            while (var23 > 0) {
                                                var27 = -50;
                                                var29 = -1;
                                                Loc var36;
                                                for (var14 = 0; var14 < var23; var14++) {
                                                    var36 = locBuffer[var14];
                                                    if (var36.cycle != cycle) {
                                                        if (var36.distance > var27) {
                                                            var27 = var36.distance;
                                                            var29 = var14;
                                                        } else if (var36.distance == var27) {
                                                            var16 = var36.x - eyeX;
                                                            var17 = var36.z - eyeZ;
                                                            var18 = locBuffer[var29].x - eyeX;
                                                            var19 = locBuffer[var29].z - eyeZ;
                                                            if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
                                                                var29 = var14;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var29 == -1) {
                                                    break;
                                                }
                                                var36 = locBuffer[var29];
                                                var36.cycle = cycle;
                                                if (!this.locVisible(var7, var36.minSceneTileX, var36.maxSceneTileX, var36.minSceneTileZ, var36.maxSceneTileZ, var36.model.minY)) {
                                                    var36.model.draw(var36.yaw, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var36.x - eyeX, var36.y - eyeY, var36.z - eyeZ, var36.bitset);
                                                }
                                                for (var16 = var36.minSceneTileX; var16 <= var36.maxSceneTileX; var16++) {
                                                    for (var17 = var36.minSceneTileZ; var17 <= var36.maxSceneTileZ; var17++) {
                                                        Tile var37 = var8[var16][var17];
                                                        if (var37.checkLocSpans != 0) {
                                                            drawTileQueue.addTail(var37);
                                                        } else if ((var16 != var4 || var17 != var5) && var37.update) {
                                                            drawTileQueue.addTail(var37);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var3.containsLocs) {
                                                break;
                                            }
                                        } catch (Exception var22) {
                                            var3.containsLocs = false;
                                            break;
                                        }
                                    }
                                } while (!var3.update);
                            } while (var3.checkLocSpans != 0);
                            if (var4 > eyeTileX || var4 <= minDrawTileX) {
                                break;
                            }
                            var9 = var8[var4 - 1][var5];
                        } while (var9 != null && var9.update);
                        if (var4 < eyeTileX || var4 >= maxDrawTileX - 1) {
                            break;
                        }
                        var9 = var8[var4 + 1][var5];
                    } while (var9 != null && var9.update);
                    if (var5 > eyeTileZ || var5 <= minDrawTileZ) {
                        break;
                    }
                    var9 = var8[var4][var5 - 1];
                } while (var9 != null && var9.update);
                if (var5 < eyeTileZ || var5 >= maxDrawTileZ - 1) {
                    break;
                }
                var9 = var8[var4][var5 + 1];
            } while (var9 != null && var9.update);
            var3.update = false;
            tilesRemaining--;
            ObjStack var32 = var3.objStack;
            if (var32 != null && var32.offset != 0) {
                if (var32.bottomObj != null) {
                    var32.bottomObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var32.x - eyeX, var32.level - eyeY - var32.offset, var32.z - eyeZ, var32.bitset);
                }
                if (var32.middleObj != null) {
                    var32.middleObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var32.x - eyeX, var32.level - eyeY - var32.offset, var32.z - eyeZ, var32.bitset);
                }
                if (var32.topObj != null) {
                    var32.topObj.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var32.x - eyeX, var32.level - eyeY - var32.offset, var32.z - eyeZ, var32.bitset);
                }
            }
            if (var3.backWallTypes != 0) {
                WallDecoration var31 = var3.wallDecoration;
                if (var31 != null && !this.visible(var7, var4, var5, var31.model.minY)) {
                    if ((var31.type & var3.backWallTypes) != 0) {
                        var31.model.draw(var31.angle, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var31.x - eyeX, var31.y - eyeY, var31.z - eyeZ, var31.bitset);
                    } else if ((var31.type & 768) != 0) {
                        var11 = var31.x - eyeX;
                        var27 = var31.y - eyeY;
                        var29 = var31.z - eyeZ;
                        var14 = var31.angle;
                        if (var14 != 1 && var14 != 2) {
                            var15 = var11;
                        } else {
                            var15 = -var11;
                        }
                        if (var14 != 2 && var14 != 3) {
                            var16 = var29;
                        } else {
                            var16 = -var29;
                        }
                        if ((var31.type & 256) != 0 && var16 >= var15) {
                            var17 = var11 + WALL_DECORATION_INSET_X[var14];
                            var18 = var29 + WALL_DECORATION_INSET_Z[var14];
                            var31.model.draw(var14 * 512 + 256, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var17, var27, var18, var31.bitset);
                        }
                        if ((var31.type & 512) != 0 && var16 <= var15) {
                            var17 = var11 + WALL_DECORATION_OUTSET_X[var14];
                            var18 = var29 + WALL_DECORATION_OUTSET_Z[var14];
                            var31.model.draw(var14 * 512 + 1280 & 2047, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var17, var27, var18, var31.bitset);
                        }
                    }
                }
                var26 = var3.wall;
                if (var26 != null) {
                    if ((var26.typeB & var3.backWallTypes) != 0 && !this.wallVisible(var7, var4, var5, var26.typeB)) {
                        var26.modelB.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var26.x - eyeX, var26.level - eyeY, var26.z - eyeZ, var26.bitset);
                    }
                    if ((var26.typeA & var3.backWallTypes) != 0 && !this.wallVisible(var7, var4, var5, var26.typeA)) {
                        var26.modelA.draw(0, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, var26.x - eyeX, var26.level - eyeY, var26.z - eyeZ, var26.bitset);
                    }
                }
            }
            Tile var33;
            if (var6 < this.maxLevel - 1) {
                var33 = this.levelTiles[var6 + 1][var4][var5];
                if (var33 != null && var33.update) {
                    drawTileQueue.addTail(var33);
                }
            }
            if (var4 < eyeTileX) {
                var33 = var8[var4 + 1][var5];
                if (var33 != null && var33.update) {
                    drawTileQueue.addTail(var33);
                }
            }
            if (var5 < eyeTileZ) {
                var33 = var8[var4][var5 + 1];
                if (var33 != null && var33.update) {
                    drawTileQueue.addTail(var33);
                }
            }
            if (var4 > eyeTileX) {
                var33 = var8[var4 - 1][var5];
                if (var33 != null && var33.update) {
                    drawTileQueue.addTail(var33);
                }
            }
            if (var5 > eyeTileZ) {
                var33 = var8[var4][var5 - 1];
                if (var33 != null && var33.update) {
                    drawTileQueue.addTail(var33);
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(LXPBACSMK;IIIIIII)V")
    public void drawTileUnderlay(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9;
        int var10 = var9 = (arg6 << 7) - eyeX;
        int var11;
        int var12 = var11 = (arg7 << 7) - eyeZ;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = this.levelHeightmaps[arg1][arg6][arg7] - eyeY;
        int var18 = this.levelHeightmaps[arg1][arg6 + 1][arg7] - eyeY;
        int var19 = this.levelHeightmaps[arg1][arg6 + 1][arg7 + 1] - eyeY;
        int var20 = this.levelHeightmaps[arg1][arg6][arg7 + 1] - eyeY;
        int var21 = var12 * arg4 + var10 * arg5 >> 16;
        int var35 = var12 * arg5 - var10 * arg4 >> 16;
        int var32 = var21;
        int var41 = var17 * arg3 - var35 * arg2 >> 16;
        int var36 = var17 * arg2 + var35 * arg3 >> 16;
        int var40 = var41;
        if (var36 >= 50) {
            var21 = var11 * arg4 + var14 * arg5 >> 16;
            int var33 = var11 * arg5 - var14 * arg4 >> 16;
            var14 = var21;
            var21 = var18 * arg3 - var33 * arg2 >> 16;
            int var34 = var18 * arg2 + var33 * arg3 >> 16;
            var18 = var21;
            if (var34 >= 50) {
                var21 = var16 * arg4 + var13 * arg5 >> 16;
                var16 = var16 * arg5 - var13 * arg4 >> 16;
                int var37 = var21;
                var21 = var19 * arg3 - var16 * arg2 >> 16;
                var16 = var19 * arg2 + var16 * arg3 >> 16;
                var19 = var21;
                if (var16 >= 50) {
                    var21 = var15 * arg4 + var9 * arg5 >> 16;
                    int var38 = var15 * arg5 - var9 * arg4 >> 16;
                    int var31 = var21;
                    var21 = var20 * arg3 - var38 * arg2 >> 16;
                    int var39 = var20 * arg2 + var38 * arg3 >> 16;
                    if (var39 >= 50) {
                        int var22 = Draw3D.centerX + (var32 << 9) / var36;
                        int var23 = Draw3D.centerY + (var40 << 9) / var36;
                        int var24 = Draw3D.centerX + (var14 << 9) / var34;
                        int var25 = Draw3D.centerY + (var18 << 9) / var34;
                        int var26 = Draw3D.centerX + (var37 << 9) / var16;
                        int var27 = Draw3D.centerY + (var19 << 9) / var16;
                        int var28 = Draw3D.centerX + (var31 << 9) / var39;
                        int var29 = Draw3D.centerY + (var21 << 9) / var39;
                        Draw3D.alpha = 0;
                        int var30;
                        if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                            Draw3D.clipX = false;
                            if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Draw2D.boundX || var28 > Draw2D.boundX || var24 > Draw2D.boundX) {
                                Draw3D.clipX = true;
                            }
                            if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var27, var29, var25, var26, var28, var24)) {
                                clickTileX = arg6;
                                clickTileZ = arg7;
                            }
                            if (arg0.textureId == -1) {
                                if (arg0.northeastColor != 12345678) {
                                    Draw3D.fillGouraudTriangle(var27, var29, var25, var26, var28, var24, arg0.northeastColor, arg0.northwestColor, arg0.southeastColor);
                                }
                            } else if (!lowMemory) {
                                if (arg0.flat) {
                                    Draw3D.fillTexturedTriangle(var27, var29, var25, var26, var28, var24, arg0.northeastColor, arg0.northwestColor, arg0.southeastColor, var32, var14, var31, var40, var18, var21, var36, var34, var39, arg0.textureId);
                                } else {
                                    Draw3D.fillTexturedTriangle(var27, var29, var25, var26, var28, var24, arg0.northeastColor, arg0.northwestColor, arg0.southeastColor, var37, var31, var14, var19, var21, var18, var16, var39, var34, arg0.textureId);
                                }
                            } else {
                                var30 = TEXTURE_HSL[arg0.textureId];
                                Draw3D.fillGouraudTriangle(var27, var29, var25, var26, var28, var24, this.mulLightness(-361, var30, arg0.northeastColor), this.mulLightness(-361, var30, arg0.northwestColor), this.mulLightness(-361, var30, arg0.southeastColor));
                            }
                        }
                        if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                            Draw3D.clipX = false;
                            if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Draw2D.boundX || var24 > Draw2D.boundX || var28 > Draw2D.boundX) {
                                Draw3D.clipX = true;
                            }
                            if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var23, var25, var29, var22, var24, var28)) {
                                clickTileX = arg6;
                                clickTileZ = arg7;
                            }
                            if (arg0.textureId == -1) {
                                if (arg0.southwestColor != 12345678) {
                                    Draw3D.fillGouraudTriangle(var23, var25, var29, var22, var24, var28, arg0.southwestColor, arg0.southeastColor, arg0.northwestColor);
                                    return;
                                }
                            } else {
                                if (!lowMemory) {
                                    Draw3D.fillTexturedTriangle(var23, var25, var29, var22, var24, var28, arg0.southwestColor, arg0.southeastColor, arg0.northwestColor, var32, var14, var31, var40, var18, var21, var36, var34, var39, arg0.textureId);
                                    return;
                                }
                                var30 = TEXTURE_HSL[arg0.textureId];
                                Draw3D.fillGouraudTriangle(var23, var25, var29, var22, var24, var28, this.mulLightness(-361, var30, arg0.southwestColor), this.mulLightness(-361, var30, arg0.southeastColor), this.mulLightness(-361, var30, arg0.northwestColor));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IBIILVBAXKVMG;III)V")
    public void drawTileOverlay(int arg0, byte arg1, int arg2, int arg3, TileOverlay arg4, int arg5, int arg6, int arg7) {
        int var9 = arg4.vertexX.length;
        if (arg1 == 99) {
            int var11;
            int var12;
            int var13;
            int var14;
            for (int var10 = 0; var10 < var9; var10++) {
                var11 = arg4.vertexX[var10] - eyeX;
                var12 = arg4.vertexY[var10] - eyeY;
                var13 = arg4.vertexZ[var10] - eyeZ;
                var14 = var13 * arg3 + var11 * arg7 >> 16;
                int var23 = var13 * arg7 - var11 * arg3 >> 16;
                int var25 = var12 * arg5 - var23 * arg2 >> 16;
                int var24 = var12 * arg2 + var23 * arg5 >> 16;
                if (var24 < 50) {
                    return;
                }
                if (arg4.triangleTextureIds != null) {
                    TileOverlay.tmpViewspaceX[var10] = var14;
                    TileOverlay.tmpViewspaceY[var10] = var25;
                    TileOverlay.tmpViewspaceZ[var10] = var24;
                }
                TileOverlay.tmpScreenX[var10] = Draw3D.centerX + (var14 << 9) / var24;
                TileOverlay.tmpScreenY[var10] = Draw3D.centerY + (var25 << 9) / var24;
            }
            Draw3D.alpha = 0;
            var9 = arg4.triangleVertexA.length;
            for (var11 = 0; var11 < var9; var11++) {
                var12 = arg4.triangleVertexA[var11];
                var13 = arg4.triangleVertexB[var11];
                var14 = arg4.triangleVertexC[var11];
                int var15 = TileOverlay.tmpScreenX[var12];
                int var16 = TileOverlay.tmpScreenX[var13];
                int var17 = TileOverlay.tmpScreenX[var14];
                int var18 = TileOverlay.tmpScreenY[var12];
                int var19 = TileOverlay.tmpScreenY[var13];
                int var20 = TileOverlay.tmpScreenY[var14];
                if ((var15 - var16) * (var20 - var19) - (var18 - var19) * (var17 - var16) > 0) {
                    Draw3D.clipX = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > Draw2D.boundX || var16 > Draw2D.boundX || var17 > Draw2D.boundX) {
                        Draw3D.clipX = true;
                    }
                    if (takingInput && this.pointInsideTriangle(mouseX, mouseY, var18, var19, var20, var15, var16, var17)) {
                        clickTileX = arg0;
                        clickTileZ = arg6;
                    }
                    if (arg4.triangleTextureIds != null && arg4.triangleTextureIds[var11] != -1) {
                        if (!lowMemory) {
                            if (arg4.flat) {
                                Draw3D.fillTexturedTriangle(var18, var19, var20, var15, var16, var17, arg4.triangleColorA[var11], arg4.triangleColorB[var11], arg4.triangleColorC[var11], TileOverlay.tmpViewspaceX[0], TileOverlay.tmpViewspaceX[1], TileOverlay.tmpViewspaceX[3], TileOverlay.tmpViewspaceY[0], TileOverlay.tmpViewspaceY[1], TileOverlay.tmpViewspaceY[3], TileOverlay.tmpViewspaceZ[0], TileOverlay.tmpViewspaceZ[1], TileOverlay.tmpViewspaceZ[3], arg4.triangleTextureIds[var11]);
                            } else {
                                Draw3D.fillTexturedTriangle(var18, var19, var20, var15, var16, var17, arg4.triangleColorA[var11], arg4.triangleColorB[var11], arg4.triangleColorC[var11], TileOverlay.tmpViewspaceX[var12], TileOverlay.tmpViewspaceX[var13], TileOverlay.tmpViewspaceX[var14], TileOverlay.tmpViewspaceY[var12], TileOverlay.tmpViewspaceY[var13], TileOverlay.tmpViewspaceY[var14], TileOverlay.tmpViewspaceZ[var12], TileOverlay.tmpViewspaceZ[var13], TileOverlay.tmpViewspaceZ[var14], arg4.triangleTextureIds[var11]);
                            }
                        } else {
                            int var21 = TEXTURE_HSL[arg4.triangleTextureIds[var11]];
                            Draw3D.fillGouraudTriangle(var18, var19, var20, var15, var16, var17, this.mulLightness(-361, var21, arg4.triangleColorA[var11]), this.mulLightness(-361, var21, arg4.triangleColorB[var11]), this.mulLightness(-361, var21, arg4.triangleColorC[var11]));
                        }
                    } else if (arg4.triangleColorA[var11] != 12345678) {
                        Draw3D.fillGouraudTriangle(var18, var19, var20, var15, var16, var17, arg4.triangleColorA[var11], arg4.triangleColorB[var11], arg4.triangleColorC[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "f", descriptor = "(III)I")
    public int mulLightness(int arg0, int arg1, int arg2) {
        int var4 = 127 - arg2;
        arg2 = var4 * (arg1 & 127) / 160;
        if (arg0 >= 0) {
            return this._flowObfuscator2;
        } else {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return (arg1 & 65408) + arg2;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIIIIII)Z")
    public boolean pointInsideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var9 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var10 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var11 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var9 * var11 > 0 && var11 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "c", descriptor = "(I)V")
    private void updateActiveOccluders(int arg0) {
        if (arg0 == 0) {
            int var2 = levelOccluderCount[topLevel];
            Occluder[] var3 = levelOccluders[topLevel];
            activeOccluderCount = 0;
            for (int var4 = 0; var4 < var2; var4++) {
                Occluder var5 = var3[var4];
                int var6;
                int var7;
                int var8;
                int var10;
                boolean var14;
                if (var5.type == 1) {
                    var6 = var5.minTileX - eyeTileX + 25;
                    if (var6 >= 0 && var6 <= 50) {
                        var7 = var5.minTileZ - eyeTileZ + 25;
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        var8 = var5.maxTileZ - eyeTileZ + 25;
                        if (var8 > 50) {
                            var8 = 50;
                        }
                        var14 = false;
                        while (var7 <= var8) {
                            if (visibilityMap[var6][var7++]) {
                                var14 = true;
                                break;
                            }
                        }
                        if (var14) {
                            var10 = eyeX - var5.minX;
                            if (var10 > 32) {
                                var5.mode = 1;
                            } else {
                                if (var10 >= -32) {
                                    continue;
                                }
                                var5.mode = 2;
                                var10 = -var10;
                            }
                            var5.minDeltaZ = (var5.minZ - eyeZ << 8) / var10;
                            var5.maxDeltaZ = (var5.maxZ - eyeZ << 8) / var10;
                            var5.minDeltaY = (var5.minY - eyeY << 8) / var10;
                            var5.maxDeltaY = (var5.maxY - eyeY << 8) / var10;
                            activeOccluders[activeOccluderCount++] = var5;
                        }
                    }
                } else if (var5.type == 2) {
                    var6 = var5.minTileZ - eyeTileZ + 25;
                    if (var6 >= 0 && var6 <= 50) {
                        var7 = var5.minTileX - eyeTileX + 25;
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        var8 = var5.maxTileX - eyeTileX + 25;
                        if (var8 > 50) {
                            var8 = 50;
                        }
                        var14 = false;
                        while (var7 <= var8) {
                            if (visibilityMap[var7++][var6]) {
                                var14 = true;
                                break;
                            }
                        }
                        if (var14) {
                            var10 = eyeZ - var5.minZ;
                            if (var10 > 32) {
                                var5.mode = 3;
                            } else {
                                if (var10 >= -32) {
                                    continue;
                                }
                                var5.mode = 4;
                                var10 = -var10;
                            }
                            var5.minDeltaX = (var5.minX - eyeX << 8) / var10;
                            var5.maxDeltaX = (var5.maxX - eyeX << 8) / var10;
                            var5.minDeltaY = (var5.minY - eyeY << 8) / var10;
                            var5.maxDeltaY = (var5.maxY - eyeY << 8) / var10;
                            activeOccluders[activeOccluderCount++] = var5;
                        }
                    }
                } else if (var5.type == 4) {
                    var6 = var5.minY - eyeY;
                    if (var6 > 128) {
                        var7 = var5.minTileZ - eyeTileZ + 25;
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        var8 = var5.maxTileZ - eyeTileZ + 25;
                        if (var8 > 50) {
                            var8 = 50;
                        }
                        if (var7 <= var8) {
                            int var9 = var5.minTileX - eyeTileX + 25;
                            if (var9 < 0) {
                                var9 = 0;
                            }
                            var10 = var5.maxTileX - eyeTileX + 25;
                            if (var10 > 50) {
                                var10 = 50;
                            }
                            boolean var11 = false;
                            label149: for (int var12 = var9; var12 <= var10; var12++) {
                                for (int var13 = var7; var13 <= var8; var13++) {
                                    if (visibilityMap[var12][var13]) {
                                        var11 = true;
                                        break label149;
                                    }
                                }
                            }
                            if (var11) {
                                var5.mode = 5;
                                var5.minDeltaX = (var5.minX - eyeX << 8) / var6;
                                var5.maxDeltaX = (var5.maxX - eyeX << 8) / var6;
                                var5.minDeltaZ = (var5.minZ - eyeZ << 8) / var6;
                                var5.maxDeltaZ = (var5.maxZ - eyeZ << 8) / var6;
                                activeOccluders[activeOccluderCount++] = var5;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "g", descriptor = "(III)Z")
    private boolean tileVisible(int arg0, int arg1, int arg2) {
        int var4 = this.levelTileOcclusionCycles[arg0][arg1][arg2];
        if (var4 == -cycle) {
            return false;
        } else if (var4 == cycle) {
            return true;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            if (this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2], var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
                this.levelTileOcclusionCycles[arg0][arg1][arg2] = cycle;
                return true;
            } else {
                this.levelTileOcclusionCycles[arg0][arg1][arg2] = -cycle;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "h", descriptor = "(IIII)Z")
    private boolean wallVisible(int arg0, int arg1, int arg2, int arg3) {
        if (!this.tileVisible(arg0, arg1, arg2)) {
            return false;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            int var7 = this.levelHeightmaps[arg0][arg1][arg2] - 1;
            int var8 = var7 - 120;
            int var9 = var7 - 230;
            int var10 = var7 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var5 > eyeX) {
                        if (!this.occluded(var5, var7, var6)) {
                            return false;
                        }
                        if (!this.occluded(var5, var7, var6 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!this.occluded(var5, var8, var6)) {
                            return false;
                        }
                        if (!this.occluded(var5, var8, var6 + 128)) {
                            return false;
                        }
                    }
                    if (!this.occluded(var5, var9, var6)) {
                        return false;
                    }
                    if (!this.occluded(var5, var9, var6 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var6 < eyeZ) {
                        if (!this.occluded(var5, var7, var6 + 128)) {
                            return false;
                        }
                        if (!this.occluded(var5 + 128, var7, var6 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!this.occluded(var5, var8, var6 + 128)) {
                            return false;
                        }
                        if (!this.occluded(var5 + 128, var8, var6 + 128)) {
                            return false;
                        }
                    }
                    if (!this.occluded(var5, var9, var6 + 128)) {
                        return false;
                    }
                    if (!this.occluded(var5 + 128, var9, var6 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var5 < eyeX) {
                        if (!this.occluded(var5 + 128, var7, var6)) {
                            return false;
                        }
                        if (!this.occluded(var5 + 128, var7, var6 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!this.occluded(var5 + 128, var8, var6)) {
                            return false;
                        }
                        if (!this.occluded(var5 + 128, var8, var6 + 128)) {
                            return false;
                        }
                    }
                    if (!this.occluded(var5 + 128, var9, var6)) {
                        return false;
                    }
                    if (!this.occluded(var5 + 128, var9, var6 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var6 > eyeZ) {
                        if (!this.occluded(var5, var7, var6)) {
                            return false;
                        }
                        if (!this.occluded(var5 + 128, var7, var6)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!this.occluded(var5, var8, var6)) {
                            return false;
                        }
                        if (!this.occluded(var5 + 128, var8, var6)) {
                            return false;
                        }
                    }
                    if (!this.occluded(var5, var9, var6)) {
                        return false;
                    }
                    if (!this.occluded(var5 + 128, var9, var6)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!this.occluded(var5 + 64, var10, var6 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return this.occluded(var5, var9, var6 + 128);
            } else if (arg3 == 32) {
                return this.occluded(var5 + 128, var9, var6 + 128);
            } else if (arg3 == 64) {
                return this.occluded(var5 + 128, var9, var6);
            } else if (arg3 == 128) {
                return this.occluded(var5, var9, var6);
            } else {
                System.out.println("Warning unsupported wall type");
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "i", descriptor = "(IIII)Z")
    private boolean visible(int arg0, int arg1, int arg2, int arg3) {
        if (!this.tileVisible(arg0, arg1, arg2)) {
            return false;
        } else {
            int var5 = arg1 << 7;
            int var6 = arg2 << 7;
            return this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.occluded(var5 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.occluded(var5 + 1, this.levelHeightmaps[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "a", descriptor = "(IIIIII)Z")
    private boolean locVisible(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7;
        int var8;
        if (arg1 == arg2 && arg3 == arg4) {
            if (!this.tileVisible(arg0, arg1, arg3)) {
                return false;
            } else {
                var7 = arg1 << 7;
                var8 = arg3 << 7;
                return this.occluded(var7 + 1, this.levelHeightmaps[arg0][arg1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.occluded(var7 + 128 - 1, this.levelHeightmaps[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.occluded(var7 + 1, this.levelHeightmaps[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
            }
        } else {
            for (var7 = arg1; var7 <= arg2; var7++) {
                for (var8 = arg3; var8 <= arg4; var8++) {
                    if (this.levelTileOcclusionCycles[arg0][var7][var8] == -cycle) {
                        return false;
                    }
                }
            }
            var8 = (arg1 << 7) + 1;
            int var9 = (arg3 << 7) + 2;
            int var10 = this.levelHeightmaps[arg0][arg1][arg3] - arg5;
            if (!this.occluded(var8, var10, var9)) {
                return false;
            } else {
                int var11 = (arg2 << 7) - 1;
                if (!this.occluded(var11, var10, var9)) {
                    return false;
                } else {
                    int var12 = (arg4 << 7) - 1;
                    if (!this.occluded(var8, var10, var12)) {
                        return false;
                    } else if (!this.occluded(var11, var10, var12)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!NYFUGYQS", name = "h", descriptor = "(III)Z")
    private boolean occluded(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < activeOccluderCount; var4++) {
            Occluder var5 = activeOccluders[var4];
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            if (var5.mode == 1) {
                var6 = var5.minX - arg0;
                if (var6 > 0) {
                    var7 = var5.minZ + (var5.minDeltaZ * var6 >> 8);
                    var8 = var5.maxZ + (var5.maxDeltaZ * var6 >> 8);
                    var9 = var5.minY + (var5.minDeltaY * var6 >> 8);
                    var10 = var5.maxY + (var5.maxDeltaY * var6 >> 8);
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.mode == 2) {
                var6 = arg0 - var5.minX;
                if (var6 > 0) {
                    var7 = var5.minZ + (var5.minDeltaZ * var6 >> 8);
                    var8 = var5.maxZ + (var5.maxDeltaZ * var6 >> 8);
                    var9 = var5.minY + (var5.minDeltaY * var6 >> 8);
                    var10 = var5.maxY + (var5.maxDeltaY * var6 >> 8);
                    if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.mode == 3) {
                var6 = var5.minZ - arg2;
                if (var6 > 0) {
                    var7 = var5.minX + (var5.minDeltaX * var6 >> 8);
                    var8 = var5.maxX + (var5.maxDeltaX * var6 >> 8);
                    var9 = var5.minY + (var5.minDeltaY * var6 >> 8);
                    var10 = var5.maxY + (var5.maxDeltaY * var6 >> 8);
                    if (arg0 >= var7 && arg0 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.mode == 4) {
                var6 = arg2 - var5.minZ;
                if (var6 > 0) {
                    var7 = var5.minX + (var5.minDeltaX * var6 >> 8);
                    var8 = var5.maxX + (var5.maxDeltaX * var6 >> 8);
                    var9 = var5.minY + (var5.minDeltaY * var6 >> 8);
                    var10 = var5.maxY + (var5.maxDeltaY * var6 >> 8);
                    if (arg0 >= var7 && arg0 <= var8 && arg1 >= var9 && arg1 <= var10) {
                        return true;
                    }
                }
            } else if (var5.mode == 5) {
                var6 = arg1 - var5.minY;
                if (var6 > 0) {
                    var7 = var5.minX + (var5.minDeltaX * var6 >> 8);
                    var8 = var5.maxX + (var5.maxDeltaX * var6 >> 8);
                    var9 = var5.minZ + (var5.minDeltaZ * var6 >> 8);
                    var10 = var5.maxZ + (var5.maxDeltaZ * var6 >> 8);
                    if (arg0 >= var7 && arg0 <= var8 && arg2 >= var9 && arg2 <= var10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
