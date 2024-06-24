package sign;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sign/signlink")
public class signlink implements Runnable {

    @OriginalMember(owner = "client!sign/signlink", name = "clientversion", descriptor = "I")
    private static final int clientversion = 317;

    @OriginalMember(owner = "client!sign/signlink", name = "uid", descriptor = "I")
    public static int uid;

    @OriginalMember(owner = "client!sign/signlink", name = "storeid", descriptor = "I")
    public static int storeid = 32;

    @OriginalMember(owner = "client!sign/signlink", name = "cache_dat", descriptor = "Ljava/io/RandomAccessFile;")
    public static RandomAccessFile cache_dat = null;

    @OriginalMember(owner = "client!sign/signlink", name = "cache_idx", descriptor = "[Ljava/io/RandomAccessFile;")
    public static RandomAccessFile[] cache_idx = new RandomAccessFile[5];

    @OriginalMember(owner = "client!sign/signlink", name = "sunjava", descriptor = "Z")
    public static boolean sunjava;

    @OriginalMember(owner = "client!sign/signlink", name = "mainapp", descriptor = "Ljava/applet/Applet;")
    public static Applet mainapp = null;

    @OriginalMember(owner = "client!sign/signlink", name = "active", descriptor = "Z")
    private static boolean active;

    @OriginalMember(owner = "client!sign/signlink", name = "threadliveid", descriptor = "I")
    private static int threadliveid;

    @OriginalMember(owner = "client!sign/signlink", name = "socketip", descriptor = "Ljava/net/InetAddress;")
    private static InetAddress socketip;

    @OriginalMember(owner = "client!sign/signlink", name = "socketreq", descriptor = "I")
    private static int socketreq;

    @OriginalMember(owner = "client!sign/signlink", name = "socket", descriptor = "Ljava/net/Socket;")
    private static Socket socket = null;

    @OriginalMember(owner = "client!sign/signlink", name = "threadreqpri", descriptor = "I")
    private static int threadreqpri = 1;

    @OriginalMember(owner = "client!sign/signlink", name = "threadreq", descriptor = "Ljava/lang/Runnable;")
    private static Runnable threadreq = null;

    @OriginalMember(owner = "client!sign/signlink", name = "dnsreq", descriptor = "Ljava/lang/String;")
    private static String dnsreq = null;

    @OriginalMember(owner = "client!sign/signlink", name = "dns", descriptor = "Ljava/lang/String;")
    public static String dns = null;

    @OriginalMember(owner = "client!sign/signlink", name = "urlreq", descriptor = "Ljava/lang/String;")
    private static String urlreq = null;

    @OriginalMember(owner = "client!sign/signlink", name = "urlstream", descriptor = "Ljava/io/DataInputStream;")
    private static DataInputStream urlstream = null;

    @OriginalMember(owner = "client!sign/signlink", name = "savelen", descriptor = "I")
    private static int savelen;

    @OriginalMember(owner = "client!sign/signlink", name = "savereq", descriptor = "Ljava/lang/String;")
    private static String savereq = null;

    @OriginalMember(owner = "client!sign/signlink", name = "savebuf", descriptor = "[B")
    private static byte[] savebuf = null;

    @OriginalMember(owner = "client!sign/signlink", name = "midiplay", descriptor = "Z")
    private static boolean midiplay;

    @OriginalMember(owner = "client!sign/signlink", name = "midipos", descriptor = "I")
    private static int midipos;

    @OriginalMember(owner = "client!sign/signlink", name = "midi", descriptor = "Ljava/lang/String;")
    public static String midi = null;

    @OriginalMember(owner = "client!sign/signlink", name = "midivol", descriptor = "I")
    public static int midivol;

    @OriginalMember(owner = "client!sign/signlink", name = "midifade", descriptor = "I")
    public static int midifade;

    @OriginalMember(owner = "client!sign/signlink", name = "waveplay", descriptor = "Z")
    private static boolean waveplay;

    @OriginalMember(owner = "client!sign/signlink", name = "wavepos", descriptor = "I")
    private static int wavepos;

