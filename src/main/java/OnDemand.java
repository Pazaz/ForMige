import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("client!GHOWLKWN")
public class OnDemand extends OnDemandProvider implements Runnable {

    @OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "I")
    private int totalPrefetchFiles;

    @OriginalMember(owner = "client!GHOWLKWN", name = "c", descriptor = "LLHGXPZPG;")
    private LinkList pending = new LinkList(169);

    @OriginalMember(owner = "client!GHOWLKWN", name = "d", descriptor = "I")
    private int topPriority;

    @OriginalMember(owner = "client!GHOWLKWN", name = "e", descriptor = "Ljava/lang/String;")
    public String message = "";

    @OriginalMember(owner = "client!GHOWLKWN", name = "f", descriptor = "I")
    private int heartbeatCycle;

    @OriginalMember(owner = "client!GHOWLKWN", name = "g", descriptor = "J")
    private long socketOpenTime;

    @OriginalMember(owner = "client!GHOWLKWN", name = "h", descriptor = "Z")
    private boolean _flowObfuscator2 = true;

    @OriginalMember(owner = "client!GHOWLKWN", name = "i", descriptor = "[I")
    private int[] mapLoc;

    @OriginalMember(owner = "client!GHOWLKWN", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 crc32 = new CRC32();

    @OriginalMember(owner = "client!GHOWLKWN", name = "k", descriptor = "[B")
    private byte[] buf = new byte[500];

    @OriginalMember(owner = "client!GHOWLKWN", name = "l", descriptor = "I")
    private int _flowObfuscator3 = 923;

    @OriginalMember(owner = "client!GHOWLKWN", name = "m", descriptor = "I")
    public int cycle;

    @OriginalMember(owner = "client!GHOWLKWN", name = "n", descriptor = "[[B")
    private byte[][] archiveFilePriorities = new byte[4][];

    @OriginalMember(owner = "client!GHOWLKWN", name = "o", descriptor = "Lclient;")
    private client app;

    @OriginalMember(owner = "client!GHOWLKWN", name = "p", descriptor = "LLHGXPZPG;")
    private LinkList prefetches = new LinkList(169);

    @OriginalMember(owner = "client!GHOWLKWN", name = "q", descriptor = "I")
    private static int _flowObfuscator4;

    @OriginalMember(owner = "client!GHOWLKWN", name = "r", descriptor = "I")
    private int partOffset;

    @OriginalMember(owner = "client!GHOWLKWN", name = "s", descriptor = "I")
    private int partAvailable;

    @OriginalMember(owner = "client!GHOWLKWN", name = "t", descriptor = "[I")
    private int[] midiIndex;

    @OriginalMember(owner = "client!GHOWLKWN", name = "u", descriptor = "I")
    public int failCount;

    @OriginalMember(owner = "client!GHOWLKWN", name = "v", descriptor = "[I")
    private int[] mapLand;

    @OriginalMember(owner = "client!GHOWLKWN", name = "w", descriptor = "I")
    private int loadedPrefetchFiles;

    @OriginalMember(owner = "client!GHOWLKWN", name = "x", descriptor = "I")
    private int _flowObfuscator5 = 13603;

    @OriginalMember(owner = "client!GHOWLKWN", name = "y", descriptor = "Z")
    private boolean running = true;

    @OriginalMember(owner = "client!GHOWLKWN", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream out;

    @OriginalMember(owner = "client!GHOWLKWN", name = "A", descriptor = "Z")
    private boolean _flowObfuscator6 = false;

    @OriginalMember(owner = "client!GHOWLKWN", name = "B", descriptor = "[I")
    private int[] mapPrefetch;

    @OriginalMember(owner = "client!GHOWLKWN", name = "C", descriptor = "Z")
    private boolean active = false;

    @OriginalMember(owner = "client!GHOWLKWN", name = "D", descriptor = "LLHGXPZPG;")
    private LinkList completed = new LinkList(169);

    @OriginalMember(owner = "client!GHOWLKWN", name = "E", descriptor = "[B")
    private byte[] data = new byte[65000];

    @OriginalMember(owner = "client!GHOWLKWN", name = "F", descriptor = "[I")
    private int[] animIndex;

    @OriginalMember(owner = "client!GHOWLKWN", name = "G", descriptor = "LBISVHPUN;")
    private DoublyLinkList requests = new DoublyLinkList(_flowObfuscator4);

    @OriginalMember(owner = "client!GHOWLKWN", name = "H", descriptor = "Ljava/io/InputStream;")
    private InputStream in;

    @OriginalMember(owner = "client!GHOWLKWN", name = "I", descriptor = "Ljava/net/Socket;")
    private Socket socket;

    @OriginalMember(owner = "client!GHOWLKWN", name = "J", descriptor = "[[I")
    private int[][] archiveFileVersions = new int[4][];

    @OriginalMember(owner = "client!GHOWLKWN", name = "K", descriptor = "[[I")
    private int[][] archiveFileChecksums = new int[4][];

    @OriginalMember(owner = "client!GHOWLKWN", name = "L", descriptor = "I")
    private int importantCount;

    @OriginalMember(owner = "client!GHOWLKWN", name = "M", descriptor = "I")
    private int requestCount;

    @OriginalMember(owner = "client!GHOWLKWN", name = "N", descriptor = "LLHGXPZPG;")
    private LinkList missing = new LinkList(169);

    @OriginalMember(owner = "client!GHOWLKWN", name = "O", descriptor = "LPHKHJKBS;")
    private OnDemandRequest current;

    @OriginalMember(owner = "client!GHOWLKWN", name = "P", descriptor = "LLHGXPZPG;")
    private LinkList queue = new LinkList(169);

    @OriginalMember(owner = "client!GHOWLKWN", name = "Q", descriptor = "[I")
    private int[] mapIndex;

    @OriginalMember(owner = "client!GHOWLKWN", name = "R", descriptor = "[B")
    private byte[] modelIndex;

    @OriginalMember(owner = "client!GHOWLKWN", name = "S", descriptor = "I")
    private int waitCycles;

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(IBI[B)Z")
    private final boolean validate(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg3 != null && arg3.length >= 2) {
            int var5 = arg3.length - 2;
            int var6 = ((arg3[var5] & 255) << 8) + (arg3[var5 + 1] & 255);
            if (arg1 != 3) {
                this._flowObfuscator2 = !this._flowObfuscator2;
            }
            this.crc32.reset();
            this.crc32.update(arg3, 0, var5);
            int var7 = (int) this.crc32.getValue();
            if (var6 != arg0) {
                return false;
            } else {
                return var7 == arg2;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "(I)V")
    private final void read(int arg0) {
        if (arg0 >= 0) {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
        try {
            int var2 = this.in.available();
            int var4;
            int var5;
            if (this.partAvailable == 0 && var2 >= 6) {
                this.active = true;
                for (int var3 = 0; var3 < 6; var3 += this.in.read(this.buf, var3, 6 - var3)) {
                }
                var4 = this.buf[0] & 255;
                var5 = ((this.buf[1] & 255) << 8) + (this.buf[2] & 255);
                int var6 = ((this.buf[3] & 255) << 8) + (this.buf[4] & 255);
                int var7 = this.buf[5] & 255;
                this.current = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.pending.head(); var8 != null; var8 = (OnDemandRequest) this.pending.next(false)) {
                    if (var8.archive == var4 && var8.file == var5) {
                        this.current = var8;
                    }
                    if (this.current != null) {
                        var8.cycle = 0;
                    }
                }
                if (this.current != null) {
                    this.waitCycles = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.current.data = null;
                        if (this.current.important) {
                            LinkList var9 = this.completed;
                            synchronized (this.completed) {
                                this.completed.addTail(this.current);
                            }
                        } else {
                            this.current.unlink();
                        }
                        this.current = null;
                    } else {
                        if (this.current.data == null && var7 == 0) {
                            this.current.data = new byte[var6];
                        }
                        if (this.current.data == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.partOffset = var7 * 500;
                this.partAvailable = 500;
                if (this.partAvailable > var6 - var7 * 500) {
                    this.partAvailable = var6 - var7 * 500;
                }
            }
            if (this.partAvailable > 0 && var2 >= this.partAvailable) {
                this.active = true;
                byte[] var14 = this.buf;
                var4 = 0;
                if (this.current != null) {
                    var14 = this.current.data;
                    var4 = this.partOffset;
                }
                for (var5 = 0; var5 < this.partAvailable; var5 += this.in.read(var14, var5 + var4, this.partAvailable - var5)) {
                }
                if (this.partAvailable + this.partOffset >= var14.length && this.current != null) {
                    if (this.app.fileStreams[0] != null) {
                        this.app.fileStreams[this.current.archive + 1].write(var14.length, var14, (byte) 2, this.current.file);
                    }
                    if (!this.current.important && this.current.archive == 3) {
                        this.current.important = true;
                        this.current.archive = 93;
                    }
                    if (this.current.important) {
                        LinkList var15 = this.completed;
                        synchronized (this.completed) {
                            this.completed.addTail(this.current);
                        }
                    } else {
                        this.current.unlink();
                    }
                }
                this.partAvailable = 0;
            }
        } catch (IOException var13) {
            try {
                this.socket.close();
            } catch (Exception var10) {
            }
            this.socket = null;
            this.in = null;
            this.out = null;
            this.partAvailable = 0;
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(LXTGLDHGX;Lclient;)V")
    public final void load(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        int var6;
        int var8;
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var5 = arg0.read(var3[var4], (byte[]) null);
            var6 = var5.length / 2;
            Packet var7 = new Packet(var5, 891);
            this.archiveFileVersions[var4] = new int[var6];
            this.archiveFilePriorities[var4] = new byte[var6];
            for (var8 = 0; var8 < var6; var8++) {
                this.archiveFileVersions[var4][var8] = var7.g2();
            }
        }
        String[] var14 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        byte[] var15;
        for (var6 = 0; var6 < 4; var6++) {
            var15 = arg0.read(var14[var6], (byte[]) null);
            var8 = var15.length / 4;
            Packet var9 = new Packet(var15, 891);
            this.archiveFileChecksums[var6] = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                this.archiveFileChecksums[var6][var10] = var9.g4();
            }
        }
        var15 = arg0.read("model_index", (byte[]) null);
        var8 = this.archiveFileVersions[0].length;
        this.modelIndex = new byte[var8];
        for (int var16 = 0; var16 < var8; var16++) {
            if (var16 < var15.length) {
                this.modelIndex[var16] = var15[var16];
            } else {
                this.modelIndex[var16] = 0;
            }
        }
        var15 = arg0.read("map_index", (byte[]) null);
        Packet var17 = new Packet(var15, 891);
        var8 = var15.length / 7;
        this.mapIndex = new int[var8];
        this.mapLand = new int[var8];
        this.mapLoc = new int[var8];
        this.mapPrefetch = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            this.mapIndex[var11] = var17.g2();
            this.mapLand[var11] = var17.g2();
            this.mapLoc[var11] = var17.g2();
            this.mapPrefetch[var11] = var17.g1();
        }
        var15 = arg0.read("anim_index", (byte[]) null);
        var17 = new Packet(var15, 891);
        var8 = var15.length / 2;
        this.animIndex = new int[var8];
        for (int var12 = 0; var12 < var8; var12++) {
            this.animIndex[var12] = var17.g2();
        }
        var15 = arg0.read("midi_index", (byte[]) null);
        var17 = new Packet(var15, 891);
        var8 = var15.length;
        this.midiIndex = new int[var8];
        for (int var13 = 0; var13 < var8; var13++) {
            this.midiIndex[var13] = var17.g1();
        }
        this.app = arg1;
        this.running = true;
        this.app.startThread(this, 2);
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "()I")
    public final int remaining() {
        DoublyLinkList var2 = this.requests;
        synchronized (this.requests) {
            return this.requests.size();
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "()V")
    public final void stop() {
        this.running = false;
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(ZI)V")
    public final void prefetchMaps(boolean arg0, int arg1) {
        int var3 = this.mapIndex.length;
        if (arg1 != 0) {
            _flowObfuscator4 = 20;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.mapPrefetch[var4] != 0) {
                this.prefetch((byte) 2, 3, this.mapLoc[var4], (byte) 8);
                this.prefetch((byte) 2, 3, this.mapLand[var4], (byte) 8);
            }
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(II)I")
    public final int getFileCount(int arg0, int arg1) {
        if (arg0 <= 0) {
            this._flowObfuscator6 = !this._flowObfuscator6;
        }
        return this.archiveFileVersions[arg1].length;
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(ILPHKHJKBS;)V")
    private final void send(int arg0, OnDemandRequest arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this._flowObfuscator5 = -339;
        }
        try {
            if (this.socket == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.socketOpenTime < 4000L) {
                    return;
                }
                this.socketOpenTime = var3;
                this.socket = this.app.openSocket(43594 + client.portOffset);
                this.in = this.socket.getInputStream();
                this.out = this.socket.getOutputStream();
                this.out.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.in.read();
                }
                this.waitCycles = 0;
            }
            this.buf[0] = (byte) arg1.archive;
            this.buf[1] = (byte) (arg1.file >> 8);
            this.buf[2] = (byte) arg1.file;
            if (arg1.important) {
                this.buf[3] = 2;
            } else if (!this.app.ingame) {
                this.buf[3] = 1;
            } else {
                this.buf[3] = 0;
            }
            this.out.write(this.buf, 0, 4);
            this.heartbeatCycle = 0;
            this.failCount = -10000;
        } catch (IOException var7) {
            try {
                this.socket.close();
            } catch (Exception var6) {
            }
            this.socket = null;
            this.in = null;
            this.out = null;
            this.partAvailable = 0;
            this.failCount++;
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "c", descriptor = "(I)I")
    public final int getAnimCount(int arg0) {
        if (arg0 != 0) {
            this._flowObfuscator5 = -76;
        }
        return this.animIndex.length;
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "(II)V")
    public final void request(int arg0, int arg1) {
        if (arg0 >= 0 && arg0 <= this.archiveFileVersions.length && arg1 >= 0 && arg1 <= this.archiveFileVersions[arg0].length) {
            if (this.archiveFileVersions[arg0][arg1] != 0) {
                DoublyLinkList var3 = this.requests;
                synchronized (this.requests) {
                    OnDemandRequest var5;
                    for (var5 = (OnDemandRequest) this.requests.head(); var5 != null; var5 = (OnDemandRequest) this.requests.next(false)) {
                        if (var5.archive == arg0 && var5.file == arg1) {
                            return;
                        }
                    }
                    var5 = new OnDemandRequest();
                    var5.archive = arg0;
                    var5.file = arg1;
                    var5.important = true;
                    LinkList var6 = this.queue;
                    synchronized (this.queue) {
                        this.queue.addTail(var5);
                    }
                    this.requests.addTail(var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "c", descriptor = "(II)I")
    public final int getModelFlags(int arg0, int arg1) {
        if (arg1 >= 0) {
            _flowObfuscator4 = -7;
        }
        return this.modelIndex[arg0] & 255;
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.running) {
                this.cycle++;
                byte var1 = 20;
                if (this.topPriority == 0 && this.app.fileStreams[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var7) {
                }
                this.active = true;
                for (int var2 = 0; var2 < 100 && this.active; var2++) {
                    this.active = false;
                    this.handleQueue(true);
                    this.handlePending(false);
                    if (this.importantCount == 0 && var2 >= 5) {
                        break;
                    }
                    this.handleExtras((byte) -56);
                    if (this.in != null) {
                        this.read(-369);
                    }
                }
                boolean var3 = false;
                OnDemandRequest var4;
                for (var4 = (OnDemandRequest) this.pending.head(); var4 != null; var4 = (OnDemandRequest) this.pending.next(false)) {
                    if (var4.important) {
                        var3 = true;
                        var4.cycle++;
                        if (var4.cycle > 50) {
                            var4.cycle = 0;
                            this.send(8, var4);
                        }
                    }
                }
                if (!var3) {
                    for (var4 = (OnDemandRequest) this.pending.head(); var4 != null; var4 = (OnDemandRequest) this.pending.next(false)) {
                        var3 = true;
                        var4.cycle++;
                        if (var4.cycle > 50) {
                            var4.cycle = 0;
                            this.send(8, var4);
                        }
                    }
                }
                if (var3) {
                    this.waitCycles++;
                    if (this.waitCycles > 750) {
                        try {
                            this.socket.close();
                        } catch (Exception var6) {
                        }
                        this.socket = null;
                        this.in = null;
                        this.out = null;
                        this.partAvailable = 0;
                    }
                } else {
                    this.waitCycles = 0;
                    this.message = "";
                }
                if (this.app.ingame && this.socket != null && this.out != null && (this.topPriority > 0 || this.app.fileStreams[0] == null)) {
                    this.heartbeatCycle++;
                    if (this.heartbeatCycle > 500) {
                        this.heartbeatCycle = 0;
                        this.buf[0] = 0;
                        this.buf[1] = 0;
                        this.buf[2] = 0;
                        this.buf[3] = 10;
                        try {
                            this.out.write(this.buf, 0, 4);
                        } catch (IOException var5) {
                            this.waitCycles = 5000;
                        }
                    }
                }
            }
        } catch (Exception var8) {
            signlink.reporterror("od_ex " + var8.getMessage());
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(IIZ)V")
    public final void prefetch(int arg0, int arg1, boolean arg2) {
        if (this.app.fileStreams[0] != null) {
            if (this.archiveFileVersions[arg1][arg0] != 0) {
                if (this.archiveFilePriorities[arg1][arg0] != 0) {
                    if (this.topPriority != 0) {
                        OnDemandRequest var4 = new OnDemandRequest();
                        var4.archive = arg1;
                        var4.file = arg0;
                        if (arg2) {
                            _flowObfuscator4 = -423;
                        }
                        var4.important = false;
                        LinkList var5 = this.prefetches;
                        synchronized (this.prefetches) {
                            this.prefetches.addTail(var4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "c", descriptor = "()LPHKHJKBS;")
    public final OnDemandRequest poll() {
        LinkList var2 = this.completed;
        OnDemandRequest var1;
        synchronized (this.completed) {
            var1 = (OnDemandRequest) this.completed.removeHead();
        }
        if (var1 == null) {
            return null;
        } else {
            DoublyLinkList var8 = this.requests;
            synchronized (this.requests) {
                var1.unlinkDouble();
            }
            if (var1.data == null) {
                return var1;
            } else {
                int var9 = 0;
                try {
                    GZIPInputStream var3 = new GZIPInputStream(new ByteArrayInputStream(var1.data));
                    while (true) {
                        if (var9 == this.data.length) {
                            throw new RuntimeException("buffer overflow!");
                        }
                        int var4 = var3.read(this.data, var9, this.data.length - var9);
                        if (var4 == -1) {
                            break;
                        }
                        var9 += var4;
                    }
                } catch (IOException var7) {
                    throw new RuntimeException("error unzipping");
                }
                var1.data = new byte[var9];
                for (int var10 = 0; var10 < var9; var10++) {
                    var1.data[var10] = this.data[var10];
                }
                return var1;
            }
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(IIII)I")
    public final int getMapFile(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            return _flowObfuscator4;
        } else {
            int var5 = (arg3 << 8) + arg2;
            for (int var6 = 0; var6 < this.mapIndex.length; var6++) {
                if (this.mapIndex[var6] == var5) {
                    if (arg0 == 0) {
                        return this.mapLand[var6];
                    }
                    return this.mapLoc[var6];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(I)V")
    public final void requestModel(int arg0) {
        this.request(0, arg0);
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(BIIB)V")
    public final void prefetch(byte arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 8) {
            boolean var6 = false;
        } else {
            this._flowObfuscator3 = 237;
        }
        if (this.app.fileStreams[0] != null) {
            if (this.archiveFileVersions[arg1][arg2] != 0) {
                byte[] var5 = this.app.fileStreams[arg1 + 1].read(true, arg2);
                if (!this.validate(this.archiveFileVersions[arg1][arg2], (byte) 3, this.archiveFileChecksums[arg1][arg2], var5)) {
                    this.archiveFilePriorities[arg1][arg2] = arg0;
                    if (arg0 > this.topPriority) {
                        this.topPriority = arg0;
                    }
                    this.totalPrefetchFiles++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "d", descriptor = "(II)Z")
    public final boolean hasMapLocFile(int arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else {
            for (int var3 = 0; var3 < this.mapIndex.length; var3++) {
                if (this.mapLoc[var3] == arg0) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(Z)V")
    private final void handlePending(boolean arg0) {
        this.importantCount = 0;
        if (!arg0) {
            this.requestCount = 0;
            OnDemandRequest var2;
            for (var2 = (OnDemandRequest) this.pending.head(); var2 != null; var2 = (OnDemandRequest) this.pending.next(false)) {
                if (var2.important) {
                    this.importantCount++;
                } else {
                    this.requestCount++;
                }
            }
            while (this.importantCount < 10) {
                var2 = (OnDemandRequest) this.missing.removeHead();
                if (var2 == null) {
                    break;
                }
                if (this.archiveFilePriorities[var2.archive][var2.file] != 0) {
                    this.loadedPrefetchFiles++;
                }
                this.archiveFilePriorities[var2.archive][var2.file] = 0;
                this.pending.addTail(var2);
                this.importantCount++;
                this.send(8, var2);
                this.active = true;
            }
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "d", descriptor = "(I)V")
    public final void clearPrefetches(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        LinkList var4 = this.prefetches;
        synchronized (this.prefetches) {
            this.prefetches.clear();
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "b", descriptor = "(Z)V")
    private final void handleQueue(boolean arg0) {
        if (arg0) {
            LinkList var3 = this.queue;
            OnDemandRequest var2;
            synchronized (this.queue) {
                var2 = (OnDemandRequest) this.queue.removeHead();
            }
            while (var2 != null) {
                this.active = true;
                byte[] var10 = null;
                if (this.app.fileStreams[0] != null) {
                    var10 = this.app.fileStreams[var2.archive + 1].read(true, var2.file);
                }
                if (!this.validate(this.archiveFileVersions[var2.archive][var2.file], (byte) 3, this.archiveFileChecksums[var2.archive][var2.file], var10)) {
                    var10 = null;
                }
                LinkList var4 = this.queue;
                synchronized (this.queue) {
                    if (var10 == null) {
                        this.missing.addTail(var2);
                    } else {
                        var2.data = var10;
                        LinkList var6 = this.completed;
                        synchronized (this.completed) {
                            this.completed.addTail(var2);
                        }
                    }
                    var2 = (OnDemandRequest) this.queue.removeHead();
                }
            }
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "a", descriptor = "(B)V")
    private final void handleExtras(byte arg0) {
        if (arg0 != -56) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.importantCount == 0) {
            if (this.requestCount >= 10 || this.topPriority == 0) {
                return;
            }
            LinkList var3 = this.prefetches;
            OnDemandRequest var9;
            synchronized (this.prefetches) {
                var9 = (OnDemandRequest) this.prefetches.removeHead();
            }
            while (var9 != null) {
                if (this.archiveFilePriorities[var9.archive][var9.file] != 0) {
                    this.archiveFilePriorities[var9.archive][var9.file] = 0;
                    this.pending.addTail(var9);
                    this.send(8, var9);
                    this.active = true;
                    if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
                        this.loadedPrefetchFiles++;
                    }
                    this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
                    this.requestCount++;
                    if (this.requestCount == 10) {
                        return;
                    }
                }
                var3 = this.prefetches;
                synchronized (this.prefetches) {
                    var9 = (OnDemandRequest) this.prefetches.removeHead();
                }
            }
            for (int var10 = 0; var10 < 4; var10++) {
                byte[] var4 = this.archiveFilePriorities[var10];
                int var5 = var4.length;
                for (int var6 = 0; var6 < var5; var6++) {
                    if (var4[var6] == this.topPriority) {
                        var4[var6] = 0;
                        var9 = new OnDemandRequest();
                        var9.archive = var10;
                        var9.file = var6;
                        var9.important = false;
                        this.pending.addTail(var9);
                        this.send(8, var9);
                        this.active = true;
                        if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
                            this.loadedPrefetchFiles++;
                        }
                        this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
                        this.requestCount++;
                        if (this.requestCount == 10) {
                            return;
                        }
                    }
                }
            }
            this.topPriority--;
        }
    }

    @OriginalMember(owner = "client!GHOWLKWN", name = "e", descriptor = "(II)Z")
    public final boolean shouldPrefetchMidi(int arg0, int arg1) {
        if (arg1 != 5) {
            _flowObfuscator4 = 169;
        }
        return this.midiIndex[arg0] == 1;
    }
}
