import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FTPNODIB")
public class CollisionMap {

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "client!FTPNODIB", name = "b", descriptor = "I")
    private int _flowObfuscator2 = -32357;

    @OriginalMember(owner = "client!FTPNODIB", name = "c", descriptor = "Z")
    private boolean _flowObfuscator3 = false;

    @OriginalMember(owner = "client!FTPNODIB", name = "d", descriptor = "I")
    private int _flowObfuscator4 = 7;

    @OriginalMember(owner = "client!FTPNODIB", name = "e", descriptor = "Z")
    private boolean _flowObfuscator5 = true;

    @OriginalMember(owner = "client!FTPNODIB", name = "f", descriptor = "Z")
    private boolean _flowObfuscator6 = true;

    @OriginalMember(owner = "client!FTPNODIB", name = "g", descriptor = "B")
    private byte _flowObfuscator7 = 2;

    @OriginalMember(owner = "client!FTPNODIB", name = "h", descriptor = "B")
    private byte _flowObfuscator8 = -101;

    @OriginalMember(owner = "client!FTPNODIB", name = "i", descriptor = "I")
    public int offsetX = 0;

    @OriginalMember(owner = "client!FTPNODIB", name = "j", descriptor = "I")
    public int offsetZ = 0;

    @OriginalMember(owner = "client!FTPNODIB", name = "k", descriptor = "I")
    public int sizeX;

    @OriginalMember(owner = "client!FTPNODIB", name = "l", descriptor = "I")
    public int sizeZ;

    @OriginalMember(owner = "client!FTPNODIB", name = "m", descriptor = "[[I")
    public int[][] flags;

    @OriginalMember(owner = "client!FTPNODIB", name = "<init>", descriptor = "(IIZ)V")
    public CollisionMap(int arg0, int arg1, boolean arg2) {
        this.sizeX = arg0;
        this.sizeZ = arg1;
        this.flags = new int[this.sizeX][this.sizeZ];
        this.reset();
        if (!arg2) {
            this._flowObfuscator2 = -496;
        }
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "()V")
    public void reset() {
        for (int var1 = 0; var1 < this.sizeX; var1++) {
            for (int var2 = 0; var2 < this.sizeZ; var2++) {
                if (var1 != 0 && var2 != 0 && var1 != this.sizeX - 1 && var2 != this.sizeZ - 1) {
                    this.flags[var1][var2] = 16777216;
                } else {
                    this.flags[var1][var2] = 16777215;
                }
            }
        }
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIIIBZ)V")
    public void addWall(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        int var8 = arg2 - this.offsetX;
        int var7 = arg0 - this.offsetZ;
        if (arg4 == 1) {
            boolean var9 = false;
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.add(var8, var7, 128);
                    this.add(var8 - 1, var7, 8);
                }
                if (arg1 == 1) {
                    this.add(var8, var7, 2);
                    this.add(var8, var7 + 1, 32);
                }
                if (arg1 == 2) {
                    this.add(var8, var7, 8);
                    this.add(var8 + 1, var7, 128);
                }
                if (arg1 == 3) {
                    this.add(var8, var7, 32);
                    this.add(var8, var7 - 1, 2);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.add(var8, var7, 1);
                    this.add(var8 - 1, var7 + 1, 16);
                }
                if (arg1 == 1) {
                    this.add(var8, var7, 4);
                    this.add(var8 + 1, var7 + 1, 64);
                }
                if (arg1 == 2) {
                    this.add(var8, var7, 16);
                    this.add(var8 + 1, var7 - 1, 1);
                }
                if (arg1 == 3) {
                    this.add(var8, var7, 64);
                    this.add(var8 - 1, var7 - 1, 4);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.add(var8, var7, 130);
                    this.add(var8 - 1, var7, 8);
                    this.add(var8, var7 + 1, 32);
                }
                if (arg1 == 1) {
                    this.add(var8, var7, 10);
                    this.add(var8, var7 + 1, 32);
                    this.add(var8 + 1, var7, 128);
                }
                if (arg1 == 2) {
                    this.add(var8, var7, 40);
                    this.add(var8 + 1, var7, 128);
                    this.add(var8, var7 - 1, 2);
                }
                if (arg1 == 3) {
                    this.add(var8, var7, 160);
                    this.add(var8, var7 - 1, 2);
                    this.add(var8 - 1, var7, 8);
                }
            }
            if (arg5) {
                if (arg3 == 0) {
                    if (arg1 == 0) {
                        this.add(var8, var7, 65536);
                        this.add(var8 - 1, var7, 4096);
                    }
                    if (arg1 == 1) {
                        this.add(var8, var7, 1024);
                        this.add(var8, var7 + 1, 16384);
                    }
                    if (arg1 == 2) {
                        this.add(var8, var7, 4096);
                        this.add(var8 + 1, var7, 65536);
                    }
                    if (arg1 == 3) {
                        this.add(var8, var7, 16384);
                        this.add(var8, var7 - 1, 1024);
                    }
                }
                if (arg3 == 1 || arg3 == 3) {
                    if (arg1 == 0) {
                        this.add(var8, var7, 512);
                        this.add(var8 - 1, var7 + 1, 8192);
                    }
                    if (arg1 == 1) {
                        this.add(var8, var7, 2048);
                        this.add(var8 + 1, var7 + 1, 32768);
                    }
                    if (arg1 == 2) {
                        this.add(var8, var7, 8192);
                        this.add(var8 + 1, var7 - 1, 512);
                    }
                    if (arg1 == 3) {
                        this.add(var8, var7, 32768);
                        this.add(var8 - 1, var7 - 1, 2048);
                    }
                }
                if (arg3 == 2) {
                    if (arg1 == 0) {
                        this.add(var8, var7, 66560);
                        this.add(var8 - 1, var7, 4096);
                        this.add(var8, var7 + 1, 16384);
                    }
                    if (arg1 == 1) {
                        this.add(var8, var7, 5120);
                        this.add(var8, var7 + 1, 16384);
                        this.add(var8 + 1, var7, 65536);
                    }
                    if (arg1 == 2) {
                        this.add(var8, var7, 20480);
                        this.add(var8 + 1, var7, 65536);
                        this.add(var8, var7 - 1, 1024);
                    }
                    if (arg1 == 3) {
                        this.add(var8, var7, 81920);
                        this.add(var8, var7 - 1, 1024);
                        this.add(var8 - 1, var7, 4096);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(ZIIIIII)V")
    public void addLoc(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg0) {
            var8 += 131072;
        }
        int var12 = arg4 - this.offsetX;
        int var11 = 14 / arg1;
        int var13 = arg5 - this.offsetZ;
        int var9;
        if (arg6 == 1 || arg6 == 3) {
            var9 = arg2;
            arg2 = arg3;
            arg3 = var9;
        }
        for (var9 = var12; var9 < var12 + arg2; var9++) {
            if (var9 >= 0 && var9 < this.sizeX) {
                for (int var10 = var13; var10 < var13 + arg3; var10++) {
                    if (var10 >= 0 && var10 < this.sizeZ) {
                        this.add(var9, var10, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(III)V")
    public void setBlocked(int arg0, int arg1, int arg2) {
        int var5 = arg2 - this.offsetX;
        if (arg1 != 0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        int var4 = arg0 - this.offsetZ;
        this.flags[var5][var4] |= 2097152;
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "b", descriptor = "(III)V")
    private void add(int arg0, int arg1, int arg2) {
        this.flags[arg0][arg1] |= arg2;
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIZZII)V")
    public void removeWall(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg4 - this.offsetX;
        int var8 = arg5 - this.offsetZ;
        if (arg3) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.remove(128, var7, var8, 933);
                    this.remove(8, var7 - 1, var8, 933);
                }
                if (arg0 == 1) {
                    this.remove(2, var7, var8, 933);
                    this.remove(32, var7, var8 + 1, 933);
                }
                if (arg0 == 2) {
                    this.remove(8, var7, var8, 933);
                    this.remove(128, var7 + 1, var8, 933);
                }
                if (arg0 == 3) {
                    this.remove(32, var7, var8, 933);
                    this.remove(2, var7, var8 - 1, 933);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.remove(1, var7, var8, 933);
                    this.remove(16, var7 - 1, var8 + 1, 933);
                }
                if (arg0 == 1) {
                    this.remove(4, var7, var8, 933);
                    this.remove(64, var7 + 1, var8 + 1, 933);
                }
                if (arg0 == 2) {
                    this.remove(16, var7, var8, 933);
                    this.remove(1, var7 + 1, var8 - 1, 933);
                }
                if (arg0 == 3) {
                    this.remove(64, var7, var8, 933);
                    this.remove(4, var7 - 1, var8 - 1, 933);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.remove(130, var7, var8, 933);
                    this.remove(8, var7 - 1, var8, 933);
                    this.remove(32, var7, var8 + 1, 933);
                }
                if (arg0 == 1) {
                    this.remove(10, var7, var8, 933);
                    this.remove(32, var7, var8 + 1, 933);
                    this.remove(128, var7 + 1, var8, 933);
                }
                if (arg0 == 2) {
                    this.remove(40, var7, var8, 933);
                    this.remove(128, var7 + 1, var8, 933);
                    this.remove(2, var7, var8 - 1, 933);
                }
                if (arg0 == 3) {
                    this.remove(160, var7, var8, 933);
                    this.remove(2, var7, var8 - 1, 933);
                    this.remove(8, var7 - 1, var8, 933);
                }
            }
            if (arg2) {
                if (arg1 == 0) {
                    if (arg0 == 0) {
                        this.remove(65536, var7, var8, 933);
                        this.remove(4096, var7 - 1, var8, 933);
                    }
                    if (arg0 == 1) {
                        this.remove(1024, var7, var8, 933);
                        this.remove(16384, var7, var8 + 1, 933);
                    }
                    if (arg0 == 2) {
                        this.remove(4096, var7, var8, 933);
                        this.remove(65536, var7 + 1, var8, 933);
                    }
                    if (arg0 == 3) {
                        this.remove(16384, var7, var8, 933);
                        this.remove(1024, var7, var8 - 1, 933);
                    }
                }
                if (arg1 == 1 || arg1 == 3) {
                    if (arg0 == 0) {
                        this.remove(512, var7, var8, 933);
                        this.remove(8192, var7 - 1, var8 + 1, 933);
                    }
                    if (arg0 == 1) {
                        this.remove(2048, var7, var8, 933);
                        this.remove(32768, var7 + 1, var8 + 1, 933);
                    }
                    if (arg0 == 2) {
                        this.remove(8192, var7, var8, 933);
                        this.remove(512, var7 + 1, var8 - 1, 933);
                    }
                    if (arg0 == 3) {
                        this.remove(32768, var7, var8, 933);
                        this.remove(2048, var7 - 1, var8 - 1, 933);
                    }
                }
                if (arg1 == 2) {
                    if (arg0 == 0) {
                        this.remove(66560, var7, var8, 933);
                        this.remove(4096, var7 - 1, var8, 933);
                        this.remove(16384, var7, var8 + 1, 933);
                    }
                    if (arg0 == 1) {
                        this.remove(5120, var7, var8, 933);
                        this.remove(16384, var7, var8 + 1, 933);
                        this.remove(65536, var7 + 1, var8, 933);
                    }
                    if (arg0 == 2) {
                        this.remove(20480, var7, var8, 933);
                        this.remove(65536, var7 + 1, var8, 933);
                        this.remove(1024, var7, var8 - 1, 933);
                    }
                    if (arg0 == 3) {
                        this.remove(81920, var7, var8, 933);
                        this.remove(1024, var7, var8 - 1, 933);
                        this.remove(4096, var7 - 1, var8, 933);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIIIBIZ)V")
    public void removeLoc(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        int var8 = 256;
        if (arg6) {
            var8 += 131072;
        }
        int var11 = arg2 - this.offsetX;
        int var12 = arg3 - this.offsetZ;
        if (arg4 != 6) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        int var9;
        if (arg0 == 1 || arg0 == 3) {
            var9 = arg1;
            arg1 = arg5;
            arg5 = var9;
        }
        for (var9 = var11; var9 < var11 + arg1; var9++) {
            if (var9 >= 0 && var9 < this.sizeX) {
                for (int var10 = var12; var10 < var12 + arg5; var10++) {
                    if (var10 >= 0 && var10 < this.sizeZ) {
                        this.remove(var8, var9, var10, 933);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIII)V")
    private void remove(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 36 / arg3;
        this.flags[arg1][arg2] &= 16777215 - arg0;
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "c", descriptor = "(III)V")
    public void removeBlocked(int arg0, int arg1, int arg2) {
        int var6 = arg2 - this.offsetX;
        int var5 = arg1 - this.offsetZ;
        int var4 = 6 / arg0;
        this.flags[var6][var5] &= 14680063;
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(IIIIIII)Z")
    public boolean reachedWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        if (arg1 == arg0 && arg2 == arg6) {
            return true;
        } else {
            int var9 = arg1 - this.offsetX;
            int var10 = arg2 - this.offsetZ;
            int var8 = arg0 - this.offsetX;
            int var11 = arg6 - this.offsetZ;
            if (arg5 == 0) {
                if (arg4 == 0) {
                    if (var9 == var8 - 1 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 + 1 && (this.flags[var9][var10] & 19398944) == 0) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 - 1 && (this.flags[var9][var10] & 19398914) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 == var8 && var10 == var11 + 1) {
                        return true;
                    }
                    if (var9 == var8 - 1 && var10 == var11 && (this.flags[var9][var10] & 19398920) == 0) {
                        return true;
                    }
                    if (var9 == var8 + 1 && var10 == var11 && (this.flags[var9][var10] & 19399040) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 == var8 + 1 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 + 1 && (this.flags[var9][var10] & 19398944) == 0) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 - 1 && (this.flags[var9][var10] & 19398914) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 == var8 && var10 == var11 - 1) {
                        return true;
                    }
                    if (var9 == var8 - 1 && var10 == var11 && (this.flags[var9][var10] & 19398920) == 0) {
                        return true;
                    }
                    if (var9 == var8 + 1 && var10 == var11 && (this.flags[var9][var10] & 19399040) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg4 == 0) {
                    if (var9 == var8 - 1 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 + 1) {
                        return true;
                    }
                    if (var9 == var8 + 1 && var10 == var11 && (this.flags[var9][var10] & 19399040) == 0) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 - 1 && (this.flags[var9][var10] & 19398914) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 == var8 - 1 && var10 == var11 && (this.flags[var9][var10] & 19398920) == 0) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 + 1) {
                        return true;
                    }
                    if (var9 == var8 + 1 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 - 1 && (this.flags[var9][var10] & 19398914) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 == var8 - 1 && var10 == var11 && (this.flags[var9][var10] & 19398920) == 0) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 + 1 && (this.flags[var9][var10] & 19398944) == 0) {
                        return true;
                    }
                    if (var9 == var8 + 1 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 - 1) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 == var8 - 1 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 + 1 && (this.flags[var9][var10] & 19398944) == 0) {
                        return true;
                    }
                    if (var9 == var8 + 1 && var10 == var11 && (this.flags[var9][var10] & 19399040) == 0) {
                        return true;
                    }
                    if (var9 == var8 && var10 == var11 - 1) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var8 && var10 == var11 + 1 && (this.flags[var9][var10] & 32) == 0) {
                    return true;
                }
                if (var9 == var8 && var10 == var11 - 1 && (this.flags[var9][var10] & 2) == 0) {
                    return true;
                }
                if (var9 == var8 - 1 && var10 == var11 && (this.flags[var9][var10] & 8) == 0) {
                    return true;
                }
                if (var9 == var8 + 1 && var10 == var11 && (this.flags[var9][var10] & 128) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "b", descriptor = "(IIIIIII)Z")
    public boolean reachedWallDecoration(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 0) {
            throw new NullPointerException();
        } else if (arg5 == arg0 && arg2 == arg1) {
            return true;
        } else {
            int var11 = arg5 - this.offsetX;
            int var10 = arg2 - this.offsetZ;
            int var8 = arg0 - this.offsetX;
            int var9 = arg1 - this.offsetZ;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg4 = arg4 + 2 & 3;
                }
                if (arg4 == 0) {
                    if (var11 == var8 + 1 && var10 == var9 && (this.flags[var11][var10] & 128) == 0) {
                        return true;
                    }
                    if (var11 == var8 && var10 == var9 - 1 && (this.flags[var11][var10] & 2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 == var8 - 1 && var10 == var9 && (this.flags[var11][var10] & 8) == 0) {
                        return true;
                    }
                    if (var11 == var8 && var10 == var9 - 1 && (this.flags[var11][var10] & 2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 == var8 - 1 && var10 == var9 && (this.flags[var11][var10] & 8) == 0) {
                        return true;
                    }
                    if (var11 == var8 && var10 == var9 + 1 && (this.flags[var11][var10] & 32) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 == var8 + 1 && var10 == var9 && (this.flags[var11][var10] & 128) == 0) {
                        return true;
                    }
                    if (var11 == var8 && var10 == var9 + 1 && (this.flags[var11][var10] & 32) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var11 == var8 && var10 == var9 + 1 && (this.flags[var11][var10] & 32) == 0) {
                    return true;
                }
                if (var11 == var8 && var10 == var9 - 1 && (this.flags[var11][var10] & 2) == 0) {
                    return true;
                }
                if (var11 == var8 - 1 && var10 == var9 && (this.flags[var11][var10] & 8) == 0) {
                    return true;
                }
                if (var11 == var8 + 1 && var10 == var9 && (this.flags[var11][var10] & 128) == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!FTPNODIB", name = "a", descriptor = "(BIIIIIII)Z")
    public boolean reachedLoc(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 1) {
            throw new NullPointerException();
        } else {
            int var9 = arg2 + arg6 - 1;
            int var10 = arg1 + arg4 - 1;
            if (arg3 >= arg2 && arg3 <= var9 && arg7 >= arg1 && arg7 <= var10) {
                return true;
            } else if (arg3 == arg2 - 1 && arg7 >= arg1 && arg7 <= var10 && (this.flags[arg3 - this.offsetX][arg7 - this.offsetZ] & 8) == 0 && (arg5 & 8) == 0) {
                return true;
            } else if (arg3 == var9 + 1 && arg7 >= arg1 && arg7 <= var10 && (this.flags[arg3 - this.offsetX][arg7 - this.offsetZ] & 128) == 0 && (arg5 & 2) == 0) {
                return true;
            } else if (arg7 == arg1 - 1 && arg3 >= arg2 && arg3 <= var9 && (this.flags[arg3 - this.offsetX][arg7 - this.offsetZ] & 2) == 0 && (arg5 & 4) == 0) {
                return true;
            } else {
                return arg7 == var10 + 1 && arg3 >= arg2 && arg3 <= var9 && (this.flags[arg3 - this.offsetX][arg7 - this.offsetZ] & 32) == 0 && (arg5 & 1) == 0;
            }
        }
    }
}
