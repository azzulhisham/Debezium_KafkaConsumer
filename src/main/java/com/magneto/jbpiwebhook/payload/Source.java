package com.magneto.jbpiwebhook.payload;

public class Source {
    public String version;
    public String connector;
    public String name;
    public long ts_ms;
    public String snapshot;
    public String db;
    public String schema;
    public String table;
    public String change_lsn;
    public String commit_lsn;
    public int event_serial_no;
}
