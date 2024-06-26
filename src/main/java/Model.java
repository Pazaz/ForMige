import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZKARKDQW")
public class Model extends Entity {

    @OriginalMember(owner = "client!ZKARKDQW", name = "m", descriptor = "I")
    private int _flowObfuscator6 = 9;

    @OriginalMember(owner = "client!ZKARKDQW", name = "n", descriptor = "Z")
    private boolean _flowObfuscator7 = false;

    @OriginalMember(owner = "client!ZKARKDQW", name = "o", descriptor = "I")
    private int _flowObfuscator8 = 360;

    @OriginalMember(owner = "client!ZKARKDQW", name = "p", descriptor = "I")
    private int _flowObfuscator9 = 1;

    @OriginalMember(owner = "client!ZKARKDQW", name = "q", descriptor = "Z")
    private boolean _flowObfuscator10 = true;

    @OriginalMember(owner = "client!ZKARKDQW", name = "r", descriptor = "I")
    private static int _flowObfuscator11 = -192;

    @OriginalMember(owner = "client!ZKARKDQW", name = "s", descriptor = "I")
    public static int loaded;

    @OriginalMember(owner = "client!ZKARKDQW", name = "t", descriptor = "LZKARKDQW;")
    public static Model empty = new Model(true);

    @OriginalMember(owner = "client!ZKARKDQW", name = "u", descriptor = "[I")
    private static int[] tmpVertexX = new int[2000];

    @OriginalMember(owner = "client!ZKARKDQW", name = "v", descriptor = "[I")
    private static int[] tmpVertexY = new int[2000];

    @OriginalMember(owner = "client!ZKARKDQW", name = "w", descriptor = "[I")
    private static int[] tmpVertexZ = new int[2000];

    @OriginalMember(owner = "client!ZKARKDQW", name = "x", descriptor = "[I")
    private static int[] tmpFaceAlpha = new int[2000];

    @OriginalMember(owner = "client!ZKARKDQW", name = "y", descriptor = "I")
    public int vertexCount;

    @OriginalMember(owner = "client!ZKARKDQW", name = "z", descriptor = "[I")
    public int[] vertexX;

    @OriginalMember(owner = "client!ZKARKDQW", name = "A", descriptor = "[I")
    public int[] vertexY;

    @OriginalMember(owner = "client!ZKARKDQW", name = "B", descriptor = "[I")
    public int[] vertexZ;

    @OriginalMember(owner = "client!ZKARKDQW", name = "C", descriptor = "I")
    public int faceCount;

    @OriginalMember(owner = "client!ZKARKDQW", name = "D", descriptor = "[I")
    public int[] faceVertexA;

    @OriginalMember(owner = "client!ZKARKDQW", name = "E", descriptor = "[I")
    public int[] faceVertexB;

    @OriginalMember(owner = "client!ZKARKDQW", name = "F", descriptor = "[I")
    public int[] faceVertexC;

    @OriginalMember(owner = "client!ZKARKDQW", name = "G", descriptor = "[I")
    public int[] faceColourA;

    @OriginalMember(owner = "client!ZKARKDQW", name = "H", descriptor = "[I")
    public int[] faceColourB;

    @OriginalMember(owner = "client!ZKARKDQW", name = "I", descriptor = "[I")
    public int[] faceColourC;

    @OriginalMember(owner = "client!ZKARKDQW", name = "J", descriptor = "[I")
    public int[] faceInfo;

    @OriginalMember(owner = "client!ZKARKDQW", name = "K", descriptor = "[I")
    public int[] facePriority;

    @OriginalMember(owner = "client!ZKARKDQW", name = "L", descriptor = "[I")
    public int[] faceAlpha;

    @OriginalMember(owner = "client!ZKARKDQW", name = "M", descriptor = "[I")
    public int[] faceColour;

    @OriginalMember(owner = "client!ZKARKDQW", name = "N", descriptor = "I")
    public int priority;

    @OriginalMember(owner = "client!ZKARKDQW", name = "O", descriptor = "I")
    public int texturedFaceCount;

