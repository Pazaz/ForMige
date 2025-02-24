import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MBMGIXGO")
public class Packet extends DoublyLinkable {

    @OriginalMember(owner = "client!MBMGIXGO", name = "i", descriptor = "I")
    private int _flowObfuscator1 = 891;

    @OriginalMember(owner = "client!MBMGIXGO", name = "j", descriptor = "I")
    private int _flowObfuscator2 = 9;

    @OriginalMember(owner = "client!MBMGIXGO", name = "k", descriptor = "B")
    private byte _flowObfuscator3 = 14;

    @OriginalMember(owner = "client!MBMGIXGO", name = "l", descriptor = "I")
    private int _flowObfuscator4 = -29508;

    @OriginalMember(owner = "client!MBMGIXGO", name = "m", descriptor = "I")
    private int _flowObfuscator5 = 881;

    @OriginalMember(owner = "client!MBMGIXGO", name = "n", descriptor = "B")
    private byte _flowObfuscator6 = 8;

    @OriginalMember(owner = "client!MBMGIXGO", name = "o", descriptor = "I")
    private int _flowObfuscator7 = 657;

    @OriginalMember(owner = "client!MBMGIXGO", name = "p", descriptor = "Z")
    private boolean _flowObfuscator8 = false;

    @OriginalMember(owner = "client!MBMGIXGO", name = "q", descriptor = "I")
    private int _flowObfuscator9 = -715;

    @OriginalMember(owner = "client!MBMGIXGO", name = "r", descriptor = "B")
    private byte _flowObfuscator10 = -57;

    @OriginalMember(owner = "client!MBMGIXGO", name = "s", descriptor = "B")
    private byte _flowObfuscator11 = 108;

    @OriginalMember(owner = "client!MBMGIXGO", name = "t", descriptor = "B")
    private byte _flowObfuscator12 = 3;

    @OriginalMember(owner = "client!MBMGIXGO", name = "u", descriptor = "Z")
    private boolean _flowObfuscator13 = false;

    @OriginalMember(owner = "client!MBMGIXGO", name = "v", descriptor = "I")
    private int _flowObfuscator14 = -373;

    @OriginalMember(owner = "client!MBMGIXGO", name = "w", descriptor = "Z")
    private boolean _flowObfuscator15 = false;

    @OriginalMember(owner = "client!MBMGIXGO", name = "x", descriptor = "Z")
    private boolean _flowObfuscator16 = true;

    @OriginalMember(owner = "client!MBMGIXGO", name = "y", descriptor = "[B")
    public byte[] data;

    @OriginalMember(owner = "client!MBMGIXGO", name = "z", descriptor = "I")
    public int pos;

    @OriginalMember(owner = "client!MBMGIXGO", name = "A", descriptor = "I")
    public int bitPos;

    @OriginalMember(owner = "client!MBMGIXGO", name = "B", descriptor = "[I")
    private static int[] crctable = new int[256];

    @OriginalMember(owner = "client!MBMGIXGO", name = "C", descriptor = "[I")
    private static final int[] bitmask;

    @OriginalMember(owner = "client!MBMGIXGO", name = "D", descriptor = "LJOCFVBOI;")
    public Isaac random;

    @OriginalMember(owner = "client!MBMGIXGO", name = "E", descriptor = "I")
    private static int cacheMinCount;

    @OriginalMember(owner = "client!MBMGIXGO", name = "F", descriptor = "I")
    private static int cacheMidCount;

    @OriginalMember(owner = "client!MBMGIXGO", name = "G", descriptor = "I")
    private static int cacheMaxCount;

    @OriginalMember(owner = "client!MBMGIXGO", name = "H", descriptor = "LLHGXPZPG;")
    private static LinkList cacheMin;

    @OriginalMember(owner = "client!MBMGIXGO", name = "I", descriptor = "LLHGXPZPG;")
    private static LinkList cacheMid;

    @OriginalMember(owner = "client!MBMGIXGO", name = "J", descriptor = "LLHGXPZPG;")
    private static LinkList cacheMax;

    @OriginalMember(owner = "client!MBMGIXGO", name = "K", descriptor = "[C")
    private static char[] charset;

