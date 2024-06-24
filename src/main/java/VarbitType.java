import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SXYSOXTR")
public class VarbitType {

    @OriginalMember(owner = "client!SXYSOXTR", name = "a", descriptor = "I")
    private static int _flowObfuscator1;

    @OriginalMember(owner = "client!SXYSOXTR", name = "b", descriptor = "I")
    public static int count;

    @OriginalMember(owner = "client!SXYSOXTR", name = "c", descriptor = "[LSXYSOXTR;")
    public static VarbitType[] instances;

    @OriginalMember(owner = "client!SXYSOXTR", name = "d", descriptor = "Ljava/lang/String;")
    public String field1434;

    @OriginalMember(owner = "client!SXYSOXTR", name = "e", descriptor = "I")
    public int basevar;

    @OriginalMember(owner = "client!SXYSOXTR", name = "f", descriptor = "I")
    public int startbit;

    @OriginalMember(owner = "client!SXYSOXTR", name = "g", descriptor = "I")
    public int endbit;

    @OriginalMember(owner = "client!SXYSOXTR", name = "h", descriptor = "Z")
    public boolean field1438 = false;

    @OriginalMember(owner = "client!SXYSOXTR", name = "i", descriptor = "I")
    public int field1439 = -1;

    @OriginalMember(owner = "client!SXYSOXTR", name = "j", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!SXYSOXTR", name = "a", descriptor = "(ILXTGLDHGX;)V")
    public static void unpack(int arg0, Jagfile arg1) {
        if (arg0 != 0) {
            _flowObfuscator1 = 91;
        }
        Packet var2 = new Packet(arg1.read("varbit.dat", (byte[]) null), 891);
        count = var2.g2();
        if (instances == null) {
            instances = new VarbitType[count];
        }
        for (int var3 = 0; var3 < count; var3++) {
            if (instances[var3] == null) {
                instances[var3] = new VarbitType();
            }
            instances[var3].decodeClient(var2, false, var3);
            if (instances[var3].field1438) {
                VarpType.instances[instances[var3].basevar].field1500 = true;
            }
        }
        if (var2.pos != var2.data.length) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!SXYSOXTR", name = "a", descriptor = "(LMBMGIXGO;ZI)V")
    public void decodeClient(Packet arg0, boolean arg1, int arg2) {
        if (!arg1) {
            while (true) {
                int var4 = arg0.g1();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.basevar = arg0.g2();
                    this.startbit = arg0.g1();
                    this.endbit = arg0.g1();
                } else if (var4 == 10) {
                    this.field1434 = arg0.gjstr();
                } else if (var4 == 2) {
                    this.field1438 = true;
                } else if (var4 == 3) {
                    this.field1439 = arg0.g4();
                } else if (var4 == 4) {
                    this.field1440 = arg0.g4();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }
}
