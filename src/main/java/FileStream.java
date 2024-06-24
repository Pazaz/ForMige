import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IGSLDTHC")
public class FileStream {

    @OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "I")
    private int _flowObfuscator1 = 923;

    @OriginalMember(owner = "client!IGSLDTHC", name = "b", descriptor = "Z")
    private boolean _flowObfuscator2 = true;

    @OriginalMember(owner = "client!IGSLDTHC", name = "c", descriptor = "[B")
    public static byte[] temp = new byte[520];

    @OriginalMember(owner = "client!IGSLDTHC", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile dat;

    @OriginalMember(owner = "client!IGSLDTHC", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    public RandomAccessFile idx;

    @OriginalMember(owner = "client!IGSLDTHC", name = "f", descriptor = "I")
    public int archive;

    @OriginalMember(owner = "client!IGSLDTHC", name = "g", descriptor = "I")
    public int maxFileSize = 65000;

    @OriginalMember(owner = "client!IGSLDTHC", name = "<init>", descriptor = "(ILjava/io/RandomAccessFile;Ljava/io/RandomAccessFile;IZ)V")
    public FileStream(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3, boolean arg4) {
        this.archive = arg3;
        if (!arg4) {
            throw new NullPointerException();
        } else {
            this.dat = arg1;
            this.idx = arg2;
            this.maxFileSize = arg0;
        }
    }

    @OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "(ZI)[B")
    public synchronized byte[] read(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            try {
                this.seek(this.idx, -660, arg1 * 6);
                int var3;
                int var4;
                for (var3 = 0; var3 < 6; var3 += var4) {
                    var4 = this.idx.read(temp, var3, 6 - var3);
                    if (var4 == -1) {
                        return null;
                    }
                }
                var4 = ((temp[0] & 255) << 16) + ((temp[1] & 255) << 8) + (temp[2] & 255);
                int var5 = ((temp[3] & 255) << 16) + ((temp[4] & 255) << 8) + (temp[5] & 255);
                if (var4 >= 0 && var4 <= this.maxFileSize) {
                    if (var5 > 0 && (long) var5 <= this.dat.length() / 520L) {
                        byte[] var6 = new byte[var4];
                        int var7 = 0;
                        int var8 = 0;
                        while (var7 < var4) {
                            if (var5 == 0) {
                                return null;
                            }
                            this.seek(this.dat, -660, var5 * 520);
                            var3 = 0;
                            int var9 = var4 - var7;
                            if (var9 > 512) {
                                var9 = 512;
                            }
                            int var10;
                            while (var3 < var9 + 8) {
                                var10 = this.dat.read(temp, var3, var9 + 8 - var3);
                                if (var10 == -1) {
                                    return null;
                                }
                                var3 += var10;
                            }
                            var10 = ((temp[0] & 255) << 8) + (temp[1] & 255);
                            int var11 = ((temp[2] & 255) << 8) + (temp[3] & 255);
                            int var12 = ((temp[4] & 255) << 16) + ((temp[5] & 255) << 8) + (temp[6] & 255);
                            int var13 = temp[7] & 255;
                            if (var10 == arg1 && var11 == var8 && var13 == this.archive) {
                                if (var12 >= 0 && (long) var12 <= this.dat.length() / 520L) {
                                    for (int var14 = 0; var14 < var9; var14++) {
                                        var6[var7++] = temp[var14 + 8];
                                    }
                                    var5 = var12;
                                    var8++;
                                    continue;
                                }
                                return null;
                            }
                            return null;
                        }
                        return var6;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } catch (IOException var15) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "(I[BBI)Z")
    public synchronized boolean write(int arg0, byte[] arg1, byte arg2, int arg3) {
        boolean var5 = this.write(true, 923, arg3, arg0, arg1);
        if (arg2 == 2) {
            boolean var6 = false;
        } else {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
        if (!var5) {
            var5 = this.write(false, 923, arg3, arg0, arg1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "(ZIII[B)Z")
    private synchronized boolean write(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        int var15 = 27 / arg1;
        try {
            int var6;
            int var7;
            int var8;
            if (!arg0) {
                var6 = (int) ((this.dat.length() + 519L) / 520L);
                if (var6 == 0) {
                    var6 = 1;
                }
            } else {
                this.seek(this.idx, -660, arg2 * 6);
                for (var7 = 0; var7 < 6; var7 += var8) {
                    var8 = this.idx.read(temp, var7, 6 - var7);
                    if (var8 == -1) {
                        return false;
                    }
                }
                var6 = ((temp[3] & 255) << 16) + ((temp[4] & 255) << 8) + (temp[5] & 255);
                if (var6 <= 0 || (long) var6 > this.dat.length() / 520L) {
                    return false;
                }
            }
            temp[0] = (byte) (arg3 >> 16);
            temp[1] = (byte) (arg3 >> 8);
            temp[2] = (byte) arg3;
            temp[3] = (byte) (var6 >> 16);
            temp[4] = (byte) (var6 >> 8);
            temp[5] = (byte) var6;
            this.seek(this.idx, -660, arg2 * 6);
            this.idx.write(temp, 0, 6);
            var7 = 0;
            var8 = 0;
            while (var7 < arg3) {
                int var9 = 0;
                int var10;
                if (arg0) {
                    this.seek(this.dat, -660, var6 * 520);
                    int var11;
                    for (var10 = 0; var10 < 8; var10 += var11) {
                        var11 = this.dat.read(temp, var10, 8 - var10);
                        if (var11 == -1) {
                            break;
                        }
                    }
                    if (var10 == 8) {
                        label108: {
                            var11 = ((temp[0] & 255) << 8) + (temp[1] & 255);
                            int var12 = ((temp[2] & 255) << 8) + (temp[3] & 255);
                            var9 = ((temp[4] & 255) << 16) + ((temp[5] & 255) << 8) + (temp[6] & 255);
                            int var13 = temp[7] & 255;
                            if (var11 == arg2 && var12 == var8 && var13 == this.archive) {
                                if (var9 >= 0 && (long) var9 <= this.dat.length() / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
                if (var9 == 0) {
                    arg0 = false;
                    var9 = (int) ((this.dat.length() + 519L) / 520L);
                    if (var9 == 0) {
                        var9++;
                    }
                    if (var9 == var6) {
                        var9++;
                    }
                }
                if (arg3 - var7 <= 512) {
                    var9 = 0;
                }
                temp[0] = (byte) (arg2 >> 8);
                temp[1] = (byte) arg2;
                temp[2] = (byte) (var8 >> 8);
                temp[3] = (byte) var8;
                temp[4] = (byte) (var9 >> 16);
                temp[5] = (byte) (var9 >> 8);
                temp[6] = (byte) var9;
                temp[7] = (byte) this.archive;
                this.seek(this.dat, -660, var6 * 520);
                this.dat.write(temp, 0, 8);
                var10 = arg3 - var7;
                if (var10 > 512) {
                    var10 = 512;
                }
                this.dat.write(arg4, var7, var10);
                var7 += var10;
                var6 = var9;
                var8++;
            }
            return true;
        } catch (IOException var14) {
            return false;
        }
    }

    @OriginalMember(owner = "client!IGSLDTHC", name = "a", descriptor = "(Ljava/io/RandomAccessFile;II)V")
    public synchronized void seek(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
        if (arg1 < 0) {
            if (arg2 < 0 || arg2 > 62914560) {
                System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
                arg2 = 62914560;
                try {
                    Thread.sleep(1000L);
                } catch (Exception var4) {
                }
            }
            arg0.seek((long) arg2);
        }
    }
}
