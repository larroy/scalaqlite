class Sqlite3 {
    native static public int sqlite3_open(String path, long[] db);
    native static public int sqlite3_enable_load_extension(long db, int onoff);

    public static void main(String[] args) {
        long db[] = {0};
        int r = sqlite3_open(":memory:", db);
        System.out.println("r=" + r + ", db=" + Long.toHexString(db[0]));
        r = sqlite3_enable_load_extension(db[0], 1);
        System.out.println("r=" + r);
    }

    static {
        System.loadLibrary("Sqlite3Java");
    }
}