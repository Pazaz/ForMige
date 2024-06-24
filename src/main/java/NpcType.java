import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CKDEJADD")
public class NpcType {

    @OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "I")
    public int walkanim_l = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "b", descriptor = "I")
    private static int cachePos;

    @OriginalMember(owner = "client!CKDEJADD", name = "c", descriptor = "I")
    public int multivarbit = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "d", descriptor = "I")
    public int walkanim_b = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "e", descriptor = "I")
    public int mutlivarp = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "f", descriptor = "LMBMGIXGO;")
    private static Packet dat;

    @OriginalMember(owner = "client!CKDEJADD", name = "g", descriptor = "I")
    public int vislevel = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "h", descriptor = "I")
    public static int count;

    @OriginalMember(owner = "client!CKDEJADD", name = "i", descriptor = "I")
    private int _flowObfuscator1 = 9;

    @OriginalMember(owner = "client!CKDEJADD", name = "j", descriptor = "I")
    private int _flowObfuscator2 = 1834;

    @OriginalMember(owner = "client!CKDEJADD", name = "k", descriptor = "Ljava/lang/String;")
    public String name;

    @OriginalMember(owner = "client!CKDEJADD", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] op;

    @OriginalMember(owner = "client!CKDEJADD", name = "m", descriptor = "I")
    public int walkanim = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "n", descriptor = "B")
    public byte size = 1;

    @OriginalMember(owner = "client!CKDEJADD", name = "o", descriptor = "I")
    private int _flowObfuscator3 = 9;

    @OriginalMember(owner = "client!CKDEJADD", name = "p", descriptor = "[I")
    private int[] recol_d;

    @OriginalMember(owner = "client!CKDEJADD", name = "q", descriptor = "I")
    public int field50 = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "r", descriptor = "[I")
    private static int[] idx;

    @OriginalMember(owner = "client!CKDEJADD", name = "s", descriptor = "[I")
    private int[] heads;

    @OriginalMember(owner = "client!CKDEJADD", name = "t", descriptor = "I")
    private static int _flowObfuscator4 = 748;

    @OriginalMember(owner = "client!CKDEJADD", name = "u", descriptor = "I")
    public int headicon = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "v", descriptor = "[I")
    private int[] recol_s;

    @OriginalMember(owner = "client!CKDEJADD", name = "w", descriptor = "I")
    public int readyanim = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "x", descriptor = "J")
    public long type = -1L;

    @OriginalMember(owner = "client!CKDEJADD", name = "y", descriptor = "I")
    public int turnspeed = 32;

    @OriginalMember(owner = "client!CKDEJADD", name = "z", descriptor = "[LCKDEJADD;")
    private static NpcType[] cache;

    @OriginalMember(owner = "client!CKDEJADD", name = "A", descriptor = "Z")
    private boolean _flowObfuscator5 = false;

    @OriginalMember(owner = "client!CKDEJADD", name = "B", descriptor = "Lclient;")
    public static client varProvider;

    @OriginalMember(owner = "client!CKDEJADD", name = "C", descriptor = "I")
    public int walkanim_r = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "D", descriptor = "Z")
    public boolean active = true;

    @OriginalMember(owner = "client!CKDEJADD", name = "E", descriptor = "I")
    private int ambient;

    @OriginalMember(owner = "client!CKDEJADD", name = "F", descriptor = "I")
    private int resizev = 128;

    @OriginalMember(owner = "client!CKDEJADD", name = "G", descriptor = "Z")
    public boolean minimap = true;

    @OriginalMember(owner = "client!CKDEJADD", name = "H", descriptor = "[I")
    public int[] multinpc;

    @OriginalMember(owner = "client!CKDEJADD", name = "I", descriptor = "[B")
    public byte[] desc;

    @OriginalMember(owner = "client!CKDEJADD", name = "J", descriptor = "I")
    public int field69 = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "K", descriptor = "I")
    private int resizeh = 128;

    @OriginalMember(owner = "client!CKDEJADD", name = "L", descriptor = "I")
    private int contrast;

    @OriginalMember(owner = "client!CKDEJADD", name = "M", descriptor = "Z")
    public boolean alwaysontop = false;

    @OriginalMember(owner = "client!CKDEJADD", name = "N", descriptor = "[I")
    private int[] models;

    @OriginalMember(owner = "client!CKDEJADD", name = "O", descriptor = "LGCPOSBWX;")
    public static LruCache modelCacheStatic = new LruCache(false, 30);

    @OriginalMember(owner = "client!CKDEJADD", name = "P", descriptor = "I")
    public int field75 = -1;

    @OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(I)LCKDEJADD;")
    public static final NpcType get(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if (cache[var1].type == (long) arg0) {
                return cache[var1];
            }
        }
        cachePos = (cachePos + 1) % 20;
        NpcType var2 = cache[cachePos] = new NpcType();
        dat.pos = idx[arg0];
        var2.type = (long) arg0;
        var2.decodeClient(true, dat);
        return var2;
    }

    @OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(Z)LZKARKDQW;")
    public final Model getHeadModel(boolean arg0) {
        if (this.multinpc != null) {
            NpcType var8 = this.getMultiNpc(this._flowObfuscator2);
            return var8 == null ? null : var8.getHeadModel(true);
        } else if (this.heads == null) {
            return null;
        } else {
            boolean var2 = false;
            if (!arg0) {
                this._flowObfuscator2 = 303;
            }
            for (int var3 = 0; var3 < this.heads.length; var3++) {
                if (!Model.validate(this.heads[var3])) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[this.heads.length];
                for (int var5 = 0; var5 < this.heads.length; var5++) {
                    var4[var5] = Model.tryGet(this._flowObfuscator3, this.heads[var5]);
                }
                Model var6;
                if (var4.length == 1) {
                    var6 = var4[0];
                } else {
                    var6 = new Model(var4.length, var4, -38);
                }
                if (this.recol_s != null) {
                    for (int var7 = 0; var7 < this.recol_s.length; var7++) {
                        var6.recolour(this.recol_s[var7], this.recol_d[var7]);
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!CKDEJADD", name = "b", descriptor = "(I)LCKDEJADD;")
    public final NpcType getMultiNpc(int arg0) {
        int var2 = -1;
        if (arg0 != 1834) {
            this._flowObfuscator5 = !this._flowObfuscator5;
        }
        if (this.multivarbit != -1) {
            VarbitType var3 = VarbitType.instances[this.multivarbit];
            int var4 = var3.basevar;
            int var5 = var3.startbit;
            int var6 = var3.endbit;
            int var7 = client.BITMASK[var6 - var5];
            var2 = varProvider.varps[var4] >> var5 & var7;
        } else if (this.mutlivarp != -1) {
            var2 = varProvider.varps[this.mutlivarp];
        }
        return var2 >= 0 && var2 < this.multinpc.length && this.multinpc[var2] != -1 ? get(this.multinpc[var2]) : null;
    }

    @OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(LXTGLDHGX;)V")
    public static final void unpack(Jagfile arg0) {
        dat = new Packet(arg0.read("npc.dat", (byte[]) null), 891);
        Packet var1 = new Packet(arg0.read("npc.idx", (byte[]) null), 891);
        count = var1.g2();
        idx = new int[count];
        int var2 = 2;
        for (int var3 = 0; var3 < count; var3++) {
            idx[var3] = var2;
            var2 += var1.g2();
        }
        cache = new NpcType[20];
        for (int var4 = 0; var4 < 20; var4++) {
            cache[var4] = new NpcType();
        }
    }

    @OriginalMember(owner = "client!CKDEJADD", name = "c", descriptor = "(I)V")
    public static final void unload(int arg0) {
        modelCacheStatic = null;
        idx = null;
        if (arg0 >= 0) {
            _flowObfuscator4 = 60;
        }
        cache = null;
        dat = null;
    }

    @OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(III[I)LZKARKDQW;")
    public final Model getModel(int arg0, int arg1, int arg2, int[] arg3) {
        if (this.multinpc != null) {
            NpcType var12 = this.getMultiNpc(this._flowObfuscator2);
            return var12 == null ? null : var12.getModel(0, arg1, arg2, arg3);
        } else {
            Model var5 = (Model) modelCacheStatic.get(this.type);
            if (arg0 != 0) {
                for (int var6 = 1; var6 > 0; var6++) {
                }
            }
            if (var5 == null) {
                boolean var11 = false;
                for (int var7 = 0; var7 < this.models.length; var7++) {
                    if (!Model.validate(this.models[var7])) {
                        var11 = true;
                    }
                }
                if (var11) {
                    return null;
                }
                Model[] var8 = new Model[this.models.length];
                for (int var9 = 0; var9 < this.models.length; var9++) {
                    var8[var9] = Model.tryGet(this._flowObfuscator3, this.models[var9]);
                }
                if (var8.length == 1) {
                    var5 = var8[0];
                } else {
                    var5 = new Model(var8.length, var8, -38);
                }
                if (this.recol_s != null) {
                    for (int var10 = 0; var10 < this.recol_s.length; var10++) {
                        var5.recolour(this.recol_s[var10], this.recol_d[var10]);
                    }
                }
                var5.createLabelReferences((byte) -71);
                var5.calculateNormals(64 + this.ambient, 850 + this.contrast, -30, -50, -30, true);
                modelCacheStatic.put(var5, this.type, (byte) 2);
            }
            Model var13 = Model.empty;
            var13.set(7, var5, AnimFrame.isNull(arg2, false) & AnimFrame.isNull(arg1, false));
            if (arg2 != -1 && arg1 != -1) {
                var13.applyTransforms(-20491, arg3, arg1, arg2);
            } else if (arg2 != -1) {
                var13.applyTransform(arg2, 40542);
            }
            if (this.resizeh != 128 || this.resizev != 128) {
                var13.scale(this.resizeh, this.resizeh, this._flowObfuscator1, this.resizev);
            }
            var13.calculateBoundsCylinder(false);
            var13.labelFaces = null;
            var13.labelVertices = null;
            if (this.size == 1) {
                var13.picking = true;
            }
            return var13;
        }
    }

    @OriginalMember(owner = "client!CKDEJADD", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    private final void decodeClient(boolean arg0, Packet arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            while (true) {
                while (true) {
                    int var3 = arg1.g1();
                    if (var3 == 0) {
                        return;
                    }
                    int var4;
                    int var5;
                    if (var3 == 1) {
                        var4 = arg1.g1();
                        this.models = new int[var4];
                        for (var5 = 0; var5 < var4; var5++) {
                            this.models[var5] = arg1.g2();
                        }
                    } else if (var3 == 2) {
                        this.name = arg1.gjstr();
                    } else if (var3 == 3) {
                        this.desc = arg1.gjstrraw((byte) 30);
                    } else if (var3 == 12) {
                        this.size = arg1.g1b();
                    } else if (var3 == 13) {
                        this.readyanim = arg1.g2();
                    } else if (var3 == 14) {
                        this.walkanim = arg1.g2();
                    } else if (var3 == 17) {
                        this.walkanim = arg1.g2();
                        this.walkanim_b = arg1.g2();
                        this.walkanim_r = arg1.g2();
                        this.walkanim_l = arg1.g2();
                    } else if (var3 >= 30 && var3 < 40) {
                        if (this.op == null) {
                            this.op = new String[5];
                        }
                        this.op[var3 - 30] = arg1.gjstr();
                        if (this.op[var3 - 30].equalsIgnoreCase("hidden")) {
                            this.op[var3 - 30] = null;
                        }
                    } else if (var3 == 40) {
                        var4 = arg1.g1();
                        this.recol_s = new int[var4];
                        this.recol_d = new int[var4];
                        for (var5 = 0; var5 < var4; var5++) {
                            this.recol_s[var5] = arg1.g2();
                            this.recol_d[var5] = arg1.g2();
                        }
                    } else if (var3 == 60) {
                        var4 = arg1.g1();
                        this.heads = new int[var4];
                        for (var5 = 0; var5 < var4; var5++) {
                            this.heads[var5] = arg1.g2();
                        }
                    } else if (var3 == 90) {
                        this.field75 = arg1.g2();
                    } else if (var3 == 91) {
                        this.field50 = arg1.g2();
                    } else if (var3 == 92) {
                        this.field69 = arg1.g2();
                    } else if (var3 == 93) {
                        this.minimap = false;
                    } else if (var3 == 95) {
                        this.vislevel = arg1.g2();
                    } else if (var3 == 97) {
                        this.resizeh = arg1.g2();
                    } else if (var3 == 98) {
                        this.resizev = arg1.g2();
                    } else if (var3 == 99) {
                        this.alwaysontop = true;
                    } else if (var3 == 100) {
                        this.ambient = arg1.g1b();
                    } else if (var3 == 101) {
                        this.contrast = arg1.g1b() * 5;
                    } else if (var3 == 102) {
                        this.headicon = arg1.g2();
                    } else if (var3 == 103) {
                        this.turnspeed = arg1.g2();
                    } else if (var3 == 106) {
                        this.multivarbit = arg1.g2();
                        if (this.multivarbit == 65535) {
                            this.multivarbit = -1;
                        }
                        this.mutlivarp = arg1.g2();
                        if (this.mutlivarp == 65535) {
                            this.mutlivarp = -1;
                        }
                        var4 = arg1.g1();
                        this.multinpc = new int[var4 + 1];
                        for (var5 = 0; var5 <= var4; var5++) {
                            this.multinpc[var5] = arg1.g2();
                            if (this.multinpc[var5] == 65535) {
                                this.multinpc[var5] = -1;
                            }
                        }
                    } else if (var3 == 107) {
                        this.active = false;
                    }
                }
            }
        }
    }
}
