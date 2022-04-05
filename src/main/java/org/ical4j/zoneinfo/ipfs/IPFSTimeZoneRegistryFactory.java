package org.ical4j.zoneinfo.ipfs;

import io.ipfs.api.IPFS;
import net.fortuna.ical4j.model.TimeZoneRegistry;
import net.fortuna.ical4j.model.TimeZoneRegistryFactory;

public class IPFSTimeZoneRegistryFactory extends TimeZoneRegistryFactory {

    @Override
    public TimeZoneRegistry createRegistry() {
        return new IPFSTimeZoneRegistry(new IPFS("localhost", 5001), "zoneinfo/");
    }
}
