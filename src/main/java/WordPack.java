import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RTHTIIVA")
public class WordPack {

    @OriginalMember(owner = "client!RTHTIIVA", name = "a", descriptor = "I")
    private static int _flowObfuscator1;

    @OriginalMember(owner = "client!RTHTIIVA", name = "b", descriptor = "Z")
    private static boolean _flowObfuscator2;

    @OriginalMember(owner = "client!RTHTIIVA", name = "c", descriptor = "Z")
    private static boolean _flowObfuscator3 = true;

    @OriginalMember(owner = "client!RTHTIIVA", name = "d", descriptor = "[C")
    public static char[] charBuffer = new char[100];

    @OriginalMember(owner = "client!RTHTIIVA", name = "e", descriptor = "LMBMGIXGO;")
    private static Packet buffer = new Packet(new byte[100], 891);

    @OriginalMember(owner = "client!RTHTIIVA", name = "f", descriptor = "[C")
    private static char[] TABLE = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!RTHTIIVA", name = "a", descriptor = "(IZLMBMGIXGO;)Ljava/lang/String;")
    public static String unpack(int arg0, boolean arg1, Packet arg2) {
        int var3 = 0;
        int var4 = -1;
        int var7;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var6 = arg2.g1();
            var7 = var6 >> 4 & 15;
            if (var4 == -1) {
                if (var7 < 13) {
                    charBuffer[var3++] = TABLE[var7];
                } else {
                    var4 = var7;
                }
            } else {
                charBuffer[var3++] = TABLE[(var4 << 4) + var7 - 195];
                var4 = -1;
            }
            var7 = var6 & 15;
            if (var4 == -1) {
                if (var7 < 13) {
                    charBuffer[var3++] = TABLE[var7];
                } else {
                    var4 = var7;
                }
            } else {
                charBuffer[var3++] = TABLE[(var4 << 4) + var7 - 195];
                var4 = -1;
            }
        }
        boolean var9 = true;
        for (var7 = 0; var7 < var3; var7++) {
            char var8 = charBuffer[var7];
            if (var9 && var8 >= 'a' && var8 <= 'z') {
                charBuffer[var7] = (char) (charBuffer[var7] + -32);
                var9 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var9 = true;
            }
        }
        if (!arg1) {
            _flowObfuscator1 = 466;
        }
        return new String(charBuffer, 0, var3);
    }

    @OriginalMember(owner = "client!RTHTIIVA", name = "a", descriptor = "(Ljava/lang/String;ZLMBMGIXGO;)V")
    public static void pack(String arg0, boolean arg1, Packet arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        arg0 = arg0.toLowerCase();
        int var3 = -1;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            char var5 = arg0.charAt(var4);
            int var6 = 0;
            for (int var7 = 0; var7 < TABLE.length; var7++) {
                if (var5 == TABLE[var7]) {
                    var6 = var7;
                    break;
                }
            }
            if (var6 > 12) {
                var6 += 195;
            }
            if (var3 == -1) {
                if (var6 < 13) {
                    var3 = var6;
                } else {
                    arg2.p1(var6);
                }
            } else if (var6 < 13) {
                arg2.p1((var3 << 4) + var6);
                var3 = -1;
            } else {
                arg2.p1((var3 << 4) + (var6 >> 4));
                var3 = var6 & 15;
            }
        }
        if (!arg1) {
            _flowObfuscator1 = -452;
        }
        if (var3 != -1) {
            arg2.p1(var3 << 4);
        }
    }

    @OriginalMember(owner = "client!RTHTIIVA", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String format(String arg0, int arg1) {
        buffer.pos = 0;
        pack(arg0, _flowObfuscator3, buffer);
        int var2 = buffer.pos;
        buffer.pos = 0;
        if (arg1 != 0) {
            _flowObfuscator2 = !_flowObfuscator2;
        }
        return unpack(var2, true, buffer);
    }
}
