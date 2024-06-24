import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MNHKFPQO")
public class FloType {

    @OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "client!MNHKFPQO", name = "b", descriptor = "I")
    private static int _flowObfuscator2;

    @OriginalMember(owner = "client!MNHKFPQO", name = "c", descriptor = "I")
    public static int count;

    @OriginalMember(owner = "client!MNHKFPQO", name = "d", descriptor = "[LMNHKFPQO;")
    public static FloType[] instances;

    @OriginalMember(owner = "client!MNHKFPQO", name = "e", descriptor = "Ljava/lang/String;")
    public String debugname;

    @OriginalMember(owner = "client!MNHKFPQO", name = "f", descriptor = "I")
    public int rgb;

    @OriginalMember(owner = "client!MNHKFPQO", name = "g", descriptor = "I")
    public int texture = -1;

    @OriginalMember(owner = "client!MNHKFPQO", name = "h", descriptor = "Z")
    public boolean overlay = false;

    @OriginalMember(owner = "client!MNHKFPQO", name = "i", descriptor = "Z")
    public boolean occlude = true;

    @OriginalMember(owner = "client!MNHKFPQO", name = "j", descriptor = "I")
    public int hue;

    @OriginalMember(owner = "client!MNHKFPQO", name = "k", descriptor = "I")
    public int saturation;

    @OriginalMember(owner = "client!MNHKFPQO", name = "l", descriptor = "I")
    public int lightness;

    @OriginalMember(owner = "client!MNHKFPQO", name = "m", descriptor = "I")
    public int chroma;

    @OriginalMember(owner = "client!MNHKFPQO", name = "n", descriptor = "I")
    public int luminance;

    @OriginalMember(owner = "client!MNHKFPQO", name = "o", descriptor = "I")
    public int hsl;

    @OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "(ILXTGLDHGX;)V")
    public static void unpack(int arg0, Jagfile arg1) {
        if (arg0 != 0) {
            _flowObfuscator2 = 115;
        }
        Packet var2 = new Packet(arg1.read("flo.dat", (byte[]) null), 891);
        count = var2.g2();
        if (instances == null) {
            instances = new FloType[count];
        }
        for (int var3 = 0; var3 < count; var3++) {
            if (instances[var3] == null) {
                instances[var3] = new FloType();
            }
            instances[var3].decodeClient(true, var2);
        }
    }

    @OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    public void decodeClient(boolean arg0, Packet arg1) {
        if (!arg0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        while (true) {
            int var3 = arg1.g1();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.rgb = arg1.g3();
                this.setColour(this.rgb, 9);
            } else if (var3 == 2) {
                this.texture = arg1.g1();
            } else if (var3 == 3) {
                this.overlay = true;
            } else if (var3 == 5) {
                this.occlude = false;
            } else if (var3 == 6) {
                this.debugname = arg1.gjstr();
            } else if (var3 == 7) {
                int var4 = this.hue;
                int var5 = this.saturation;
                int var6 = this.lightness;
                int var7 = this.chroma;
                int var8 = arg1.g3();
                this.setColour(var8, 9);
                this.hue = var4;
                this.saturation = var5;
                this.lightness = var6;
                this.chroma = var7;
                this.luminance = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "(II)V")
    private void setColour(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 255) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 255) / 256.0D;
        double var7 = (double) (arg0 & 255) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var11 + var9);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = 2.0D + (var7 - var3) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = 4.0D + (var3 - var5) / (var11 - var9);
            }
        }
        var13 /= 6.0D;
        this.hue = (int) (var13 * 256.0D);
        this.saturation = (int) (var15 * 256.0D);
        this.lightness = (int) (var17 * 256.0D);
        if (this.saturation < 0) {
            this.saturation = 0;
        } else if (this.saturation > 255) {
            this.saturation = 255;
        }
        if (this.lightness < 0) {
            this.lightness = 0;
        } else if (this.lightness > 255) {
            this.lightness = 255;
        }
        if (var17 > 0.5D) {
            this.luminance = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.luminance = (int) (var17 * var15 * 512.0D);
        }
        if (this.luminance < 1) {
            this.luminance = 1;
        }
        this.chroma = (int) (var13 * (double) this.luminance);
        int var19 = this.hue + (int) (Math.random() * 16.0D) - 8;
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        int var20 = this.saturation + (int) (Math.random() * 48.0D) - 24;
        if (arg1 >= 9 && arg1 <= 9) {
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            int var21 = this.lightness + (int) (Math.random() * 48.0D) - 24;
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > 255) {
                var21 = 255;
            }
            this.hsl = this.hsl24to16(var19, var20, var21);
        }
    }

    @OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "(III)I")
    private final int hsl24to16(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
    }
}