    @OriginalMember(owner = "client!MBMGIXGO", name = "L", descriptor = "Z")
    public static boolean _flowObfuscator17;

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(II)LMBMGIXGO;")
    public static Packet alloc(int arg0, int arg1) {
        LinkList var3 = cacheMid;
        synchronized (cacheMid) {
            Packet var5 = null;
            if (arg0 == 0 && cacheMinCount > 0) {
                cacheMinCount--;
                var5 = (Packet) cacheMin.removeHead();
            } else if (arg0 == 1 && cacheMidCount > 0) {
                cacheMidCount--;
                var5 = (Packet) cacheMid.removeHead();
            } else if (arg0 == 2 && cacheMaxCount > 0) {
                cacheMaxCount--;
                var5 = (Packet) cacheMax.removeHead();
            }
            if (var5 != null) {
                var5.pos = 0;
                return var5;
            }
        }
        if (arg1 >= 9 && arg1 <= 9) {
            Packet var2 = new Packet(false);
            var2.pos = 0;
            if (arg0 == 0) {
                var2.data = new byte[100];
            } else if (arg0 == 1) {
                var2.data = new byte[5000];
            } else {
                var2.data = new byte[30000];
            }
            return var2;
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "<init>", descriptor = "(Z)V")
    private Packet(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "<init>", descriptor = "([BI)V")
    public Packet(byte[] arg0, int arg1) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        } else {
            this.data = arg0;
            this.pos = 0;
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(BI)V")
    public void p1isaac(byte arg0, int arg1) {
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.data[this.pos++] = (byte) (arg1 + this.random.nextInt());
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(I)V")
    public void p1(int arg0) {
        this.data[this.pos++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(I)V")
    public void p2(int arg0) {
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(ZI)V")
    public void ip2(boolean arg0, int arg1) {
        this.data[this.pos++] = (byte) arg1;
        this.data[this.pos++] = (byte) (arg1 >> 8);
        if (!arg0) {
            this._flowObfuscator1 = -142;
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "(I)V")
    public void p3(int arg0) {
        this.data[this.pos++] = (byte) (arg0 >> 16);
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "(I)V")
    public void p4(int arg0) {
        this.data[this.pos++] = (byte) (arg0 >> 24);
        this.data[this.pos++] = (byte) (arg0 >> 16);
        this.data[this.pos++] = (byte) (arg0 >> 8);
        this.data[this.pos++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(II)V")
    public void ip4(int arg0, int arg1) {
        this.data[this.pos++] = (byte) arg1;
        this.data[this.pos++] = (byte) (arg1 >> 8);
        if (arg0 == 0) {
            this.data[this.pos++] = (byte) (arg1 >> 16);
            this.data[this.pos++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IJ)V")
    public void p8(int arg0, long arg1) {
        this.data[this.pos++] = (byte) ((int) (arg1 >> 56));
        this.data[this.pos++] = (byte) ((int) (arg1 >> 48));
        this.data[this.pos++] = (byte) ((int) (arg1 >> 40));
        this.data[this.pos++] = (byte) ((int) (arg1 >> 32));
        if (arg0 < 5 || arg0 > 5) {
            this._flowObfuscator14 = 409;
        }
        this.data[this.pos++] = (byte) ((int) (arg1 >> 24));
        this.data[this.pos++] = (byte) ((int) (arg1 >> 16));
        this.data[this.pos++] = (byte) ((int) (arg1 >> 8));
        this.data[this.pos++] = (byte) ((int) arg1);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void pjstr(String arg0) {
        arg0.getBytes(0, arg0.length(), this.data, this.pos);
        this.pos += arg0.length();
        this.data[this.pos++] = 10;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "([BIZI)V")
    public void pdata(byte[] arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this._flowObfuscator13 = !this._flowObfuscator13;
        }
        for (int var5 = arg3; var5 < arg3 + arg1; var5++) {
            this.data[this.pos++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IB)V")
    public void psize1(int arg0, byte arg1) {
        this.data[this.pos - arg0 - 1] = (byte) arg0;
        if (arg1 == 0) {
            boolean var3 = false;
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "()I")
    public int g1() {
        return this.data[this.pos++] & 255;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "()B")
    public byte g1b() {
        return this.data[this.pos++];
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "()I")
    public int g2() {
        this.pos += 2;
        return ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "f", descriptor = "()I")
    public int g2b() {
        this.pos += 2;
        int var1 = ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "g", descriptor = "()I")
    public int g3() {
        this.pos += 3;
        return ((this.data[this.pos - 3] & 255) << 16) + ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "h", descriptor = "()I")
    public int g4() {
        this.pos += 4;
        return ((this.data[this.pos - 4] & 255) << 24) + ((this.data[this.pos - 3] & 255) << 16) + ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "(I)J")
    public long g8(int arg0) {
        long var2 = (long) this.g4() & 4294967295L;
        if (arg0 != -35089) {
            this._flowObfuscator15 = !this._flowObfuscator15;
        }
        long var4 = (long) this.g4() & 4294967295L;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "i", descriptor = "()Ljava/lang/String;")
    public String gjstr() {
        int var1 = this.pos;
        while (this.data[this.pos++] != 10) {
        }
        return new String(this.data, var1, this.pos - var1 - 1);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(B)[B")
    public byte[] gjstrraw(byte arg0) {
        int var2 = this.pos;
        while (this.data[this.pos++] != 10) {
        }
        byte[] var3 = new byte[this.pos - var2 - 1];
        if (arg0 != 30) {
            this._flowObfuscator16 = !this._flowObfuscator16;
        }
        for (int var4 = var2; var4 < this.pos - 1; var4++) {
            var3[var4 - var2] = this.data[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IBI[B)V")
    public void gdata(int arg0, byte arg1, int arg2, byte[] arg3) {
        int var5;
        if (arg1 != 14) {
            for (var5 = 1; var5 > 0; var5++) {
            }
        }
        for (var5 = arg2; var5 < arg2 + arg0; var5++) {
            arg3[var5] = this.data[this.pos++];
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "f", descriptor = "(I)V")
    public void accessBits(int arg0) {
        this.bitPos = this.pos * 8;
        if (arg0 != this._flowObfuscator4) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "(II)I")
    public int gBit(int arg0, int arg1) {
        int var3 = this.bitPos >> 3;
        int var4 = 8 - (this.bitPos & 7);
        int var5 = 0;
        if (arg1 != 0) {
            this._flowObfuscator15 = !this._flowObfuscator15;
        }
        this.bitPos += arg0;
        while (arg0 > var4) {
            var5 += (this.data[var3++] & bitmask[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        if (arg0 == var4) {
            var5 += this.data[var3] & bitmask[var4];
        } else {
            var5 += this.data[var3] >> var4 - arg0 & bitmask[arg0];
        }
        return var5;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(Z)V")
    public void accessBytes(boolean arg0) {
        this.pos = (this.bitPos + 7) / 8;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "j", descriptor = "()I")
    public int gsmart() {
        int var1 = this.data[this.pos] & 255;
        return var1 < 128 ? this.g1() - 64 : this.g2() - 49152;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "k", descriptor = "()I")
    public int gsmarts() {
        int var1 = this.data[this.pos] & 255;
        return var1 < 128 ? this.g1() : this.g2() - 32768;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void rsaenc(BigInteger arg0, BigInteger arg1, byte arg2) {
        int var4 = this.pos;
        this.pos = 0;
        byte[] var5 = new byte[var4];
        this.gdata(var4, this._flowObfuscator3, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        if (arg2 != 0) {
            this._flowObfuscator15 = !this._flowObfuscator15;
        }
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.pos = 0;
        this.p1(var8.length);
        this.pdata(var8, var8.length, true, 0);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "(II)V")
    public void p1_alt2(int arg0, int arg1) {
        this.data[this.pos++] = (byte) (-arg0);
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "(II)V")
    public void p1_alt3(int arg0, int arg1) {
        this.data[this.pos++] = (byte) (128 - arg1);
        int var3 = 90 / arg0;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "g", descriptor = "(I)I")
    public int g1_alt1(int arg0) {
        return arg0 != 0 ? this._flowObfuscator7 : this.data[this.pos++] - 128 & 255;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(Z)I")
    public int g1_alt2(boolean arg0) {
        if (arg0) {
            this._flowObfuscator1 = 310;
        }
        return -this.data[this.pos++] & 255;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "h", descriptor = "(I)I")
    public int g1_alt3(int arg0) {
        if (arg0 != 2) {
            this._flowObfuscator16 = !this._flowObfuscator16;
        }
        return 128 - this.data[this.pos++] & 255;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(B)B")
    public byte g1b_alt2(byte arg0) {
        if (arg0 != this._flowObfuscator10) {
            throw new NullPointerException();
        } else {
            return (byte) (-this.data[this.pos++]);
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "i", descriptor = "(I)B")
    public byte g1b_alt3(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (128 - this.data[this.pos++]);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(ZI)V")
    public void p2_alt1(boolean arg0, int arg1) {
        this.data[this.pos++] = (byte) arg1;
        this.data[this.pos++] = (byte) (arg1 >> 8);
        if (!arg0) {
            this._flowObfuscator13 = !this._flowObfuscator13;
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "f", descriptor = "(II)V")
    public void p2_alt2(int arg0, int arg1) {
        this.data[this.pos++] = (byte) (arg1 >> 8);
        while (arg0 >= 0) {
            this._flowObfuscator14 = 376;
        }
        this.data[this.pos++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "g", descriptor = "(II)V")
    public void p2_alt3(int arg0, int arg1) {
        this.data[this.pos++] = (byte) (arg1 + 128);
        if (arg0 != 0) {
            this._flowObfuscator14 = -238;
        }
        this.data[this.pos++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "(B)I")
    public int g2_alt1(byte arg0) {
        this.pos += 2;
        return arg0 != this._flowObfuscator11 ? 3 : ((this.data[this.pos - 1] & 255) << 8) + (this.data[this.pos - 2] & 255);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "(Z)I")
    public int g2_alt2(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.pos += 2;
        return ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] - 128 & 255);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "(B)I")
    public int g2_alt3(byte arg0) {
        this.pos += 2;
        if (arg0 != -74) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.data[this.pos - 1] & 255) << 8) + (this.data[this.pos - 2] - 128 & 255);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "j", descriptor = "(I)I")
    public int g2b_alt1(int arg0) {
        this.pos += 2;
        if (arg0 >= 0) {
            return 2;
        } else {
            int var2 = ((this.data[this.pos - 1] & 255) << 8) + (this.data[this.pos - 2] & 255);
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "(Z)I")
    public int g2b_alt3(boolean arg0) {
        int var2;
        if (arg0) {
            for (var2 = 1; var2 > 0; var2++) {
            }
        }
        this.pos += 2;
        var2 = ((this.data[this.pos - 1] & 255) << 8) + (this.data[this.pos - 2] - 128 & 255);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "(B)I")
    public int g4_alt2(byte arg0) {
        if (arg0 != 41) {
            return 3;
        } else {
            this.pos += 4;
            return ((this.data[this.pos - 2] & 255) << 24) + ((this.data[this.pos - 1] & 255) << 16) + ((this.data[this.pos - 4] & 255) << 8) + (this.data[this.pos - 3] & 255);
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "(Z)I")
    public int g4_alt3(boolean arg0) {
        if (!arg0) {
            this._flowObfuscator8 = !this._flowObfuscator8;
        }
        this.pos += 4;
        return ((this.data[this.pos - 3] & 255) << 24) + ((this.data[this.pos - 4] & 255) << 16) + ((this.data[this.pos - 1] & 255) << 8) + (this.data[this.pos - 2] & 255);
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IB[BI)V")
    public void pdata_alt2(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 != 6) {
            this._flowObfuscator8 = !this._flowObfuscator8;
        }
        for (int var5 = arg0 + arg3 - 1; var5 >= arg0; var5--) {
            this.data[this.pos++] = (byte) (arg2[var5] + 128);
        }
    }

    @OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IIZ[B)V")
    public void gdata_alt1(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (!arg2) {
            this._flowObfuscator8 = !this._flowObfuscator8;
        }
        for (int var5 = arg1 + arg0 - 1; var5 >= arg1; var5--) {
            arg3[var5] = this.data[this.pos++];
        }
    }

    static {
        for (int var1 = 0; var1 < 256; var1++) {
            int var0 = var1;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var0 & 1) == 1) {
                    var0 = var0 >>> 1 ^ -306674912;
                } else {
                    var0 >>>= 1;
                }
            }
            crctable[var1] = var0;
        }
        bitmask = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        cacheMin = new LinkList(169);
        cacheMid = new LinkList(169);
        cacheMax = new LinkList(169);
        charset = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