    @OriginalMember(owner = "client!sign/signlink", name = "wave", descriptor = "Ljava/lang/String;")
    public static String wave = null;

    @OriginalMember(owner = "client!sign/signlink", name = "wavevol", descriptor = "I")
    public static int wavevol;

    @OriginalMember(owner = "client!sign/signlink", name = "reporterror", descriptor = "Z")
    public static boolean reporterror = true;

    @OriginalMember(owner = "client!sign/signlink", name = "errorname", descriptor = "Ljava/lang/String;")
    public static String errorname = "";

    @OriginalMember(owner = "client!sign/signlink", name = "startpriv", descriptor = "(Ljava/net/InetAddress;)V", line = 62)
    public static final void startpriv(InetAddress arg0) {
        threadliveid = (int) (Math.random() * 9.9999999E7D);
        if (active) {
            try {
                Thread.sleep(500L);
            } catch (Exception var3) {
            }
            active = false;
        }
        socketreq = 0;
        threadreq = null;
        dnsreq = null;
        savereq = null;
        urlreq = null;
        socketip = arg0;
        Thread var1 = new Thread(new signlink());
        var1.setDaemon(true);
        var1.start();
        while (!active) {
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!sign/signlink", name = "run", descriptor = "()V", line = 79)
    public final void run() {
        active = true;
        String var1 = findcachedir();
        uid = getuid(var1);
        try {
            File var2 = new File(var1 + "main_file_cache.dat");
            if (var2.exists() && var2.length() > 52428800L) {
                var2.delete();
            }
            cache_dat = new RandomAccessFile(var1 + "main_file_cache.dat", "rw");
            for (int var3 = 0; var3 < 5; var3++) {
                cache_idx[var3] = new RandomAccessFile(var1 + "main_file_cache.idx" + var3, "rw");
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }
        int var10 = threadliveid;
        while (threadliveid == var10) {
            if (socketreq != 0) {
                try {
                    socket = new Socket(socketip, socketreq);
                } catch (Exception var4) {
                    socket = null;
                }
                socketreq = 0;
            } else if (threadreq != null) {
                Thread var11 = new Thread(threadreq);
                var11.setDaemon(true);
                var11.start();
                var11.setPriority(threadreqpri);
                threadreq = null;
            } else if (dnsreq != null) {
                try {
                    dns = InetAddress.getByName(dnsreq).getHostName();
                } catch (Exception var8) {
                    dns = "unknown";
                }
                dnsreq = null;
            } else if (savereq != null) {
                if (savebuf != null) {
                    try {
                        FileOutputStream var12 = new FileOutputStream(var1 + savereq);
                        var12.write(savebuf, 0, savelen);
                        var12.close();
                    } catch (Exception var7) {
                    }
                }
                if (waveplay) {
                    wave = var1 + savereq;
                    waveplay = false;
                }
                if (midiplay) {
                    midi = var1 + savereq;
                    midiplay = false;
                }
                savereq = null;
            } else if (urlreq != null) {
                try {
                    urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
                } catch (Exception var6) {
                    urlstream = null;
                }
                urlreq = null;
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var5) {
            }
        }
    }

    @OriginalMember(owner = "client!sign/signlink", name = "findcachedir", descriptor = "()Ljava/lang/String;", line = 144)
    public static final String findcachedir() {
        String[] var0 = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "", "c:/rscache", "/rscache" };
        if (storeid < 32 || storeid > 34) {
            storeid = 32;
        }
        String var1 = ".file_store_" + storeid;
        for (int var2 = 0; var2 < var0.length; var2++) {
            try {
                String var3 = var0[var2];
                File var4;
                if (var3.length() > 0) {
                    var4 = new File(var3);
                    if (!var4.exists()) {
                        continue;
                    }
                }
                var4 = new File(var3 + var1);
                if (var4.exists() || var4.mkdir()) {
                    return var3 + var1 + "/";
                }
            } catch (Exception var5) {
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sign/signlink", name = "getuid", descriptor = "(Ljava/lang/String;)I", line = 165)
    private static final int getuid(String arg0) {
        try {
            File var1 = new File(arg0 + "uid.dat");
            if (!var1.exists() || var1.length() < 4L) {
                DataOutputStream var2 = new DataOutputStream(new FileOutputStream(arg0 + "uid.dat"));
                var2.writeInt((int) (Math.random() * 9.9999999E7D));
                var2.close();
            }
        } catch (Exception var4) {
        }
        try {
            DataInputStream var5 = new DataInputStream(new FileInputStream(arg0 + "uid.dat"));
            int var6 = var5.readInt();
            var5.close();
            return var6 + 1;
        } catch (Exception var3) {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sign/signlink", name = "opensocket", descriptor = "(I)Ljava/net/Socket;", line = 188)
    public static final synchronized Socket opensocket(int arg0) throws IOException {
        socketreq = arg0;
        while (socketreq != 0) {
            try {
                Thread.sleep(50L);
            } catch (Exception var1) {
            }
        }
        if (socket == null) {
            throw new IOException("could not open socket");
        } else {
            return socket;
        }
    }

    @OriginalMember(owner = "client!sign/signlink", name = "openurl", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;", line = 195)
    public static final synchronized DataInputStream openurl(String arg0) throws IOException {
        urlreq = arg0;
        while (urlreq != null) {
            try {
                Thread.sleep(50L);
            } catch (Exception var1) {
            }
        }
        if (urlstream == null) {
            throw new IOException("could not open: " + arg0);
        } else {
            return urlstream;
        }
    }

    @OriginalMember(owner = "client!sign/signlink", name = "dnslookup", descriptor = "(Ljava/lang/String;)V", line = 202)
    public static final synchronized void dnslookup(String arg0) {
        dns = arg0;
        dnsreq = arg0;
    }

    @OriginalMember(owner = "client!sign/signlink", name = "startthread", descriptor = "(Ljava/lang/Runnable;I)V", line = 207)
    public static final synchronized void startthread(Runnable arg0, int arg1) {
        threadreqpri = arg1;
        threadreq = arg0;
    }

    @OriginalMember(owner = "client!sign/signlink", name = "wavesave", descriptor = "([BI)Z", line = 211)
    public static final synchronized boolean wavesave(byte[] arg0, int arg1) {
        if (arg1 > 2000000) {
            return false;
        } else if (savereq != null) {
            return false;
        } else {
            wavepos = (wavepos + 1) % 5;
            savelen = arg1;
            savebuf = arg0;
            waveplay = true;
            savereq = "sound" + wavepos + ".wav";
            return true;
        }
    }

    @OriginalMember(owner = "client!sign/signlink", name = "wavereplay", descriptor = "()Z", line = 219)
    public static final synchronized boolean wavereplay() {
        if (savereq != null) {
            return false;
        } else {
            savebuf = null;
            waveplay = true;
            savereq = "sound" + wavepos + ".wav";
            return true;
        }
    }

    @OriginalMember(owner = "client!sign/signlink", name = "midisave", descriptor = "([BI)V", line = 225)
    public static final synchronized void midisave(byte[] arg0, int arg1) {
        if (arg1 <= 2000000) {
            if (savereq == null) {
                midipos = (midipos + 1) % 5;
                savelen = arg1;
                savebuf = arg0;
                midiplay = true;
                savereq = "jingle" + midipos + ".mid";
            }
        }
    }

    @OriginalMember(owner = "client!sign/signlink", name = "reporterror", descriptor = "(Ljava/lang/String;)V", line = 239)
    public static final void reporterror(String arg0) {
        if (reporterror) {
            if (active) {
                System.out.println("Error: " + arg0);
                try {
                    String var3 = arg0.replace(':', '_');
                    String var4 = var3.replace('@', '_');
                    String var5 = var4.replace('&', '_');
                    String var6 = var5.replace('#', '_');
                    DataInputStream var1 = openurl("reporterror" + 317 + ".cgi?error=" + errorname + " " + var6);
                    var1.readLine();
                    var1.close();
                } catch (IOException var2) {
                }
            }
        }
    }
}
