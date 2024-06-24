import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MUDLUUBC")
public class SpotAnimType {

    @OriginalMember(owner = "client!MUDLUUBC", name = "a", descriptor = "I")
    private int _flowObfuscator1 = 9;

    @OriginalMember(owner = "client!MUDLUUBC", name = "b", descriptor = "Z")
    private static boolean _flowObfuscator2 = true;

    @OriginalMember(owner = "client!MUDLUUBC", name = "c", descriptor = "I")
    public static int count;

    @OriginalMember(owner = "client!MUDLUUBC", name = "d", descriptor = "[LMUDLUUBC;")
    public static SpotAnimType[] instances;

    @OriginalMember(owner = "client!MUDLUUBC", name = "e", descriptor = "I")
    public int type;

    @OriginalMember(owner = "client!MUDLUUBC", name = "f", descriptor = "I")
    public int model;

    @OriginalMember(owner = "client!MUDLUUBC", name = "g", descriptor = "I")
    public int anim = -1;

    @OriginalMember(owner = "client!MUDLUUBC", name = "h", descriptor = "LLKGEGIEW;")
    public SeqType seq;

    @OriginalMember(owner = "client!MUDLUUBC", name = "i", descriptor = "[I")
    public int[] recol_s = new int[6];

    @OriginalMember(owner = "client!MUDLUUBC", name = "j", descriptor = "[I")
    public int[] recol_d = new int[6];

    @OriginalMember(owner = "client!MUDLUUBC", name = "k", descriptor = "I")
    public int resizeh = 128;

    @OriginalMember(owner = "client!MUDLUUBC", name = "l", descriptor = "I")
    public int resizev = 128;

    @OriginalMember(owner = "client!MUDLUUBC", name = "m", descriptor = "I")
    public int angle;

    @OriginalMember(owner = "client!MUDLUUBC", name = "n", descriptor = "I")
    public int ambient;

    @OriginalMember(owner = "client!MUDLUUBC", name = "o", descriptor = "I")
    public int contrast;

    @OriginalMember(owner = "client!MUDLUUBC", name = "p", descriptor = "LGCPOSBWX;")
    public static LruCache modelCache = new LruCache(false, 30);

    @OriginalMember(owner = "client!MUDLUUBC", name = "a", descriptor = "(ILXTGLDHGX;)V")
    public static void unpack(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.read("spotanim.dat", (byte[]) null), 891);
        if (arg0 != 0) {
            _flowObfuscator2 = !_flowObfuscator2;
        }
        count = var2.g2();
        if (instances == null) {
            instances = new SpotAnimType[count];
        }
        for (int var3 = 0; var3 < count; var3++) {
            if (instances[var3] == null) {
                instances[var3] = new SpotAnimType();
            }
            instances[var3].type = var3;
            instances[var3].decodeClient(true, var2);
        }
    }

    @OriginalMember(owner = "client!MUDLUUBC", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    public void decodeClient(boolean arg0, Packet arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            while (true) {
                while (true) {
                    int var3 = arg1.g1();
                    if (var3 == 0) {
                        return;
                    }
                    if (var3 == 1) {
                        this.model = arg1.g2();
                    } else if (var3 == 2) {
                        this.anim = arg1.g2();
                        if (SeqType.instances != null) {
                            this.seq = SeqType.instances[this.anim];
                        }
                    } else if (var3 == 4) {
                        this.resizeh = arg1.g2();
                    } else if (var3 == 5) {
                        this.resizev = arg1.g2();
                    } else if (var3 == 6) {
                        this.angle = arg1.g2();
                    } else if (var3 == 7) {
                        this.ambient = arg1.g1();
                    } else if (var3 == 8) {
                        this.contrast = arg1.g1();
                    } else if (var3 >= 40 && var3 < 50) {
                        this.recol_s[var3 - 40] = arg1.g2();
                    } else if (var3 >= 50 && var3 < 60) {
                        this.recol_d[var3 - 50] = arg1.g2();
                    } else {
                        System.out.println("Error unrecognised spotanim config code: " + var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!MUDLUUBC", name = "a", descriptor = "()LZKARKDQW;")
    public Model getModel() {
        Model var1 = (Model) modelCache.get((long) this.type);
        if (var1 != null) {
            return var1;
        } else {
            var1 = Model.tryGet(this._flowObfuscator1, this.model);
            if (var1 == null) {
                return null;
            } else {
                for (int var2 = 0; var2 < 6; var2++) {
                    if (this.recol_s[0] != 0) {
                        var1.recolour(this.recol_s[var2], this.recol_d[var2]);
                    }
                }
                modelCache.put(var1, (long) this.type, (byte) 2);
                return var1;
            }
        }
    }
}