    @OriginalMember(owner = "client!ZKARKDQW", name = "P", descriptor = "[I")
    public int[] texturedVertexA;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Q", descriptor = "[I")
    public int[] texturedVertexB;

    @OriginalMember(owner = "client!ZKARKDQW", name = "R", descriptor = "[I")
    public int[] texturedVertexC;

    @OriginalMember(owner = "client!ZKARKDQW", name = "S", descriptor = "I")
    public int minX;

    @OriginalMember(owner = "client!ZKARKDQW", name = "T", descriptor = "I")
    public int maxX;

    @OriginalMember(owner = "client!ZKARKDQW", name = "U", descriptor = "I")
    public int maxZ;

    @OriginalMember(owner = "client!ZKARKDQW", name = "V", descriptor = "I")
    public int minZ;

    // from 377:
    @OriginalMember(owner = "client!LZYQDKJV", name = "S", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!LZYQDKJV", name = "T", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!LZYQDKJV", name = "U", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!ZKARKDQW", name = "W", descriptor = "I")
    public int radius;

    @OriginalMember(owner = "client!ZKARKDQW", name = "X", descriptor = "I")
    public int maxY;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Y", descriptor = "I")
    public int maxDepth;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Z", descriptor = "I")
    public int minDepth;

    @OriginalMember(owner = "client!ZKARKDQW", name = "ab", descriptor = "I")
    public int objRaise;

    @OriginalMember(owner = "client!ZKARKDQW", name = "bb", descriptor = "[I")
    public int[] vertexLabel;

    @OriginalMember(owner = "client!ZKARKDQW", name = "cb", descriptor = "[I")
    public int[] faceLabel;

    @OriginalMember(owner = "client!ZKARKDQW", name = "db", descriptor = "[[I")
    public int[][] labelVertices;

    @OriginalMember(owner = "client!ZKARKDQW", name = "eb", descriptor = "[[I")
    public int[][] labelFaces;

    @OriginalMember(owner = "client!ZKARKDQW", name = "fb", descriptor = "Z")
    public boolean picking = false;

    @OriginalMember(owner = "client!ZKARKDQW", name = "gb", descriptor = "[LRJXWGZGD;")
    public VertexNormal[] vertexNormalOriginal;

    @OriginalMember(owner = "client!ZKARKDQW", name = "hb", descriptor = "[LLLORVYLP;")
    public static Metadata[] meta;

    @OriginalMember(owner = "client!ZKARKDQW", name = "ib", descriptor = "LVJKFYAWG;")
    public static OnDemandProvider ondemand;

    @OriginalMember(owner = "client!ZKARKDQW", name = "jb", descriptor = "[Z")
    public static boolean[] faceClippedX = new boolean[4096];

    @OriginalMember(owner = "client!ZKARKDQW", name = "kb", descriptor = "[Z")
    public static boolean[] faceNearClipped = new boolean[4096];

    @OriginalMember(owner = "client!ZKARKDQW", name = "lb", descriptor = "[I")
    public static int[] vertexScreenX = new int[4096];

    @OriginalMember(owner = "client!ZKARKDQW", name = "mb", descriptor = "[I")
    public static int[] vertexScreenY = new int[4096];

    @OriginalMember(owner = "client!ZKARKDQW", name = "nb", descriptor = "[I")
    public static int[] vertexScreenZ = new int[4096];

    @OriginalMember(owner = "client!ZKARKDQW", name = "ob", descriptor = "[I")
    public static int[] vertexViewSpaceX = new int[4096];

    @OriginalMember(owner = "client!ZKARKDQW", name = "pb", descriptor = "[I")
    public static int[] vertexViewSpaceY = new int[4096];

    @OriginalMember(owner = "client!ZKARKDQW", name = "qb", descriptor = "[I")
    public static int[] vertexViewSpaceZ = new int[4096];

    @OriginalMember(owner = "client!ZKARKDQW", name = "rb", descriptor = "[I")
    public static int[] tmpDepthFaceCount = new int[1500];

    @OriginalMember(owner = "client!ZKARKDQW", name = "sb", descriptor = "[[I")
    public static int[][] tmpDepthFaces = new int[1500][512];

    @OriginalMember(owner = "client!ZKARKDQW", name = "tb", descriptor = "[I")
    public static int[] tmpPriorityFaceCount = new int[12];

    @OriginalMember(owner = "client!ZKARKDQW", name = "ub", descriptor = "[[I")
    public static int[][] tmpPriorityFaces = new int[12][2000];

    @OriginalMember(owner = "client!ZKARKDQW", name = "vb", descriptor = "[I")
    public static int[] tmpPriority10FaceDepth = new int[2000];

    @OriginalMember(owner = "client!ZKARKDQW", name = "wb", descriptor = "[I")
    public static int[] tmpPriority11FaceDepth = new int[2000];

    @OriginalMember(owner = "client!ZKARKDQW", name = "xb", descriptor = "[I")
    public static int[] tmpPriorityDepthSum = new int[12];

    @OriginalMember(owner = "client!ZKARKDQW", name = "yb", descriptor = "[I")
    public static int[] clippedX = new int[10];

    @OriginalMember(owner = "client!ZKARKDQW", name = "zb", descriptor = "[I")
    public static int[] clippedY = new int[10];

    @OriginalMember(owner = "client!ZKARKDQW", name = "Ab", descriptor = "[I")
    public static int[] clippedColour = new int[10];

    @OriginalMember(owner = "client!ZKARKDQW", name = "Bb", descriptor = "I")
    public static int baseX;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Cb", descriptor = "I")
    public static int baseY;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Db", descriptor = "I")
    public static int baseZ;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Eb", descriptor = "Z")
    public static boolean checkHover;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Fb", descriptor = "I")
    public static int mouseX;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Gb", descriptor = "I")
    public static int mouseY;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Hb", descriptor = "I")
    public static int pickedCount;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Ib", descriptor = "[I")
    public static int[] pickedBitsets = new int[1000];

    @OriginalMember(owner = "client!ZKARKDQW", name = "Jb", descriptor = "[I")
    public static int[] sin = Draw3D.sin;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Kb", descriptor = "[I")
    public static int[] cos = Draw3D.cos;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Lb", descriptor = "[I")
    public static int[] palette = Draw3D.palette;

    @OriginalMember(owner = "client!ZKARKDQW", name = "Mb", descriptor = "[I")
    public static int[] reciprocal16 = Draw3D.reciprocal16;

    @OriginalMember(owner = "client!ZKARKDQW", name = "b", descriptor = "(I)V")
    public static void unload(int arg0) {
        meta = null;
        faceClippedX = null;
        faceNearClipped = null;
        vertexScreenX = null;
        if (arg0 < 0) {
            vertexScreenY = null;
            vertexScreenZ = null;
            vertexViewSpaceX = null;
            vertexViewSpaceY = null;
            vertexViewSpaceZ = null;
            tmpDepthFaceCount = null;
            tmpDepthFaces = null;
            tmpPriorityFaceCount = null;
            tmpPriorityFaces = null;
            tmpPriority10FaceDepth = null;
            tmpPriority11FaceDepth = null;
            tmpPriorityDepthSum = null;
            sin = null;
            cos = null;
            palette = null;
            reciprocal16 = null;
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(ILVJKFYAWG;)V")
    public static void init(int arg0, OnDemandProvider arg1) {
        meta = new Metadata[arg0];
        ondemand = arg1;
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "([BII)V")
    public static void unpack(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            Metadata var15 = meta[arg2] = new Metadata();
            var15.vertexCount = 0;
            var15.faceCount = 0;
            var15.texturedFaceCount = 0;
        } else {
            Packet var3 = new Packet(arg0, 891);
            var3.pos = arg0.length - 18;
            Metadata var4 = meta[arg2] = new Metadata();
            var4.data = arg0;
            var4.vertexCount = var3.g2();
            var4.faceCount = var3.g2();
            var4.texturedFaceCount = var3.g1();
            int var5 = var3.g1();
            int var6 = var3.g1();
            if (arg1 == -4036) {
                int var7 = var3.g1();
                int var8 = var3.g1();
                int var9 = var3.g1();
                int var10 = var3.g2();
                int var11 = var3.g2();
                int var12 = var3.g2();
                int var13 = var3.g2();
                byte var14 = 0;
                var4.vertexFlagsOffset = var14;
                int var16 = var14 + var4.vertexCount;
                var4.faceOrientationsOffset = var16;
                var16 += var4.faceCount;
                var4.facePrioritiesOffset = var16;
                if (var6 == 255) {
                    var16 += var4.faceCount;
                } else {
                    var4.facePrioritiesOffset = -var6 - 1;
                }
                var4.faceLabelsOffset = var16;
                if (var8 == 1) {
                    var16 += var4.faceCount;
                } else {
                    var4.faceLabelsOffset = -1;
                }
                var4.faceInfosOffset = var16;
                if (var5 == 1) {
                    var16 += var4.faceCount;
                } else {
                    var4.faceInfosOffset = -1;
                }
                var4.vertexLabelsOffset = var16;
                if (var9 == 1) {
                    var16 += var4.vertexCount;
                } else {
                    var4.vertexLabelsOffset = -1;
                }
                var4.faceAlphasOffset = var16;
                if (var7 == 1) {
                    var16 += var4.faceCount;
                } else {
                    var4.faceAlphasOffset = -1;
                }
                var4.faceVerticesOffset = var16;
                var16 += var13;
                var4.faceColorsOffset = var16;
                var16 += var4.faceCount * 2;
                var4.faceTextureAxisOffset = var16;
                var16 += var4.texturedFaceCount * 6;
                var4.vertexXOffset = var16;
                var16 += var10;
                var4.vertexYOffset = var16;
                var16 += var11;
                var4.vertexZOffset = var16;
                int var10000 = var16 + var12;
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(II)V")
    public static void unload(int arg0, int arg1) {
        meta[arg1] = null;
        if (arg0 <= 0) {
            _flowObfuscator11 = -219;
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "b", descriptor = "(II)LZKARKDQW;")
    public static Model tryGet(int arg0, int arg1) {
        if (meta == null) {
            return null;
        } else {
            Metadata var2 = meta[arg1];
            if (arg0 != 9) {
                for (int var3 = 1; var3 > 0; var3++) {
                }
            }
            if (var2 == null) {
                ondemand.requestModel(arg1);
                return null;
            } else {
                return new Model(arg1, -870);
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "c", descriptor = "(I)Z")
    public static boolean validate(int arg0) {
        if (meta == null) {
            return false;
        } else {
            Metadata var1 = meta[arg0];
            if (var1 == null) {
                ondemand.requestModel(arg0);
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "<init>", descriptor = "(Z)V")
    private Model(boolean arg0) {
        if (!arg0) {
            this._flowObfuscator10 = !this._flowObfuscator10;
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "<init>", descriptor = "(II)V")
    private Model(int arg0, int arg1) {
        loaded++;
        Metadata var3 = meta[arg0];
        this.vertexCount = var3.vertexCount;
        this.faceCount = var3.faceCount;
        this.texturedFaceCount = var3.texturedFaceCount;
        this.vertexX = new int[this.vertexCount];
        this.vertexY = new int[this.vertexCount];
        this.vertexZ = new int[this.vertexCount];
        this.faceVertexA = new int[this.faceCount];
        this.faceVertexB = new int[this.faceCount];
        while (arg1 >= 0) {
            this._flowObfuscator10 = !this._flowObfuscator10;
        }
        this.faceVertexC = new int[this.faceCount];
        this.texturedVertexA = new int[this.texturedFaceCount];
        this.texturedVertexB = new int[this.texturedFaceCount];
        this.texturedVertexC = new int[this.texturedFaceCount];
        if (var3.vertexLabelsOffset >= 0) {
            this.vertexLabel = new int[this.vertexCount];
        }
        if (var3.faceInfosOffset >= 0) {
            this.faceInfo = new int[this.faceCount];
        }
        if (var3.facePrioritiesOffset >= 0) {
            this.facePriority = new int[this.faceCount];
        } else {
            this.priority = -var3.facePrioritiesOffset - 1;
        }
        if (var3.faceAlphasOffset >= 0) {
            this.faceAlpha = new int[this.faceCount];
        }
        if (var3.faceLabelsOffset >= 0) {
            this.faceLabel = new int[this.faceCount];
        }
        this.faceColour = new int[this.faceCount];
        Packet var4 = new Packet(var3.data, 891);
        var4.pos = var3.vertexFlagsOffset;
        Packet var5 = new Packet(var3.data, 891);
        var5.pos = var3.vertexXOffset;
        Packet var6 = new Packet(var3.data, 891);
        var6.pos = var3.vertexYOffset;
        Packet var7 = new Packet(var3.data, 891);
        var7.pos = var3.vertexZOffset;
        Packet var8 = new Packet(var3.data, 891);
        var8.pos = var3.vertexLabelsOffset;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13;
        int var14;
        int var15;
        int var16;
        for (int var12 = 0; var12 < this.vertexCount; var12++) {
            var13 = var4.g1();
            var14 = 0;
            if ((var13 & 1) != 0) {
                var14 = var5.gsmart();
            }
            var15 = 0;
            if ((var13 & 2) != 0) {
                var15 = var6.gsmart();
            }
            var16 = 0;
            if ((var13 & 4) != 0) {
                var16 = var7.gsmart();
            }
            this.vertexX[var12] = var9 + var14;
            this.vertexY[var12] = var10 + var15;
            this.vertexZ[var12] = var11 + var16;
            var9 = this.vertexX[var12];
            var10 = this.vertexY[var12];
            var11 = this.vertexZ[var12];
            if (this.vertexLabel != null) {
                this.vertexLabel[var12] = var8.g1();
            }
        }
        var4.pos = var3.faceColorsOffset;
        var5.pos = var3.faceInfosOffset;
        var6.pos = var3.facePrioritiesOffset;
        var7.pos = var3.faceAlphasOffset;
        var8.pos = var3.faceLabelsOffset;
        for (var13 = 0; var13 < this.faceCount; var13++) {
            this.faceColour[var13] = var4.g2();
            if (this.faceInfo != null) {
                this.faceInfo[var13] = var5.g1();
            }
            if (this.facePriority != null) {
                this.facePriority[var13] = var6.g1();
            }
            if (this.faceAlpha != null) {
                this.faceAlpha[var13] = var7.g1();
            }
            if (this.faceLabel != null) {
                this.faceLabel[var13] = var8.g1();
            }
        }
        var4.pos = var3.faceVerticesOffset;
        var5.pos = var3.faceOrientationsOffset;
        var14 = 0;
        var15 = 0;
        var16 = 0;
        int var17 = 0;
        int var19;
        for (int var18 = 0; var18 < this.faceCount; var18++) {
            var19 = var5.g1();
            if (var19 == 1) {
                var14 = var4.gsmart() + var17;
                var15 = var4.gsmart() + var14;
                var16 = var4.gsmart() + var15;
                var17 = var16;
                this.faceVertexA[var18] = var14;
                this.faceVertexB[var18] = var15;
                this.faceVertexC[var18] = var16;
            }
            if (var19 == 2) {
                var14 = var14;
                var15 = var16;
                var16 = var4.gsmart() + var17;
                var17 = var16;
                this.faceVertexA[var18] = var14;
                this.faceVertexB[var18] = var15;
                this.faceVertexC[var18] = var16;
            }
            if (var19 == 3) {
                var14 = var16;
                var15 = var15;
                var16 = var4.gsmart() + var17;
                var17 = var16;
                this.faceVertexA[var18] = var14;
                this.faceVertexB[var18] = var15;
                this.faceVertexC[var18] = var16;
            }
            if (var19 == 4) {
                int var20 = var14;
                var14 = var15;
                var15 = var20;
                var16 = var4.gsmart() + var17;
                var17 = var16;
                this.faceVertexA[var18] = var14;
                this.faceVertexB[var18] = var20;
                this.faceVertexC[var18] = var16;
            }
        }
        var4.pos = var3.faceTextureAxisOffset;
        for (var19 = 0; var19 < this.texturedFaceCount; var19++) {
            this.texturedVertexA[var19] = var4.g2();
            this.texturedVertexB[var19] = var4.g2();
            this.texturedVertexC[var19] = var4.g2();
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "<init>", descriptor = "(I[LZKARKDQW;I)V")
    public Model(int arg0, Model[] arg1, int arg2) {
        loaded++;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.vertexCount = 0;
        this.faceCount = 0;
        this.texturedFaceCount = 0;
        this.priority = -1;
        for (int var8 = 0; var8 < arg0; var8++) {
            Model var9 = arg1[var8];
            if (var9 != null) {
                this.vertexCount += var9.vertexCount;
                this.faceCount += var9.faceCount;
                this.texturedFaceCount += var9.texturedFaceCount;
                var4 |= var9.faceInfo != null;
                if (var9.facePriority != null) {
                    var5 = true;
                } else {
                    if (this.priority == -1) {
                        this.priority = var9.priority;
                    }
                    if (this.priority != var9.priority) {
                        var5 = true;
                    }
                }
                var6 |= var9.faceAlpha != null;
                var7 |= var9.faceLabel != null;
            }
        }
        this.vertexX = new int[this.vertexCount];
        this.vertexY = new int[this.vertexCount];
        this.vertexZ = new int[this.vertexCount];
        this.vertexLabel = new int[this.vertexCount];
        this.faceVertexA = new int[this.faceCount];
        this.faceVertexB = new int[this.faceCount];
        this.faceVertexC = new int[this.faceCount];
        this.texturedVertexA = new int[this.texturedFaceCount];
        this.texturedVertexB = new int[this.texturedFaceCount];
        this.texturedVertexC = new int[this.texturedFaceCount];
        if (var4) {
            this.faceInfo = new int[this.faceCount];
        }
        if (var5) {
            this.facePriority = new int[this.faceCount];
        }
        if (var6) {
            this.faceAlpha = new int[this.faceCount];
        }
        if (var7) {
            this.faceLabel = new int[this.faceCount];
        }
        this.faceColour = new int[this.faceCount];
        this.vertexCount = 0;
        this.faceCount = 0;
        this.texturedFaceCount = 0;
        if (arg2 >= 0) {
            _flowObfuscator11 = 23;
        }
        int var14 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            Model var11 = arg1[var10];
            if (var11 != null) {
                int var13;
                for (int var12 = 0; var12 < var11.faceCount; var12++) {
                    if (var4) {
                        if (var11.faceInfo == null) {
                            this.faceInfo[this.faceCount] = 0;
                        } else {
                            var13 = var11.faceInfo[var12];
                            if ((var13 & 2) == 2) {
                                var13 += var14 << 2;
                            }
                            this.faceInfo[this.faceCount] = var13;
                        }
                    }
                    if (var5) {
                        if (var11.facePriority == null) {
                            this.facePriority[this.faceCount] = var11.priority;
                        } else {
                            this.facePriority[this.faceCount] = var11.facePriority[var12];
                        }
                    }
                    if (var6) {
                        if (var11.faceAlpha == null) {
                            this.faceAlpha[this.faceCount] = 0;
                        } else {
                            this.faceAlpha[this.faceCount] = var11.faceAlpha[var12];
                        }
                    }
                    if (var7 && var11.faceLabel != null) {
                        this.faceLabel[this.faceCount] = var11.faceLabel[var12];
                    }
                    this.faceColour[this.faceCount] = var11.faceColour[var12];
                    this.faceVertexA[this.faceCount] = this.addVertex(var11, var11.faceVertexA[var12]);
                    this.faceVertexB[this.faceCount] = this.addVertex(var11, var11.faceVertexB[var12]);
                    this.faceVertexC[this.faceCount] = this.addVertex(var11, var11.faceVertexC[var12]);
                    this.faceCount++;
                }
                for (var13 = 0; var13 < var11.texturedFaceCount; var13++) {
                    this.texturedVertexA[this.texturedFaceCount] = this.addVertex(var11, var11.texturedVertexA[var13]);
                    this.texturedVertexB[this.texturedFaceCount] = this.addVertex(var11, var11.texturedVertexB[var13]);
                    this.texturedVertexC[this.texturedFaceCount] = this.addVertex(var11, var11.texturedVertexC[var13]);
                    this.texturedFaceCount++;
                }
                var14 += var11.texturedFaceCount;
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "<init>", descriptor = "(IIZ[LZKARKDQW;)V")
    public Model(int arg0, int arg1, boolean arg2, Model[] arg3) {
        loaded++;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.vertexCount = 0;
        this.faceCount = 0;
        this.texturedFaceCount = 0;
        this.priority = -1;
        for (int var9 = 0; var9 < arg0; var9++) {
            Model var10 = arg3[var9];
            if (var10 != null) {
                this.vertexCount += var10.vertexCount;
                this.faceCount += var10.faceCount;
                this.texturedFaceCount += var10.texturedFaceCount;
                var5 |= var10.faceInfo != null;
                if (var10.facePriority != null) {
                    var6 = true;
                } else {
                    if (this.priority == -1) {
                        this.priority = var10.priority;
                    }
                    if (this.priority != var10.priority) {
                        var6 = true;
                    }
                }
                var7 |= var10.faceAlpha != null;
                var8 |= var10.faceColour != null;
            }
        }
        this.vertexX = new int[this.vertexCount];
        this.vertexY = new int[this.vertexCount];
        this.vertexZ = new int[this.vertexCount];
        this.faceVertexA = new int[this.faceCount];
        this.faceVertexB = new int[this.faceCount];
        this.faceVertexC = new int[this.faceCount];
        this.faceColourA = new int[this.faceCount];
        this.faceColourB = new int[this.faceCount];
        this.faceColourC = new int[this.faceCount];
        this.texturedVertexA = new int[this.texturedFaceCount];
        this.texturedVertexB = new int[this.texturedFaceCount];
        this.texturedVertexC = new int[this.texturedFaceCount];
        int var17;
        if (arg1 >= 0) {
            for (var17 = 1; var17 > 0; var17++) {
            }
        }
        if (var5) {
            this.faceInfo = new int[this.faceCount];
        }
        if (var6) {
            this.facePriority = new int[this.faceCount];
        }
        if (var7) {
            this.faceAlpha = new int[this.faceCount];
        }
        if (var8) {
            this.faceColour = new int[this.faceCount];
        }
        this.vertexCount = 0;
        this.faceCount = 0;
        this.texturedFaceCount = 0;
        var17 = 0;
        for (int var11 = 0; var11 < arg0; var11++) {
            Model var12 = arg3[var11];
            if (var12 != null) {
                int var13 = this.vertexCount;
                for (int var14 = 0; var14 < var12.vertexCount; var14++) {
                    this.vertexX[this.vertexCount] = var12.vertexX[var14];
                    this.vertexY[this.vertexCount] = var12.vertexY[var14];
                    this.vertexZ[this.vertexCount] = var12.vertexZ[var14];
                    this.vertexCount++;
                }
                int var16;
                for (int var15 = 0; var15 < var12.faceCount; var15++) {
                    this.faceVertexA[this.faceCount] = var12.faceVertexA[var15] + var13;
                    this.faceVertexB[this.faceCount] = var12.faceVertexB[var15] + var13;
                    this.faceVertexC[this.faceCount] = var12.faceVertexC[var15] + var13;
                    this.faceColourA[this.faceCount] = var12.faceColourA[var15];
                    this.faceColourB[this.faceCount] = var12.faceColourB[var15];
                    this.faceColourC[this.faceCount] = var12.faceColourC[var15];
                    if (var5) {
                        if (var12.faceInfo == null) {
                            this.faceInfo[this.faceCount] = 0;
                        } else {
                            var16 = var12.faceInfo[var15];
                            if ((var16 & 2) == 2) {
                                var16 += var17 << 2;
                            }
                            this.faceInfo[this.faceCount] = var16;
                        }
                    }
                    if (var6) {
                        if (var12.facePriority == null) {
                            this.facePriority[this.faceCount] = var12.priority;
                        } else {
                            this.facePriority[this.faceCount] = var12.facePriority[var15];
                        }
                    }
                    if (var7) {
                        if (var12.faceAlpha == null) {
                            this.faceAlpha[this.faceCount] = 0;
                        } else {
                            this.faceAlpha[this.faceCount] = var12.faceAlpha[var15];
                        }
                    }
                    if (var8 && var12.faceColour != null) {
                        this.faceColour[this.faceCount] = var12.faceColour[var15];
                    }
                    this.faceCount++;
                }
                for (var16 = 0; var16 < var12.texturedFaceCount; var16++) {
                    this.texturedVertexA[this.texturedFaceCount] = var12.texturedVertexA[var16] + var13;
                    this.texturedVertexB[this.texturedFaceCount] = var12.texturedVertexB[var16] + var13;
                    this.texturedVertexC[this.texturedFaceCount] = var12.texturedVertexC[var16] + var13;
                    this.texturedFaceCount++;
                }
                var17 += var12.texturedFaceCount;
            }
        }
        this.calculateBoundsCylinder(false);
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "<init>", descriptor = "(IZZZLZKARKDQW;)V")
    public Model(int arg0, boolean arg1, boolean arg2, boolean arg3, Model arg4) {
        loaded++;
        this.vertexCount = arg4.vertexCount;
        this.faceCount = arg4.faceCount;
        this.texturedFaceCount = arg4.texturedFaceCount;
        int var6;
        if (arg3) {
            this.vertexX = arg4.vertexX;
            this.vertexY = arg4.vertexY;
            this.vertexZ = arg4.vertexZ;
        } else {
            this.vertexX = new int[this.vertexCount];
            this.vertexY = new int[this.vertexCount];
            this.vertexZ = new int[this.vertexCount];
            for (var6 = 0; var6 < this.vertexCount; var6++) {
                this.vertexX[var6] = arg4.vertexX[var6];
                this.vertexY[var6] = arg4.vertexY[var6];
                this.vertexZ[var6] = arg4.vertexZ[var6];
            }
        }
        if (arg1) {
            this.faceColour = arg4.faceColour;
        } else {
            this.faceColour = new int[this.faceCount];
            for (var6 = 0; var6 < this.faceCount; var6++) {
                this.faceColour[var6] = arg4.faceColour[var6];
            }
        }
        if (arg2) {
            this.faceAlpha = arg4.faceAlpha;
        } else {
            this.faceAlpha = new int[this.faceCount];
            if (arg4.faceAlpha == null) {
                for (var6 = 0; var6 < this.faceCount; var6++) {
                    this.faceAlpha[var6] = 0;
                }
            } else {
                for (var6 = 0; var6 < this.faceCount; var6++) {
                    this.faceAlpha[var6] = arg4.faceAlpha[var6];
                }
            }
        }
        this.vertexLabel = arg4.vertexLabel;
        this.faceLabel = arg4.faceLabel;
        this.faceInfo = arg4.faceInfo;
        this.faceVertexA = arg4.faceVertexA;
        this.faceVertexB = arg4.faceVertexB;
        this.faceVertexC = arg4.faceVertexC;
        this.facePriority = arg4.facePriority;
        this.priority = arg4.priority;
        this.texturedVertexA = arg4.texturedVertexA;
        if (arg0 < 9 || arg0 > 9) {
            for (var6 = 1; var6 > 0; var6++) {
            }
        }
        this.texturedVertexB = arg4.texturedVertexB;
        this.texturedVertexC = arg4.texturedVertexC;
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "<init>", descriptor = "(ZIZLZKARKDQW;)V")
    public Model(boolean arg0, int arg1, boolean arg2, Model arg3) {
        loaded++;
        this.vertexCount = arg3.vertexCount;
        this.faceCount = arg3.faceCount;
        this.texturedFaceCount = arg3.texturedFaceCount;
        int var5;
        if (arg0) {
            this.vertexY = new int[this.vertexCount];
            for (var5 = 0; var5 < this.vertexCount; var5++) {
                this.vertexY[var5] = arg3.vertexY[var5];
            }
        } else {
            this.vertexY = arg3.vertexY;
        }
        if (arg2) {
            this.faceColourA = new int[this.faceCount];
            this.faceColourB = new int[this.faceCount];
            this.faceColourC = new int[this.faceCount];
            for (var5 = 0; var5 < this.faceCount; var5++) {
                this.faceColourA[var5] = arg3.faceColourA[var5];
                this.faceColourB[var5] = arg3.faceColourB[var5];
                this.faceColourC[var5] = arg3.faceColourC[var5];
            }
            this.faceInfo = new int[this.faceCount];
            int var6;
            if (arg3.faceInfo == null) {
                for (var6 = 0; var6 < this.faceCount; var6++) {
                    this.faceInfo[var6] = 0;
                }
            } else {
                for (var6 = 0; var6 < this.faceCount; var6++) {
                    this.faceInfo[var6] = arg3.faceInfo[var6];
                }
            }
            super.vertexNormal = new VertexNormal[this.vertexCount];
            for (var6 = 0; var6 < this.vertexCount; var6++) {
                VertexNormal var7 = super.vertexNormal[var6] = new VertexNormal();
                VertexNormal var8 = arg3.vertexNormal[var6];
                var7.x = var8.x;
                var7.y = var8.y;
                var7.z = var8.z;
                var7.w = var8.w;
            }
            this.vertexNormalOriginal = arg3.vertexNormalOriginal;
        } else {
            this.faceColourA = arg3.faceColourA;
            this.faceColourB = arg3.faceColourB;
            this.faceColourC = arg3.faceColourC;
            this.faceInfo = arg3.faceInfo;
        }
        this.vertexX = arg3.vertexX;
        this.vertexZ = arg3.vertexZ;
        this.faceColour = arg3.faceColour;
        this.faceAlpha = arg3.faceAlpha;
        this.facePriority = arg3.facePriority;
        this.priority = arg3.priority;
        this.faceVertexA = arg3.faceVertexA;
        this.faceVertexB = arg3.faceVertexB;
        this.faceVertexC = arg3.faceVertexC;
        this.texturedVertexA = arg3.texturedVertexA;
        this.texturedVertexB = arg3.texturedVertexB;
        this.texturedVertexC = arg3.texturedVertexC;
        super.minY = arg3.minY;
        this.maxY = arg3.maxY;
        if (arg1 < 0) {
            this.radius = arg3.radius;
            this.minDepth = arg3.minDepth;
            this.maxDepth = arg3.maxDepth;
            this.minX = arg3.minX;
            this.maxZ = arg3.maxZ;
            this.minZ = arg3.minZ;
            this.maxX = arg3.maxX;
            this.field1216 = arg3.field1216;
            this.field1217 = arg3.field1217;
            this.field1215 = arg3.field1215;
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(ILZKARKDQW;Z)V")
    public void set(int arg0, Model arg1, boolean arg2) {
        this.vertexCount = arg1.vertexCount;
        int var4;
        if (arg0 != 7) {
            for (var4 = 1; var4 > 0; var4++) {
            }
        }
        this.faceCount = arg1.faceCount;
        this.texturedFaceCount = arg1.texturedFaceCount;
        if (tmpVertexX.length < this.vertexCount) {
            tmpVertexX = new int[this.vertexCount + 100];
            tmpVertexY = new int[this.vertexCount + 100];
            tmpVertexZ = new int[this.vertexCount + 100];
        }
        this.vertexX = tmpVertexX;
        this.vertexY = tmpVertexY;
        this.vertexZ = tmpVertexZ;
        for (var4 = 0; var4 < this.vertexCount; var4++) {
            this.vertexX[var4] = arg1.vertexX[var4];
            this.vertexY[var4] = arg1.vertexY[var4];
            this.vertexZ[var4] = arg1.vertexZ[var4];
        }
        if (arg2) {
            this.faceAlpha = arg1.faceAlpha;
        } else {
            if (tmpFaceAlpha.length < this.faceCount) {
                tmpFaceAlpha = new int[this.faceCount + 100];
            }
            this.faceAlpha = tmpFaceAlpha;
            int var5;
            if (arg1.faceAlpha == null) {
                for (var5 = 0; var5 < this.faceCount; var5++) {
                    this.faceAlpha[var5] = 0;
                }
            } else {
                for (var5 = 0; var5 < this.faceCount; var5++) {
                    this.faceAlpha[var5] = arg1.faceAlpha[var5];
                }
            }
        }
        this.faceInfo = arg1.faceInfo;
        this.faceColour = arg1.faceColour;
        this.facePriority = arg1.facePriority;
        this.priority = arg1.priority;
        this.labelFaces = arg1.labelFaces;
        this.labelVertices = arg1.labelVertices;
        this.faceVertexA = arg1.faceVertexA;
        this.faceVertexB = arg1.faceVertexB;
        this.faceVertexC = arg1.faceVertexC;
        this.faceColourA = arg1.faceColourA;
        this.faceColourB = arg1.faceColourB;
        this.faceColourC = arg1.faceColourC;
        this.texturedVertexA = arg1.texturedVertexA;
        this.texturedVertexB = arg1.texturedVertexB;
        this.texturedVertexC = arg1.texturedVertexC;
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(LZKARKDQW;I)I")
    private final int addVertex(Model arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.vertexX[arg1];
        int var5 = arg0.vertexY[arg1];
        int var6 = arg0.vertexZ[arg1];
        for (int var7 = 0; var7 < this.vertexCount; var7++) {
            if (var4 == this.vertexX[var7] && var5 == this.vertexY[var7] && var6 == this.vertexZ[var7]) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.vertexX[this.vertexCount] = var4;
            this.vertexY[this.vertexCount] = var5;
            this.vertexZ[this.vertexCount] = var6;
            if (arg0.vertexLabel != null) {
                this.vertexLabel[this.vertexCount] = arg0.vertexLabel[arg1];
            }
            var3 = this.vertexCount++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(Z)V")
    public void calculateBoundsCylinder(boolean arg0) {
        super.minY = 0;
        this.radius = 0;
        this.maxY = 0;
        for (int var2 = 0; var2 < this.vertexCount; var2++) {
            int var3 = this.vertexX[var2];
            int var4 = this.vertexY[var2];
            int var5 = this.vertexZ[var2];
            if (-var4 > super.minY) {
                super.minY = -var4;
            }
            if (var4 > this.maxY) {
                this.maxY = var4;
            }
            int var6 = var3 * var3 + var5 * var5;
            if (var6 > this.radius) {
                this.radius = var6;
            }
        }
        if (arg0) {
            _flowObfuscator11 = 455;
        }
        this.radius = (int) (Math.sqrt((double) this.radius) + 0.99D);
        this.minDepth = (int) (Math.sqrt((double) (this.radius * this.radius + super.minY * super.minY)) + 0.99D);
        this.maxDepth = this.minDepth + (int) (Math.sqrt((double) (this.radius * this.radius + this.maxY * this.maxY)) + 0.99D);
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "b", descriptor = "(Z)V")
    public void calculateBoundsY(boolean arg0) {
        super.minY = 0;
        this.maxY = 0;
        if (arg0) {
            this._flowObfuscator7 = !this._flowObfuscator7;
        }
        for (int var2 = 0; var2 < this.vertexCount; var2++) {
            int var3 = this.vertexY[var2];
            if (-var3 > super.minY) {
                super.minY = -var3;
            }
            if (var3 > this.maxY) {
                this.maxY = var3;
            }
        }
        this.minDepth = (int) (Math.sqrt((double) (this.radius * this.radius + super.minY * super.minY)) + 0.99D);
        this.maxDepth = this.minDepth + (int) (Math.sqrt((double) (this.radius * this.radius + this.maxY * this.maxY)) + 0.99D);
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "d", descriptor = "(I)V")
    public void calculateBoundsAABB(int arg0) {
        super.minY = 0;
        this.radius = 0;
        this.maxY = 0;
        this.minX = 32767;
        this.maxX = -32767;
        this.maxZ = -32767;
        this.minZ = 32767;
        for (int var2 = 0; var2 < this.vertexCount; var2++) {
            int var3 = this.vertexX[var2];
            int var4 = this.vertexY[var2];
            int var5 = this.vertexZ[var2];
            if (var3 < this.minX) {
                this.minX = var3;
            }
            if (var3 > this.maxX) {
                this.maxX = var3;
            }
            if (var5 < this.minZ) {
                this.minZ = var5;
            }
            if (var5 > this.maxZ) {
                this.maxZ = var5;
            }
            if (-var4 > super.minY) {
                super.minY = -var4;
            }
            if (var4 > this.maxY) {
                this.maxY = var4;
            }
            int var6 = var3 * var3 + var5 * var5;
            if (var6 > this.radius) {
                this.radius = var6;
            }
        }
        this.radius = (int) Math.sqrt((double) this.radius);
        this.minDepth = (int) Math.sqrt((double) (this.radius * this.radius + super.minY * super.minY));
        if (arg0 == 21073) {
            this.maxDepth = this.minDepth + (int) Math.sqrt((double) (this.radius * this.radius + this.maxY * this.maxY));
        }
        this.field1216 = (this.minX << 16) + (this.maxX & 65535);
        this.field1217 = (this.maxZ << 16) + (this.minZ & 65535);
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(B)V")
    public void createLabelReferences(byte arg0) {
        if (arg0 != -71) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var10002;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        if (this.vertexLabel != null) {
            var8 = new int[256];
            var3 = 0;
            for (var4 = 0; var4 < this.vertexCount; var4++) {
                var5 = this.vertexLabel[var4];
                var10002 = var8[var5]++;
                if (var5 > var3) {
                    var3 = var5;
                }
            }
            this.labelVertices = new int[var3 + 1][];
            for (var5 = 0; var5 <= var3; var5++) {
                this.labelVertices[var5] = new int[var8[var5]];
                var8[var5] = 0;
            }
            var6 = 0;
            while (var6 < this.vertexCount) {
                var7 = this.vertexLabel[var6];
                this.labelVertices[var7][var8[var7]++] = var6++;
            }
            this.vertexLabel = null;
        }
        if (this.faceLabel != null) {
            var8 = new int[256];
            var3 = 0;
            for (var4 = 0; var4 < this.faceCount; var4++) {
                var5 = this.faceLabel[var4];
                var10002 = var8[var5]++;
                if (var5 > var3) {
                    var3 = var5;
                }
            }
            this.labelFaces = new int[var3 + 1][];
            for (var5 = 0; var5 <= var3; var5++) {
                this.labelFaces[var5] = new int[var8[var5]];
                var8[var5] = 0;
            }
            var6 = 0;
            while (var6 < this.faceCount) {
                var7 = this.faceLabel[var6];
                this.labelFaces[var7][var8[var7]++] = var6++;
            }
            this.faceLabel = null;
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "c", descriptor = "(II)V")
    public void applyTransform(int arg0, int arg1) {
        if (this.labelVertices != null) {
            if (arg0 != -1) {
                AnimFrame var3 = AnimFrame.get(this._flowObfuscator6, arg0);
                if (var3 != null) {
                    AnimBase var4 = var3.base;
                    if (arg1 == 40542) {
                        baseX = 0;
                        baseY = 0;
                        baseZ = 0;
                        for (int var5 = 0; var5 < var3.length; var5++) {
                            int var6 = var3.groups[var5];
                            this.applyTransform(var4.types[var6], var4.labels[var6], var3.x[var5], var3.y[var5], var3.z[var5]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(I[III)V")
    public void applyTransforms(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            if (arg1 != null && arg2 != -1) {
                AnimFrame var5 = AnimFrame.get(this._flowObfuscator6, arg3);
                if (var5 != null) {
                    AnimFrame var6 = AnimFrame.get(this._flowObfuscator6, arg2);
                    if (arg0 == -20491) {
                        if (var6 == null) {
                            this.applyTransform(arg3, 40542);
                        } else {
                            AnimBase var7 = var5.base;
                            baseX = 0;
                            baseY = 0;
                            baseZ = 0;
                            byte var8 = 0;
                            int var13 = var8 + 1;
                            int var9 = arg1[var8];
                            int var11;
                            for (int var10 = 0; var10 < var5.length; var10++) {
                                var11 = var5.groups[var10];
                                while (var11 > var9) {
                                    var9 = arg1[var13++];
                                }
                                if (var11 != var9 || var7.types[var11] == 0) {
                                    this.applyTransform(var7.types[var11], var7.labels[var11], var5.x[var10], var5.y[var10], var5.z[var10]);
                                }
                            }
                            baseX = 0;
                            baseY = 0;
                            baseZ = 0;
                            var8 = 0;
                            var13 = var8 + 1;
                            var9 = arg1[var8];
                            for (var11 = 0; var11 < var6.length; var11++) {
                                int var12 = var6.groups[var11];
                                while (var12 > var9) {
                                    var9 = arg1[var13++];
                                }
                                if (var12 == var9 || var7.types[var12] == 0) {
                                    this.applyTransform(var7.types[var12], var7.labels[var12], var6.x[var11], var6.y[var11], var6.z[var11]);
                                }
                            }
                        }
                    }
                }
            } else {
                this.applyTransform(arg3, 40542);
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(I[IIII)V")
    private void applyTransform(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        int var7;
        int var8;
        int var11;
        int var12;
        if (arg0 == 0) {
            var7 = 0;
            baseX = 0;
            baseY = 0;
            baseZ = 0;
            for (var8 = 0; var8 < var6; var8++) {
                int var18 = arg1[var8];
                if (var18 < this.labelVertices.length) {
                    int[] var19 = this.labelVertices[var18];
                    for (var11 = 0; var11 < var19.length; var11++) {
                        var12 = var19[var11];
                        baseX += this.vertexX[var12];
                        baseY += this.vertexY[var12];
                        baseZ += this.vertexZ[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                baseX = baseX / var7 + arg2;
                baseY = baseY / var7 + arg3;
                baseZ = baseZ / var7 + arg4;
            } else {
                baseX = arg2;
                baseY = arg3;
                baseZ = arg4;
            }
        } else {
            int[] var9;
            int var10;
            if (arg0 == 1) {
                for (var7 = 0; var7 < var6; var7++) {
                    var8 = arg1[var7];
                    if (var8 < this.labelVertices.length) {
                        var9 = this.labelVertices[var8];
                        for (var10 = 0; var10 < var9.length; var10++) {
                            var11 = var9[var10];
                            this.vertexX[var11] += arg2;
                            this.vertexY[var11] += arg3;
                            this.vertexZ[var11] += arg4;
                        }
                    }
                }
            } else if (arg0 == 2) {
                for (var7 = 0; var7 < var6; var7++) {
                    var8 = arg1[var7];
                    if (var8 < this.labelVertices.length) {
                        var9 = this.labelVertices[var8];
                        for (var10 = 0; var10 < var9.length; var10++) {
                            var11 = var9[var10];
                            this.vertexX[var11] -= baseX;
                            this.vertexY[var11] -= baseY;
                            this.vertexZ[var11] -= baseZ;
                            var12 = (arg2 & 255) * 8;
                            int var13 = (arg3 & 255) * 8;
                            int var14 = (arg4 & 255) * 8;
                            int var15;
                            int var16;
                            int var17;
                            if (var14 != 0) {
                                var15 = sin[var14];
                                var16 = cos[var14];
                                var17 = this.vertexY[var11] * var15 + this.vertexX[var11] * var16 >> 16;
                                this.vertexY[var11] = this.vertexY[var11] * var16 - this.vertexX[var11] * var15 >> 16;
                                this.vertexX[var11] = var17;
                            }
                            if (var12 != 0) {
                                var15 = sin[var12];
                                var16 = cos[var12];
                                var17 = this.vertexY[var11] * var16 - this.vertexZ[var11] * var15 >> 16;
                                this.vertexZ[var11] = this.vertexY[var11] * var15 + this.vertexZ[var11] * var16 >> 16;
                                this.vertexY[var11] = var17;
                            }
                            if (var13 != 0) {
                                var15 = sin[var13];
                                var16 = cos[var13];
                                var17 = this.vertexZ[var11] * var15 + this.vertexX[var11] * var16 >> 16;
                                this.vertexZ[var11] = this.vertexZ[var11] * var16 - this.vertexX[var11] * var15 >> 16;
                                this.vertexX[var11] = var17;
                            }
                            this.vertexX[var11] += baseX;
                            this.vertexY[var11] += baseY;
                            this.vertexZ[var11] += baseZ;
                        }
                    }
                }
            } else if (arg0 == 3) {
                for (var7 = 0; var7 < var6; var7++) {
                    var8 = arg1[var7];
                    if (var8 < this.labelVertices.length) {
                        var9 = this.labelVertices[var8];
                        for (var10 = 0; var10 < var9.length; var10++) {
                            var11 = var9[var10];
                            this.vertexX[var11] -= baseX;
                            this.vertexY[var11] -= baseY;
                            this.vertexZ[var11] -= baseZ;
                            this.vertexX[var11] = this.vertexX[var11] * arg2 / 128;
                            this.vertexY[var11] = this.vertexY[var11] * arg3 / 128;
                            this.vertexZ[var11] = this.vertexZ[var11] * arg4 / 128;
                            this.vertexX[var11] += baseX;
                            this.vertexY[var11] += baseY;
                            this.vertexZ[var11] += baseZ;
                        }
                    }
                }
            } else if (arg0 == 5) {
                if (this.labelFaces != null && this.faceAlpha != null) {
                    for (var7 = 0; var7 < var6; var7++) {
                        var8 = arg1[var7];
                        if (var8 < this.labelFaces.length) {
                            var9 = this.labelFaces[var8];
                            for (var10 = 0; var10 < var9.length; var10++) {
                                var11 = var9[var10];
                                this.faceAlpha[var11] += arg2 * 8;
                                if (this.faceAlpha[var11] < 0) {
                                    this.faceAlpha[var11] = 0;
                                }
                                if (this.faceAlpha[var11] > 255) {
                                    this.faceAlpha[var11] = 255;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "e", descriptor = "(I)V")
    public void rotateY90(int arg0) {
        if (arg0 > 0) {
            for (int var2 = 0; var2 < this.vertexCount; var2++) {
                int var3 = this.vertexX[var2];
                this.vertexX[var2] = this.vertexZ[var2];
                this.vertexZ[var2] = -var3;
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "d", descriptor = "(II)V")
    public void rotateX(int arg0, int arg1) {
        int var3 = sin[arg0];
        int var4 = cos[arg0];
        for (int var5 = 0; var5 < this.vertexCount; var5++) {
            int var6 = this.vertexY[var5] * var4 - this.vertexZ[var5] * var3 >> 16;
            this.vertexZ[var5] = this.vertexY[var5] * var3 + this.vertexZ[var5] * var4 >> 16;
            this.vertexY[var5] = var6;
        }
        if (arg1 < this._flowObfuscator9 || arg1 > this._flowObfuscator9) {
            this._flowObfuscator9 = 324;
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(IIII)V")
    public void translate(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 16384) {
            this._flowObfuscator6 = -132;
        }
        for (int var5 = 0; var5 < this.vertexCount; var5++) {
            this.vertexX[var5] += arg0;
            this.vertexY[var5] += arg1;
            this.vertexZ[var5] += arg3;
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "e", descriptor = "(II)V")
    public void recolour(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.faceCount; var3++) {
            if (this.faceColour[var3] == arg0) {
                this.faceColour[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "f", descriptor = "(I)V")
    public void rotateY180(int arg0) {
        for (int var2 = 0; var2 < this.vertexCount; var2++) {
            this.vertexZ[var2] = -this.vertexZ[var2];
        }
        for (int var3 = 0; var3 < this.faceCount; var3++) {
            int var4 = this.faceVertexA[var3];
            this.faceVertexA[var3] = this.faceVertexC[var3];
            this.faceVertexC[var3] = var4;
        }
        if (arg0 != 0) {
            _flowObfuscator11 = 107;
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "b", descriptor = "(IIII)V")
    public void scale(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 9) {
            this._flowObfuscator9 = -383;
        }
        for (int var5 = 0; var5 < this.vertexCount; var5++) {
            this.vertexX[var5] = this.vertexX[var5] * arg0 / 128;
            this.vertexY[var5] = this.vertexY[var5] * arg3 / 128;
            this.vertexZ[var5] = this.vertexZ[var5] * arg1 / 128;
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(IIIIIZ)V")
    public final void calculateNormals(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg1 * var7 >> 8;
        if (this.faceColourA == null) {
            this.faceColourA = new int[this.faceCount];
            this.faceColourB = new int[this.faceCount];
            this.faceColourC = new int[this.faceCount];
        }
        int var9;
        if (super.vertexNormal == null) {
            super.vertexNormal = new VertexNormal[this.vertexCount];
            for (var9 = 0; var9 < this.vertexCount; var9++) {
                super.vertexNormal[var9] = new VertexNormal();
            }
        }
        int var10;
        for (var9 = 0; var9 < this.faceCount; var9++) {
            var10 = this.faceVertexA[var9];
            int var11 = this.faceVertexB[var9];
            int var12 = this.faceVertexC[var9];
            int var13 = this.vertexX[var11] - this.vertexX[var10];
            int var14 = this.vertexY[var11] - this.vertexY[var10];
            int var15 = this.vertexZ[var11] - this.vertexZ[var10];
            int var16 = this.vertexX[var12] - this.vertexX[var10];
            int var17 = this.vertexY[var12] - this.vertexY[var10];
            int var18 = this.vertexZ[var12] - this.vertexZ[var10];
            int var19 = var14 * var18 - var17 * var15;
            int var20 = var15 * var16 - var18 * var13;
            int var21;
            for (var21 = var13 * var17 - var16 * var14; var19 > 8192 || var20 > 8192 || var21 > 8192 || var19 < -8192 || var20 < -8192 || var21 < -8192; var21 >>= 1) {
                var19 >>= 1;
                var20 >>= 1;
            }
            int var22 = (int) Math.sqrt((double) (var19 * var19 + var20 * var20 + var21 * var21));
            if (var22 <= 0) {
                var22 = 1;
            }
            var19 = var19 * 256 / var22;
            var20 = var20 * 256 / var22;
            var21 = var21 * 256 / var22;
            if (this.faceInfo != null && (this.faceInfo[var9] & 1) != 0) {
                int var28 = arg0 + (arg2 * var19 + arg3 * var20 + arg4 * var21) / (var8 + var8 / 2);
                this.faceColourA[var9] = mulColorLightness(this.faceColour[var9], var28, this.faceInfo[var9]);
            } else {
                VertexNormal var23 = super.vertexNormal[var10];
                var23.x += var19;
                var23.y += var20;
                var23.z += var21;
                var23.w++;
                VertexNormal var26 = super.vertexNormal[var11];
                var26.x += var19;
                var26.y += var20;
                var26.z += var21;
                var26.w++;
                VertexNormal var27 = super.vertexNormal[var12];
                var27.x += var19;
                var27.y += var20;
                var27.z += var21;
                var27.w++;
            }
        }
        if (arg5) {
            this.applyLighting(arg0, var8, arg2, arg3, arg4);
        } else {
            this.vertexNormalOriginal = new VertexNormal[this.vertexCount];
            for (var10 = 0; var10 < this.vertexCount; var10++) {
                VertexNormal var24 = super.vertexNormal[var10];
                VertexNormal var25 = this.vertexNormalOriginal[var10] = new VertexNormal();
                var25.x = var24.x;
                var25.y = var24.y;
                var25.z = var24.z;
                var25.w = var24.w;
            }
            this.field1215 = (arg0 << 16) + (var8 & 65535);
        }
        if (arg5) {
            this.calculateBoundsCylinder(false);
        } else {
            this.calculateBoundsAABB(21073);
        }
    }

    @OriginalMember(owner = "client!LZYQDKJV", name = "b", descriptor = "(IIII)V")
    public final void applyLighting(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1215 >> 16;
        int var6 = this.field1215 << 16 >> 16;
        this.applyLighting(var5, var6, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(IIIII)V")
    public final void applyLighting(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var7;
        for (int var6 = 0; var6 < this.faceCount; var6++) {
            var7 = this.faceVertexA[var6];
            int var8 = this.faceVertexB[var6];
            int var9 = this.faceVertexC[var6];
            VertexNormal var10;
            int var11;
            int var12;
            if (this.faceInfo == null) {
                var12 = this.faceColour[var6];
                var10 = super.vertexNormal[var7];
                var11 = arg0 + (arg2 * var10.x + arg3 * var10.y + arg4 * var10.z) / (arg1 * var10.w);
                this.faceColourA[var6] = mulColorLightness(var12, var11, 0);
                VertexNormal var14 = super.vertexNormal[var8];
                int var16 = arg0 + (arg2 * var14.x + arg3 * var14.y + arg4 * var14.z) / (arg1 * var14.w);
                this.faceColourB[var6] = mulColorLightness(var12, var16, 0);
                VertexNormal var15 = super.vertexNormal[var9];
                int var17 = arg0 + (arg2 * var15.x + arg3 * var15.y + arg4 * var15.z) / (arg1 * var15.w);
                this.faceColourC[var6] = mulColorLightness(var12, var17, 0);
            } else if ((this.faceInfo[var6] & 1) == 0) {
                var12 = this.faceColour[var6];
                int var13 = this.faceInfo[var6];
                var10 = super.vertexNormal[var7];
                var11 = arg0 + (arg2 * var10.x + arg3 * var10.y + arg4 * var10.z) / (arg1 * var10.w);
                this.faceColourA[var6] = mulColorLightness(var12, var11, var13);
                var10 = super.vertexNormal[var8];
                var11 = arg0 + (arg2 * var10.x + arg3 * var10.y + arg4 * var10.z) / (arg1 * var10.w);
                this.faceColourB[var6] = mulColorLightness(var12, var11, var13);
                var10 = super.vertexNormal[var9];
                var11 = arg0 + (arg2 * var10.x + arg3 * var10.y + arg4 * var10.z) / (arg1 * var10.w);
                this.faceColourC[var6] = mulColorLightness(var12, var11, var13);
            }
        }
        super.vertexNormal = null;
        this.vertexNormalOriginal = null;
        this.vertexLabel = null;
        this.faceLabel = null;
        if (this.faceInfo != null) {
            for (var7 = 0; var7 < this.faceCount; var7++) {
                if ((this.faceInfo[var7] & 2) == 2) {
                    return;
                }
            }
        }
        this.faceColour = null;
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(III)I")
    public static final int mulColorLightness(int arg0, int arg1, int arg2) {
        if ((arg2 & 2) == 2) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            arg1 = arg1 * (arg0 & 127) >> 7;
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return (arg0 & 65408) + arg1;
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(IIIIIII)V")
    public final void drawSimple(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Draw3D.centerX;
        int var9 = Draw3D.centerY;
        int var10 = sin[arg0];
        int var11 = cos[arg0];
        int var12 = sin[arg1];
        int var13 = cos[arg1];
        int var14 = sin[arg2];
        int var15 = cos[arg2];
        int var16 = sin[arg3];
        int var17 = cos[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.vertexCount; var19++) {
            int var20 = this.vertexX[var19];
            int var21 = this.vertexY[var19];
            int var22 = this.vertexZ[var19];
            int var23;
            if (arg2 != 0) {
                var23 = var21 * var14 + var20 * var15 >> 16;
                var21 = var21 * var15 - var20 * var14 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                var23 = var21 * var11 - var22 * var10 >> 16;
                var22 = var21 * var10 + var22 * var11 >> 16;
                var21 = var23;
            }
            if (arg1 != 0) {
                var23 = var22 * var12 + var20 * var13 >> 16;
                var22 = var22 * var13 - var20 * var12 >> 16;
                var20 = var23;
            }
            var20 += arg4;
            var21 += arg5;
            var22 += arg6;
            var23 = var21 * var17 - var22 * var16 >> 16;
            var22 = var21 * var16 + var22 * var17 >> 16;
            vertexScreenZ[var19] = var22 - var18;
            vertexScreenX[var19] = var8 + (var20 << 9) / var22;
            vertexScreenY[var19] = var9 + (var23 << 9) / var22;
            if (this.texturedFaceCount > 0) {
                vertexViewSpaceX[var19] = var20;
                vertexViewSpaceY[var19] = var23;
                vertexViewSpaceZ[var19] = var22;
            }
        }
        try {
            this.draw(false, false, 0);
        } catch (Exception var24) {
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(IIIIIIIII)V")
    public final void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg7 * arg4 - arg5 * arg3 >> 16;
        int var11 = arg6 * arg1 + var10 * arg2 >> 16;
        int var12 = this.radius * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 > 50 && var11 < 3500) {
            int var14 = arg7 * arg3 + arg5 * arg4 >> 16;
            int var15 = var14 - this.radius << 9;
            if (var15 / var13 < Draw2D.centerX2d) {
                int var16 = var14 + this.radius << 9;
                if (var16 / var13 > -Draw2D.centerX2d) {
                    int var17 = arg6 * arg2 - var10 * arg1 >> 16;
                    int var18 = this.radius * arg1 >> 16;
                    int var19 = var17 + var18 << 9;
                    if (var19 / var13 > -Draw2D.centerY2d) {
                        int var20 = var18 + (super.minY * arg2 >> 16);
                        int var21 = var17 - var20 << 9;
                        if (var21 / var13 < Draw2D.centerY2d) {
                            int var22 = var12 + (super.minY * arg1 >> 16);
                            boolean var23 = false;
                            if (var11 - var22 <= 50) {
                                var23 = true;
                            }
                            boolean var24 = false;
                            int var25;
                            int var26;
                            int var27;
                            if (arg8 > 0 && checkHover) {
                                var25 = var11 - var12;
                                if (var25 <= 50) {
                                    var25 = 50;
                                }
                                if (var14 > 0) {
                                    var15 /= var13;
                                    var16 /= var25;
                                } else {
                                    var16 /= var13;
                                    var15 /= var25;
                                }
                                if (var17 > 0) {
                                    var21 /= var13;
                                    var19 /= var25;
                                } else {
                                    var19 /= var13;
                                    var21 /= var25;
                                }
                                var26 = mouseX - Draw3D.centerX;
                                var27 = mouseY - Draw3D.centerY;
                                if (var26 > var15 && var26 < var16 && var27 > var21 && var27 < var19) {
                                    if (this.picking) {
                                        pickedBitsets[pickedCount++] = arg8;
                                    } else {
                                        var24 = true;
                                    }
                                }
                            }
                            var25 = Draw3D.centerX;
                            var26 = Draw3D.centerY;
                            var27 = 0;
                            int var28 = 0;
                            if (arg0 != 0) {
                                var27 = sin[arg0];
                                var28 = cos[arg0];
                            }
                            for (int var29 = 0; var29 < this.vertexCount; var29++) {
                                int var30 = this.vertexX[var29];
                                int var31 = this.vertexY[var29];
                                int var32 = this.vertexZ[var29];
                                int var33;
                                if (arg0 != 0) {
                                    var33 = var32 * var27 + var30 * var28 >> 16;
                                    var32 = var32 * var28 - var30 * var27 >> 16;
                                    var30 = var33;
                                }
                                var30 += arg5;
                                var31 += arg6;
                                var32 += arg7;
                                var33 = var32 * arg3 + var30 * arg4 >> 16;
                                var32 = var32 * arg4 - var30 * arg3 >> 16;
                                var30 = var33;
                                var33 = var31 * arg2 - var32 * arg1 >> 16;
                                var32 = var31 * arg1 + var32 * arg2 >> 16;
                                vertexScreenZ[var29] = var32 - var11;
                                if (var32 >= 50) {
                                    vertexScreenX[var29] = var25 + (var30 << 9) / var32;
                                    vertexScreenY[var29] = var26 + (var33 << 9) / var32;
                                } else {
                                    vertexScreenX[var29] = -5000;
                                    var23 = true;
                                }
                                if (var23 || this.texturedFaceCount > 0) {
                                    vertexViewSpaceX[var29] = var30;
                                    vertexViewSpaceY[var29] = var33;
                                    vertexViewSpaceZ[var29] = var32;
                                }
                            }
                            try {
                                this.draw(var23, var24, arg8);
                            } catch (Exception var34) {
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(ZZI)V")
    private final void draw(boolean arg0, boolean arg1, int arg2) {
        for (int var4 = 0; var4 < this.maxDepth; var4++) {
            tmpDepthFaceCount[var4] = 0;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        for (int var5 = 0; var5 < this.faceCount; var5++) {
            if (this.faceInfo == null || this.faceInfo[var5] != -1) {
                var6 = this.faceVertexA[var5];
                var7 = this.faceVertexB[var5];
                var8 = this.faceVertexC[var5];
                var9 = vertexScreenX[var6];
                var10 = vertexScreenX[var7];
                var11 = vertexScreenX[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    faceNearClipped[var5] = true;
                    var12 = (vertexScreenZ[var6] + vertexScreenZ[var7] + vertexScreenZ[var8]) / 3 + this.minDepth;
                    tmpDepthFaces[var12][tmpDepthFaceCount[var12]++] = var5;
                } else {
                    if (arg1 && this.pointWithinTriangle(mouseX, mouseY, vertexScreenY[var6], vertexScreenY[var7], vertexScreenY[var8], var9, var10, var11)) {
                        pickedBitsets[pickedCount++] = arg2;
                        arg1 = false;
                    }
                    if ((var9 - var10) * (vertexScreenY[var8] - vertexScreenY[var7]) - (vertexScreenY[var6] - vertexScreenY[var7]) * (var11 - var10) > 0) {
                        faceNearClipped[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Draw2D.boundX && var10 <= Draw2D.boundX && var11 <= Draw2D.boundX) {
                            faceClippedX[var5] = false;
                        } else {
                            faceClippedX[var5] = true;
                        }
                        var12 = (vertexScreenZ[var6] + vertexScreenZ[var7] + vertexScreenZ[var8]) / 3 + this.minDepth;
                        tmpDepthFaces[var12][tmpDepthFaceCount[var12]++] = var5;
                    }
                }
            }
        }
        if (this.facePriority == null) {
            for (var6 = this.maxDepth - 1; var6 >= 0; var6--) {
                var7 = tmpDepthFaceCount[var6];
                if (var7 > 0) {
                    int[] var21 = tmpDepthFaces[var6];
                    for (var9 = 0; var9 < var7; var9++) {
                        this.drawFace(var21[var9]);
                    }
                }
            }
        } else {
            for (var6 = 0; var6 < 12; var6++) {
                tmpPriorityFaceCount[var6] = 0;
                tmpPriorityDepthSum[var6] = 0;
            }
            int var13;
            for (var7 = this.maxDepth - 1; var7 >= 0; var7--) {
                var8 = tmpDepthFaceCount[var7];
                if (var8 > 0) {
                    int[] var20 = tmpDepthFaces[var7];
                    for (var10 = 0; var10 < var8; var10++) {
                        var11 = var20[var10];
                        var12 = this.facePriority[var11];
                        var13 = tmpPriorityFaceCount[var12]++;
                        tmpPriorityFaces[var12][var13] = var11;
                        if (var12 < 10) {
                            tmpPriorityDepthSum[var12] += var7;
                        } else if (var12 == 10) {
                            tmpPriority10FaceDepth[var13] = var7;
                        } else {
                            tmpPriority11FaceDepth[var13] = var7;
                        }
                    }
                }
            }
            var8 = 0;
            if (tmpPriorityFaceCount[1] > 0 || tmpPriorityFaceCount[2] > 0) {
                var8 = (tmpPriorityDepthSum[1] + tmpPriorityDepthSum[2]) / (tmpPriorityFaceCount[1] + tmpPriorityFaceCount[2]);
            }
            var9 = 0;
            if (tmpPriorityFaceCount[3] > 0 || tmpPriorityFaceCount[4] > 0) {
                var9 = (tmpPriorityDepthSum[3] + tmpPriorityDepthSum[4]) / (tmpPriorityFaceCount[3] + tmpPriorityFaceCount[4]);
            }
            var10 = 0;
            if (tmpPriorityFaceCount[6] > 0 || tmpPriorityFaceCount[8] > 0) {
                var10 = (tmpPriorityDepthSum[6] + tmpPriorityDepthSum[8]) / (tmpPriorityFaceCount[6] + tmpPriorityFaceCount[8]);
            }
            var12 = 0;
            var13 = tmpPriorityFaceCount[10];
            int[] var14 = tmpPriorityFaces[10];
            int[] var15 = tmpPriority10FaceDepth;
            if (var12 == var13) {
                var12 = 0;
                var13 = tmpPriorityFaceCount[11];
                var14 = tmpPriorityFaces[11];
                var15 = tmpPriority11FaceDepth;
            }
            if (var12 < var13) {
                var11 = var15[var12];
            } else {
                var11 = -1000;
            }
            for (int var16 = 0; var16 < 10; var16++) {
                while (var16 == 0 && var11 > var8) {
                    this.drawFace(var14[var12++]);
                    if (var12 == var13 && var14 != tmpPriorityFaces[11]) {
                        var12 = 0;
                        var13 = tmpPriorityFaceCount[11];
                        var14 = tmpPriorityFaces[11];
                        var15 = tmpPriority11FaceDepth;
                    }
                    if (var12 < var13) {
                        var11 = var15[var12];
                    } else {
                        var11 = -1000;
                    }
                }
                while (var16 == 3 && var11 > var9) {
                    this.drawFace(var14[var12++]);
                    if (var12 == var13 && var14 != tmpPriorityFaces[11]) {
                        var12 = 0;
                        var13 = tmpPriorityFaceCount[11];
                        var14 = tmpPriorityFaces[11];
                        var15 = tmpPriority11FaceDepth;
                    }
                    if (var12 < var13) {
                        var11 = var15[var12];
                    } else {
                        var11 = -1000;
                    }
                }
                while (var16 == 5 && var11 > var10) {
                    this.drawFace(var14[var12++]);
                    if (var12 == var13 && var14 != tmpPriorityFaces[11]) {
                        var12 = 0;
                        var13 = tmpPriorityFaceCount[11];
                        var14 = tmpPriorityFaces[11];
                        var15 = tmpPriority11FaceDepth;
                    }
                    if (var12 < var13) {
                        var11 = var15[var12];
                    } else {
                        var11 = -1000;
                    }
                }
                int var17 = tmpPriorityFaceCount[var16];
                int[] var18 = tmpPriorityFaces[var16];
                for (int var19 = 0; var19 < var17; var19++) {
                    this.drawFace(var18[var19]);
                }
            }
            while (var11 != -1000) {
                this.drawFace(var14[var12++]);
                if (var12 == var13 && var14 != tmpPriorityFaces[11]) {
                    var12 = 0;
                    var14 = tmpPriorityFaces[11];
                    var13 = tmpPriorityFaceCount[11];
                    var15 = tmpPriority11FaceDepth;
                }
                if (var12 < var13) {
                    var11 = var15[var12];
                } else {
                    var11 = -1000;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "g", descriptor = "(I)V")
    private final void drawFace(int arg0) {
        if (faceNearClipped[arg0]) {
            this.drawNearClippedFace(arg0);
        } else {
            int var2 = this.faceVertexA[arg0];
            int var3 = this.faceVertexB[arg0];
            int var4 = this.faceVertexC[arg0];
            Draw3D.clipX = faceClippedX[arg0];
            if (this.faceAlpha == null) {
                Draw3D.alpha = 0;
            } else {
                Draw3D.alpha = this.faceAlpha[arg0];
            }
            int var5;
            if (this.faceInfo == null) {
                var5 = 0;
            } else {
                var5 = this.faceInfo[arg0] & 3;
            }
            if (var5 == 0) {
                Draw3D.fillGouraudTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourB[arg0], this.faceColourC[arg0]);
            } else if (var5 == 1) {
                Draw3D.fillTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], palette[this.faceColourA[arg0]]);
            } else {
                int var6;
                int var7;
                int var8;
                int var9;
                if (var5 == 2) {
                    var6 = this.faceInfo[arg0] >> 2;
                    var7 = this.texturedVertexA[var6];
                    var8 = this.texturedVertexB[var6];
                    var9 = this.texturedVertexC[var6];
                    Draw3D.fillTexturedTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourB[arg0], this.faceColourC[arg0], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceX[var9], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceY[var9], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], vertexViewSpaceZ[var9], this.faceColour[arg0]);
                } else {
                    if (var5 == 3) {
                        var6 = this.faceInfo[arg0] >> 2;
                        var7 = this.texturedVertexA[var6];
                        var8 = this.texturedVertexB[var6];
                        var9 = this.texturedVertexC[var6];
                        Draw3D.fillTexturedTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceX[var9], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceY[var9], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], vertexViewSpaceZ[var9], this.faceColour[arg0]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "h", descriptor = "(I)V")
    private final void drawNearClippedFace(int arg0) {
        int var2 = Draw3D.centerX;
        int var3 = Draw3D.centerY;
        int var4 = 0;
        int var5 = this.faceVertexA[arg0];
        int var6 = this.faceVertexB[arg0];
        int var7 = this.faceVertexC[arg0];
        int var8 = vertexViewSpaceZ[var5];
        int var9 = vertexViewSpaceZ[var6];
        int var10 = vertexViewSpaceZ[var7];
        int var11;
        int var12;
        int var13;
        int var14;
        if (var8 >= 50) {
            clippedX[var4] = vertexScreenX[var5];
            clippedY[var4] = vertexScreenY[var5];
            clippedColour[var4++] = this.faceColourA[arg0];
        } else {
            var11 = vertexViewSpaceX[var5];
            var12 = vertexViewSpaceY[var5];
            var13 = this.faceColourA[arg0];
            if (var10 >= 50) {
                var14 = (50 - var8) * reciprocal16[var10 - var8];
                clippedX[var4] = var2 + (var11 + ((vertexViewSpaceX[var7] - var11) * var14 >> 16) << 9) / 50;
                clippedY[var4] = var3 + (var12 + ((vertexViewSpaceY[var7] - var12) * var14 >> 16) << 9) / 50;
                clippedColour[var4++] = var13 + ((this.faceColourC[arg0] - var13) * var14 >> 16);
            }
            if (var9 >= 50) {
                var14 = (50 - var8) * reciprocal16[var9 - var8];
                clippedX[var4] = var2 + (var11 + ((vertexViewSpaceX[var6] - var11) * var14 >> 16) << 9) / 50;
                clippedY[var4] = var3 + (var12 + ((vertexViewSpaceY[var6] - var12) * var14 >> 16) << 9) / 50;
                clippedColour[var4++] = var13 + ((this.faceColourB[arg0] - var13) * var14 >> 16);
            }
        }
        if (var9 >= 50) {
            clippedX[var4] = vertexScreenX[var6];
            clippedY[var4] = vertexScreenY[var6];
            clippedColour[var4++] = this.faceColourB[arg0];
        } else {
            var11 = vertexViewSpaceX[var6];
            var12 = vertexViewSpaceY[var6];
            var13 = this.faceColourB[arg0];
            if (var8 >= 50) {
                var14 = (50 - var9) * reciprocal16[var8 - var9];
                clippedX[var4] = var2 + (var11 + ((vertexViewSpaceX[var5] - var11) * var14 >> 16) << 9) / 50;
                clippedY[var4] = var3 + (var12 + ((vertexViewSpaceY[var5] - var12) * var14 >> 16) << 9) / 50;
                clippedColour[var4++] = var13 + ((this.faceColourA[arg0] - var13) * var14 >> 16);
            }
            if (var10 >= 50) {
                var14 = (50 - var9) * reciprocal16[var10 - var9];
                clippedX[var4] = var2 + (var11 + ((vertexViewSpaceX[var7] - var11) * var14 >> 16) << 9) / 50;
                clippedY[var4] = var3 + (var12 + ((vertexViewSpaceY[var7] - var12) * var14 >> 16) << 9) / 50;
                clippedColour[var4++] = var13 + ((this.faceColourC[arg0] - var13) * var14 >> 16);
            }
        }
        if (var10 >= 50) {
            clippedX[var4] = vertexScreenX[var7];
            clippedY[var4] = vertexScreenY[var7];
            clippedColour[var4++] = this.faceColourC[arg0];
        } else {
            var11 = vertexViewSpaceX[var7];
            var12 = vertexViewSpaceY[var7];
            var13 = this.faceColourC[arg0];
            if (var9 >= 50) {
                var14 = (50 - var10) * reciprocal16[var9 - var10];
                clippedX[var4] = var2 + (var11 + ((vertexViewSpaceX[var6] - var11) * var14 >> 16) << 9) / 50;
                clippedY[var4] = var3 + (var12 + ((vertexViewSpaceY[var6] - var12) * var14 >> 16) << 9) / 50;
                clippedColour[var4++] = var13 + ((this.faceColourB[arg0] - var13) * var14 >> 16);
            }
            if (var8 >= 50) {
                var14 = (50 - var10) * reciprocal16[var8 - var10];
                clippedX[var4] = var2 + (var11 + ((vertexViewSpaceX[var5] - var11) * var14 >> 16) << 9) / 50;
                clippedY[var4] = var3 + (var12 + ((vertexViewSpaceY[var5] - var12) * var14 >> 16) << 9) / 50;
                clippedColour[var4++] = var13 + ((this.faceColourA[arg0] - var13) * var14 >> 16);
            }
        }
        var11 = clippedX[0];
        var12 = clippedX[1];
        var13 = clippedX[2];
        var14 = clippedY[0];
        int var15 = clippedY[1];
        int var16 = clippedY[2];
        if ((var11 - var12) * (var16 - var15) - (var14 - var15) * (var13 - var12) > 0) {
            Draw3D.clipX = false;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var4 == 3) {
                if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Draw2D.boundX || var12 > Draw2D.boundX || var13 > Draw2D.boundX) {
                    Draw3D.clipX = true;
                }
                if (this.faceInfo == null) {
                    var17 = 0;
                } else {
                    var17 = this.faceInfo[arg0] & 3;
                }
                if (var17 == 0) {
                    Draw3D.fillGouraudTriangle(var14, var15, var16, var11, var12, var13, clippedColour[0], clippedColour[1], clippedColour[2]);
                } else if (var17 == 1) {
                    Draw3D.fillTriangle(var14, var15, var16, var11, var12, var13, palette[this.faceColourA[arg0]]);
                } else if (var17 == 2) {
                    var18 = this.faceInfo[arg0] >> 2;
                    var19 = this.texturedVertexA[var18];
                    var20 = this.texturedVertexB[var18];
                    var21 = this.texturedVertexC[var18];
                    Draw3D.fillTexturedTriangle(var14, var15, var16, var11, var12, var13, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var19], vertexViewSpaceX[var20], vertexViewSpaceX[var21], vertexViewSpaceY[var19], vertexViewSpaceY[var20], vertexViewSpaceY[var21], vertexViewSpaceZ[var19], vertexViewSpaceZ[var20], vertexViewSpaceZ[var21], this.faceColour[arg0]);
                } else if (var17 == 3) {
                    var18 = this.faceInfo[arg0] >> 2;
                    var19 = this.texturedVertexA[var18];
                    var20 = this.texturedVertexB[var18];
                    var21 = this.texturedVertexC[var18];
                    Draw3D.fillTexturedTriangle(var14, var15, var16, var11, var12, var13, this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var19], vertexViewSpaceX[var20], vertexViewSpaceX[var21], vertexViewSpaceY[var19], vertexViewSpaceY[var20], vertexViewSpaceY[var21], vertexViewSpaceZ[var19], vertexViewSpaceZ[var20], vertexViewSpaceZ[var21], this.faceColour[arg0]);
                }
            }
            if (var4 == 4) {
                if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Draw2D.boundX || var12 > Draw2D.boundX || var13 > Draw2D.boundX || clippedX[3] < 0 || clippedX[3] > Draw2D.boundX) {
                    Draw3D.clipX = true;
                }
                if (this.faceInfo == null) {
                    var17 = 0;
                } else {
                    var17 = this.faceInfo[arg0] & 3;
                }
                if (var17 == 0) {
                    Draw3D.fillGouraudTriangle(var14, var15, var16, var11, var12, var13, clippedColour[0], clippedColour[1], clippedColour[2]);
                    Draw3D.fillGouraudTriangle(var14, var16, clippedY[3], var11, var13, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3]);
                    return;
                }
                if (var17 == 1) {
                    var18 = palette[this.faceColourA[arg0]];
                    Draw3D.fillTriangle(var14, var15, var16, var11, var12, var13, var18);
                    Draw3D.fillTriangle(var14, var16, clippedY[3], var11, var13, clippedX[3], var18);
                    return;
                }
                if (var17 == 2) {
                    var18 = this.faceInfo[arg0] >> 2;
                    var19 = this.texturedVertexA[var18];
                    var20 = this.texturedVertexB[var18];
                    var21 = this.texturedVertexC[var18];
                    Draw3D.fillTexturedTriangle(var14, var15, var16, var11, var12, var13, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var19], vertexViewSpaceX[var20], vertexViewSpaceX[var21], vertexViewSpaceY[var19], vertexViewSpaceY[var20], vertexViewSpaceY[var21], vertexViewSpaceZ[var19], vertexViewSpaceZ[var20], vertexViewSpaceZ[var21], this.faceColour[arg0]);
                    Draw3D.fillTexturedTriangle(var14, var16, clippedY[3], var11, var13, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3], vertexViewSpaceX[var19], vertexViewSpaceX[var20], vertexViewSpaceX[var21], vertexViewSpaceY[var19], vertexViewSpaceY[var20], vertexViewSpaceY[var21], vertexViewSpaceZ[var19], vertexViewSpaceZ[var20], vertexViewSpaceZ[var21], this.faceColour[arg0]);
                    return;
                }
                if (var17 == 3) {
                    var18 = this.faceInfo[arg0] >> 2;
                    var19 = this.texturedVertexA[var18];
                    var20 = this.texturedVertexB[var18];
                    var21 = this.texturedVertexC[var18];
                    Draw3D.fillTexturedTriangle(var14, var15, var16, var11, var12, var13, this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var19], vertexViewSpaceX[var20], vertexViewSpaceX[var21], vertexViewSpaceY[var19], vertexViewSpaceY[var20], vertexViewSpaceY[var21], vertexViewSpaceZ[var19], vertexViewSpaceZ[var20], vertexViewSpaceZ[var21], this.faceColour[arg0]);
                    Draw3D.fillTexturedTriangle(var14, var16, clippedY[3], var11, var13, clippedX[3], this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var19], vertexViewSpaceX[var20], vertexViewSpaceX[var21], vertexViewSpaceY[var19], vertexViewSpaceY[var20], vertexViewSpaceY[var21], vertexViewSpaceZ[var19], vertexViewSpaceZ[var20], vertexViewSpaceZ[var21], this.faceColour[arg0]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZKARKDQW", name = "a", descriptor = "(IIIIIIII)Z")
    private final boolean pointWithinTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }
}
