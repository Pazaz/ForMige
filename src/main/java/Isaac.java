import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JOCFVBOI")
public class Isaac {

    @OriginalMember(owner = "client!JOCFVBOI", name = "a", descriptor = "I")
    private int _flowObfuscator1 = -436;

    @OriginalMember(owner = "client!JOCFVBOI", name = "b", descriptor = "I")
    private int _flowObfuscator2 = -431;

    @OriginalMember(owner = "client!JOCFVBOI", name = "c", descriptor = "I")
    private int count;

    @OriginalMember(owner = "client!JOCFVBOI", name = "d", descriptor = "[I")
    private int[] rsl = new int[256];

    @OriginalMember(owner = "client!JOCFVBOI", name = "e", descriptor = "[I")
    private int[] mem = new int[256];

    @OriginalMember(owner = "client!JOCFVBOI", name = "f", descriptor = "I")
    private int a;

    @OriginalMember(owner = "client!JOCFVBOI", name = "g", descriptor = "I")
    private int b;

    @OriginalMember(owner = "client!JOCFVBOI", name = "h", descriptor = "I")
    private int c;

    @OriginalMember(owner = "client!JOCFVBOI", name = "<init>", descriptor = "(I[I)V")
    public Isaac(int arg0, int[] arg1) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            this.rsl[var3] = arg1[var3];
        }
        if (arg0 >= 0) {
            this._flowObfuscator2 = -242;
        }
        this.init();
    }

    @OriginalMember(owner = "client!JOCFVBOI", name = "a", descriptor = "()I")
    public final int nextInt() {
        if (this.count-- == 0) {
            this.isaac();
            this.count = 255;
        }
        return this.rsl[this.count];
    }

    @OriginalMember(owner = "client!JOCFVBOI", name = "b", descriptor = "()V")
    private final void isaac() {
        this.b += ++this.c;
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = this.mem[var1];
            if ((var1 & 3) == 0) {
                this.a ^= this.a << 13;
            } else if ((var1 & 3) == 1) {
                this.a ^= this.a >>> 6;
            } else if ((var1 & 3) == 2) {
                this.a ^= this.a << 2;
            } else if ((var1 & 3) == 3) {
                this.a ^= this.a >>> 16;
            }
            this.a += this.mem[var1 + 128 & 255];
            int var3;
            this.mem[var1] = var3 = this.mem[(var2 & 1020) >> 2] + this.a + this.b;
            this.rsl[var1] = this.b = this.mem[(var3 >> 8 & 1020) >> 2] + var2;
        }
    }

    @OriginalMember(owner = "client!JOCFVBOI", name = "c", descriptor = "()V")
    private final void init() {
        int var9 = -1640531527;
        int var8 = -1640531527;
        int var7 = -1640531527;
        int var6 = -1640531527;
        int var5 = -1640531527;
        int var4 = -1640531527;
        int var3 = -1640531527;
        int var2 = -1640531527;
        int var1;
        for (var1 = 0; var1 < 4; var1++) {
            var2 ^= var3 << 11;
            var5 += var2;
            var3 += var4;
            var3 ^= var4 >>> 2;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 << 8;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 >>> 16;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 << 10;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 >>> 4;
            var2 += var7;
            var8 += var9;
            var8 ^= var9 << 8;
            var3 += var8;
            var9 += var2;
            var9 ^= var2 >>> 9;
            var4 += var9;
            var2 += var3;
        }
        for (var1 = 0; var1 < 256; var1 += 8) {
            var2 += this.rsl[var1];
            var3 += this.rsl[var1 + 1];
            var4 += this.rsl[var1 + 2];
            var5 += this.rsl[var1 + 3];
            var6 += this.rsl[var1 + 4];
            var7 += this.rsl[var1 + 5];
            var8 += this.rsl[var1 + 6];
            var9 += this.rsl[var1 + 7];
            var2 ^= var3 << 11;
            var5 += var2;
            var3 += var4;
            var3 ^= var4 >>> 2;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 << 8;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 >>> 16;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 << 10;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 >>> 4;
            var2 += var7;
            var8 += var9;
            var8 ^= var9 << 8;
            var3 += var8;
            var9 += var2;
            var9 ^= var2 >>> 9;
            var4 += var9;
            var2 += var3;
            this.mem[var1] = var2;
            this.mem[var1 + 1] = var3;
            this.mem[var1 + 2] = var4;
            this.mem[var1 + 3] = var5;
            this.mem[var1 + 4] = var6;
            this.mem[var1 + 5] = var7;
            this.mem[var1 + 6] = var8;
            this.mem[var1 + 7] = var9;
        }
        for (var1 = 0; var1 < 256; var1 += 8) {
            var2 += this.mem[var1];
            var3 += this.mem[var1 + 1];
            var4 += this.mem[var1 + 2];
            var5 += this.mem[var1 + 3];
            var6 += this.mem[var1 + 4];
            var7 += this.mem[var1 + 5];
            var8 += this.mem[var1 + 6];
            var9 += this.mem[var1 + 7];
            var2 ^= var3 << 11;
            var5 += var2;
            var3 += var4;
            var3 ^= var4 >>> 2;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 << 8;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 >>> 16;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 << 10;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 >>> 4;
            var2 += var7;
            var8 += var9;
            var8 ^= var9 << 8;
            var3 += var8;
            var9 += var2;
            var9 ^= var2 >>> 9;
            var4 += var9;
            var2 += var3;
            this.mem[var1] = var2;
            this.mem[var1 + 1] = var3;
            this.mem[var1 + 2] = var4;
            this.mem[var1 + 3] = var5;
            this.mem[var1 + 4] = var6;
            this.mem[var1 + 5] = var7;
            this.mem[var1 + 6] = var8;
            this.mem[var1 + 7] = var9;
        }
        this.isaac();
        this.count = 256;
    }
}
