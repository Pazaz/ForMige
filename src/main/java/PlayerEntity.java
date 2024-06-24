import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DLZHLHNK")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "client!DLZHLHNK", name = "sb", descriptor = "J")
    public long modelUid = -1L;

    @OriginalMember(owner = "client!DLZHLHNK", name = "tb", descriptor = "LCKDEJADD;")
    public NpcType npc;

    @OriginalMember(owner = "client!DLZHLHNK", name = "ub", descriptor = "Z")
    public boolean lowmem = false;

    @OriginalMember(owner = "client!DLZHLHNK", name = "vb", descriptor = "[I")
    public int[] colors = new int[5];

    @OriginalMember(owner = "client!DLZHLHNK", name = "wb", descriptor = "I")
    public int team;

    @OriginalMember(owner = "client!DLZHLHNK", name = "xb", descriptor = "I")
    public int gender;

    @OriginalMember(owner = "client!DLZHLHNK", name = "yb", descriptor = "Ljava/lang/String;")
    public String name;

    @OriginalMember(owner = "client!DLZHLHNK", name = "zb", descriptor = "LGCPOSBWX;")
    public static LruCache modelCache = new LruCache(false, 260);

    @OriginalMember(owner = "client!DLZHLHNK", name = "Ab", descriptor = "I")
    public int combatLevel;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Bb", descriptor = "I")
    public int headicons;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Cb", descriptor = "I")
    public int locStartCycle;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Db", descriptor = "I")
    public int locStopCycle;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Eb", descriptor = "I")
    public int y;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Fb", descriptor = "Z")
    public boolean visible = false;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Gb", descriptor = "I")
    public int locOffsetX;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Hb", descriptor = "I")
    public int locOffsetY;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Ib", descriptor = "I")
    public int locOffsetZ;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Jb", descriptor = "LZKARKDQW;")
    public Model locModel;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Kb", descriptor = "I")
    private int _flowObfuscator1 = 9;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Lb", descriptor = "Z")
    private boolean _flowObfuscator2 = true;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Mb", descriptor = "[I")
    public int[] appearances = new int[12];

    @OriginalMember(owner = "client!DLZHLHNK", name = "Nb", descriptor = "J")
    public long appearanceHashcode;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Ob", descriptor = "I")
    public int minTileX;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Pb", descriptor = "I")
    public int minTileZ;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Qb", descriptor = "I")
    public int maxTileX;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Rb", descriptor = "I")
    public int maxTileZ;

    @OriginalMember(owner = "client!DLZHLHNK", name = "Sb", descriptor = "I")
    public int skillLevel;

    @OriginalMember(owner = "client!DLZHLHNK", name = "a", descriptor = "(I)LZKARKDQW;")
    public final Model getModel(int arg0) {
        if (arg0 != 4016) {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
        if (!this.visible) {
            return null;
        } else {
            Model var2 = this.getSequencedModel(0);
            if (var2 == null) {
                return null;
            } else {
                super.height = var2.minY;
                var2.picking = true;
                if (this.lowmem) {
                    return var2;
                } else {
                    if (super.spotanimId != -1 && super.spotanimFrame != -1) {
                        SpotAnimType var3 = SpotAnimType.instances[super.spotanimId];
                        Model var4 = var3.getModel();
                        if (var4 != null) {
                            Model var5 = new Model(9, true, AnimFrame.isNull(super.spotanimFrame, false), false, var4);
                            var5.translate(0, -super.spotanimHeight, 16384, 0);
                            var5.createLabelReferences((byte) -71);
                            var5.applyTransform(var3.seq.frames[super.spotanimFrame], 40542);
                            var5.labelFaces = null;
                            var5.labelVertices = null;
                            if (var3.resizeh != 128 || var3.resizev != 128) {
                                var5.scale(var3.resizeh, var3.resizeh, this._flowObfuscator1, var3.resizev);
                            }
                            var5.calculateNormals(64 + var3.ambient, 850 + var3.contrast, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model(2, -819, true, var6);
                        }
                    }
                    if (this.locModel != null) {
                        if (client.loopCycle >= this.locStopCycle) {
                            this.locModel = null;
                        }
                        if (client.loopCycle >= this.locStartCycle && client.loopCycle < this.locStopCycle) {
                            Model var7 = this.locModel;
                            var7.translate(this.locOffsetX - super.x, this.locOffsetY - this.y, 16384, this.locOffsetZ - super.z);
                            if (super.dstYaw == 512) {
                                var7.rotateY90(360);
                                var7.rotateY90(360);
                                var7.rotateY90(360);
                            } else if (super.dstYaw == 1024) {
                                var7.rotateY90(360);
                                var7.rotateY90(360);
                            } else if (super.dstYaw == 1536) {
                                var7.rotateY90(360);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model(2, -819, true, var8);
                            if (super.dstYaw == 512) {
                                var7.rotateY90(360);
                            } else if (super.dstYaw == 1024) {
                                var7.rotateY90(360);
                                var7.rotateY90(360);
                            } else if (super.dstYaw == 1536) {
                                var7.rotateY90(360);
                                var7.rotateY90(360);
                                var7.rotateY90(360);
                            }
                            var7.translate(super.x - this.locOffsetX, this.y - this.locOffsetY, 16384, super.z - this.locOffsetZ);
                        }
                    }
                    var2.picking = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!DLZHLHNK", name = "a", descriptor = "(ILMBMGIXGO;)V")
    public final void read(int arg0, Packet arg1) {
        arg1.pos = 0;
        this.gender = arg1.g1();
        this.headicons = arg1.g1();
        if (arg0 == 0) {
            this.npc = null;
            this.team = 0;
            int var4;
            int var5;
            int var6;
            for (int var3 = 0; var3 < 12; var3++) {
                var4 = arg1.g1();
                if (var4 == 0) {
                    this.appearances[var3] = 0;
                } else {
                    var5 = arg1.g1();
                    this.appearances[var3] = (var4 << 8) + var5;
                    if (var3 == 0 && this.appearances[0] == 65535) {
                        this.npc = NpcType.get(arg1.g2());
                        break;
                    }
                    if (this.appearances[var3] >= 512 && this.appearances[var3] - 512 < ObjType.count) {
                        var6 = ObjType.get(this.appearances[var3] - 512).team;
                        if (var6 != 0) {
                            this.team = var6;
                        }
                    }
                }
            }
            for (var4 = 0; var4 < 5; var4++) {
                var5 = arg1.g1();
                if (var5 < 0 || var5 >= client.DESIGN_BODY_COLOR[var4].length) {
                    var5 = 0;
                }
                this.colors[var4] = var5;
            }
            super.seqStandId = arg1.g2();
            if (super.seqStandId == 65535) {
                super.seqStandId = -1;
            }
            super.seqTurnId = arg1.g2();
            if (super.seqTurnId == 65535) {
                super.seqTurnId = -1;
            }
            super.seqWalkId = arg1.g2();
            if (super.seqWalkId == 65535) {
                super.seqWalkId = -1;
            }
            super.seqTurnAroundId = arg1.g2();
            if (super.seqTurnAroundId == 65535) {
                super.seqTurnAroundId = -1;
            }
            super.seqTurnLeftId = arg1.g2();
            if (super.seqTurnLeftId == 65535) {
                super.seqTurnLeftId = -1;
            }
            super.seqTurnRightId = arg1.g2();
            if (super.seqTurnRightId == 65535) {
                super.seqTurnRightId = -1;
            }
            super.seqRunId = arg1.g2();
            if (super.seqRunId == 65535) {
                super.seqRunId = -1;
            }
            this.name = JString.toSentenceCase(-45804, JString.fromBase37(arg1.g8(-35089), (byte) -99));
            this.combatLevel = arg1.g1();
            this.skillLevel = arg1.g2();
            this.visible = true;
            this.appearanceHashcode = 0L;
            for (var5 = 0; var5 < 12; var5++) {
                this.appearanceHashcode <<= 4;
                if (this.appearances[var5] >= 256) {
                    this.appearanceHashcode += (long) (this.appearances[var5] - 256);
                }
            }
            if (this.appearances[0] >= 256) {
                this.appearanceHashcode += (long) (this.appearances[0] - 256 >> 4);
            }
            if (this.appearances[1] >= 256) {
                this.appearanceHashcode += (long) (this.appearances[1] - 256 >> 8);
            }
            for (var6 = 0; var6 < 5; var6++) {
                this.appearanceHashcode <<= 3;
                this.appearanceHashcode += (long) this.colors[var6];
            }
            this.appearanceHashcode <<= 1;
            this.appearanceHashcode += (long) this.gender;
        }
    }

    @OriginalMember(owner = "client!DLZHLHNK", name = "b", descriptor = "(I)LZKARKDQW;")
    private final Model getSequencedModel(int arg0) {
        if (this.npc != null) {
            int var14 = -1;
            if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
                var14 = SeqType.instances[super.primarySeqId].frames[super.primarySeqFrame];
            } else if (super.secondarySeqId >= 0) {
                var14 = SeqType.instances[super.secondarySeqId].frames[super.secondarySeqFrame];
            }
            return this.npc.getModel(0, -1, var14, (int[]) null);
        } else {
            long var2 = this.appearanceHashcode;
            int var4 = -1;
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
                SeqType var8 = SeqType.instances[super.primarySeqId];
                var4 = var8.frames[super.primarySeqFrame];
                if (super.secondarySeqId >= 0 && super.secondarySeqId != super.seqStandId) {
                    var5 = SeqType.instances[super.secondarySeqId].frames[super.secondarySeqFrame];
                }
                if (var8.righthand >= 0) {
                    var6 = var8.righthand;
                    var2 += (long) (var6 - this.appearances[5] << 40);
                }
                if (var8.lefthand >= 0) {
                    var7 = var8.lefthand;
                    var2 += (long) (var7 - this.appearances[3] << 48);
                }
            } else if (super.secondarySeqId >= 0) {
                var4 = SeqType.instances[super.secondarySeqId].frames[super.secondarySeqFrame];
            }
            Model var15 = (Model) modelCache.get(var2);
            if (arg0 != 0) {
                for (int var9 = 1; var9 > 0; var9++) {
                }
            }
            int var10;
            int var11;
            if (var15 == null) {
                boolean var16 = false;
                for (var10 = 0; var10 < 12; var10++) {
                    var11 = this.appearances[var10];
                    if (var7 >= 0 && var10 == 3) {
                        var11 = var7;
                    }
                    if (var6 >= 0 && var10 == 5) {
                        var11 = var6;
                    }
                    if (var11 >= 256 && var11 < 512 && !IdkType.instances[var11 - 256].validateModel((byte) 2)) {
                        var16 = true;
                    }
                    if (var11 >= 512 && !ObjType.get(var11 - 512).validateWornModel(40903, this.gender)) {
                        var16 = true;
                    }
                }
                if (var16) {
                    if (this.modelUid != -1L) {
                        var15 = (Model) modelCache.get(this.modelUid);
                    }
                    if (var15 == null) {
                        return null;
                    }
                }
            }
            if (var15 == null) {
                Model[] var17 = new Model[12];
                var10 = 0;
                int var12;
                for (var11 = 0; var11 < 12; var11++) {
                    var12 = this.appearances[var11];
                    if (var7 >= 0 && var11 == 3) {
                        var12 = var7;
                    }
                    if (var6 >= 0 && var11 == 5) {
                        var12 = var6;
                    }
                    Model var13;
                    if (var12 >= 256 && var12 < 512) {
                        var13 = IdkType.instances[var12 - 256].getModel(false);
                        if (var13 != null) {
                            var17[var10++] = var13;
                        }
                    }
                    if (var12 >= 512) {
                        var13 = ObjType.get(var12 - 512).getWornModel(false, this.gender);
                        if (var13 != null) {
                            var17[var10++] = var13;
                        }
                    }
                }
                var15 = new Model(var10, var17, -38);
                for (var12 = 0; var12 < 5; var12++) {
                    if (this.colors[var12] != 0) {
                        var15.recolour(client.DESIGN_BODY_COLOR[var12][0], client.DESIGN_BODY_COLOR[var12][this.colors[var12]]);
                        if (var12 == 1) {
                            var15.recolour(client.DESIGN_HAIR_COLOR[0], client.DESIGN_HAIR_COLOR[this.colors[var12]]);
                        }
                    }
                }
                var15.createLabelReferences((byte) -71);
                var15.calculateNormals(64, 850, -30, -50, -30, true);
                modelCache.put(var15, var2, (byte) 2);
                this.modelUid = var2;
            }
            if (this.lowmem) {
                return var15;
            } else {
                Model var18 = Model.empty;
                var18.set(7, var15, AnimFrame.isNull(var4, false) & AnimFrame.isNull(var5, false));
                if (var4 != -1 && var5 != -1) {
                    var18.applyTransforms(-20491, SeqType.instances[super.primarySeqId].walkmerge, var5, var4);
                } else if (var4 != -1) {
                    var18.applyTransform(var4, 40542);
                }
                var18.calculateBoundsCylinder(false);
                var18.labelFaces = null;
                var18.labelVertices = null;
                return var18;
            }
        }
    }

    @OriginalMember(owner = "client!DLZHLHNK", name = "b", descriptor = "(Z)Z")
    public final boolean isVisible(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            return this.visible;
        }
    }

    @OriginalMember(owner = "client!DLZHLHNK", name = "a", descriptor = "(B)LZKARKDQW;")
    public final Model getHeadModel(byte arg0) {
        if (arg0 != -41) {
            this._flowObfuscator1 = 132;
        }
        if (!this.visible) {
            return null;
        } else if (this.npc != null) {
            return this.npc.getHeadModel(true);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; var3++) {
                int var4 = this.appearances[var3];
                if (var4 >= 256 && var4 < 512 && !IdkType.instances[var4 - 256].validateHeadModel(false)) {
                    var2 = true;
                }
                if (var4 >= 512 && !ObjType.get(var4 - 512).validateHeadModel(-2836, this.gender)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var9 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; var6++) {
                    int var7 = this.appearances[var6];
                    Model var8;
                    if (var7 >= 256 && var7 < 512) {
                        var8 = IdkType.instances[var7 - 256].getHeadModel(0);
                        if (var8 != null) {
                            var9[var5++] = var8;
                        }
                    }
                    if (var7 >= 512) {
                        var8 = ObjType.get(var7 - 512).getHeadModel(-705, this.gender);
                        if (var8 != null) {
                            var9[var5++] = var8;
                        }
                    }
                }
                Model var10 = new Model(var5, var9, -38);
                for (int var11 = 0; var11 < 5; var11++) {
                    if (this.colors[var11] != 0) {
                        var10.recolour(client.DESIGN_BODY_COLOR[var11][0], client.DESIGN_BODY_COLOR[var11][this.colors[var11]]);
                        if (var11 == 1) {
                            var10.recolour(client.DESIGN_HAIR_COLOR[0], client.DESIGN_HAIR_COLOR[this.colors[var11]]);
                        }
                    }
                }
                return var10;
            }
        }
    }
}
