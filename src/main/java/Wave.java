import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JHDAGNBV")
public class Wave {

    @OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "client!JHDAGNBV", name = "b", descriptor = "Z")
    private static boolean _flowObfuscator2;

    @OriginalMember(owner = "client!JHDAGNBV", name = "c", descriptor = "Z")
    private static boolean _flowObfuscator3 = true;

    @OriginalMember(owner = "client!JHDAGNBV", name = "d", descriptor = "I")
    private int _flowObfuscator4;

    @OriginalMember(owner = "client!JHDAGNBV", name = "e", descriptor = "[LJHDAGNBV;")
    private static Wave[] tracks = new Wave[5000];

    @OriginalMember(owner = "client!JHDAGNBV", name = "f", descriptor = "[I")
    public static int[] delays = new int[5000];

    @OriginalMember(owner = "client!JHDAGNBV", name = "g", descriptor = "[B")
    private static byte[] waveBytes;

    @OriginalMember(owner = "client!JHDAGNBV", name = "h", descriptor = "LMBMGIXGO;")
    private static Packet waveBuffer;

    @OriginalMember(owner = "client!JHDAGNBV", name = "i", descriptor = "[LCLRWXPOI;")
    private SoundTone[] tones = new SoundTone[10];

    @OriginalMember(owner = "client!JHDAGNBV", name = "j", descriptor = "I")
    private int loopBegin;

    @OriginalMember(owner = "client!JHDAGNBV", name = "k", descriptor = "I")
    private int loopEnd;

    @OriginalMember(owner = "client!JHDAGNBV", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this._flowObfuscator4 = 477;
        }
    }

    @OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(ILMBMGIXGO;)V")
    public static final void unpack(int arg0, Packet arg1) {
        waveBytes = new byte[441000];
        waveBuffer = new Packet(waveBytes, 891);
        if (arg0 != 0) {
            _flowObfuscator2 = !_flowObfuscator2;
        }
        SoundTone.init();
        while (true) {
            int var2 = arg1.g2();
            if (var2 == 65535) {
                return;
            }
            tracks[var2] = new Wave(8);
            tracks[var2].read(true, arg1);
            delays[var2] = tracks[var2].trim(0);
        }
    }

    @OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(IIZ)LMBMGIXGO;")
    public static final Packet generate(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            _flowObfuscator3 = !_flowObfuscator3;
        }
        if (tracks[arg1] != null) {
            Wave var3 = tracks[arg1];
            return var3.getWave(arg0, 6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    private final void read(boolean arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.g1();
            if (var4 != 0) {
                arg1.pos--;
                this.tones[var3] = new SoundTone();
                this.tones[var3].read(true, arg1);
            }
        }
        if (!arg0) {
            this._flowObfuscator4 = 58;
        }
        this.loopBegin = arg1.g2();
        this.loopEnd = arg1.g2();
    }

    @OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(I)I")
    private final int trim(int arg0) {
        int var2 = 9999999;
        if (arg0 != 0) {
            this._flowObfuscator4 = -52;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.tones[var3] != null && this.tones[var3].start / 20 < var2) {
                var2 = this.tones[var3].start / 20;
            }
        }
        if (this.loopBegin < this.loopEnd && this.loopBegin / 20 < var2) {
            var2 = this.loopBegin / 20;
        }
        if (var2 != 9999999 && var2 != 0) {
            for (int var4 = 0; var4 < 10; var4++) {
                if (this.tones[var4] != null) {
                    this.tones[var4].start -= var2 * 20;
                }
            }
            if (this.loopBegin < this.loopEnd) {
                this.loopBegin -= var2 * 20;
                this.loopEnd -= var2 * 20;
            }
            return var2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(II)LMBMGIXGO;")
    private final Packet getWave(int arg0, int arg1) {
        int var3 = this.generate(arg0);
        waveBuffer.pos = 0;
        waveBuffer.p4(1380533830);
        waveBuffer.ip4(0, 36 + var3);
        waveBuffer.p4(1463899717);
        waveBuffer.p4(1718449184);
        waveBuffer.ip4(0, 16);
        waveBuffer.ip2(true, 1);
        if (arg1 < 6 || arg1 > 6) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        waveBuffer.ip2(true, 1);
        waveBuffer.ip4(0, 22050);
        waveBuffer.ip4(0, 22050);
        waveBuffer.ip2(true, 1);
        waveBuffer.ip2(true, 8);
        waveBuffer.p4(1684108385);
        waveBuffer.ip4(0, var3);
        waveBuffer.pos += var3;
        return waveBuffer;
    }

    @OriginalMember(owner = "client!JHDAGNBV", name = "b", descriptor = "(I)I")
    private final int generate(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.tones[var3] != null && this.tones[var3].length + this.tones[var3].start > var2) {
                var2 = this.tones[var3].length + this.tones[var3].start;
            }
        }
        if (var2 == 0) {
            return 0;
        } else {
            int var4 = 22050 * var2 / 1000;
            int var5 = 22050 * this.loopBegin / 1000;
            int var6 = 22050 * this.loopEnd / 1000;
            if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
                arg0 = 0;
            }
            int var7 = var4 + (var6 - var5) * (arg0 - 1);
            for (int var8 = 44; var8 < var7 + 44; var8++) {
                waveBytes[var8] = -128;
            }
            int var10;
            int var11;
            int var13;
            for (int var9 = 0; var9 < 10; var9++) {
                if (this.tones[var9] != null) {
                    var10 = this.tones[var9].length * 22050 / 1000;
                    var11 = this.tones[var9].start * 22050 / 1000;
                    int[] var12 = this.tones[var9].generate(var10, this.tones[var9].length);
                    for (var13 = 0; var13 < var10; var13++) {
                        waveBytes[var13 + var11 + 44] += (byte) (var12[var13] >> 8);
                    }
                }
            }
            if (arg0 > 1) {
                var5 += 44;
                var6 += 44;
                var4 += 44;
                var7 += 44;
                var10 = var7 - var4;
                for (var11 = var4 - 1; var11 >= var6; var11--) {
                    waveBytes[var11 + var10] = waveBytes[var11];
                }
                for (int var14 = 1; var14 < arg0; var14++) {
                    var10 = (var6 - var5) * var14;
                    for (var13 = var5; var13 < var6; var13++) {
                        waveBytes[var13 + var10] = waveBytes[var13];
                    }
                }
                var7 -= 44;
            }
            return var7;
        }
    }
}
