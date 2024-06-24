import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DSMJIEPN")
public class Pix8 extends Draw2D {

    @OriginalMember(owner = "client!DSMJIEPN", name = "x", descriptor = "I")
    private int _flowObfuscator9;

    @OriginalMember(owner = "client!DSMJIEPN", name = "y", descriptor = "Z")
    private boolean _flowObfuscator10 = false;

    @OriginalMember(owner = "client!DSMJIEPN", name = "z", descriptor = "I")
    private int _flowObfuscator11 = 360;

    @OriginalMember(owner = "client!DSMJIEPN", name = "A", descriptor = "B")
    private byte _flowObfuscator12 = 3;

    @OriginalMember(owner = "client!DSMJIEPN", name = "B", descriptor = "[B")
    public byte[] pixels;

    @OriginalMember(owner = "client!DSMJIEPN", name = "C", descriptor = "[I")
    public int[] palette;

    @OriginalMember(owner = "client!DSMJIEPN", name = "D", descriptor = "I")
    public int cropRight;

    @OriginalMember(owner = "client!DSMJIEPN", name = "E", descriptor = "I")
    public int cropBottom;

    @OriginalMember(owner = "client!DSMJIEPN", name = "F", descriptor = "I")
    public int cropLeft;

    @OriginalMember(owner = "client!DSMJIEPN", name = "G", descriptor = "I")
    public int cropTop;

    @OriginalMember(owner = "client!DSMJIEPN", name = "H", descriptor = "I")
    public int width;

    @OriginalMember(owner = "client!DSMJIEPN", name = "I", descriptor = "I")
    public int height;

