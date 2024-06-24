import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XTGLDHGX")
public class Jagfile {

    @OriginalMember(owner = "client!XTGLDHGX", name = "a", descriptor = "B")
    private byte _flowObfuscator1 = 0;

    @OriginalMember(owner = "client!XTGLDHGX", name = "b", descriptor = "I")
    private int _flowObfuscator2 = 9;

    @OriginalMember(owner = "client!XTGLDHGX", name = "c", descriptor = "I")
    private int _flowObfuscator3 = -29508;

    @OriginalMember(owner = "client!XTGLDHGX", name = "d", descriptor = "[B")
    public byte[] data;

    @OriginalMember(owner = "client!XTGLDHGX", name = "e", descriptor = "I")
    public int fileCount;

    @OriginalMember(owner = "client!XTGLDHGX", name = "f", descriptor = "[I")
    public int[] fileHash;

    @OriginalMember(owner = "client!XTGLDHGX", name = "g", descriptor = "[I")
    public int[] fileUnpackedSize;

    @OriginalMember(owner = "client!XTGLDHGX", name = "h", descriptor = "[I")
    public int[] filePackedSize;

    @OriginalMember(owner = "client!XTGLDHGX", name = "i", descriptor = "[I")
    public int[] fileOffset;

    @OriginalMember(owner = "client!XTGLDHGX", name = "j", descriptor = "Z")
    private boolean unpacked;

    @OriginalMember(owner = "client!XTGLDHGX", name = "<init>", descriptor = "(I[B)V")
    public Jagfile(int arg0, byte[] arg1) {
        if (arg0 != 44820) {
            throw new NullPointerException();
        } else {
            this.unpack(arg1, this._flowObfuscator1);
        }
    }

    @OriginalMember(owner = "client!XTGLDHGX", name = "a", descriptor = "([BB)V")
    private void unpack(byte[] arg0, byte arg1) {
        Packet var3 = new Packet(arg0, 891);
        int var4 = var3.g3();
        int var5 = var3.g3();
        if (var5 != var4) {
            byte[] var6 = new byte[var4];
            BZip2.read(var6, var4, arg0, var5, 6);
            this.data = var6;
            var3 = new Packet(this.data, 891);
            this.unpacked = true;
        } else {
            this.data = arg0;
            this.unpacked = false;
        }
        this.fileCount = var3.g2();
        if (arg1 == 0) {
            this.fileHash = new int[this.fileCount];
            this.fileUnpackedSize = new int[this.fileCount];
            this.filePackedSize = new int[this.fileCount];
            this.fileOffset = new int[this.fileCount];
            int var8 = var3.pos + this.fileCount * 10;
            for (int var7 = 0; var7 < this.fileCount; var7++) {
                this.fileHash[var7] = var3.g4();
                this.fileUnpackedSize[var7] = var3.g3();
                this.filePackedSize[var7] = var3.g3();
                this.fileOffset[var7] = var8;
                var8 += this.filePackedSize[var7];
            }
        }
    }

    @OriginalMember(owner = "client!XTGLDHGX", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] read(String arg0, byte[] arg1) {
        int var3 = 0;
        String var7 = arg0.toUpperCase();
        for (int var4 = 0; var4 < var7.length(); var4++) {
            var3 = var3 * 61 + var7.charAt(var4) - 32;
        }
        for (int var5 = 0; var5 < this.fileCount; var5++) {
            if (this.fileHash[var5] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.fileUnpackedSize[var5]];
                }
                if (!this.unpacked) {
                    BZip2.read(arg1, this.fileUnpackedSize[var5], this.data, this.filePackedSize[var5], this.fileOffset[var5]);
                } else {
                    for (int var6 = 0; var6 < this.fileUnpackedSize[var5]; var6++) {
                        arg1[var6] = this.data[this.fileOffset[var5] + var6];
                    }
                }
                return arg1;
            }
        }
        return null;
    }
}
