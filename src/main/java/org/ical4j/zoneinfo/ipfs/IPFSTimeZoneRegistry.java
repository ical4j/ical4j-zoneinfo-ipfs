package org.ical4j.zoneinfo.ipfs;

import io.ipfs.api.IPFS;
import io.ipfs.multihash.Multihash;
import net.fortuna.ical4j.model.TimeZone;
import net.fortuna.ical4j.model.TimeZoneRegistry;

import java.io.IOException;
import java.io.InputStream;

public class IPFSTimeZoneRegistry implements TimeZoneRegistry {

    private final IPFS ipfs;

    private final String resourcePrefix;

    public IPFSTimeZoneRegistry(IPFS ipfs, String resourcePrefix) {
        this.ipfs = ipfs;
        this.resourcePrefix = resourcePrefix;
    }

    @Override
    public void register(TimeZone timezone) {

    }

    @Override
    public void register(TimeZone timezone, boolean update) {

    }

    @Override
    public void clear() {

    }

    @Override
    public TimeZone getTimeZone(String id) {
        String hash = "QmT78zSuBmuS4z925WZfrqQ1qHaJ56DQaTfyMUF7F8ff5o"; // Hash of a file
        Multihash multihash = Multihash.fromBase58(hash);
        try {
            byte[] bytes = ipfs.cat(multihash, id);
        } catch (IOException e) {

        }
        return null;
    }
}
