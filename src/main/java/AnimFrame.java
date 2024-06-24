import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SQHJOGRT")
public class AnimFrame {

    @OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "I")
    private static int _flowObfuscator1 = -715;

    @OriginalMember(owner = "client!SQHJOGRT", name = "b", descriptor = "[LSQHJOGRT;")
    private static AnimFrame[] instances;

    @OriginalMember(owner = "client!SQHJOGRT", name = "c", descriptor = "I")
    public int id;

    @OriginalMember(owner = "client!SQHJOGRT", name = "d", descriptor = "LKVCQPLIW;")
    public AnimBase base;

    @OriginalMember(owner = "client!SQHJOGRT", name = "e", descriptor = "I")
    public int length;

    @OriginalMember(owner = "client!SQHJOGRT", name = "f", descriptor = "[I")
    public int[] groups;

    @OriginalMember(owner = "client!SQHJOGRT", name = "g", descriptor = "[I")
    public int[] x;

    @OriginalMember(owner = "client!SQHJOGRT", name = "h", descriptor = "[I")
    public int[] y;

    @OriginalMember(owner = "client!SQHJOGRT", name = "i", descriptor = "[I")
    public int[] z;

    @OriginalMember(owner = "client!SQHJOGRT", name = "j", descriptor = "[Z")
    private static boolean[] hasAlpha;

    @OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "(I)V")
    public static void init(int arg0) {
        instances = new AnimFrame[arg0 + 1];
        hasAlpha = new boolean[arg0 + 1];
        for (int var1 = 0; var1 < arg0 + 1; var1++) {
            hasAlpha[var1] = true;
        }
    }

    @OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "([BZ)V")
    public static void unpack(byte[] arg0, boolean arg1) {
        Packet var2 = new Packet(arg0, 891);
        var2.pos = arg0.length - 8;
        int var3 = var2.g2();
        int var4 = var2.g2();
        int var5 = var2.g2();
        int var6 = var2.g2();
        byte var7 = 0;
        Packet var8 = new Packet(arg0, 891);
        var8.pos = var7;
        int var28 = var7 + var3 + 2;
        Packet var9 = new Packet(arg0, 891);
        var9.pos = var28;
        int var29 = var28 + var4;
        Packet var10 = new Packet(arg0, 891);
        var10.pos = var29;
        int var30 = var29 + var5;
        Packet var11 = new Packet(arg0, 891);
        var11.pos = var30;
        int var31 = var30 + var6;
        Packet var12 = new Packet(arg0, 891);
        var12.pos = var31;
        if (arg1) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        AnimBase var32 = new AnimBase(0, var12);
        int var14 = var8.g2();
        int[] var15 = new int[500];
        int[] var16 = new int[500];
        int[] var17 = new int[500];
        int[] var18 = new int[500];
        for (int var19 = 0; var19 < var14; var19++) {
            int var20 = var8.g2();
            AnimFrame var21 = instances[var20] = new AnimFrame();
            var21.id = var11.g1();
            var21.base = var32;
            int var22 = var8.g1();
            int var23 = -1;
            int var24 = 0;
            int var26;
            for (int var25 = 0; var25 < var22; var25++) {
                var26 = var9.g1();
                if (var26 > 0) {
                    if (var32.types[var25] != 0) {
                        for (int var27 = var25 - 1; var27 > var23; var27--) {
                            if (var32.types[var27] == 0) {
                                var15[var24] = var27;
                                var16[var24] = 0;
                                var17[var24] = 0;
                                var18[var24] = 0;
                                var24++;
                                break;
                            }
                        }
                    }
                    var15[var24] = var25;
                    short var33 = 0;
                    if (var32.types[var25] == 3) {
                        var33 = 128;
                    }
                    if ((var26 & 1) != 0) {
                        var16[var24] = var10.gsmart();
                    } else {
                        var16[var24] = var33;
                    }
                    if ((var26 & 2) != 0) {
                        var17[var24] = var10.gsmart();
                    } else {
                        var17[var24] = var33;
                    }
                    if ((var26 & 4) != 0) {
                        var18[var24] = var10.gsmart();
                    } else {
                        var18[var24] = var33;
                    }
                    var23 = var25;
                    var24++;
                    if (var32.types[var25] == 5) {
                        hasAlpha[var20] = false;
                    }
                }
            }
            var21.length = var24;
            var21.groups = new int[var24];
            var21.x = new int[var24];
            var21.y = new int[var24];
            var21.z = new int[var24];
            for (var26 = 0; var26 < var24; var26++) {
                var21.groups[var26] = var15[var26];
                var21.x[var26] = var16[var26];
                var21.y[var26] = var17[var26];
                var21.z[var26] = var18[var26];
            }
        }
    }

    @OriginalMember(owner = "client!SQHJOGRT", name = "b", descriptor = "(I)V")
    public static void unload(int arg0) {
        while (arg0 >= 0) {
            _flowObfuscator1 = 90;
        }
        instances = null;
    }

    @OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "(II)LSQHJOGRT;")
    public static AnimFrame get(int arg0, int arg1) {
        if (arg0 != 9) {
            throw new NullPointerException();
        } else {
            return instances == null ? null : instances[arg1];
        }
    }

    @OriginalMember(owner = "client!SQHJOGRT", name = "a", descriptor = "(IZ)Z")
    public static boolean isNull(int arg0, boolean arg1) {
        if (arg1) {
            _flowObfuscator1 = -79;
        }
        return arg0 == -1;
    }
}