    @OriginalMember(owner = "client!DSMJIEPN", name = "<init>", descriptor = "(LXTGLDHGX;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.read(arg1 + ".dat", (byte[]) null), 891);
        Packet var5 = new Packet(arg0.read("index.dat", (byte[]) null), 891);
        var5.pos = var4.g2();
        this.width = var5.g2();
        this.height = var5.g2();
        int var6 = var5.g1();
        this.palette = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.palette[var7 + 1] = var5.g3();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.pos += 2;
            var4.pos += var5.g2() * var5.g2();
            var5.pos++;
        }
        this.cropLeft = var5.g1();
        this.cropTop = var5.g1();
        this.cropRight = var5.g2();
        this.cropBottom = var5.g2();
        int var9 = var5.g1();
        int var10 = this.cropRight * this.cropBottom;
        this.pixels = new byte[var10];
        int var11;
        if (var9 == 0) {
            for (var11 = 0; var11 < var10; var11++) {
                this.pixels[var11] = var4.g1b();
            }
        } else {
            if (var9 == 1) {
                for (var11 = 0; var11 < this.cropRight; var11++) {
                    for (int var12 = 0; var12 < this.cropBottom; var12++) {
                        this.pixels[var11 + var12 * this.cropRight] = var4.g1b();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!DSMJIEPN", name = "b", descriptor = "(Z)V")
    public void shrink(boolean arg0) {
        this.width /= 2;
        this.height /= 2;
        byte[] var2 = new byte[this.width * this.height];
        int var3 = 0;
        for (int var4 = 0; var4 < this.cropBottom; var4++) {
            for (int var5 = 0; var5 < this.cropRight; var5++) {
                var2[(var5 + this.cropLeft >> 1) + (var4 + this.cropTop >> 1) * this.width] = this.pixels[var3++];
            }
        }
        this.pixels = var2;
        this.cropRight = this.width;
        this.cropBottom = this.height;
        this.cropLeft = 0;
        if (!arg0) {
            this.cropTop = 0;
        }
    }

    @OriginalMember(owner = "client!DSMJIEPN", name = "c", descriptor = "(Z)V")
    public void crop(boolean arg0) {
        if (this.cropRight != this.width || this.cropBottom != this.height) {
            byte[] var2 = new byte[this.width * this.height];
            if (!arg0) {
                int var3 = 0;
                for (int var4 = 0; var4 < this.cropBottom; var4++) {
                    for (int var5 = 0; var5 < this.cropRight; var5++) {
                        var2[var5 + this.cropLeft + (var4 + this.cropTop) * this.width] = this.pixels[var3++];
                    }
                }
                this.pixels = var2;
                this.cropRight = this.width;
                this.cropBottom = this.height;
                this.cropLeft = 0;
                this.cropTop = 0;
            }
        }
    }

    @OriginalMember(owner = "client!DSMJIEPN", name = "b", descriptor = "(I)V")
    public void flipHorizontally(int arg0) {
        if (arg0 == 0) {
            byte[] var2 = new byte[this.cropRight * this.cropBottom];
            int var3 = 0;
            for (int var4 = 0; var4 < this.cropBottom; var4++) {
                for (int var5 = this.cropRight - 1; var5 >= 0; var5--) {
                    var2[var3++] = this.pixels[var5 + var4 * this.cropRight];
                }
            }
            this.pixels = var2;
            this.cropLeft = this.width - this.cropRight - this.cropLeft;
        }
    }

    @OriginalMember(owner = "client!DSMJIEPN", name = "d", descriptor = "(Z)V")
    public void flipVertically(boolean arg0) {
        byte[] var2 = new byte[this.cropRight * this.cropBottom];
        int var3 = 0;
        for (int var4 = this.cropBottom - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.cropRight; var5++) {
                var2[var3++] = this.pixels[var5 + var4 * this.cropRight];
            }
        }
        this.pixels = var2;
        if (!arg0) {
            this._flowObfuscator9 = -48;
        }
        this.cropTop = this.height - this.cropBottom - this.cropTop;
    }

    @OriginalMember(owner = "client!DSMJIEPN", name = "a", descriptor = "(IIII)V")
    public void translate(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.palette.length; var5++) {
            int var6 = this.palette[var5] >> 16 & 255;
            var6 += arg0;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.palette[var5] >> 8 & 255;
            var7 += arg1;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.palette[var5] & 255;
            var8 += arg2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            this.palette[var5] = (var6 << 16) + (var7 << 8) + var8;
        }
        if (arg3 != 0) {
            this._flowObfuscator9 = 69;
        }
    }

    @OriginalMember(owner = "client!DSMJIEPN", name = "a", descriptor = "(III)V")
    public void draw(int arg0, int arg1, int arg2) {
        arg0 += this.cropLeft;
        arg2 += this.cropTop;
        int var4 = arg0 + arg2 * Draw2D.width2d;
        int var5 = 0;
        if (arg1 == 16083) {
            int var6 = this.cropBottom;
            int var7 = this.cropRight;
            int var8 = Draw2D.width2d - var7;
            int var9 = 0;
            int var10;
            if (arg2 < Draw2D.top) {
                var10 = Draw2D.top - arg2;
                var6 -= var10;
                arg2 = Draw2D.top;
                var5 += var10 * var7;
                var4 += var10 * Draw2D.width2d;
            }
            if (arg2 + var6 > Draw2D.bottom) {
                var6 -= arg2 + var6 - Draw2D.bottom;
            }
            if (arg0 < Draw2D.left) {
                var10 = Draw2D.left - arg0;
                var7 -= var10;
                arg0 = Draw2D.left;
                var5 += var10;
                var4 += var10;
                var9 += var10;
                var8 += var10;
            }
            if (arg0 + var7 > Draw2D.right) {
                var10 = arg0 + var7 - Draw2D.right;
                var7 -= var10;
                var9 += var10;
                var8 += var10;
            }
            if (var7 > 0 && var6 > 0) {
                this.copyPixels(var6, (byte) 9, Draw2D.data, this.pixels, var8, var4, var7, var5, this.palette, var9);
            }
        }
    }

    @OriginalMember(owner = "client!DSMJIEPN", name = "a", descriptor = "(IB[I[BIIII[II)V")
    private void copyPixels(int arg0, byte arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        if (arg1 != 9) {
            this._flowObfuscator10 = !this._flowObfuscator10;
        }
        int var11 = -(arg6 >> 2);
        int var16 = -(arg6 & 3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                byte var14 = arg3[arg7++];
                if (var14 != 0) {
                    arg2[arg5++] = arg8[var14 & 255];
                } else {
                    arg5++;
                }
                var14 = arg3[arg7++];
                if (var14 != 0) {
                    arg2[arg5++] = arg8[var14 & 255];
                } else {
                    arg5++;
                }
                var14 = arg3[arg7++];
                if (var14 != 0) {
                    arg2[arg5++] = arg8[var14 & 255];
                } else {
                    arg5++;
                }
                var14 = arg3[arg7++];
                if (var14 != 0) {
                    arg2[arg5++] = arg8[var14 & 255];
                } else {
                    arg5++;
                }
            }
            for (int var17 = var16; var17 < 0; var17++) {
                byte var15 = arg3[arg7++];
                if (var15 != 0) {
                    arg2[arg5++] = arg8[var15 & 255];
                } else {
                    arg5++;
                }
            }
            arg5 += arg4;
            arg7 += arg9;
        }
    }
}
